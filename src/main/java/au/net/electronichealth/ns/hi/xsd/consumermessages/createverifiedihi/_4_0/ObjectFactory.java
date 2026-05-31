
package au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0 package. 
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

    private static final QName _CreateVerifiedIHIResult_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0", "createVerifiedIHIResult");
    private static final QName _CreateVerifiedIHI_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0", "createVerifiedIHI");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateVerifiedIHIResultType }
     * 
     * @return
     *     the new instance of {@link CreateVerifiedIHIResultType }
     */
    public CreateVerifiedIHIResultType createCreateVerifiedIHIResultType() {
        return new CreateVerifiedIHIResultType();
    }

    /**
     * Create an instance of {@link CreateVerifiedIHIType }
     * 
     * @return
     *     the new instance of {@link CreateVerifiedIHIType }
     */
    public CreateVerifiedIHIType createCreateVerifiedIHIType() {
        return new CreateVerifiedIHIType();
    }

    /**
     * Create an instance of {@link CreateVerifiedIHIResponse }
     * 
     * @return
     *     the new instance of {@link CreateVerifiedIHIResponse }
     */
    public CreateVerifiedIHIResponse createCreateVerifiedIHIResponse() {
        return new CreateVerifiedIHIResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVerifiedIHIResultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVerifiedIHIResultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0", name = "createVerifiedIHIResult")
    public JAXBElement<CreateVerifiedIHIResultType> createCreateVerifiedIHIResult(CreateVerifiedIHIResultType value) {
        return new JAXBElement<>(_CreateVerifiedIHIResult_QNAME, CreateVerifiedIHIResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVerifiedIHIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVerifiedIHIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0", name = "createVerifiedIHI")
    public JAXBElement<CreateVerifiedIHIType> createCreateVerifiedIHI(CreateVerifiedIHIType value) {
        return new JAXBElement<>(_CreateVerifiedIHI_QNAME, CreateVerifiedIHIType.class, null, value);
    }

}
