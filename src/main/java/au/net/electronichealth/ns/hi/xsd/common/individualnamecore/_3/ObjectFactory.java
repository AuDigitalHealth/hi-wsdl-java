
package au.net.electronichealth.ns.hi.xsd.common.individualnamecore._3;

import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.IndividualNameUsageType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameSuffixType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.individualnamecore._3 package. 
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

    private static final QName _FamilyName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "familyName");
    private static final QName _GivenName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "givenName");
    private static final QName _NameTitle_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "nameTitle");
    private static final QName _NameSuffix_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "nameSuffix");
    private static final QName _Usage_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "usage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.individualnamecore._3
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
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "familyName")
    public JAXBElement<String> createFamilyName(String value) {
        return new JAXBElement<>(_FamilyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "givenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "nameTitle")
    public JAXBElement<String> createNameTitle(String value) {
        return new JAXBElement<>(_NameTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "nameSuffix")
    public JAXBElement<NameSuffixType> createNameSuffix(NameSuffixType value) {
        return new JAXBElement<>(_NameSuffix_QNAME, NameSuffixType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualNameUsageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndividualNameUsageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "usage")
    public JAXBElement<IndividualNameUsageType> createUsage(IndividualNameUsageType value) {
        return new JAXBElement<>(_Usage_QNAME, IndividualNameUsageType.class, null, value);
    }

}
