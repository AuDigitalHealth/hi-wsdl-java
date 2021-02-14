
package au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DateAndAccuracyType;


/**
 * <p>Java class for OrganisationService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisationType" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}OrganisationType"/>
 *         &lt;element name="organisationServiceType" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}ServiceType"/>
 *         &lt;element name="organisationServiceUnit" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}ServiceUnitType" minOccurs="0"/>
 *         &lt;element name="organisationServiceComments" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}ServiceCommentsType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType"/>
 *         &lt;element name="endDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationService", propOrder = {
    "organisationType",
    "organisationServiceType",
    "organisationServiceUnit",
    "organisationServiceComments",
    "startDate",
    "endDate"
})
@XmlSeeAlso({
    OrganisationServiceRecord.class
})
public class OrganisationService {

    @XmlElement(required = true)
    protected String organisationType;
    @XmlElement(required = true)
    protected String organisationServiceType;
    protected String organisationServiceUnit;
    protected String organisationServiceComments;
    @XmlElement(required = true)
    protected DateAndAccuracyType startDate;
    protected DateAndAccuracyType endDate;

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
     * Gets the value of the organisationServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationServiceType() {
        return organisationServiceType;
    }

    /**
     * Sets the value of the organisationServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationServiceType(String value) {
        this.organisationServiceType = value;
    }

    /**
     * Gets the value of the organisationServiceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationServiceUnit() {
        return organisationServiceUnit;
    }

    /**
     * Sets the value of the organisationServiceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationServiceUnit(String value) {
        this.organisationServiceUnit = value;
    }

    /**
     * Gets the value of the organisationServiceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationServiceComments() {
        return organisationServiceComments;
    }

    /**
     * Sets the value of the organisationServiceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationServiceComments(String value) {
        this.organisationServiceComments = value;
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

}
