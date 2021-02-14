
package au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2 package. 
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

    private final static QName _OrganisationDetails_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0", "organisationDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganisationDetails }
     * 
     */
    public OrganisationDetails createOrganisationDetails() {
        return new OrganisationDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0", name = "organisationDetails")
    public JAXBElement<OrganisationDetails> createOrganisationDetails(OrganisationDetails value) {
        return new JAXBElement<OrganisationDetails>(_OrganisationDetails_QNAME, OrganisationDetails.class, null, value);
    }

}
