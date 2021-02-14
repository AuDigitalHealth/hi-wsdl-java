
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryfororganisation._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AustralianAddressCriteriaType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.InternationalAddressCriteriaType;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2.OrganisationDetails;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}hpioNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}name" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}organisationType" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}serviceType" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}unitType" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0}organisationDetails" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}australianAddressCriteria" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}internationalAddressCriteria" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}linkSearchType" minOccurs="0"/>
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
    "hpioNumber",
    "name",
    "organisationType",
    "serviceType",
    "unitType",
    "organisationDetails",
    "australianAddressCriteria",
    "internationalAddressCriteria",
    "linkSearchType"
})
@XmlRootElement(name = "searchHIProviderDirectoryForOrganisation")
public class SearchHIProviderDirectoryForOrganisation {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected String hpioNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected String name;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected String organisationType;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected String serviceType;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected String unitType;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0")
    protected OrganisationDetails organisationDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected AustralianAddressCriteriaType australianAddressCriteria;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected InternationalAddressCriteriaType internationalAddressCriteria;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0")
    protected String linkSearchType;

    /**
     * Gets the value of the hpioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpioNumber() {
        return hpioNumber;
    }

    /**
     * Sets the value of the hpioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpioNumber(String value) {
        this.hpioNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationType(String value) {
        this.organisationType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the organisationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationDetails }
     *     
     */
    public OrganisationDetails getOrganisationDetails() {
        return organisationDetails;
    }

    /**
     * Sets the value of the organisationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationDetails }
     *     
     */
    public void setOrganisationDetails(OrganisationDetails value) {
        this.organisationDetails = value;
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

    /**
     * Gets the value of the linkSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkSearchType() {
        return linkSearchType;
    }

    /**
     * Sets the value of the linkSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkSearchType(String value) {
        this.linkSearchType = value;
    }

}
