
package au.net.electronichealth.ns.hi.xsd.consumermessages.resolveprovisionalihi._3;

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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/ResolveProvisionalIHI/3.0}resolveProvisionalIHIResult"/>
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
    "resolveProvisionalIHIResult"
})
@XmlRootElement(name = "resolveProvisionalIHIResponse")
public class ResolveProvisionalIHIResponse {

    @XmlElement(required = true)
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
