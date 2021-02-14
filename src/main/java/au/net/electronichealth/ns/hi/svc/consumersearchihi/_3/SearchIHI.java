
package au.net.electronichealth.ns.hi.svc.consumersearchihi._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.TrueFalseType;
import au.net.electronichealth.ns.hi.xsd.consumercore.address._3.AustralianPostalAddressType;
import au.net.electronichealth.ns.hi.xsd.consumercore.address._3.AustralianStreetAddressType;
import au.net.electronichealth.ns.hi.xsd.consumercore.address._3.InternationalAddressType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirth"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}australianPostalAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}australianStreetAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}internationalAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0}history" minOccurs="0"/>
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
    "dateOfBirth",
    "sex",
    "familyName",
    "givenName",
    "australianPostalAddress",
    "australianStreetAddress",
    "internationalAddress",
    "history"
})
@XmlRootElement(name = "searchIHI")
public class SearchIHI {

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
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    protected SexType sex;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0")
    protected AustralianPostalAddressType australianPostalAddress;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0")
    protected AustralianStreetAddressType australianStreetAddress;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0")
    protected InternationalAddressType internationalAddress;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0")
    protected TrueFalseType history;

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
     * Gets the value of the australianPostalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianPostalAddressType }
     *     
     */
    public AustralianPostalAddressType getAustralianPostalAddress() {
        return australianPostalAddress;
    }

    /**
     * Sets the value of the australianPostalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianPostalAddressType }
     *     
     */
    public void setAustralianPostalAddress(AustralianPostalAddressType value) {
        this.australianPostalAddress = value;
    }

    /**
     * Gets the value of the australianStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianStreetAddressType }
     *     
     */
    public AustralianStreetAddressType getAustralianStreetAddress() {
        return australianStreetAddress;
    }

    /**
     * Sets the value of the australianStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianStreetAddressType }
     *     
     */
    public void setAustralianStreetAddress(AustralianStreetAddressType value) {
        this.australianStreetAddress = value;
    }

    /**
     * Gets the value of the internationalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAddressType }
     *     
     */
    public InternationalAddressType getInternationalAddress() {
        return internationalAddress;
    }

    /**
     * Sets the value of the internationalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAddressType }
     *     
     */
    public void setInternationalAddress(InternationalAddressType value) {
        this.internationalAddress = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setHistory(TrueFalseType value) {
        this.history = value;
    }

}
