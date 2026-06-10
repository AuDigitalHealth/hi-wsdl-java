
package au.net.electronichealth.ns.hi.svc.consumersearchihibatchasync._3;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3.SearchIHIResultType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchIHIBatchResult" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIResultType" maxOccurs="2000"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}batchIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchIHIBatchResult",
    "batchIdentifier"
})
@XmlRootElement(name = "retrieveSearchIHIBatchResponse")
public class RetrieveSearchIHIBatchResponse {

    @XmlElement(required = true)
    protected List<SearchIHIResultType> searchIHIBatchResult;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0", required = true)
    protected String batchIdentifier;

    /**
     * Gets the value of the searchIHIBatchResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the searchIHIBatchResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchIHIBatchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchIHIResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchIHIBatchResult property.
     */
    public List<SearchIHIResultType> getSearchIHIBatchResult() {
        if (searchIHIBatchResult == null) {
            searchIHIBatchResult = new ArrayList<>();
        }
        return this.searchIHIBatchResult;
    }

    /**
     * Gets the value of the batchIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchIdentifier() {
        return batchIdentifier;
    }

    /**
     * Sets the value of the batchIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchIdentifier(String value) {
        this.batchIdentifier = value;
    }

}
