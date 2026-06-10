
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1 package. 
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

    private static final QName _BatchSearchForProviderIndividualCriteria_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0", "batchSearchForProviderIndividualCriteria");
    private static final QName _BatchSearchForProviderIndividualResult_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0", "batchSearchForProviderIndividualResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BatchSearchForProviderIndividualCriteriaType }
     * 
     * @return
     *     the new instance of {@link BatchSearchForProviderIndividualCriteriaType }
     */
    public BatchSearchForProviderIndividualCriteriaType createBatchSearchForProviderIndividualCriteriaType() {
        return new BatchSearchForProviderIndividualCriteriaType();
    }

    /**
     * Create an instance of {@link BatchSearchForProviderIndividualResultType }
     * 
     * @return
     *     the new instance of {@link BatchSearchForProviderIndividualResultType }
     */
    public BatchSearchForProviderIndividualResultType createBatchSearchForProviderIndividualResultType() {
        return new BatchSearchForProviderIndividualResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchSearchForProviderIndividualCriteriaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchSearchForProviderIndividualCriteriaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0", name = "batchSearchForProviderIndividualCriteria")
    public JAXBElement<BatchSearchForProviderIndividualCriteriaType> createBatchSearchForProviderIndividualCriteria(BatchSearchForProviderIndividualCriteriaType value) {
        return new JAXBElement<>(_BatchSearchForProviderIndividualCriteria_QNAME, BatchSearchForProviderIndividualCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchSearchForProviderIndividualResultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BatchSearchForProviderIndividualResultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0", name = "batchSearchForProviderIndividualResult")
    public JAXBElement<BatchSearchForProviderIndividualResultType> createBatchSearchForProviderIndividualResult(BatchSearchForProviderIndividualResultType value) {
        return new JAXBElement<>(_BatchSearchForProviderIndividualResult_QNAME, BatchSearchForProviderIndividualResultType.class, null, value);
    }

}
