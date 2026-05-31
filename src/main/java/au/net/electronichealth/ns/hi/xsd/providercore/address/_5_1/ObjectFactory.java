
package au.net.electronichealth.ns.hi.xsd.providercore.address._5_1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.address._5_1 package. 
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

    private static final QName _AddressRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Address/5.1.0", "addressRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.address._5_1
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link AddressRecordResponse }
     * 
     * @return
     *     the new instance of {@link AddressRecordResponse }
     */
    public AddressRecordResponse createAddressRecordResponse() {
        return new AddressRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/5.1.0", name = "addressRecord")
    public JAXBElement<AddressRecord> createAddressRecord(AddressRecord value) {
        return new JAXBElement<>(_AddressRecord_QNAME, AddressRecord.class, null, value);
    }

}
