
package au.net.electronichealth.ns.hi.xsd.consumermessages.createverifiedihi._4_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.IndividualNameUsageType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.consumercore.address._3.AddressType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.SourceOfDeathNotificationType;
import au.net.electronichealth.ns.hi.xsd.consumercore.electroniccommunication._3.ElectronicCommunicationType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for CreateVerifiedIHIType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CreateVerifiedIHIType"&gt;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ElectronicCommunication/3.0}electronicCommunication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}nameTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0}onlyNameIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}nameSuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}usage"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0}conditionalUse" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}address"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}privacyNotification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVerifiedIHIType", propOrder = {
    "dateOfBirth",
    "dateOfBirthAccuracyIndicator",
    "sex",
    "birthPlurality",
    "birthOrder",
    "dateOfDeath",
    "dateOfDeathAccuracyIndicator",
    "sourceOfDeathNotification",
    "electronicCommunication",
    "nameTitle",
    "familyName",
    "givenName",
    "onlyNameIndicator",
    "nameSuffix",
    "usage",
    "conditionalUse",
    "address",
    "privacyNotification"
})
public class CreateVerifiedIHIType {

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
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ElectronicCommunication/3.0")
    protected List<ElectronicCommunicationType> electronicCommunication;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String nameTitle;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected List<String> givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0")
    protected Boolean onlyNameIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    @XmlSchemaType(name = "string")
    protected NameSuffixType nameSuffix;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected IndividualNameUsageType usage;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.0")
    protected String conditionalUse;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0", required = true)
    protected AddressType address;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    protected boolean privacyNotification;

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

    /**
     * Gets the value of the electronicCommunication property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the electronicCommunication property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElectronicCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the electronicCommunication property.
     */
    public List<ElectronicCommunicationType> getElectronicCommunication() {
        if (electronicCommunication == null) {
            electronicCommunication = new ArrayList<>();
        }
        return this.electronicCommunication;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the givenName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the givenName property.
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the onlyNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyNameIndicator() {
        return onlyNameIndicator;
    }

    /**
     * Sets the value of the onlyNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyNameIndicator(Boolean value) {
        this.onlyNameIndicator = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffixType }
     *     
     */
    public NameSuffixType getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffixType }
     *     
     */
    public void setNameSuffix(NameSuffixType value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameUsageType }
     *     
     */
    public IndividualNameUsageType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameUsageType }
     *     
     */
    public void setUsage(IndividualNameUsageType value) {
        this.usage = value;
    }

    /**
     * Gets the value of the conditionalUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalUse() {
        return conditionalUse;
    }

    /**
     * Sets the value of the conditionalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalUse(String value) {
        this.conditionalUse = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the privacyNotification property.
     * 
     */
    public boolean isPrivacyNotification() {
        return privacyNotification;
    }

    /**
     * Sets the value of the privacyNotification property.
     * 
     */
    public void setPrivacyNotification(boolean value) {
        this.privacyNotification = value;
    }

}
