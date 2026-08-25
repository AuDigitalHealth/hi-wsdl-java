
package au.net.electronichealth.ns.hi.xsd.providercore.address._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.address._3_2 package. 
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

    private static final QName _Address_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", "address");
    private static final QName _AddressRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", "addressRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.address._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AustralianAddressType }
     * 
     * @return
     *     the new instance of {@link AustralianAddressType }
     */
    public AustralianAddressType createAustralianAddressType() {
        return new AustralianAddressType();
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
     * Create an instance of {@link Address }
     * 
     * @return
     *     the new instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressRecord }
     * 
     * @return
     *     the new instance of {@link AddressRecord }
     */
    public AddressRecord createAddressRecord() {
        return new AddressRecord();
    }

    /**
     * Create an instance of {@link AustralianAddressCriteriaType }
     * 
     * @return
     *     the new instance of {@link AustralianAddressCriteriaType }
     */
    public AustralianAddressCriteriaType createAustralianAddressCriteriaType() {
        return new AustralianAddressCriteriaType();
    }

    /**
     * Create an instance of {@link InternationalAddressCriteriaType }
     * 
     * @return
     *     the new instance of {@link InternationalAddressCriteriaType }
     */
    public InternationalAddressCriteriaType createInternationalAddressCriteriaType() {
        return new InternationalAddressCriteriaType();
    }

    /**
     * Create an instance of {@link AddressPurposeAndDateType }
     * 
     * @return
     *     the new instance of {@link AddressPurposeAndDateType }
     */
    public AddressPurposeAndDateType createAddressPurposeAndDateType() {
        return new AddressPurposeAndDateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", name = "addressRecord")
    public JAXBElement<AddressRecord> createAddressRecord(AddressRecord value) {
        return new JAXBElement<>(_AddressRecord_QNAME, AddressRecord.class, null, value);
    }

}
