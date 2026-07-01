
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteSearchIHIBatchResult" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIBatchStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deleteSearchIHIBatchResult"
})
@XmlRootElement(name = "deleteSearchIHIBatchResponse")
public class DeleteSearchIHIBatchResponse {

    @XmlElement(required = true)
    protected SearchIHIBatchStatusType deleteSearchIHIBatchResult;

    /**
     * Gets the value of the deleteSearchIHIBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIHIBatchStatusType }
     *     
     */
    public SearchIHIBatchStatusType getDeleteSearchIHIBatchResult() {
        return deleteSearchIHIBatchResult;
    }

    /**
     * Sets the value of the deleteSearchIHIBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIHIBatchStatusType }
     *     
     */
    public void setDeleteSearchIHIBatchResult(SearchIHIBatchStatusType value) {
        this.deleteSearchIHIBatchResult = value;
    }

}
