
package au.net.electronichealth.ns.hi.xsd.common.addresscore._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.PostalDeliveryType;


/**
 * <p>Java class for PostalDeliveryGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PostalDeliveryGroupType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postalDeliveryType"/>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postalDeliveryNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
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
