
package au.net.electronichealth.ns.hi.xsd.consumercore.address._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.address._3 package. 
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

    private final static QName _Suburb_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "suburb");
    private final static QName _AustralianPostalAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "australianPostalAddress");
    private final static QName _Address_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "address");
    private final static QName _AustralianStreetAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "australianStreetAddress");
    private final static QName _InternationalAddressLine_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "internationalAddressLine");
    private final static QName _InternationalAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "internationalAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.address._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AustralianPostalAddressType }
     * 
     */
    public AustralianPostalAddressType createAustralianPostalAddressType() {
        return new AustralianPostalAddressType();
    }

    /**
     * Create an instance of {@link AustralianStreetAddressType }
     * 
     */
    public AustralianStreetAddressType createAustralianStreetAddressType() {
        return new AustralianStreetAddressType();
    }

    /**
     * Create an instance of {@link InternationalAddressType }
     * 
     */
    public InternationalAddressType createInternationalAddressType() {
        return new InternationalAddressType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "suburb")
    public JAXBElement<String> createSuburb(String value) {
        return new JAXBElement<String>(_Suburb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianPostalAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "australianPostalAddress")
    public JAXBElement<AustralianPostalAddressType> createAustralianPostalAddress(AustralianPostalAddressType value) {
        return new JAXBElement<AustralianPostalAddressType>(_AustralianPostalAddress_QNAME, AustralianPostalAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianStreetAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "australianStreetAddress")
    public JAXBElement<AustralianStreetAddressType> createAustralianStreetAddress(AustralianStreetAddressType value) {
        return new JAXBElement<AustralianStreetAddressType>(_AustralianStreetAddress_QNAME, AustralianStreetAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "internationalAddressLine")
    public JAXBElement<String> createInternationalAddressLine(String value) {
        return new JAXBElement<String>(_InternationalAddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "internationalAddress")
    public JAXBElement<InternationalAddressType> createInternationalAddress(InternationalAddressType value) {
        return new JAXBElement<InternationalAddressType>(_InternationalAddress_QNAME, InternationalAddressType.class, null, value);
    }

}
