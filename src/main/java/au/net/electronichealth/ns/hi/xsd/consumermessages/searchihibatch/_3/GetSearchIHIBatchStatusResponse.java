
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

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
 *         &lt;element name="getSearchIHIBatchStatusResult" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIBatchStatusType"/&gt;
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
