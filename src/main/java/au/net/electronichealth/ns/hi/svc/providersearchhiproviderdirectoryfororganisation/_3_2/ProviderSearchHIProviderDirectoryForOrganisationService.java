
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryfororganisation._3_2;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProviderSearchHIProviderDirectoryForOrganisationService", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchHIProviderDirectoryForOrganisation/3.2.0", wsdlLocation = "HI_ProviderSearchHIProviderDirectoryForOrganisation-3.2.0.wsdl")
public class ProviderSearchHIProviderDirectoryForOrganisationService
    extends Service
{

    private final static URL PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_EXCEPTION;
    private final static QName PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/hi/svc/ProviderSearchHIProviderDirectoryForOrganisation/3.2.0", "ProviderSearchHIProviderDirectoryForOrganisationService");

    static {
        PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryfororganisation._3_2.ProviderSearchHIProviderDirectoryForOrganisationService.class.getResource("HI_ProviderSearchHIProviderDirectoryForOrganisation-3.2.0.wsdl");
        WebServiceException e = null;
        if (PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'HI_ProviderSearchHIProviderDirectoryForOrganisation-3.2.0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_EXCEPTION = e;
    }

    public ProviderSearchHIProviderDirectoryForOrganisationService() {
        super(__getWsdlLocation(), PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_QNAME);
    }

    public ProviderSearchHIProviderDirectoryForOrganisationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_QNAME, features);
    }

    public ProviderSearchHIProviderDirectoryForOrganisationService(URL wsdlLocation) {
        super(wsdlLocation, PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_QNAME);
    }

    public ProviderSearchHIProviderDirectoryForOrganisationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_QNAME, features);
    }

    public ProviderSearchHIProviderDirectoryForOrganisationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderSearchHIProviderDirectoryForOrganisationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProviderSearchHIProviderDirectoryForOrganisationPortType
     */
    @WebEndpoint(name = "ProviderSearchHIProviderDirectoryForOrganisationSOAP12Port")
    public ProviderSearchHIProviderDirectoryForOrganisationPortType getProviderSearchHIProviderDirectoryForOrganisationSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderSearchHIProviderDirectoryForOrganisation/3.2.0", "ProviderSearchHIProviderDirectoryForOrganisationSOAP12Port"), ProviderSearchHIProviderDirectoryForOrganisationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderSearchHIProviderDirectoryForOrganisationPortType
     */
    @WebEndpoint(name = "ProviderSearchHIProviderDirectoryForOrganisationSOAP12Port")
    public ProviderSearchHIProviderDirectoryForOrganisationPortType getProviderSearchHIProviderDirectoryForOrganisationSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderSearchHIProviderDirectoryForOrganisation/3.2.0", "ProviderSearchHIProviderDirectoryForOrganisationSOAP12Port"), ProviderSearchHIProviderDirectoryForOrganisationPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_EXCEPTION!= null) {
            throw PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_EXCEPTION;
        }
        return PROVIDERSEARCHHIPROVIDERDIRECTORYFORORGANISATIONSERVICE_WSDL_LOCATION;
    }

}
