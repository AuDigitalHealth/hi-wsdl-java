
package au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2 package. 
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

    private final static QName _DeathNotification_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0", "deathNotification");
    private final static QName _PersonalDetails_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0", "personalDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonalDetails }
     * 
     */
    public PersonalDetails createPersonalDetails() {
        return new PersonalDetails();
    }

    /**
     * Create an instance of {@link DeathNotificationType }
     * 
     */
    public DeathNotificationType createDeathNotificationType() {
        return new DeathNotificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeathNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0", name = "deathNotification")
    public JAXBElement<DeathNotificationType> createDeathNotification(DeathNotificationType value) {
        return new JAXBElement<DeathNotificationType>(_DeathNotification_QNAME, DeathNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0", name = "personalDetails")
    public JAXBElement<PersonalDetails> createPersonalDetails(PersonalDetails value) {
        return new JAXBElement<PersonalDetails>(_PersonalDetails_QNAME, PersonalDetails.class, null, value);
    }

}
