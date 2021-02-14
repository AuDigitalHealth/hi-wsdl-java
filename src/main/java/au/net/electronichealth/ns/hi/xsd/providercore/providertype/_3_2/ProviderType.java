
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DateAndAccuracyType;


/**
 * <p>Java class for ProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerTypeCode" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}ProviderTypeCode"/>
 *         &lt;element name="startDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType"/>
 *         &lt;element name="endDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType" minOccurs="0"/>
 *         &lt;element name="providerSpecialty" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}ProviderSpecialtyType" minOccurs="0"/>
 *         &lt;element name="providerSpecialisation" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}ProviderSpecialisationType" minOccurs="0"/>
 *         &lt;element name="registrationId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}RegistrationIdType" minOccurs="0"/>
 *         &lt;element name="registrationType" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}RegistrationType" minOccurs="0"/>
 *         &lt;element name="registrationIssuer" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}RegistrationIssuerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderType", propOrder = {
    "providerTypeCode",
    "startDate",
    "endDate",
    "providerSpecialty",
    "providerSpecialisation",
    "registrationId",
    "registrationType",
    "registrationIssuer"
})
@XmlSeeAlso({
    ProviderTypeRecord.class
})
public class ProviderType {

    @XmlElement(required = true)
    protected String providerTypeCode;
    @XmlElement(required = true)
    protected DateAndAccuracyType startDate;
    protected DateAndAccuracyType endDate;
    protected String providerSpecialty;
    protected String providerSpecialisation;
    protected String registrationId;
    protected String registrationType;
    protected String registrationIssuer;

    /**
     * Gets the value of the providerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderTypeCode() {
        return providerTypeCode;
    }

    /**
     * Sets the value of the providerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderTypeCode(String value) {
        this.providerTypeCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public DateAndAccuracyType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public void setStartDate(DateAndAccuracyType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public DateAndAccuracyType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public void setEndDate(DateAndAccuracyType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the providerSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderSpecialty() {
        return providerSpecialty;
    }

    /**
     * Sets the value of the providerSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderSpecialty(String value) {
        this.providerSpecialty = value;
    }

    /**
     * Gets the value of the providerSpecialisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderSpecialisation() {
        return providerSpecialisation;
    }

    /**
     * Sets the value of the providerSpecialisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderSpecialisation(String value) {
        this.providerSpecialisation = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the registrationIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationIssuer() {
        return registrationIssuer;
    }

    /**
     * Sets the value of the registrationIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationIssuer(String value) {
        this.registrationIssuer = value;
    }

}
