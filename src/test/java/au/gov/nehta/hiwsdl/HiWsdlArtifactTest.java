package au.gov.nehta.hiwsdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import jakarta.xml.ws.WebServiceClient;
import org.junit.Test;

/**
 * Offline checks for packaged WSDL and JAX-WS {@link WebServiceClient} stubs only.
 * Does not invoke or reflectively exercise generated JAXB types.
 */
public class HiWsdlArtifactTest {

    private static final List<String> HI_BINDING_WSDL = Arrays.asList(
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
        "HI_ProviderSearchTdsProviderIndividual-5.1.0.wsdl"
    );

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

    private static List<Class<?>> serviceClassesOnClasspath() throws Exception {
        return classesInPackage("au.net.electronichealth.ns.hi.svc");
    }

    private static List<Class<?>> classesInPackage(String packageName) throws Exception {
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(path);
        List<Class<?>> classes = new ArrayList<>();

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
            } else if (file.getName().endsWith(".class")
                && !file.getName().contains("$")
                && !"package-info.class".equals(file.getName())) {
                String className = packageName + "." + file.getName().substring(0, file.getName().length() - ".class".length());
                classes.add(Class.forName(className));
            }
        }
    }
}
