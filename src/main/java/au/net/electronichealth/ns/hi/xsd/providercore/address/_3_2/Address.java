
package au.net.electronichealth.ns.hi.xsd.providercore.address._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Address complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="australianAddress" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}AustralianAddressType" minOccurs="0"/&gt;
 *         &lt;element name="internationalAddress" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}InternationalAddressType" minOccurs="0"/&gt;
 *         &lt;element name="addressPurpose" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}AddressPurposeAndDateType"/&gt;
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "australianAddress",
    "internationalAddress",
    "addressPurpose",
    "preferred"
})
@XmlSeeAlso({
    AddressRecord.class
})
public class Address {

    protected AustralianAddressType australianAddress;
    protected InternationalAddressType internationalAddress;
    @XmlElement(required = true)
    protected AddressPurposeAndDateType addressPurpose;
    protected Boolean preferred;

    /**
     * Gets the value of the australianAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianAddressType }
     *     
     */
    public AustralianAddressType getAustralianAddress() {
        return australianAddress;
    }

    /**
     * Sets the value of the australianAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianAddressType }
     *     
     */
    public void setAustralianAddress(AustralianAddressType value) {
        this.australianAddress = value;
    }

    /**
     * Gets the value of the internationalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAddressType }
     *     
     */
    public InternationalAddressType getInternationalAddress() {
        return internationalAddress;
    }

    /**
     * Sets the value of the internationalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAddressType }
     *     
     */
    public void setInternationalAddress(InternationalAddressType value) {
        this.internationalAddress = value;
    }

    /**
     * Gets the value of the addressPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPurposeAndDateType }
     *     
     */
    public AddressPurposeAndDateType getAddressPurpose() {
        return addressPurpose;
    }

    /**
     * Sets the value of the addressPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPurposeAndDateType }
     *     
     */
    public void setAddressPurpose(AddressPurposeAndDateType value) {
        this.addressPurpose = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

}
