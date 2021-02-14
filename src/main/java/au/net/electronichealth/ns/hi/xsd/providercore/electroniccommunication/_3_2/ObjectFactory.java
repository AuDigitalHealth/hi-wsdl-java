
package au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2 package. 
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

    private final static QName _ElectronicCommunicationRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0", "electronicCommunicationRecord");
    private final static QName _ElectronicCommunication_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0", "electronicCommunication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ElectronicCommunicationRecord }
     * 
     */
    public ElectronicCommunicationRecord createElectronicCommunicationRecord() {
        return new ElectronicCommunicationRecord();
    }

    /**
     * Create an instance of {@link ElectronicCommunication }
     * 
     */
    public ElectronicCommunication createElectronicCommunication() {
        return new ElectronicCommunication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCommunicationRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0", name = "electronicCommunicationRecord")
    public JAXBElement<ElectronicCommunicationRecord> createElectronicCommunicationRecord(ElectronicCommunicationRecord value) {
        return new JAXBElement<ElectronicCommunicationRecord>(_ElectronicCommunicationRecord_QNAME, ElectronicCommunicationRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCommunication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0", name = "electronicCommunication")
    public JAXBElement<ElectronicCommunication> createElectronicCommunication(ElectronicCommunication value) {
        return new JAXBElement<ElectronicCommunication>(_ElectronicCommunication_QNAME, ElectronicCommunication.class, null, value);
    }

}
