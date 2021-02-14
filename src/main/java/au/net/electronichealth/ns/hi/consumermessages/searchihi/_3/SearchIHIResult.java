
package au.net.electronichealth.ns.hi.consumermessages.searchihi._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.IHIRecordStatusType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.IHIStatusType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}ihiNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}medicareCardNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}medicareIRN" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}dvaFileNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}ihiRecordStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}ihiStatus" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirthAccuracyIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfDeath" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfDeathAccuracyIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessages" minOccurs="0"/>
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
    "ihiNumber",
    "medicareCardNumber",
    "medicareIRN",
    "dvaFileNumber",
    "ihiRecordStatus",
    "ihiStatus",
    "givenName",
    "familyName",
    "dateOfBirth",
    "sex",
    "dateOfBirthAccuracyIndicator",
    "dateOfDeath",
    "dateOfDeathAccuracyIndicator",
    "serviceMessages"
})
@XmlRootElement(name = "searchIHIResult")
public class SearchIHIResult {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    protected String ihiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String medicareCardNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    protected Integer medicareIRN;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dvaFileNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    protected IHIRecordStatusType ihiRecordStatus;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    protected IHIStatusType ihiStatus;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected SexType sex;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected DateAccuracyIndicatorType dateOfBirthAccuracyIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected DateAccuracyIndicatorType dateOfDeathAccuracyIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

    /**
     * Gets the value of the ihiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhiNumber() {
        return ihiNumber;
    }

    /**
     * Sets the value of the ihiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhiNumber(String value) {
        this.ihiNumber = value;
    }

    /**
     * Gets the value of the medicareCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicareCardNumber() {
        return medicareCardNumber;
    }

    /**
     * Sets the value of the medicareCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicareCardNumber(String value) {
        this.medicareCardNumber = value;
    }

    /**
     * Gets the value of the medicareIRN property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedicareIRN() {
        return medicareIRN;
    }

    /**
     * Sets the value of the medicareIRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedicareIRN(Integer value) {
        this.medicareIRN = value;
    }

    /**
     * Gets the value of the dvaFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvaFileNumber() {
        return dvaFileNumber;
    }

    /**
     * Sets the value of the dvaFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvaFileNumber(String value) {
        this.dvaFileNumber = value;
    }

    /**
     * Gets the value of the ihiRecordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IHIRecordStatusType }
     *     
     */
    public IHIRecordStatusType getIhiRecordStatus() {
        return ihiRecordStatus;
    }

    /**
     * Sets the value of the ihiRecordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IHIRecordStatusType }
     *     
     */
    public void setIhiRecordStatus(IHIRecordStatusType value) {
        this.ihiRecordStatus = value;
    }

    /**
     * Gets the value of the ihiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IHIStatusType }
     *     
     */
    public IHIStatusType getIhiStatus() {
        return ihiStatus;
    }

    /**
     * Sets the value of the ihiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IHIStatusType }
     *     
     */
    public void setIhiStatus(IHIStatusType value) {
        this.ihiStatus = value;
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
     * Gets the value of the serviceMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMessagesType }
     *     
     */
    public ServiceMessagesType getServiceMessages() {
        return serviceMessages;
    }

    /**
     * Sets the value of the serviceMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMessagesType }
     *     
     */
    public void setServiceMessages(ServiceMessagesType value) {
        this.serviceMessages = value;
    }

}
