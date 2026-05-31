
package au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2 package. 
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

    private static final QName _OrganisationNameRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0", "organisationNameRecord");
    private static final QName _OrganisationName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0", "organisationName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganisationNameRecord }
     * 
     * @return
     *     the new instance of {@link OrganisationNameRecord }
     */
    public OrganisationNameRecord createOrganisationNameRecord() {
        return new OrganisationNameRecord();
    }

    /**
     * Create an instance of {@link OrganisationName }
     * 
     * @return
     *     the new instance of {@link OrganisationName }
     */
    public OrganisationName createOrganisationName() {
        return new OrganisationName();
    }

    /**
     * Create an instance of {@link NameUsageType }
     * 
     * @return
     *     the new instance of {@link NameUsageType }
     */
    public NameUsageType createNameUsageType() {
        return new NameUsageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationNameRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationNameRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0", name = "organisationNameRecord")
    public JAXBElement<OrganisationNameRecord> createOrganisationNameRecord(OrganisationNameRecord value) {
        return new JAXBElement<>(_OrganisationNameRecord_QNAME, OrganisationNameRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0", name = "organisationName")
    public JAXBElement<OrganisationName> createOrganisationName(OrganisationName value) {
        return new JAXBElement<>(_OrganisationName_QNAME, OrganisationName.class, null, value);
    }

}
