
package au.net.electronichealth.ns.hi.xsd.common.individualnamecore._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.IndividualNameUsageType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameTitleType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.individualnamecore._3 package. 
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

    private final static QName _GivenName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "givenName");
    private final static QName _NameTitle_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "nameTitle");
    private final static QName _FamilyName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "familyName");
    private final static QName _Usage_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "usage");
    private final static QName _NameSuffix_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", "nameSuffix");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.individualnamecore._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "givenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameTitleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "nameTitle")
    public JAXBElement<NameTitleType> createNameTitle(NameTitleType value) {
        return new JAXBElement<NameTitleType>(_NameTitle_QNAME, NameTitleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "familyName")
    public JAXBElement<String> createFamilyName(String value) {
        return new JAXBElement<String>(_FamilyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualNameUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "usage")
    public JAXBElement<IndividualNameUsageType> createUsage(IndividualNameUsageType value) {
        return new JAXBElement<IndividualNameUsageType>(_Usage_QNAME, IndividualNameUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", name = "nameSuffix")
    public JAXBElement<NameSuffixType> createNameSuffix(NameSuffixType value) {
        return new JAXBElement<NameSuffixType>(_NameSuffix_QNAME, NameSuffixType.class, null, value);
    }

}
