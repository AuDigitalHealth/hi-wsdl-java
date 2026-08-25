package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jakarta.xml.ws.WebServiceClient;
import org.junit.Test;

/**
 * Offline checks for packaged WSDL and JAX-WS {@link WebServiceClient} stubs
 * only.
 * Does not invoke or reflectively exercise generated JAXB types.
 */
public class HiWsdlArtifactTest {

    private static final List<String> HI_BINDING_WSDL = List.of(
            "HI_ConsumerSearchIHI-3.0.wsdl",
            "HI_ConsumerSearchIHIBatchSync-3.0.wsdl",
            "HI_ProviderBatchAsyncSearchForProviderIndividual-5.1.0.wsdl",
            "HI_ProviderBatchAsyncSearchForProviderOrganisation-5.1.0.wsdl",
            "HI_ProviderSearchForProviderIndividual-5.0.0.wsdl",
            "HI_ProviderSearchForProviderOrganisation-5.0.0.wsdl",
            "HI_ProviderManageProviderOrganisation-3.2.0.wsdl",
            "HI_ProviderManageProviderDirectoryEntry-3.2.0.wsdl",
            "HI_ProviderSearchHIProviderDirectoryForOrganisation-3.2.0.wsdl",
            "HI_ProviderReadReferenceData-3.2.0.wsdl",
            "HI_ProviderReadProviderOrganisation-3.2.0.wsdl",
            "HI_ProviderManageProviderAdministrativeIndividual-3.2.0.wsdl",
            "HI_ProviderReadProviderAdministrativeIndividual-3.2.0.wsdl",
            "HI_ProviderSearchHIProviderDirectoryForIndividual-3.2.0.wsdl",
            "HI_ConsumerSearchIHIBatchAsync-3.0.wsdl",
            "HI_ConsumerCreateProvisionalIHI-3.0.wsdl",
            "HI_ConsumerMergeProvisionalIHI-3.0.wsdl",
            "HI_ConsumerUpdateProvisionalIHI-3.0.wsdl",
            "HI_ConsumerCreateUnverifiedIHI-3.0.2.wsdl",
            "HI_ConsumerResolveProvisionalIHI-3.0.2.wsdl",
            "HI_ConsumerNotifyDuplicateIHI-3.2.0.wsdl",
            "HI_ConsumerNotifyReplicaIHI-3.2.0.wsdl",
            "HI_ConsumerUpdateIHI-3.2.0.wsdl",
            "HI_ConsumerCreateVerifiedIHI-4.0.0.wsdl",
            "HI_ProviderManageTdsProviderIndividual-5.1.0.wsdl",
            "HI_ProviderSearchTdsProviderIndividual-5.1.0.wsdl");

    /**
     * Superseded service WSDL kept on the classpath; not a primary MCA binding
     * stub.
     */
    private static final String SUPERSEDED_UPDATE_IHI_WSDL = "HI_ConsumerUpdateIHI-3.0.2.wsdl";

    @Test
    public void hiBindingWsdlOnClasspath() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        for (String wsdl : HI_BINDING_WSDL) {
            assertNotNull(wsdl, loader.getResource(wsdl));
        }
    }

    @Test
    public void hiBindingServiceStubCount() throws Exception {
        int serviceStubs = 0;
        for (Class<?> type : serviceClassesOnClasspath()) {
            if (type.getAnnotation(WebServiceClient.class) != null) {
                serviceStubs++;
            }
        }
        assertEquals(26, serviceStubs);
    }

    @Test
    public void serviceStubsReferencePackagedWsdl() throws Exception {
        for (Class<?> type : serviceClassesOnClasspath()) {
            WebServiceClient client = type.getAnnotation(WebServiceClient.class);
            if (client == null) {
                continue;
            }
            assertNotNull(type.getName() + " wsdlLocation=" + client.wsdlLocation(),
                    resolveWsdl(type, client.wsdlLocation()));
        }
    }

    @Test
    public void serviceStubWsdlLocationsMatchHiBindingWsdl() throws Exception {
        Set<String> expected = new LinkedHashSet<>(HI_BINDING_WSDL);
        Set<String> actual = new LinkedHashSet<>();
        for (Class<?> type : serviceClassesOnClasspath()) {
            WebServiceClient client = type.getAnnotation(WebServiceClient.class);
            if (client != null) {
                actual.add(client.wsdlLocation());
            }
        }

        assertEquals(expected, actual);
        assertFalse(actual.contains(SUPERSEDED_UPDATE_IHI_WSDL));
    }

    @Test
    public void supersededUpdateIhiWsdlRemainsOnClasspathWithoutStub() throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        assertNotNull(SUPERSEDED_UPDATE_IHI_WSDL, loader.getResource(SUPERSEDED_UPDATE_IHI_WSDL));

        boolean stubForSuperseded = false;
        for (Class<?> type : serviceClassesOnClasspath()) {
            WebServiceClient client = type.getAnnotation(WebServiceClient.class);
            if (client != null && SUPERSEDED_UPDATE_IHI_WSDL.equals(client.wsdlLocation())) {
                stubForSuperseded = true;
                break;
            }
        }
        assertTrue("primary binding list excludes superseded Update IHI WSDL",
                !HI_BINDING_WSDL.contains(SUPERSEDED_UPDATE_IHI_WSDL));
        assertFalse(stubForSuperseded);
    }

    private static URL resolveWsdl(Class<?> stub, String location) {
        URL url = stub.getResource(location);
        if (url == null) {
            url = Thread.currentThread().getContextClassLoader().getResource(location);
        }
        return url;
    }

    private static List<Class<?>> serviceClassesOnClasspath() throws Exception {
        return classesInPackage("au.net.electronichealth.ns.hi.svc");
    }

    private static List<Class<?>> classesInPackage(String packageName) throws Exception {
        String path = packageName.replace('.', '/');
        List<Class<?>> classes = new ArrayList<>();
        for (URL resource : Collections.list(
                Thread.currentThread().getContextClassLoader().getResources(path))) {
            if ("file".equals(resource.getProtocol())) {
                File directory = new File(URLDecoder.decode(resource.getFile(), StandardCharsets.UTF_8));
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
            } else if (file.getName().endsWith(".class")
                    && !file.getName().contains("$")
                    && !"package-info.class".equals(file.getName())) {
                String className = packageName + "."
                        + file.getName().substring(0, file.getName().length() - ".class".length());
                classes.add(Class.forName(className));
            }
        }
    }
}
