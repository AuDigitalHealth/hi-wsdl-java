
package au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DateAndAccuracyType;


/**
 * <p>Java class for DeathNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeathNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOfDeath" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType"/>
 *         &lt;element name="sourceOfDeathNotification" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}SourceOfDeathNotificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
