
package au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_1 package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _BatchIdentifier_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", "batchIdentifier");
    private final static QName _RequestIdentifier_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", "requestIdentifier");
    private final static QName _BatchStatus_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", "batchStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", name = "batchIdentifier")
    public JAXBElement<String> createBatchIdentifier(String value) {
        return new JAXBElement<String>(_BatchIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", name = "requestIdentifier")
    public JAXBElement<String> createRequestIdentifier(String value) {
        return new JAXBElement<String>(_RequestIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", name = "batchStatus")
    public JAXBElement<BatchStatusType> createBatchStatus(BatchStatusType value) {
        return new JAXBElement<BatchStatusType>(_BatchStatus_QNAME, BatchStatusType.class, null, value);
    }

}
