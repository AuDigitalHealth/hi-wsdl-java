
package au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2;

import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.MediumType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.UsageType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ElectronicCommunication complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ElectronicCommunication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0}medium"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0}details"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0}usage"/&gt;
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
@XmlType(name = "ElectronicCommunication", propOrder = {
    "medium",
    "details",
    "usage",
    "preferred"
})
@XmlSeeAlso({
    ElectronicCommunicationRecord.class
})
public class ElectronicCommunication {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected MediumType medium;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", required = true)
    protected String details;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/ElectronicCommunicationCore/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected UsageType usage;
    protected Boolean preferred;

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link MediumType }
     *     
     */
    public MediumType getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumType }
     *     
     */
    public void setMedium(MediumType value) {
        this.medium = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link UsageType }
     *     
     */
    public UsageType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageType }
     *     
     */
    public void setUsage(UsageType value) {
        this.usage = value;
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
