
package au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ReferenceSetType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ReferenceSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="referenceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSetType", propOrder = {
    "referenceCode",
    "referenceDescription"
})
public class ReferenceSetType {

    @XmlElement(required = true)
    protected String referenceCode;
    @XmlElement(required = true)
    protected String referenceDescription;

    /**
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    /**
     * Gets the value of the referenceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDescription() {
        return referenceDescription;
    }

    /**
     * Sets the value of the referenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDescription(String value) {
        this.referenceDescription = value;
    }

}
