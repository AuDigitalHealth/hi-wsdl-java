
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2 package. 
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

    private static final QName _Name_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "name");
    private static final QName _NameUpdateGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "nameUpdateGroup");
    private static final QName _CurrentName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "currentName");
    private static final QName _UpdateName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "updateName");
    private static final QName _ConditionalUse_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", "conditionalUse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameType }
     * 
     * @return
     *     the new instance of {@link NameType }
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link NameUpdateGroupType }
     * 
     * @return
     *     the new instance of {@link NameUpdateGroupType }
     */
    public NameUpdateGroupType createNameUpdateGroupType() {
        return new NameUpdateGroupType();
    }

    /**
     * Create an instance of {@link CurrentNameType }
     * 
     * @return
     *     the new instance of {@link CurrentNameType }
     */
    public CurrentNameType createCurrentNameType() {
        return new CurrentNameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "name")
    public JAXBElement<NameType> createName(NameType value) {
        return new JAXBElement<>(_Name_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameUpdateGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameUpdateGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "nameUpdateGroup")
    public JAXBElement<NameUpdateGroupType> createNameUpdateGroup(NameUpdateGroupType value) {
        return new JAXBElement<>(_NameUpdateGroup_QNAME, NameUpdateGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrentNameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "currentName")
    public JAXBElement<CurrentNameType> createCurrentName(CurrentNameType value) {
        return new JAXBElement<>(_CurrentName_QNAME, CurrentNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "updateName")
    public JAXBElement<NameType> createUpdateName(NameType value) {
        return new JAXBElement<>(_UpdateName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0", name = "conditionalUse")
    public JAXBElement<String> createConditionalUse(String value) {
        return new JAXBElement<>(_ConditionalUse_QNAME, String.class, null, value);
    }

}
