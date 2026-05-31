
package au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2;

import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DateAndAccuracyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DeathNotificationType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="DeathNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateOfDeath" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType"/&gt;
 *         &lt;element name="sourceOfDeathNotification" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}SourceOfDeathNotificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeathNotificationType", propOrder = {
    "dateOfDeath",
    "sourceOfDeathNotification"
})
public class DeathNotificationType {

    @XmlElement(required = true)
    protected DateAndAccuracyType dateOfDeath;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SourceOfDeathNotificationType sourceOfDeathNotification;

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public DateAndAccuracyType getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public void setDateOfDeath(DateAndAccuracyType value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the sourceOfDeathNotification property.
     * 
     * @return
     *     possible object is
     *     {@link SourceOfDeathNotificationType }
     *     
     */
    public SourceOfDeathNotificationType getSourceOfDeathNotification() {
        return sourceOfDeathNotification;
    }

    /**
     * Sets the value of the sourceOfDeathNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOfDeathNotificationType }
     *     
     */
    public void setSourceOfDeathNotification(SourceOfDeathNotificationType value) {
        this.sourceOfDeathNotification = value;
    }

}
