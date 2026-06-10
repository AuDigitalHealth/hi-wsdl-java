
package au.net.electronichealth.ns.hi.xsd.consumercore.ihi._3;

import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.SourceOfDeathNotificationType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for IndividualHealthcareIdentityType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="IndividualHealthcareIdentityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirth"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirthAccuracyIndicator"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}birthPlurality" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}birthOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfDeath" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfDeathAccuracyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}sourceOfDeathNotification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualHealthcareIdentityType", propOrder = {
    "dateOfBirth",
    "dateOfBirthAccuracyIndicator",
    "sex",
    "birthPlurality",
    "birthOrder",
    "dateOfDeath",
    "dateOfDeathAccuracyIndicator",
    "sourceOfDeathNotification"
})
public class IndividualHealthcareIdentityType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected DateAccuracyIndicatorType dateOfBirthAccuracyIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected SexType sex;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String birthPlurality;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String birthOrder;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "string")
    protected DateAccuracyIndicatorType dateOfDeathAccuracyIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    @XmlSchemaType(name = "token")
    protected SourceOfDeathNotificationType sourceOfDeathNotification;

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfBirthAccuracyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DateAccuracyIndicatorType }
     *     
     */
    public DateAccuracyIndicatorType getDateOfBirthAccuracyIndicator() {
        return dateOfBirthAccuracyIndicator;
    }

    /**
     * Sets the value of the dateOfBirthAccuracyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAccuracyIndicatorType }
     *     
     */
    public void setDateOfBirthAccuracyIndicator(DateAccuracyIndicatorType value) {
        this.dateOfBirthAccuracyIndicator = value;
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
     * Gets the value of the birthPlurality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlurality() {
        return birthPlurality;
    }

    /**
     * Sets the value of the birthPlurality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlurality(String value) {
        this.birthPlurality = value;
    }

    /**
     * Gets the value of the birthOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthOrder() {
        return birthOrder;
    }

    /**
     * Sets the value of the birthOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthOrder(String value) {
        this.birthOrder = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the dateOfDeathAccuracyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DateAccuracyIndicatorType }
     *     
     */
    public DateAccuracyIndicatorType getDateOfDeathAccuracyIndicator() {
        return dateOfDeathAccuracyIndicator;
    }

    /**
     * Sets the value of the dateOfDeathAccuracyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAccuracyIndicatorType }
     *     
     */
    public void setDateOfDeathAccuracyIndicator(DateAccuracyIndicatorType value) {
        this.dateOfDeathAccuracyIndicator = value;
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
