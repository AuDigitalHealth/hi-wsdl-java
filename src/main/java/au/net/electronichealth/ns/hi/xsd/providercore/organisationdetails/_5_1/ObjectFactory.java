
package au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1 package. 
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

    private final static QName _BatchSearchForProviderOrganisationResult_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0", "batchSearchForProviderOrganisationResult");
    private final static QName _BatchSearchForProviderOrganisationCriteria_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0", "batchSearchForProviderOrganisationCriteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BatchSearchForProviderOrganisationResultType }
     * 
     */
    public BatchSearchForProviderOrganisationResultType createBatchSearchForProviderOrganisationResultType() {
        return new BatchSearchForProviderOrganisationResultType();
    }

    /**
     * Create an instance of {@link BatchSearchForProviderOrganisationCriteriaType }
     * 
     */
    public BatchSearchForProviderOrganisationCriteriaType createBatchSearchForProviderOrganisationCriteriaType() {
        return new BatchSearchForProviderOrganisationCriteriaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchSearchForProviderOrganisationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0", name = "batchSearchForProviderOrganisationResult")
    public JAXBElement<BatchSearchForProviderOrganisationResultType> createBatchSearchForProviderOrganisationResult(BatchSearchForProviderOrganisationResultType value) {
        return new JAXBElement<BatchSearchForProviderOrganisationResultType>(_BatchSearchForProviderOrganisationResult_QNAME, BatchSearchForProviderOrganisationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchSearchForProviderOrganisationCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0", name = "batchSearchForProviderOrganisationCriteria")
    public JAXBElement<BatchSearchForProviderOrganisationCriteriaType> createBatchSearchForProviderOrganisationCriteria(BatchSearchForProviderOrganisationCriteriaType value) {
        return new JAXBElement<BatchSearchForProviderOrganisationCriteriaType>(_BatchSearchForProviderOrganisationCriteria_QNAME, BatchSearchForProviderOrganisationCriteriaType.class, null, value);
    }

}
