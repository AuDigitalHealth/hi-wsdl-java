
package au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LinkedProviderType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="LinkedProviderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hpiiNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpiiNumberType"/&gt;
 *         &lt;element name="familyName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}FamilyNameType" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}GivenNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedProviderType", propOrder = {
    "hpiiNumber",
    "familyName",
    "givenName"
})
public class LinkedProviderType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String hpiiNumber;
    protected String familyName;
    protected String givenName;

    /**
     * Gets the value of the hpiiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpiiNumber() {
        return hpiiNumber;
    }

    /**
     * Sets the value of the hpiiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpiiNumber(String value) {
        this.hpiiNumber = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

}
