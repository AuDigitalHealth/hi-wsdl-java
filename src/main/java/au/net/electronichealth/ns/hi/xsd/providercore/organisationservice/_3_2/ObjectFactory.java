
package au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2 package. 
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

    private static final QName _OrganisationServiceRecord_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0", "organisationServiceRecord");
    private static final QName _OrganisationService_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0", "organisationService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganisationServiceRecord }
     * 
     * @return
     *     the new instance of {@link OrganisationServiceRecord }
     */
    public OrganisationServiceRecord createOrganisationServiceRecord() {
        return new OrganisationServiceRecord();
    }

    /**
     * Create an instance of {@link OrganisationService }
     * 
     * @return
     *     the new instance of {@link OrganisationService }
     */
    public OrganisationService createOrganisationService() {
        return new OrganisationService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationServiceRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationServiceRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0", name = "organisationServiceRecord")
    public JAXBElement<OrganisationServiceRecord> createOrganisationServiceRecord(OrganisationServiceRecord value) {
        return new JAXBElement<>(_OrganisationServiceRecord_QNAME, OrganisationServiceRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationService }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0", name = "organisationService")
    public JAXBElement<OrganisationService> createOrganisationService(OrganisationService value) {
        return new JAXBElement<>(_OrganisationService_QNAME, OrganisationService.class, null, value);
    }

}
