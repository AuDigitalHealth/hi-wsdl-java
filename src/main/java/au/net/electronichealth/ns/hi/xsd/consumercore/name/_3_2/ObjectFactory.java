
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2 package. 
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

    private final static QName _NameUpdateGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "nameUpdateGroup");
    private final static QName _Name_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "name");
    private final static QName _UpdateName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "updateName");
    private final static QName _CurrentName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "currentName");
    private final static QName _ConditionalUse_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "conditionalUse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2
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
     * Create an instance of {@link NameUpdateGroupType }
     * 
     */
    public NameUpdateGroupType createNameUpdateGroupType() {
        return new NameUpdateGroupType();
    }

    /**
     * Create an instance of {@link CurrentNameType }
     * 
     */
    public CurrentNameType createCurrentNameType() {
        return new CurrentNameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameUpdateGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "nameUpdateGroup")
    public JAXBElement<NameUpdateGroupType> createNameUpdateGroup(NameUpdateGroupType value) {
        return new JAXBElement<NameUpdateGroupType>(_NameUpdateGroup_QNAME, NameUpdateGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "name")
    public JAXBElement<NameType> createName(NameType value) {
        return new JAXBElement<NameType>(_Name_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "updateName")
    public JAXBElement<NameType> createUpdateName(NameType value) {
        return new JAXBElement<NameType>(_UpdateName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "currentName")
    public JAXBElement<CurrentNameType> createCurrentName(CurrentNameType value) {
        return new JAXBElement<CurrentNameType>(_CurrentName_QNAME, CurrentNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "conditionalUse")
    public JAXBElement<String> createConditionalUse(String value) {
        return new JAXBElement<String>(_ConditionalUse_QNAME, String.class, null, value);
    }

}
