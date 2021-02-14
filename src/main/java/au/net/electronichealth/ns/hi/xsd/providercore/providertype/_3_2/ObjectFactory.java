
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2 package. 
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

    private final static QName _ProviderTypeRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0", "providerTypeRecord");
    private final static QName _ProviderType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0", "providerType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProviderTypeRecord }
     * 
     */
    public ProviderTypeRecord createProviderTypeRecord() {
        return new ProviderTypeRecord();
    }

    /**
     * Create an instance of {@link ProviderType }
     * 
     */
    public ProviderType createProviderType() {
        return new ProviderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTypeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0", name = "providerTypeRecord")
    public JAXBElement<ProviderTypeRecord> createProviderTypeRecord(ProviderTypeRecord value) {
        return new JAXBElement<ProviderTypeRecord>(_ProviderTypeRecord_QNAME, ProviderTypeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0", name = "providerType")
    public JAXBElement<ProviderType> createProviderType(ProviderType value) {
        return new JAXBElement<ProviderType>(_ProviderType_QNAME, ProviderType.class, null, value);
    }

}
