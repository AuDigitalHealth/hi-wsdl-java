
package au.net.electronichealth.ns.hi.xsd.consumercore.address._3;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.address._3 package. 
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

    private static final QName _AustralianPostalAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "australianPostalAddress");
    private static final QName _AustralianStreetAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "australianStreetAddress");
    private static final QName _AustralianUnstructuredStreetAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "australianUnstructuredStreetAddress");
    private static final QName _InternationalAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "internationalAddress");
    private static final QName _Suburb_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "suburb");
    private static final QName _InternationalAddressLine_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "internationalAddressLine");
    private static final QName _Address_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "address");
    private static final QName _AddressLineOne_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "addressLineOne");
    private static final QName _AddressLineTwo_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", "addressLineTwo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.address._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AustralianPostalAddressType }
     * 
     * @return
     *     the new instance of {@link AustralianPostalAddressType }
     */
    public AustralianPostalAddressType createAustralianPostalAddressType() {
        return new AustralianPostalAddressType();
    }

    /**
     * Create an instance of {@link AustralianStreetAddressType }
     * 
     * @return
     *     the new instance of {@link AustralianStreetAddressType }
     */
    public AustralianStreetAddressType createAustralianStreetAddressType() {
        return new AustralianStreetAddressType();
    }

    /**
     * Create an instance of {@link AustralianUnstructuredStreetAddressType }
     * 
     * @return
     *     the new instance of {@link AustralianUnstructuredStreetAddressType }
     */
    public AustralianUnstructuredStreetAddressType createAustralianUnstructuredStreetAddressType() {
        return new AustralianUnstructuredStreetAddressType();
    }

    /**
     * Create an instance of {@link InternationalAddressType }
     * 
     * @return
     *     the new instance of {@link InternationalAddressType }
     */
    public InternationalAddressType createInternationalAddressType() {
        return new InternationalAddressType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     * @return
     *     the new instance of {@link AddressType }
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianPostalAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AustralianPostalAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "australianPostalAddress")
    public JAXBElement<AustralianPostalAddressType> createAustralianPostalAddress(AustralianPostalAddressType value) {
        return new JAXBElement<>(_AustralianPostalAddress_QNAME, AustralianPostalAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianStreetAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AustralianStreetAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "australianStreetAddress")
    public JAXBElement<AustralianStreetAddressType> createAustralianStreetAddress(AustralianStreetAddressType value) {
        return new JAXBElement<>(_AustralianStreetAddress_QNAME, AustralianStreetAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianUnstructuredStreetAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AustralianUnstructuredStreetAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "australianUnstructuredStreetAddress")
    public JAXBElement<AustralianUnstructuredStreetAddressType> createAustralianUnstructuredStreetAddress(AustralianUnstructuredStreetAddressType value) {
        return new JAXBElement<>(_AustralianUnstructuredStreetAddress_QNAME, AustralianUnstructuredStreetAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InternationalAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "internationalAddress")
    public JAXBElement<InternationalAddressType> createInternationalAddress(InternationalAddressType value) {
        return new JAXBElement<>(_InternationalAddress_QNAME, InternationalAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "suburb")
    public JAXBElement<String> createSuburb(String value) {
        return new JAXBElement<>(_Suburb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "internationalAddressLine")
    public JAXBElement<String> createInternationalAddressLine(String value) {
        return new JAXBElement<>(_InternationalAddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "addressLineOne")
    public JAXBElement<String> createAddressLineOne(String value) {
        return new JAXBElement<>(_AddressLineOne_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", name = "addressLineTwo")
    public JAXBElement<String> createAddressLineTwo(String value) {
        return new JAXBElement<>(_AddressLineTwo_QNAME, String.class, null, value);
    }

}
