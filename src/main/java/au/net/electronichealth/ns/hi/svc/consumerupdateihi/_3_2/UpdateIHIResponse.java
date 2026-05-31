
package au.net.electronichealth.ns.hi.svc.consumerupdateihi._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.updateihi._3_2.UpdateIHIResult;


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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/UpdateIHI/3.2.0}updateIHIResult"/>
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
