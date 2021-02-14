
package au.net.electronichealth.ns.hi.xsd.consumercore.address._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.AddressPurposeType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.TrueFalseType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}australianStreetAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}australianPostalAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}internationalAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}purpose"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}preferred"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "australianStreetAddress",
    "australianPostalAddress",
    "internationalAddress",
    "purpose",
    "preferred"
})
public class AddressType {

    protected AustralianStreetAddressType australianStreetAddress;
    protected AustralianPostalAddressType australianPostalAddress;
    protected InternationalAddressType internationalAddress;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", required = true)
    protected AddressPurposeType purpose;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    protected TrueFalseType preferred;

    /**
     * Gets the value of the australianStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianStreetAddressType }
     *     
     */
    public AustralianStreetAddressType getAustralianStreetAddress() {
        return australianStreetAddress;
    }

    /**
     * Sets the value of the australianStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianStreetAddressType }
     *     
     */
    public void setAustralianStreetAddress(AustralianStreetAddressType value) {
        this.australianStreetAddress = value;
    }

    /**
     * Gets the value of the australianPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianPostalAddressType }
     *     
     */
    public AustralianPostalAddressType getAustralianPostalAddress() {
        return australianPostalAddress;
    }

    /**
     * Sets the value of the australianPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianPostalAddressType }
     *     
     */
    public void setAustralianPostalAddress(AustralianPostalAddressType value) {
        this.australianPostalAddress = value;
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
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPurposeType }
     *     
     */
    public AddressPurposeType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPurposeType }
     *     
     */
    public void setPurpose(AddressPurposeType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setPreferred(TrueFalseType value) {
        this.preferred = value;
    }

}
