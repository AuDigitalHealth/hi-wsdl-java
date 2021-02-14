
package au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0 package. 
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

    private final static QName _HpioNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", "hpioNumber");
    private final static QName _HpiiNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", "hpiiNumber");
    private final static QName _Status_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", name = "hpioNumber")
    public JAXBElement<String> createHpioNumber(String value) {
        return new JAXBElement<String>(_HpioNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", name = "hpiiNumber")
    public JAXBElement<String> createHpiiNumber(String value) {
        return new JAXBElement<String>(_HpiiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
