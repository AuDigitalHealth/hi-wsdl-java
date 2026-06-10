
package au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _EndpointLocatorServiceRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0", "endpointLocatorServiceRecord");
    private static final QName _EndpointLocatorService_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0", "endpointLocatorService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndpointLocatorServiceRecord }
     * 
     * @return
     *     the new instance of {@link EndpointLocatorServiceRecord }
     */
    public EndpointLocatorServiceRecord createEndpointLocatorServiceRecord() {
        return new EndpointLocatorServiceRecord();
    }

    /**
     * Create an instance of {@link EndpointLocatorService }
     * 
     * @return
     *     the new instance of {@link EndpointLocatorService }
     */
    public EndpointLocatorService createEndpointLocatorService() {
        return new EndpointLocatorService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointLocatorServiceRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointLocatorServiceRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0", name = "endpointLocatorServiceRecord")
    public JAXBElement<EndpointLocatorServiceRecord> createEndpointLocatorServiceRecord(EndpointLocatorServiceRecord value) {
        return new JAXBElement<>(_EndpointLocatorServiceRecord_QNAME, EndpointLocatorServiceRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointLocatorService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointLocatorService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0", name = "endpointLocatorService")
    public JAXBElement<EndpointLocatorService> createEndpointLocatorService(EndpointLocatorService value) {
        return new JAXBElement<>(_EndpointLocatorService_QNAME, EndpointLocatorService.class, null, value);
    }

}
