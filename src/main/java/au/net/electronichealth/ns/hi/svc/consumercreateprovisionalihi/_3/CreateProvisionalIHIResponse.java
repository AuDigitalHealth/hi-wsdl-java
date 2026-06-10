
package au.net.electronichealth.ns.hi.svc.consumercreateprovisionalihi._3;

import au.net.electronichealth.ns.hi.xsd.consumermessages.createprovisionalihi._3.CreateProvisionalIHIResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateProvisionalIHI/3.0}createProvisionalIHIResult"/&gt;
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
    "createProvisionalIHIResult"
})
@XmlRootElement(name = "createProvisionalIHIResponse")
public class CreateProvisionalIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/CreateProvisionalIHI/3.0", required = true)
    protected CreateProvisionalIHIResult createProvisionalIHIResult;

    /**
     * Gets the value of the createProvisionalIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateProvisionalIHIResult }
     *     
     */
    public CreateProvisionalIHIResult getCreateProvisionalIHIResult() {
        return createProvisionalIHIResult;
    }

    /**
     * Sets the value of the createProvisionalIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateProvisionalIHIResult }
     *     
     */
    public void setCreateProvisionalIHIResult(CreateProvisionalIHIResult value) {
        this.createProvisionalIHIResult = value;
    }

}
