
package au.net.electronichealth.ns.hi.xsd.common.qualifiedidentifier._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.qualifiedidentifier._3 package. 
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

    private final static QName _QualifiedId_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/QualifiedIdentifier/3.0", "qualifiedId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.qualifiedidentifier._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualifiedId }
     * 
     */
    public QualifiedId createQualifiedId() {
        return new QualifiedId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/QualifiedIdentifier/3.0", name = "qualifiedId")
    public JAXBElement<QualifiedId> createQualifiedId(QualifiedId value) {
        return new JAXBElement<QualifiedId>(_QualifiedId_QNAME, QualifiedId.class, null, value);
    }

}
