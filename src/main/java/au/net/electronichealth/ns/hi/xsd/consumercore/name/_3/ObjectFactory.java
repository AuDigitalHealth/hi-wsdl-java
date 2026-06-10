
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.name._3 package. 
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

    private static final QName _ConditionalUse_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", "conditionalUse");
    private static final QName _Name_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", "name");
    private static final QName _OnlyNameIndicator_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", "onlyNameIndicator");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.name._3
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", name = "conditionalUse")
    public JAXBElement<String> createConditionalUse(String value) {
        return new JAXBElement<>(_ConditionalUse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", name = "name")
    public JAXBElement<NameType> createName(NameType value) {
        return new JAXBElement<>(_Name_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0", name = "onlyNameIndicator")
    public JAXBElement<Boolean> createOnlyNameIndicator(Boolean value) {
        return new JAXBElement<>(_OnlyNameIndicator_QNAME, Boolean.class, null, value);
    }

}
