
package au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}NameType"/>
 *         &lt;element name="nameUsage" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0}NameUsageType"/>
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
