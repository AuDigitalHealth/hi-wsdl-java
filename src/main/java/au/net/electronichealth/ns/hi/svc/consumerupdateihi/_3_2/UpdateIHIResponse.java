
package au.net.electronichealth.ns.hi.svc.consumerupdateihi._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.updateihi._3_2.UpdateIHIResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/UpdateIHI/3.2.0}updateIHIResult"/>
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
    "updateIHIResult"
})
@XmlRootElement(name = "updateIHIResponse")
public class UpdateIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/UpdateIHI/3.2.0", required = true)
    protected UpdateIHIResult updateIHIResult;

    /**
     * Gets the value of the updateIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIHIResult }
     *     
     */
    public UpdateIHIResult getUpdateIHIResult() {
        return updateIHIResult;
    }

    /**
     * Sets the value of the updateIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIHIResult }
     *     
     */
    public void setUpdateIHIResult(UpdateIHIResult value) {
        this.updateIHIResult = value;
    }

}
