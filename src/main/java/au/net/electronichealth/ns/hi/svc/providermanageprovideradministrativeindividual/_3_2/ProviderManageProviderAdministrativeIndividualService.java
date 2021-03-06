
package au.net.electronichealth.ns.hi.svc.providermanageprovideradministrativeindividual._3_2;

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
@WebServiceClient(name = "ProviderManageProviderAdministrativeIndividualService", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderManageProviderAdministrativeIndividual/3.2.0", wsdlLocation = "HI_ProviderManageProviderAdministrativeIndividual-3.2.0.wsdl")
public class ProviderManageProviderAdministrativeIndividualService
    extends Service
{

    private final static URL PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_EXCEPTION;
    private final static QName PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/hi/svc/ProviderManageProviderAdministrativeIndividual/3.2.0", "ProviderManageProviderAdministrativeIndividualService");

    static {
        PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.hi.svc.providermanageprovideradministrativeindividual._3_2.ProviderManageProviderAdministrativeIndividualService.class.getResource("HI_ProviderManageProviderAdministrativeIndividual-3.2.0.wsdl");
        WebServiceException e = null;
        if (PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'HI_ProviderManageProviderAdministrativeIndividual-3.2.0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_EXCEPTION = e;
    }

    public ProviderManageProviderAdministrativeIndividualService() {
        super(__getWsdlLocation(), PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_QNAME);
    }

    public ProviderManageProviderAdministrativeIndividualService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_QNAME, features);
    }

    public ProviderManageProviderAdministrativeIndividualService(URL wsdlLocation) {
        super(wsdlLocation, PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_QNAME);
    }

    public ProviderManageProviderAdministrativeIndividualService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_QNAME, features);
    }

    public ProviderManageProviderAdministrativeIndividualService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderManageProviderAdministrativeIndividualService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProviderManageProviderAdministrativeIndividualPortType
     */
    @WebEndpoint(name = "ProviderManageProviderAdministrativeIndividualSOAP12Port")
    public ProviderManageProviderAdministrativeIndividualPortType getProviderManageProviderAdministrativeIndividualSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderManageProviderAdministrativeIndividual/3.2.0", "ProviderManageProviderAdministrativeIndividualSOAP12Port"), ProviderManageProviderAdministrativeIndividualPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderManageProviderAdministrativeIndividualPortType
     */
    @WebEndpoint(name = "ProviderManageProviderAdministrativeIndividualSOAP12Port")
    public ProviderManageProviderAdministrativeIndividualPortType getProviderManageProviderAdministrativeIndividualSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderManageProviderAdministrativeIndividual/3.2.0", "ProviderManageProviderAdministrativeIndividualSOAP12Port"), ProviderManageProviderAdministrativeIndividualPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_EXCEPTION!= null) {
            throw PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_EXCEPTION;
        }
        return PROVIDERMANAGEPROVIDERADMINISTRATIVEINDIVIDUALSERVICE_WSDL_LOCATION;
    }

}
