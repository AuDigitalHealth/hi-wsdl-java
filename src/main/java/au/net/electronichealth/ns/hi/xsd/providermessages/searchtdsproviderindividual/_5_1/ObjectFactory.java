
package au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1 package. 
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

    private static final QName _HpiiNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "hpiiNumber");
    private static final QName _RegistrationId_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "registrationId");
    private static final QName _FamilyName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "familyName");
    private static final QName _GivenName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "givenName");
    private static final QName _ProviderTypeCode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "providerTypeCode");
    private static final QName _DateOfBirth_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "dateOfBirth");
    private static final QName _Sex_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "sex");
    private static final QName _Postcode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "postcode");
    private static final QName _State_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", "state");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchTdsProviderIndividualResult }
     * 
     * @return
     *     the new instance of {@link SearchTdsProviderIndividualResult }
     */
    public SearchTdsProviderIndividualResult createSearchTdsProviderIndividualResult() {
        return new SearchTdsProviderIndividualResult();
    }

    /**
     * Create an instance of {@link ProviderIndividual }
     * 
     * @return
     *     the new instance of {@link ProviderIndividual }
     */
    public ProviderIndividual createProviderIndividual() {
        return new ProviderIndividual();
    }

    /**
     * Create an instance of {@link SearchTdsProviderIndividual }
     * 
     * @return
     *     the new instance of {@link SearchTdsProviderIndividual }
     */
    public SearchTdsProviderIndividual createSearchTdsProviderIndividual() {
        return new SearchTdsProviderIndividual();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "hpiiNumber")
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
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "registrationId")
    public JAXBElement<String> createRegistrationId(String value) {
        return new JAXBElement<>(_RegistrationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "familyName")
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
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "givenName")
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
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "providerTypeCode")
    public JAXBElement<String> createProviderTypeCode(String value) {
        return new JAXBElement<>(_ProviderTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "dateOfBirth")
    public JAXBElement<XMLGregorianCalendar> createDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<>(_DateOfBirth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SexType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SexType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "sex")
    public JAXBElement<SexType> createSex(SexType value) {
        return new JAXBElement<>(_Sex_QNAME, SexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", name = "state")
    public JAXBElement<StateType> createState(StateType value) {
        return new JAXBElement<>(_State_QNAME, StateType.class, null, value);
    }

}
