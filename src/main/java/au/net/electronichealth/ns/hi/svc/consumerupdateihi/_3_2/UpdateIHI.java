
package au.net.electronichealth.ns.hi.svc.consumerupdateihi._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.consumercore.address._3.AddressType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3_2.SourceOfDeathNotificationType;
import au.net.electronichealth.ns.hi.xsd.consumercore.electroniccommunication._3.ElectronicCommunicationType;
import au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2.NameType;
import au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2.NameUpdateGroupType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}ihiNumber"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfBirthAccuracyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}birthPlurality" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}birthOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfDeath" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}dateOfDeathAccuracyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}sourceOfDeathNotification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ElectronicCommunication/3.0}electronicCommunication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}nameUpdateGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0}address" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ihiNumber",
    "dateOfBirth",
    "dateOfBirthAccuracyIndicator",
    "sex",
    "birthPlurality",
    "birthOrder",
    "dateOfDeath",
    "dateOfDeathAccuracyIndicator",
    "sourceOfDeathNotification",
    "electronicCommunication",
    "name",
    "nameUpdateGroup",
    "address"
})
@XmlRootElement(name = "updateIHI")
public class UpdateIHI {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String ihiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "string")
    protected DateAccuracyIndicatorType dateOfBirthAccuracyIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected SexType sex;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String birthPlurality;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String birthOrder;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "string")
    protected DateAccuracyIndicatorType dateOfDeathAccuracyIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0")
    @XmlSchemaType(name = "token")
    protected SourceOfDeathNotificationType sourceOfDeathNotification;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ElectronicCommunication/3.0")
    protected List<ElectronicCommunicationType> electronicCommunication;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0")
    protected List<NameType> name;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0")
    protected List<NameUpdateGroupType> nameUpdateGroup;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/Address/3.0")
    protected List<AddressType> address;

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
     * Gets the value of the name property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the name property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * </p>
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the nameUpdateGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nameUpdateGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNameUpdateGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameUpdateGroupType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nameUpdateGroup property.
     */
    public List<NameUpdateGroupType> getNameUpdateGroup() {
        if (nameUpdateGroup == null) {
            nameUpdateGroup = new ArrayList<>();
        }
        return this.nameUpdateGroup;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * </p>
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

}
