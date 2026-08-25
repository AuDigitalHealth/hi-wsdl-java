
package au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._5_1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._5_1 package. 
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

    private static final QName _ElectronicCommunicationRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/5.1.0", "electronicCommunicationRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ElectronicCommunicationRecord }
     * 
     * @return
     *     the new instance of {@link ElectronicCommunicationRecord }
     */
    public ElectronicCommunicationRecord createElectronicCommunicationRecord() {
        return new ElectronicCommunicationRecord();
    }

    /**
     * Create an instance of {@link ElectronicCommunicationRecordResponse }
     * 
     * @return
     *     the new instance of {@link ElectronicCommunicationRecordResponse }
     */
    public ElectronicCommunicationRecordResponse createElectronicCommunicationRecordResponse() {
        return new ElectronicCommunicationRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCommunicationRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectronicCommunicationRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/5.1.0", name = "electronicCommunicationRecord")
    public JAXBElement<ElectronicCommunicationRecord> createElectronicCommunicationRecord(ElectronicCommunicationRecord value) {
        return new JAXBElement<>(_ElectronicCommunicationRecord_QNAME, ElectronicCommunicationRecord.class, null, value);
    }

}
