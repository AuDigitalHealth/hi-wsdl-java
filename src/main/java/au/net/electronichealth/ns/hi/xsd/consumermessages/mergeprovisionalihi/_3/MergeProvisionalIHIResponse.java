
package au.net.electronichealth.ns.hi.xsd.consumermessages.mergeprovisionalihi._3;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/MergeProvisionalIHI/3.0}mergeProvisionalIHIResult"/>
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
    "mergeProvisionalIHIResult"
})
@XmlRootElement(name = "mergeProvisionalIHIResponse")
public class MergeProvisionalIHIResponse {

    @XmlElement(required = true)
    protected MergeProvisionalIHIResult mergeProvisionalIHIResult;

    /**
     * Gets the value of the mergeProvisionalIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link MergeProvisionalIHIResult }
     *     
     */
    public MergeProvisionalIHIResult getMergeProvisionalIHIResult() {
        return mergeProvisionalIHIResult;
    }

    /**
     * Sets the value of the mergeProvisionalIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeProvisionalIHIResult }
     *     
     */
    public void setMergeProvisionalIHIResult(MergeProvisionalIHIResult value) {
        this.mergeProvisionalIHIResult = value;
    }

}
