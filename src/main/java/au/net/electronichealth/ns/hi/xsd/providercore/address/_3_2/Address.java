
package au.net.electronichealth.ns.hi.xsd.providercore.address._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="australianAddress" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}AustralianAddressType" minOccurs="0"/>
 *         &lt;element name="internationalAddress" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}InternationalAddressType" minOccurs="0"/>
 *         &lt;element name="addressPurpose" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}AddressPurposeAndDateType"/>
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
