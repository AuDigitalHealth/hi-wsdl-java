
package au.net.electronichealth.ns.hi.xsd.consumermessages.updateprovisionalihi._3;

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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/UpdateProvisionalIHI/3.0}updateProvisionalIHIResult"/>
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
