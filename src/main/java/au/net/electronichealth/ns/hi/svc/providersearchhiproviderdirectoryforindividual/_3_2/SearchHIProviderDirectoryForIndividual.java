
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryforindividual._3_2;

import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AustralianAddressCriteriaType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressCriteriaType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}hpiiNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}providerTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}providerSpecialty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}providerSpecialisation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}australianAddressCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}internationalAddressCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hpiiNumber",
    "familyName",
    "givenName",
    "sex",
    "providerTypeCode",
    "providerSpecialty",
    "providerSpecialisation",
    "australianAddressCriteria",
    "internationalAddressCriteria"
})
@XmlRootElement(name = "searchHIProviderDirectoryForIndividual")
public class SearchHIProviderDirectoryForIndividual {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0")
    @XmlSchemaType(name = "anyURI")
    protected String hpiiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "string")
    protected SexType sex;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0")
    protected String providerTypeCode;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0")
    protected String providerSpecialty;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0")
    protected String providerSpecialisation;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0")
    protected AustralianAddressCriteriaType australianAddressCriteria;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0")
    protected InternationalAddressCriteriaType internationalAddressCriteria;

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

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

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
     * Gets the value of the australianAddressCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianAddressCriteriaType }
     *     
     */
    public AustralianAddressCriteriaType getAustralianAddressCriteria() {
        return australianAddressCriteria;
    }

    /**
     * Sets the value of the australianAddressCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianAddressCriteriaType }
     *     
     */
    public void setAustralianAddressCriteria(AustralianAddressCriteriaType value) {
        this.australianAddressCriteria = value;
    }

    /**
     * Gets the value of the internationalAddressCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAddressCriteriaType }
     *     
     */
    public InternationalAddressCriteriaType getInternationalAddressCriteria() {
        return internationalAddressCriteria;
    }

    /**
     * Sets the value of the internationalAddressCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAddressCriteriaType }
     *     
     */
    public void setInternationalAddressCriteria(InternationalAddressCriteriaType value) {
        this.internationalAddressCriteria = value;
    }

}
