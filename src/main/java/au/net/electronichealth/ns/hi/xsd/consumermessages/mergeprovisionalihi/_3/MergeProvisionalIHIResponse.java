
package au.net.electronichealth.ns.hi.xsd.consumermessages.mergeprovisionalihi._3;

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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/MergeProvisionalIHI/3.0}mergeProvisionalIHIResult"/&gt;
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
