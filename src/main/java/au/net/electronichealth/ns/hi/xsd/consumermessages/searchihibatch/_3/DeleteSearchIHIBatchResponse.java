
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteSearchIHIBatchResult" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIBatchStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
