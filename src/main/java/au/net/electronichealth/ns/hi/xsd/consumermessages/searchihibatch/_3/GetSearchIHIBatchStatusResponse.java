
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="getSearchIHIBatchStatusResult" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIBatchStatusType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
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
