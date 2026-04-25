
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.name._3 package. 
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

    private final static QName _Name_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", "name");
    private final static QName _ConditionalUse_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", "conditionalUse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.name._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", name = "name")
    public JAXBElement<NameType> createName(NameType value) {
        return new JAXBElement<NameType>(_Name_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", name = "conditionalUse")
    public JAXBElement<String> createConditionalUse(String value) {
        return new JAXBElement<String>(_ConditionalUse_QNAME, String.class, null, value);
    }

}
