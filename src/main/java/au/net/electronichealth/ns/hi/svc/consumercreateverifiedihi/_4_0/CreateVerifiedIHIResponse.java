
package au.net.electronichealth.ns.hi.svc.consumercreateverifiedihi._4_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0.CreateVerifiedIHIResultType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0}createVerifiedIHIResult"/>
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
