package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Offline contract: packaged WSDL service/port/operation/header names match
 * generated HI stubs.
 */
public class WsdlStubContractTest {

    private static final String WSDL_NS = "http://schemas.xmlsoap.org/wsdl/";

    @Test
    public void twentySixServiceStubsMatchPackagedWsdl() throws Exception {
        List<Class<?>> stubs = serviceStubs();
        assertEquals(26, stubs.size());
        for (Class<?> stub : stubs) {
            assertStubMatchesWsdl(stub);
        }
    }

    private static void assertStubMatchesWsdl(Class<?> stub) throws Exception {
        WebServiceClient client = stub.getAnnotation(WebServiceClient.class);
        assertNotNull(stub.getName(), client);

        URL wsdlUrl = resolveWsdl(stub, client.wsdlLocation());
        assertNotNull(stub.getName() + " wsdlLocation=" + client.wsdlLocation(), wsdlUrl);

        List<Document> docs = loadWsdlGraph(wsdlUrl);
        Document root = docs.get(0);
        Element definitions = root.getDocumentElement();
        assertEquals(stub.getName() + " targetNamespace", client.targetNamespace(),
                attr(definitions, "targetNamespace"));

        Element service = namedChild(docs, "service", client.name());
        assertNotNull(stub.getName() + " missing wsdl:service " + client.name(), service);

        Set<String> portNames = new LinkedHashSet<>();
        Class<?> portType = null;
        for (Method method : stub.getDeclaredMethods()) {
            WebEndpoint endpoint = method.getAnnotation(WebEndpoint.class);
            if (endpoint == null) {
                continue;
            }
            portNames.add(endpoint.name());
            if (portType == null && method.getParameterTypes().length == 0
                    && !Service.class.equals(method.getReturnType())) {
                portType = method.getReturnType();
            }
        }
        assertFalse(stub.getName() + " has no @WebEndpoint", portNames.isEmpty());
        assertNotNull(stub.getName() + " port interface", portType);

        for (String portName : portNames) {
            assertNotNull(stub.getName() + " missing wsdl:port " + portName,
                    namedChild(children(service, "port"), portName));
        }

        assertPortTypeMatchesWsdl(stub.getName(), portType, docs);
    }

    private static void assertPortTypeMatchesWsdl(String stubName, Class<?> portType, List<Document> docs)
            throws Exception {
        WebService webService = portType.getAnnotation(WebService.class);
        assertNotNull(stubName + " " + portType.getName(), webService);

        Element wsdlPortType = portTypeInNamespace(docs, webService.targetNamespace(), webService.name());
        assertNotNull(stubName + " missing wsdl:portType " + webService.name()
                + " ns=" + webService.targetNamespace(), wsdlPortType);

        Set<String> wsdlOps = new LinkedHashSet<>();
        Map<String, Element> wsdlOpByName = new LinkedHashMap<>();
        for (Element operation : children(wsdlPortType, "operation")) {
            String name = attr(operation, "name");
            wsdlOps.add(name);
            wsdlOpByName.put(name, operation);
        }

        Set<String> javaOps = new LinkedHashSet<>();
        for (Method method : portType.getDeclaredMethods()) {
            WebMethod webMethod = method.getAnnotation(WebMethod.class);
            if (webMethod == null) {
                continue;
            }
            String opName = webMethod.operationName();
            if (opName == null || opName.isEmpty()) {
                opName = method.getName();
            }
            assertTrue(stubName + " " + portType.getSimpleName() + "." + method.getName()
                    + " operation " + opName + " is not in WSDL portType " + webService.name()
                    + " ops=" + wsdlOps, wsdlOps.contains(opName));
            javaOps.add(opName);

            Element wsdlOp = wsdlOpByName.get(opName);
            Action action = method.getAnnotation(Action.class);
            if (action != null && wsdlOp != null) {
                Element input = firstChild(wsdlOp, "input");
                Element output = firstChild(wsdlOp, "output");
                if (input != null && action.input() != null && !action.input().isEmpty()) {
                    String wsdlAction = addressingAction(input);
                    if (wsdlAction != null && !wsdlAction.isEmpty()) {
                        assertEquals(stubName + " " + opName + " input Action", wsdlAction, action.input());
                    }
                }
                if (output != null && action.output() != null && !action.output().isEmpty()) {
                    String wsdlAction = addressingAction(output);
                    if (wsdlAction != null && !wsdlAction.isEmpty()) {
                        assertEquals(stubName + " " + opName + " output Action", wsdlAction, action.output());
                    }
                }
            }

            Set<String> headerParts = new LinkedHashSet<>();
            for (WebParam param : collectWebParams(method)) {
                if (param.header()) {
                    String part = param.partName();
                    if (part == null || part.isEmpty()) {
                        part = param.name();
                    }
                    headerParts.add(part);
                }
            }
            assertTrue(stubName + " " + opName + " missing productHeader SOAP header param",
                    headerParts.contains("productHeader"));
        }

        assertEquals(stubName + " " + webService.name() + " operation set", wsdlOps, javaOps);
    }

    private static WebParam[] collectWebParams(Method method) {
        java.lang.annotation.Annotation[][] all = method.getParameterAnnotations();
        List<WebParam> params = new ArrayList<>();
        for (java.lang.annotation.Annotation[] perArg : all) {
            for (java.lang.annotation.Annotation annotation : perArg) {
                if (annotation instanceof WebParam) {
                    params.add((WebParam) annotation);
                }
            }
        }
        return params.toArray(new WebParam[0]);
    }

    private static String addressingAction(Element messageRef) {
        String value = messageRef.getAttributeNS("http://www.w3.org/2007/05/addressing/metadata", "Action");
        if (value == null || value.isEmpty()) {
            value = messageRef.getAttributeNS("http://www.w3.org/2006/05/addressing/wsdl", "Action");
        }
        if (value == null || value.isEmpty()) {
            value = attr(messageRef, "Action");
        }
        return value;
    }

    private static URL resolveWsdl(Class<?> stub, String location) {
        URL url = stub.getResource(location);
        if (url == null) {
            url = Thread.currentThread().getContextClassLoader().getResource(location);
        }
        return url;
    }

    private static List<Document> loadWsdlGraph(URL start) throws Exception {
        List<Document> docs = new ArrayList<>();
        Set<String> seen = new LinkedHashSet<>();
        loadWsdlGraph(start, docs, seen);
        return docs;
    }

    private static void loadWsdlGraph(URL url, List<Document> docs, Set<String> seen) throws Exception {
        String key = url.toExternalForm();
        if (!seen.add(key)) {
            return;
        }
        Document document = parseXml(url);
        docs.add(document);
        Element definitions = document.getDocumentElement();
        for (Element imported : children(definitions, "import")) {
            String location = attr(imported, "location");
            if (location == null || location.isEmpty()) {
                continue;
            }
            URL next = new URL(url, location);
            if ("file".equals(next.getProtocol()) && !new File(next.toURI()).isFile()) {
                String name = basename(location);
                URL classpath = Thread.currentThread().getContextClassLoader().getResource(name);
                assertNotNull("wsdl import not on classpath: " + location, classpath);
                next = classpath;
            }
            loadWsdlGraph(next, docs, seen);
        }
    }

    private static String basename(String location) {
        int slash = Math.max(location.lastIndexOf('/'), location.lastIndexOf('\\'));
        if (slash >= 0) {
            return location.substring(slash + 1);
        }
        return location;
    }

    private static Document parseXml(URL url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setExpandEntityReferences(false);
        try {
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception ignored) {
            // Parser support differs across JDK XML implementations.
        }
        DocumentBuilder builder = factory.newDocumentBuilder();
        try (InputStream stream = url.openStream()) {
            return builder.parse(stream);
        }
    }

    private static Element portTypeInNamespace(List<Document> docs, String namespace, String name) {
        for (Document document : docs) {
            Element definitions = document.getDocumentElement();
            if (!namespace.equals(attr(definitions, "targetNamespace"))) {
                continue;
            }
            Element found = namedChild(children(definitions, "portType"), name);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    private static Element namedChild(List<Document> docs, String localName, String name) {
        for (Document document : docs) {
            Element found = namedChild(children(document.getDocumentElement(), localName), name);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    private static Element namedChild(List<Element> elements, String name) {
        for (Element element : elements) {
            if (name.equals(attr(element, "name"))) {
                return element;
            }
        }
        return null;
    }

    private static Element firstChild(Element parent, String localName) {
        List<Element> found = children(parent, localName);
        return found.isEmpty() ? null : found.get(0);
    }

    private static List<Element> children(Element parent, String localName) {
        List<Element> found = new ArrayList<>();
        for (Node node = parent.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            Element element = (Element) node;
            if (!localName.equals(element.getLocalName())) {
                continue;
            }
            String ns = element.getNamespaceURI();
            if (ns == null || WSDL_NS.equals(ns)) {
                found.add(element);
            }
        }
        return found;
    }

    private static String attr(Element element, String name) {
        String value = element.getAttribute(name);
        return value == null ? "" : value;
    }

    private static List<Class<?>> serviceStubs() throws Exception {
        List<Class<?>> stubs = new ArrayList<>();
        for (Class<?> type : classesInPackage("au.net.electronichealth.ns.hi.svc")) {
            if (type.getAnnotation(WebServiceClient.class) != null) {
                stubs.add(type);
            }
        }
        return stubs;
    }

    private static List<Class<?>> classesInPackage(String packageName) throws Exception {
        String path = packageName.replace('.', '/');
        List<Class<?>> classes = new ArrayList<>();
        for (URL resource : Collections.list(
                Thread.currentThread().getContextClassLoader().getResources(path))) {
            if ("file".equals(resource.getProtocol())) {
                addClasses(new File(URLDecoder.decode(resource.getFile(), StandardCharsets.UTF_8)),
                        packageName, classes);
            }
        }
        return classes;
    }

    private static void addClasses(File directory, String packageName, List<Class<?>> classes) throws Exception {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                addClasses(file, packageName + "." + file.getName(), classes);
            } else if (file.getName().endsWith(".class")
                    && !file.getName().contains("$")
                    && !"package-info.class".equals(file.getName())) {
                String className = packageName + "." + file.getName().substring(0, file.getName().length() - 6);
                classes.add(Class.forName(className));
            }
        }
    }
}
