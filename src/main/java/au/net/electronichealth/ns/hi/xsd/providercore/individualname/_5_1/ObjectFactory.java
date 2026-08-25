
package au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1 package. 
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

    private static final QName _IndividualNameRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.1.0", "individualNameRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndividualNameRecord }
     * 
     * @return
     *     the new instance of {@link IndividualNameRecord }
     */
    public IndividualNameRecord createIndividualNameRecord() {
        return new IndividualNameRecord();
    }

    /**
     * Create an instance of {@link IndividualNameRecordResponse }
     * 
     * @return
     *     the new instance of {@link IndividualNameRecordResponse }
     */
    public IndividualNameRecordResponse createIndividualNameRecordResponse() {
        return new IndividualNameRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualNameRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndividualNameRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.1.0", name = "individualNameRecord")
    public JAXBElement<IndividualNameRecord> createIndividualNameRecord(IndividualNameRecord value) {
        return new JAXBElement<>(_IndividualNameRecord_QNAME, IndividualNameRecord.class, null, value);
    }

}
