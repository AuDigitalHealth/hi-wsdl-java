
package au.net.electronichealth.ns.hi.svc.consumercreateunverifiedihi._3_0;

import au.net.electronichealth.ns.hi.xsd.consumermessages.createunverifiedihi._3.CreateUnverifiedIHIResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateUnverifiedIHI/3.0}createUnverifiedIHIResult"/&gt;
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
    "createUnverifiedIHIResult"
})
@XmlRootElement(name = "createUnverifiedIHIResponse")
public class CreateUnverifiedIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateUnverifiedIHI/3.0", required = true)
    protected CreateUnverifiedIHIResult createUnverifiedIHIResult;

    /**
     * Gets the value of the createUnverifiedIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUnverifiedIHIResult }
     *     
     */
    public CreateUnverifiedIHIResult getCreateUnverifiedIHIResult() {
        return createUnverifiedIHIResult;
    }

    /**
     * Sets the value of the createUnverifiedIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUnverifiedIHIResult }
     *     
     */
    public void setCreateUnverifiedIHIResult(CreateUnverifiedIHIResult value) {
        this.createUnverifiedIHIResult = value;
    }

}
