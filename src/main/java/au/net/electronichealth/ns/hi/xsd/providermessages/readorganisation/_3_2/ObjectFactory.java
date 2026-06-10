
package au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2 package. 
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

    private static final QName _HpioNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0", "hpioNumber");
    private static final QName _LinkSearchType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0", "linkSearchType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadProviderOrganisationResult }
     * 
     * @return
     *     the new instance of {@link ReadProviderOrganisationResult }
     */
    public ReadProviderOrganisationResult createReadProviderOrganisationResult() {
        return new ReadProviderOrganisationResult();
    }

    /**
     * Create an instance of {@link ReadProviderOrganisation }
     * 
     * @return
     *     the new instance of {@link ReadProviderOrganisation }
     */
    public ReadProviderOrganisation createReadProviderOrganisation() {
        return new ReadProviderOrganisation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0", name = "hpioNumber")
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
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0", name = "linkSearchType")
    public JAXBElement<String> createLinkSearchType(String value) {
        return new JAXBElement<>(_LinkSearchType_QNAME, String.class, null, value);
    }

}
