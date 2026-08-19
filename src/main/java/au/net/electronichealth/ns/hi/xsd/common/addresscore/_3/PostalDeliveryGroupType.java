
package au.net.electronichealth.ns.hi.xsd.common.addresscore._3;

import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.PostalDeliveryType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PostalDeliveryGroupType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="PostalDeliveryGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postalDeliveryType"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postalDeliveryNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalDeliveryGroupType", propOrder = {
    "postalDeliveryType",
    "postalDeliveryNumber"
})
public class PostalDeliveryGroupType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PostalDeliveryType postalDeliveryType;
    protected String postalDeliveryNumber;

    /**
     * Gets the value of the postalDeliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link PostalDeliveryType }
     *     
     */
    public PostalDeliveryType getPostalDeliveryType() {
        return postalDeliveryType;
    }

    /**
     * Sets the value of the postalDeliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalDeliveryType }
     *     
     */
    public void setPostalDeliveryType(PostalDeliveryType value) {
        this.postalDeliveryType = value;
    }

    /**
     * Gets the value of the postalDeliveryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalDeliveryNumber() {
        return postalDeliveryNumber;
    }

    /**
     * Sets the value of the postalDeliveryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalDeliveryNumber(String value) {
        this.postalDeliveryNumber = value;
    }

}
