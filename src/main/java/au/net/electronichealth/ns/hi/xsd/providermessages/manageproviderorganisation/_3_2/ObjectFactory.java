
package au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderorganisation._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderorganisation._3_2 package. 
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

    private final static QName _HpioNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0", "hpioNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderorganisation._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManageProviderOrganisationResult }
     * 
     */
    public ManageProviderOrganisationResult createManageProviderOrganisationResult() {
        return new ManageProviderOrganisationResult();
    }

    /**
     * Create an instance of {@link ManageProviderOrganisation }
     * 
     */
    public ManageProviderOrganisation createManageProviderOrganisation() {
        return new ManageProviderOrganisation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0", name = "hpioNumber")
    public JAXBElement<String> createHpioNumber(String value) {
        return new JAXBElement<String>(_HpioNumber_QNAME, String.class, null, value);
    }

}
