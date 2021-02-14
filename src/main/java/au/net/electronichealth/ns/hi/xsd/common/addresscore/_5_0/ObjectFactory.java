
package au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AustralianAddressType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0 package. 
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

    private final static QName _InternationalAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", "internationalAddress");
    private final static QName _SearchInternationalAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", "searchInternationalAddress");
    private final static QName _SearchAustralianAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", "searchAustralianAddress");
    private final static QName _AustralianAddress_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", "australianAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchAustralianAddressType }
     * 
     */
    public SearchAustralianAddressType createSearchAustralianAddressType() {
        return new SearchAustralianAddressType();
    }

    /**
     * Create an instance of {@link SearchInternationalAddressType }
     * 
     */
    public SearchInternationalAddressType createSearchInternationalAddressType() {
        return new SearchInternationalAddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", name = "internationalAddress")
    public JAXBElement<InternationalAddressType> createInternationalAddress(InternationalAddressType value) {
        return new JAXBElement<InternationalAddressType>(_InternationalAddress_QNAME, InternationalAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInternationalAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", name = "searchInternationalAddress")
    public JAXBElement<SearchInternationalAddressType> createSearchInternationalAddress(SearchInternationalAddressType value) {
        return new JAXBElement<SearchInternationalAddressType>(_SearchInternationalAddress_QNAME, SearchInternationalAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAustralianAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", name = "searchAustralianAddress")
    public JAXBElement<SearchAustralianAddressType> createSearchAustralianAddress(SearchAustralianAddressType value) {
        return new JAXBElement<SearchAustralianAddressType>(_SearchAustralianAddress_QNAME, SearchAustralianAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0", name = "australianAddress")
    public JAXBElement<AustralianAddressType> createAustralianAddress(AustralianAddressType value) {
        return new JAXBElement<AustralianAddressType>(_AustralianAddress_QNAME, AustralianAddressType.class, null, value);
    }

}
