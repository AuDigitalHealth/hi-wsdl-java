
package au.net.electronichealth.ns.hi.svc.consumercreateverifiedihi._4_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0.CreateVerifiedIHIResultType;


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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0}createVerifiedIHIResult"/>
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
    "createVerifiedIHIResult"
})
@XmlRootElement(name = "createVerifiedIHIResponse")
public class CreateVerifiedIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0", required = true)
    protected CreateVerifiedIHIResultType createVerifiedIHIResult;

    /**
     * Gets the value of the createVerifiedIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateVerifiedIHIResultType }
     *     
     */
    public CreateVerifiedIHIResultType getCreateVerifiedIHIResult() {
        return createVerifiedIHIResult;
    }

    /**
     * Sets the value of the createVerifiedIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateVerifiedIHIResultType }
     *     
     */
    public void setCreateVerifiedIHIResult(CreateVerifiedIHIResultType value) {
        this.createVerifiedIHIResult = value;
    }

}
