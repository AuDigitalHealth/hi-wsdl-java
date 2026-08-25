
package au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrganisationName complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="OrganisationName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}NameType"/&gt;
 *         &lt;element name="nameUsage" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0}NameUsageType"/&gt;
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationName", propOrder = {
    "name",
    "nameUsage",
    "preferred"
})
@XmlSeeAlso({
    OrganisationNameRecord.class
})
public class OrganisationName {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected NameUsageType nameUsage;
    protected Boolean preferred;

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
     * Gets the value of the nameUsage property.
     * 
     * @return
     *     possible object is
     *     {@link NameUsageType }
     *     
     */
    public NameUsageType getNameUsage() {
        return nameUsage;
    }

    /**
     * Sets the value of the nameUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameUsageType }
     *     
     */
    public void setNameUsage(NameUsageType value) {
        this.nameUsage = value;
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
