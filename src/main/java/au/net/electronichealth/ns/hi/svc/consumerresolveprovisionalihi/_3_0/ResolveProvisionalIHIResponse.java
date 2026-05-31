
package au.net.electronichealth.ns.hi.svc.consumerresolveprovisionalihi._3_0;

import au.net.electronichealth.ns.hi.xsd.consumermessages.resolveprovisionalihi._3.ResolveProvisionalIHIResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/ResolveProvisionalIHI/3.0}resolveProvisionalIHIResult"/&gt;
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
    "resolveProvisionalIHIResult"
})
@XmlRootElement(name = "resolveProvisionalIHIResponse")
public class ResolveProvisionalIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/ResolveProvisionalIHI/3.0", required = true)
    protected ResolveProvisionalIHIResult resolveProvisionalIHIResult;

    /**
     * Gets the value of the resolveProvisionalIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResolveProvisionalIHIResult }
     *     
     */
    public ResolveProvisionalIHIResult getResolveProvisionalIHIResult() {
        return resolveProvisionalIHIResult;
    }

    /**
     * Sets the value of the resolveProvisionalIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolveProvisionalIHIResult }
     *     
     */
    public void setResolveProvisionalIHIResult(ResolveProvisionalIHIResult value) {
        this.resolveProvisionalIHIResult = value;
    }

}
