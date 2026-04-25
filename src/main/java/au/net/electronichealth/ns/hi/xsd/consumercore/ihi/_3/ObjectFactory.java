
package au.net.electronichealth.ns.hi.xsd.consumercore.ihi._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.ihi._3 package. 
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

    private final static QName _IndividualHealthcareIdentity_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/IHI/3.0", "individualHealthcareIdentity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.ihi._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndividualHealthcareIdentityType }
     * 
     */
    public IndividualHealthcareIdentityType createIndividualHealthcareIdentityType() {
        return new IndividualHealthcareIdentityType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualHealthcareIdentityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/IHI/3.0", name = "individualHealthcareIdentity")
    public JAXBElement<IndividualHealthcareIdentityType> createIndividualHealthcareIdentity(IndividualHealthcareIdentityType value) {
        return new JAXBElement<IndividualHealthcareIdentityType>(_IndividualHealthcareIdentity_QNAME, IndividualHealthcareIdentityType.class, null, value);
    }

}
