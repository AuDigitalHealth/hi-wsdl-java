package au.net.electronichealth.ns.hi.svc.consumersearchihibatchasync._3;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;


@WebServiceClient(name = "ConsumerSearchIHIBatchAsyncService", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHIBatchAsync/3.0",
        wsdlLocation = "/HI_ConsumerSearchIHIBatchAsync-3.0.wsdl")
public class ConsumerSearchIHIBatchAsyncService extends Service {

    private static final URL WSDL_LOCATION;
    private static final WebServiceException INITIALIZATION_EXCEPTION;
    private static final QName SERVICE_QNAME =
            new QName("http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHIBatchAsync/3.0", "ConsumerSearchIHIBatchAsyncService");

    static {
        URL url = ConsumerSearchIHIBatchAsyncService.class.getResource("/HI_ConsumerSearchIHIBatchAsync-3.0.wsdl");
        WebServiceException e = null;
        if (url == null) {
            e = new WebServiceException("Cannot find '/HI_ConsumerSearchIHIBatchAsync-3.0.wsdl' on the classpath.");
        }
        WSDL_LOCATION = url;
        INITIALIZATION_EXCEPTION = e;
    }

    public ConsumerSearchIHIBatchAsyncService() {
        super(wsdlLocation(), SERVICE_QNAME);
    }

    public ConsumerSearchIHIBatchAsyncService(WebServiceFeature... features) {
        super(wsdlLocation(), SERVICE_QNAME, features);
    }

    public ConsumerSearchIHIBatchAsyncService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE_QNAME);
    }

    public ConsumerSearchIHIBatchAsyncService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE_QNAME, features);
    }

    public ConsumerSearchIHIBatchAsyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsumerSearchIHIBatchAsyncService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "ConsumerSearchIHIBatchAsyncSOAP12ServicePort")
    public ConsumerSearchIHIBatchAsyncPortType getConsumerSearchIHIBatchAsyncSOAP12ServicePort() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHIBatchAsync/3.0",
                "ConsumerSearchIHIBatchAsyncSOAP12ServicePort"), ConsumerSearchIHIBatchAsyncPortType.class);
    }

    @WebEndpoint(name = "ConsumerSearchIHIBatchAsyncSOAP12ServicePort")
    public ConsumerSearchIHIBatchAsyncPortType getConsumerSearchIHIBatchAsyncSOAP12ServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ConsumerSearchIHIBatchAsync/3.0",
                "ConsumerSearchIHIBatchAsyncSOAP12ServicePort"), ConsumerSearchIHIBatchAsyncPortType.class, features);
    }

    private static URL wsdlLocation() {
        if (INITIALIZATION_EXCEPTION != null) {
            throw INITIALIZATION_EXCEPTION;
        }
        return WSDL_LOCATION;
    }

}
