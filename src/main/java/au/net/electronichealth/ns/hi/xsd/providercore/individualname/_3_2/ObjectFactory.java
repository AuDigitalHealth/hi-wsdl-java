
package au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2 package. 
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

    private final static QName _IndividualName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0", "individualName");
    private final static QName _IndividualNameRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0", "individualNameRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndividualNameRecord }
     * 
     */
    public IndividualNameRecord createIndividualNameRecord() {
        return new IndividualNameRecord();
    }

    /**
     * Create an instance of {@link IndividualName }
     * 
     */
    public IndividualName createIndividualName() {
        return new IndividualName();
    }

    /**
     * Create an instance of {@link NameUsageType }
     * 
     */
    public NameUsageType createNameUsageType() {
        return new NameUsageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0", name = "individualName")
    public JAXBElement<IndividualName> createIndividualName(IndividualName value) {
        return new JAXBElement<IndividualName>(_IndividualName_QNAME, IndividualName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualNameRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0", name = "individualNameRecord")
    public JAXBElement<IndividualNameRecord> createIndividualNameRecord(IndividualNameRecord value) {
        return new JAXBElement<IndividualNameRecord>(_IndividualNameRecord_QNAME, IndividualNameRecord.class, null, value);
    }

}
