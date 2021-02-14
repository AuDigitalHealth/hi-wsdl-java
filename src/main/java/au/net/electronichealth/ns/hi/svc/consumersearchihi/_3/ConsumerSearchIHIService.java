
package au.net.electronichealth.ns.hi.svc.consumersearchihi._3;

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
@WebServiceClient(name = "ConsumerSearchIHIService", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHI/3.0", wsdlLocation = "HI_ConsumerSearchIHI-3.0.wsdl")
public class ConsumerSearchIHIService
    extends Service
{

    private final static URL CONSUMERSEARCHIHISERVICE_WSDL_LOCATION;
    private final static WebServiceException CONSUMERSEARCHIHISERVICE_EXCEPTION;
    private final static QName CONSUMERSEARCHIHISERVICE_QNAME = new QName("http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHI/3.0", "ConsumerSearchIHIService");

    static {
        CONSUMERSEARCHIHISERVICE_WSDL_LOCATION = au.net.electronichealth.ns.hi.svc.consumersearchihi._3.ConsumerSearchIHIService.class.getResource("HI_ConsumerSearchIHI-3.0.wsdl");
        WebServiceException e = null;
        if (CONSUMERSEARCHIHISERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'HI_ConsumerSearchIHI-3.0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CONSUMERSEARCHIHISERVICE_EXCEPTION = e;
    }

    public ConsumerSearchIHIService() {
        super(__getWsdlLocation(), CONSUMERSEARCHIHISERVICE_QNAME);
    }

    public ConsumerSearchIHIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSUMERSEARCHIHISERVICE_QNAME, features);
    }

    public ConsumerSearchIHIService(URL wsdlLocation) {
        super(wsdlLocation, CONSUMERSEARCHIHISERVICE_QNAME);
    }

    public ConsumerSearchIHIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSUMERSEARCHIHISERVICE_QNAME, features);
    }

    public ConsumerSearchIHIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsumerSearchIHIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConsumerSearchIHIPortType
     */
    @WebEndpoint(name = "ConsumerSearchIHISOAP12Port")
    public ConsumerSearchIHIPortType getConsumerSearchIHISOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHI/3.0", "ConsumerSearchIHISOAP12Port"), ConsumerSearchIHIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsumerSearchIHIPortType
     */
    @WebEndpoint(name = "ConsumerSearchIHISOAP12Port")
    public ConsumerSearchIHIPortType getConsumerSearchIHISOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHI/3.0", "ConsumerSearchIHISOAP12Port"), ConsumerSearchIHIPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSUMERSEARCHIHISERVICE_EXCEPTION!= null) {
            throw CONSUMERSEARCHIHISERVICE_EXCEPTION;
        }
        return CONSUMERSEARCHIHISERVICE_WSDL_LOCATION;
    }

}