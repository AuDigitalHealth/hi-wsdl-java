
package au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0;

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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateVerifiedIHI/4.0.0}createVerifiedIHIResult"/&gt;
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
    "createVerifiedIHIResult"
})
@XmlRootElement(name = "createVerifiedIHIResponse")
public class CreateVerifiedIHIResponse {

    @XmlElement(required = true)
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
