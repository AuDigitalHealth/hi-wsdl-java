
package au.net.electronichealth.ns.hi.svc.consumerresolveprovisionalihi._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.resolveprovisionalihi._3.ResolveProvisionalIHIResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/ResolveProvisionalIHI/3.0}resolveProvisionalIHIResult"/>
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
