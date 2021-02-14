
package au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AustralianAddressCriteriaType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressCriteriaType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}hpiiNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}providerTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}providerSpecialty" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}providerSpecialisation" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}australianAddressCriteria" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}internationalAddressCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    protected String hpiiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected SexType sex;
    protected String providerTypeCode;
    protected String providerSpecialty;
    protected String providerSpecialisation;
    protected AustralianAddressCriteriaType australianAddressCriteria;
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
