
package au.net.electronichealth.ns.hi.svc.consumercreateunverifiedihi._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.createunverifiedihi._3.CreateUnverifiedIHIResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateUnverifiedIHI/3.0}createUnverifiedIHIResult"/>
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
