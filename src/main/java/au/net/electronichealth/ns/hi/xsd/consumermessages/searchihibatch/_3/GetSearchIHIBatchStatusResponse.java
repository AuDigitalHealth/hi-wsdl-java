
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
 *         &lt;element name="getSearchIHIBatchStatusResult" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIBatchStatusType"/>
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
    "getSearchIHIBatchStatusResult"
})
@XmlRootElement(name = "getSearchIHIBatchStatusResponse")
public class GetSearchIHIBatchStatusResponse {

    @XmlElement(required = true)
    protected SearchIHIBatchStatusType getSearchIHIBatchStatusResult;

    /**
     * Gets the value of the getSearchIHIBatchStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIHIBatchStatusType }
     *     
     */
    public SearchIHIBatchStatusType getGetSearchIHIBatchStatusResult() {
        return getSearchIHIBatchStatusResult;
    }

    /**
     * Sets the value of the getSearchIHIBatchStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIHIBatchStatusType }
     *     
     */
    public void setGetSearchIHIBatchStatusResult(SearchIHIBatchStatusType value) {
        this.getSearchIHIBatchStatusResult = value;
    }

}
