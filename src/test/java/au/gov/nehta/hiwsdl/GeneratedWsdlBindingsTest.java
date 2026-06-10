package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import org.junit.Test;

public class GeneratedWsdlBindingsTest {

    private static final List<String> GENERATED_PACKAGE_ROOTS = Arrays.asList(
        "au.net.electronichealth",
        "hi_override.org.w3.xmldsig"
    );

    @Test
    public void generatedPublicMethodsAreInvocableOrDeclaredOnPortInterfaces() throws Exception {
        int coveredMethods = 0;

        for (Class<?> type : generatedClasses()) {
            for (Method method : publicDeclaredMethods(type)) {
                if (type.isInterface()) {
                    assertNotNull(type.getName() + "." + method.getName(), method.getAnnotation(WebMethod.class));
                    coveredMethods++;
                } else if (type.isEnum()) {
                    coveredMethods += exerciseEnumMethod(type, method);
                } else if (Service.class.isAssignableFrom(type)) {
                    coveredMethods += exerciseServiceMethod(type, method);
                } else if (Throwable.class.isAssignableFrom(type)) {
                    coveredMethods += exerciseFaultMethod(type, method);
                } else {
                    coveredMethods += exerciseGeneratedClassMethod(type, method);
                }
            }
        }

        assertTrue("Expected generated public methods to be covered", coveredMethods > 0);
    }

    @Test
    public void generatedPackageRootsResolveToClasses() throws Exception {
        for (String packageRoot : GENERATED_PACKAGE_ROOTS) {
            assertFalse(packageRoot, classesInPackage(packageRoot).isEmpty());
        }
    }

    private static List<Class<?>> generatedClasses() throws Exception {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        for (String packageRoot : GENERATED_PACKAGE_ROOTS) {
            classes.addAll(classesInPackage(packageRoot));
        }
        Collections.sort(classes, (left, right) -> left.getName().compareTo(right.getName()));
        return classes;
    }

    private static List<Class<?>> classesInPackage(String packageName) throws Exception {
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);
        List<Class<?>> classes = new ArrayList<Class<?>>();

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            if ("file".equals(resource.getProtocol())) {
                File directory = new File(URLDecoder.decode(resource.getFile(), "UTF-8"));
                addClasses(directory, packageName, classes);
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
            } else if (file.getName().endsWith(".class") && !file.getName().contains("$") && !"package-info.class".equals(file.getName())) {
                String className = packageName + "." + file.getName().substring(0, file.getName().length() - ".class".length());
                classes.add(Class.forName(className));
            }
        }
    }

    private static List<Method> publicDeclaredMethods(Class<?> type) {
        List<Method> methods = new ArrayList<Method>();
        for (Method method : type.getDeclaredMethods()) {
            if (Modifier.isPublic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge()) {
                methods.add(method);
            }
        }
        return methods;
    }

    private static int exerciseEnumMethod(Class<?> type, Method method) throws Exception {
        Object[] constants = type.getEnumConstants();
        assertTrue(type.getName(), constants.length > 0);

        if ("value".equals(method.getName()) && method.getParameterTypes().length == 0) {
            for (Object constant : constants) {
                assertNotNull(type.getName(), method.invoke(constant));
            }
            return 1;
        }

        if ("fromValue".equals(method.getName()) && method.getParameterTypes().length == 1) {
            Method value = type.getDeclaredMethod("value");
            for (Object constant : constants) {
                assertEquals(constant, method.invoke(null, value.invoke(constant)));
            }
            return 1;
        }

        return 0;
    }

    private static int exerciseServiceMethod(Class<?> type, Method method) throws Exception {
        if (!method.getName().startsWith("get") || method.getAnnotation(WebEndpoint.class) == null) {
            return 0;
        }

        WebServiceClient client = type.getAnnotation(WebServiceClient.class);
        assertNotNull(type.getName(), client);
        URL wsdl = type.getResource(client.wsdlLocation());
        if (wsdl == null) {
            wsdl = Thread.currentThread().getContextClassLoader().getResource(client.wsdlLocation());
        }
        assertNotNull(client.wsdlLocation(), wsdl);

        Constructor<?> constructor = type.getConstructor(URL.class, QName.class);
        Object service = constructor.newInstance(wsdl, new QName(client.targetNamespace(), client.name()));
        Object result = method.invoke(service, sampleArguments(method.getParameterTypes()));
        assertNotNull(type.getName() + "." + method.getName(), result);
        return 1;
    }

    private static int exerciseFaultMethod(Class<?> type, Method method) throws Exception {
        if (!"getFaultInfo".equals(method.getName())) {
            return 0;
        }

        Constructor<?> constructor = type.getConstructors()[0];
        Object[] args = sampleArguments(constructor.getParameterTypes());
        Object fault = constructor.newInstance(args);
        assertEquals(args[1], method.invoke(fault));
        return 1;
    }

    private static int exerciseGeneratedClassMethod(Class<?> type, Method method) throws Exception {
        Object instance = newInstance(type);
        if (instance == null) {
            return 0;
        }

        Object[] args = sampleArguments(method.getParameterTypes());
        Object result = method.invoke(instance, args);

        if (method.getName().startsWith("get") && List.class.isAssignableFrom(method.getReturnType())) {
            assertNotNull(type.getName() + "." + method.getName(), result);
        }
        if (method.getName().startsWith("create") && JAXBElement.class.isAssignableFrom(method.getReturnType())) {
            assertNotNull(type.getName() + "." + method.getName(), result);
        }
        return 1;
    }

    private static Object newInstance(Class<?> type) throws Exception {
        try {
            Constructor<?> constructor = type.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (NoSuchMethodException ignored) {
            return null;
        }
    }

    private static Object[] sampleArguments(Class<?>[] parameterTypes) throws Exception {
        Object[] args = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            args[i] = sampleValue(parameterTypes[i]);
        }
        return args;
    }

    private static Object sampleValue(Class<?> type) throws Exception {
        if (type.isArray() && type.getComponentType().equals(WebServiceFeature.class)) {
            return new WebServiceFeature[0];
        }
        if (type.equals(String.class)) {
            return "value";
        }
        if (type.equals(boolean.class) || type.equals(Boolean.class)) {
            return Boolean.TRUE;
        }
        if (type.equals(int.class) || type.equals(Integer.class)) {
            return 1;
        }
        if (type.equals(long.class) || type.equals(Long.class)) {
            return 1L;
        }
        if (type.equals(BigInteger.class)) {
            return BigInteger.ONE;
        }
        if (type.equals(BigDecimal.class)) {
            return BigDecimal.ONE;
        }
        if (type.equals(QName.class)) {
            return new QName("urn:test", "value");
        }
        if ("javax.xml.datatype.XMLGregorianCalendar".equals(type.getName())) {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar("2026-01-01");
        }
        if (type.isEnum()) {
            return type.getEnumConstants()[0];
        }
        if (Throwable.class.isAssignableFrom(type)) {
            return new RuntimeException("cause");
        }
        return newInstance(type);
    }
}
