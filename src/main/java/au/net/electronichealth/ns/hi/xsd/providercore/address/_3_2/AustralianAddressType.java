
package au.net.electronichealth.ns.hi.xsd.providercore.address._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.addresscore._3.LevelGroupType;
import au.net.electronichealth.ns.hi.xsd.common.addresscore._3.PostalDeliveryGroupType;
import au.net.electronichealth.ns.hi.xsd.common.addresscore._3.UnitGroupType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StreetSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StreetType;


/**
 * 
 *         An AddressType should not contain both 'addressLine' and 'unstructuredAddressLine' elements.
 *     
 * 
 * <p>Java class for AustralianAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AustralianAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}unitGroup" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}addressSiteName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}levelGroup" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}streetNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}lotNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}streetName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}streetType" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}streetSuffix" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postalDeliveryGroup" minOccurs="0"/>
 *         &lt;element name="unstructuredAddressLine" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}UnstructuredAddressLineType" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}suburb"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}state"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postcode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AustralianAddressType", propOrder = {
    "unitGroup",
    "addressSiteName",
    "levelGroup",
    "streetNumber",
    "lotNumber",
    "streetName",
    "streetType",
    "streetSuffix",
    "postalDeliveryGroup",
    "unstructuredAddressLine",
    "suburb",
    "state",
    "postcode"
})
public class AustralianAddressType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected UnitGroupType unitGroup;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected String addressSiteName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected LevelGroupType levelGroup;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected String streetNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected String lotNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected String streetName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected StreetType streetType;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected StreetSuffixType streetSuffix;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected PostalDeliveryGroupType postalDeliveryGroup;
    protected String unstructuredAddressLine;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", required = true)
    protected String suburb;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", required = true)
    protected StateType state;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", required = true)
    protected String postcode;

    /**
     * Gets the value of the unitGroup property.
     * 
     * @return
     *     possible object is
     *     {@link UnitGroupType }
     *     
     */
    public UnitGroupType getUnitGroup() {
        return unitGroup;
    }

    /**
     * Sets the value of the unitGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitGroupType }
     *     
     */
    public void setUnitGroup(UnitGroupType value) {
        this.unitGroup = value;
    }

    /**
     * Gets the value of the addressSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSiteName() {
        return addressSiteName;
    }

    /**
     * Sets the value of the addressSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSiteName(String value) {
        this.addressSiteName = value;
    }

    /**
     * Gets the value of the levelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link LevelGroupType }
     *     
     */
    public LevelGroupType getLevelGroup() {
        return levelGroup;
    }

    /**
     * Sets the value of the levelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelGroupType }
     *     
     */
    public void setLevelGroup(LevelGroupType value) {
        this.levelGroup = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link StreetType }
     *     
     */
    public StreetType getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetType }
     *     
     */
    public void setStreetType(StreetType value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link StreetSuffixType }
     *     
     */
    public StreetSuffixType getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetSuffixType }
     *     
     */
    public void setStreetSuffix(StreetSuffixType value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the postalDeliveryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PostalDeliveryGroupType }
     *     
     */
    public PostalDeliveryGroupType getPostalDeliveryGroup() {
        return postalDeliveryGroup;
    }

    /**
     * Sets the value of the postalDeliveryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalDeliveryGroupType }
     *     
     */
    public void setPostalDeliveryGroup(PostalDeliveryGroupType value) {
        this.postalDeliveryGroup = value;
    }

    /**
     * Gets the value of the unstructuredAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnstructuredAddressLine() {
        return unstructuredAddressLine;
    }

    /**
     * Sets the value of the unstructuredAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnstructuredAddressLine(String value) {
        this.unstructuredAddressLine = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

}
