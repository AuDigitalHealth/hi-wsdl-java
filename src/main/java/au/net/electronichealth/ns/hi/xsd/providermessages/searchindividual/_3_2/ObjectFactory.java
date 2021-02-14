
package au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AustralianAddressCriteriaType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressCriteriaType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2 package. 
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

    private final static QName _ProviderSpecialty_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", "providerSpecialty");
    private final static QName _AustralianAddressCriteria_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", "australianAddressCriteria");
    private final static QName _InternationalAddressCriteria_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", "internationalAddressCriteria");
    private final static QName _ProviderTypeCode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", "providerTypeCode");
    private final static QName _HpiiNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", "hpiiNumber");
    private final static QName _ProviderSpecialisation_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", "providerSpecialisation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchHIProviderDirectoryForIndividualResult }
     * 
     */
    public SearchHIProviderDirectoryForIndividualResult createSearchHIProviderDirectoryForIndividualResult() {
        return new SearchHIProviderDirectoryForIndividualResult();
    }

    /**
     * Create an instance of {@link IndividualProviderDirectoryEntryType }
     * 
     */
    public IndividualProviderDirectoryEntryType createIndividualProviderDirectoryEntryType() {
        return new IndividualProviderDirectoryEntryType();
    }

    /**
     * Create an instance of {@link SearchHIProviderDirectoryForIndividual }
     * 
     */
    public SearchHIProviderDirectoryForIndividual createSearchHIProviderDirectoryForIndividual() {
        return new SearchHIProviderDirectoryForIndividual();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", name = "providerSpecialty")
    public JAXBElement<String> createProviderSpecialty(String value) {
        return new JAXBElement<String>(_ProviderSpecialty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianAddressCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", name = "australianAddressCriteria")
    public JAXBElement<AustralianAddressCriteriaType> createAustralianAddressCriteria(AustralianAddressCriteriaType value) {
        return new JAXBElement<AustralianAddressCriteriaType>(_AustralianAddressCriteria_QNAME, AustralianAddressCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalAddressCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", name = "internationalAddressCriteria")
    public JAXBElement<InternationalAddressCriteriaType> createInternationalAddressCriteria(InternationalAddressCriteriaType value) {
        return new JAXBElement<InternationalAddressCriteriaType>(_InternationalAddressCriteria_QNAME, InternationalAddressCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", name = "providerTypeCode")
    public JAXBElement<String> createProviderTypeCode(String value) {
        return new JAXBElement<String>(_ProviderTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", name = "hpiiNumber")
    public JAXBElement<String> createHpiiNumber(String value) {
        return new JAXBElement<String>(_HpiiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", name = "providerSpecialisation")
    public JAXBElement<String> createProviderSpecialisation(String value) {
        return new JAXBElement<String>(_ProviderSpecialisation_QNAME, String.class, null, value);
    }

}
