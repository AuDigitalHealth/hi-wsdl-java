
package au.net.electronichealth.ns.hi.xsd.consumermessages.updateprovisionalihi._3;

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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/UpdateProvisionalIHI/3.0}updateProvisionalIHIResult"/&gt;
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
    "updateProvisionalIHIResult"
})
@XmlRootElement(name = "updateProvisionalIHIResponse")
public class UpdateProvisionalIHIResponse {

    @XmlElement(required = true)
    protected UpdateProvisionalIHIResult updateProvisionalIHIResult;

    /**
     * Gets the value of the updateProvisionalIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateProvisionalIHIResult }
     *     
     */
    public UpdateProvisionalIHIResult getUpdateProvisionalIHIResult() {
        return updateProvisionalIHIResult;
    }

    /**
     * Sets the value of the updateProvisionalIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateProvisionalIHIResult }
     *     
     */
    public void setUpdateProvisionalIHIResult(UpdateProvisionalIHIResult value) {
        this.updateProvisionalIHIResult = value;
    }

}
