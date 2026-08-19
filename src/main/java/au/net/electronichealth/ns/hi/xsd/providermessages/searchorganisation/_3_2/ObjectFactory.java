
package au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._3_2;

import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AustralianAddressCriteriaType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressCriteriaType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._3_2 package. 
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

    private static final QName _HpioNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "hpioNumber");
    private static final QName _Name_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "name");
    private static final QName _OrganisationType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "organisationType");
    private static final QName _ServiceType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "serviceType");
    private static final QName _UnitType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "unitType");
    private static final QName _AustralianAddressCriteria_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "australianAddressCriteria");
    private static final QName _InternationalAddressCriteria_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "internationalAddressCriteria");
    private static final QName _LinkSearchType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", "linkSearchType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchHIProviderDirectoryForOrganisationResult }
     * 
     * @return
     *     the new instance of {@link SearchHIProviderDirectoryForOrganisationResult }
     */
    public SearchHIProviderDirectoryForOrganisationResult createSearchHIProviderDirectoryForOrganisationResult() {
        return new SearchHIProviderDirectoryForOrganisationResult();
    }

    /**
     * Create an instance of {@link OrganisationProviderDirectoryEntryType }
     * 
     * @return
     *     the new instance of {@link OrganisationProviderDirectoryEntryType }
     */
    public OrganisationProviderDirectoryEntryType createOrganisationProviderDirectoryEntryType() {
        return new OrganisationProviderDirectoryEntryType();
    }

    /**
     * Create an instance of {@link SearchHIProviderDirectoryForOrganisation }
     * 
     * @return
     *     the new instance of {@link SearchHIProviderDirectoryForOrganisation }
     */
    public SearchHIProviderDirectoryForOrganisation createSearchHIProviderDirectoryForOrganisation() {
        return new SearchHIProviderDirectoryForOrganisation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "hpioNumber")
    public JAXBElement<String> createHpioNumber(String value) {
        return new JAXBElement<>(_HpioNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "organisationType")
    public JAXBElement<String> createOrganisationType(String value) {
        return new JAXBElement<>(_OrganisationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "serviceType")
    public JAXBElement<String> createServiceType(String value) {
        return new JAXBElement<>(_ServiceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "unitType")
    public JAXBElement<String> createUnitType(String value) {
        return new JAXBElement<>(_UnitType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianAddressCriteriaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AustralianAddressCriteriaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "australianAddressCriteria")
    public JAXBElement<AustralianAddressCriteriaType> createAustralianAddressCriteria(AustralianAddressCriteriaType value) {
        return new JAXBElement<>(_AustralianAddressCriteria_QNAME, AustralianAddressCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalAddressCriteriaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InternationalAddressCriteriaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "internationalAddressCriteria")
    public JAXBElement<InternationalAddressCriteriaType> createInternationalAddressCriteria(InternationalAddressCriteriaType value) {
        return new JAXBElement<>(_InternationalAddressCriteria_QNAME, InternationalAddressCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", name = "linkSearchType")
    public JAXBElement<String> createLinkSearchType(String value) {
        return new JAXBElement<>(_LinkSearchType_QNAME, String.class, null, value);
    }

}
