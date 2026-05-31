
package au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0 package. 
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

    private static final QName _HpiiNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", "hpiiNumber");
    private static final QName _Status_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", "status");
    private static final QName _HpioNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", "hpioNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", name = "hpiiNumber")
    public JAXBElement<String> createHpiiNumber(String value) {
        return new JAXBElement<>(_HpiiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0", name = "hpioNumber")
    public JAXBElement<String> createHpioNumber(String value) {
        return new JAXBElement<>(_HpioNumber_QNAME, String.class, null, value);
    }

}
