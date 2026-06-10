
package au.net.electronichealth.ns.hi.xsd.consumercore.address._3;

import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AustralianUnstructuredStreetAddressType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AustralianUnstructuredStreetAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}addressLineOne"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}addressLineTwo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}suburb"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}state"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postcode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AustralianUnstructuredStreetAddressType", propOrder = {
    "addressLineOne",
    "addressLineTwo",
    "suburb",
    "state",
    "postcode"
})
public class AustralianUnstructuredStreetAddressType {

    @XmlElement(required = true)
    protected String addressLineOne;
    protected String addressLineTwo;
    @XmlElement(required = true)
    protected String suburb;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected StateType state;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", required = true)
    protected String postcode;

    /**
     * Gets the value of the addressLineOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLineOne() {
        return addressLineOne;
    }

    /**
     * Sets the value of the addressLineOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLineOne(String value) {
        this.addressLineOne = value;
    }

    /**
     * Gets the value of the addressLineTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    /**
     * Sets the value of the addressLineTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLineTwo(String value) {
        this.addressLineTwo = value;
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
