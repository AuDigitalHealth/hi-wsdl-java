
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3 package. 
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

    private final static QName _BatchIdentifier_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0", "batchIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchIHIResultType }
     * 
     */
    public SearchIHIResultType createSearchIHIResultType() {
        return new SearchIHIResultType();
    }

    /**
     * Create an instance of {@link SearchIHIRequestType }
     * 
     */
    public SearchIHIRequestType createSearchIHIRequestType() {
        return new SearchIHIRequestType();
    }

    /**
     * Create an instance of {@link RetrieveSearchIHIBatch }
     * 
     */
    public RetrieveSearchIHIBatch createRetrieveSearchIHIBatch() {
        return new RetrieveSearchIHIBatch();
    }

    /**
     * Create an instance of {@link SubmitSearchIHIBatch }
     * 
     */
    public SubmitSearchIHIBatch createSubmitSearchIHIBatch() {
        return new SubmitSearchIHIBatch();
    }

    /**
     * Create an instance of {@link DeleteSearchIHIBatch }
     * 
     */
    public DeleteSearchIHIBatch createDeleteSearchIHIBatch() {
        return new DeleteSearchIHIBatch();
    }

    /**
     * Create an instance of {@link GetSearchIHIBatchStatusResponse }
     * 
     */
    public GetSearchIHIBatchStatusResponse createGetSearchIHIBatchStatusResponse() {
        return new GetSearchIHIBatchStatusResponse();
    }

    /**
     * Create an instance of {@link SearchIHIBatchStatusType }
     * 
     */
    public SearchIHIBatchStatusType createSearchIHIBatchStatusType() {
        return new SearchIHIBatchStatusType();
    }

    /**
     * Create an instance of {@link GetSearchIHIBatchStatus }
     * 
     */
    public GetSearchIHIBatchStatus createGetSearchIHIBatchStatus() {
        return new GetSearchIHIBatchStatus();
    }

    /**
     * Create an instance of {@link RetrieveSearchIHIBatchResponse }
     * 
     */
    public RetrieveSearchIHIBatchResponse createRetrieveSearchIHIBatchResponse() {
        return new RetrieveSearchIHIBatchResponse();
    }

    /**
     * Create an instance of {@link SubmitSearchIHIBatchResponse }
     * 
     */
    public SubmitSearchIHIBatchResponse createSubmitSearchIHIBatchResponse() {
        return new SubmitSearchIHIBatchResponse();
    }

    /**
     * Create an instance of {@link DeleteSearchIHIBatchResponse }
     * 
     */
    public DeleteSearchIHIBatchResponse createDeleteSearchIHIBatchResponse() {
        return new DeleteSearchIHIBatchResponse();
    }

    /**
     * Create an instance of {@link SearchIHIBatchRetrieveRequestType }
     * 
     */
    public SearchIHIBatchRetrieveRequestType createSearchIHIBatchRetrieveRequestType() {
        return new SearchIHIBatchRetrieveRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0", name = "batchIdentifier")
    public JAXBElement<String> createBatchIdentifier(String value) {
        return new JAXBElement<String>(_BatchIdentifier_QNAME, String.class, null, value);
    }

}
