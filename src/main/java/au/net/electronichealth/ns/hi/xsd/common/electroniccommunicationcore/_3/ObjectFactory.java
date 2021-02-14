
package au.net.electronichealth.ns.hi.xsd.common.electroniccommunicationcore._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.MediumType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.UsageType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.electroniccommunicationcore._3 package. 
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

    private final static QName _Medium_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", "medium");
    private final static QName _Usage_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", "usage");
    private final static QName _Details_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", "details");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.electroniccommunicationcore._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", name = "medium")
    public JAXBElement<MediumType> createMedium(MediumType value) {
        return new JAXBElement<MediumType>(_Medium_QNAME, MediumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", name = "usage")
    public JAXBElement<UsageType> createUsage(UsageType value) {
        return new JAXBElement<UsageType>(_Usage_QNAME, UsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", name = "details")
    public JAXBElement<String> createDetails(String value) {
        return new JAXBElement<String>(_Details_QNAME, String.class, null, value);
    }

}
