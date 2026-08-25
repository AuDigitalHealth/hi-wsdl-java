
package au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.providercore.address._5_1.AddressRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2.CertificateType;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._5_1.ElectronicCommunicationRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1.IndividualNameRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.DeathNotificationType;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.PersonalDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1.ProviderTypeRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.status._3_2.Status;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for providerIndividual complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="providerIndividual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientRef" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ClientRefType" minOccurs="0"/&gt;
 *         &lt;element name="hpiiNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpiiNumberType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Status/3.2.0}status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}personalDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.1.0}individualNameRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/5.1.0}addressRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.1}providerTypeRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/5.1.0}electronicCommunicationRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}deathNotification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}certificate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerIndividual", propOrder = {
    "clientRef",
    "hpiiNumber",
    "status",
    "personalDetails",
    "individualNameRecord",
    "addressRecord",
    "providerTypeRecord",
    "electronicCommunicationRecord",
    "deathNotification",
    "certificate"
})
public class ProviderIndividual {

    protected String clientRef;
    @XmlSchemaType(name = "anyURI")
    protected String hpiiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Status/3.2.0")
    protected Status status;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0")
    protected PersonalDetails personalDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.1.0")
    protected List<IndividualNameRecord> individualNameRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/5.1.0")
    protected List<AddressRecord> addressRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.1")
    protected List<ProviderTypeRecord> providerTypeRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/5.1.0")
    protected List<ElectronicCommunicationRecord> electronicCommunicationRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0")
    protected DeathNotificationType deathNotification;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0")
    protected CertificateType certificate;

    /**
     * Gets the value of the clientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRef() {
        return clientRef;
    }

    /**
     * Sets the value of the clientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRef(String value) {
        this.clientRef = value;
    }

    /**
     * Gets the value of the hpiiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpiiNumber() {
        return hpiiNumber;
    }

    /**
     * Sets the value of the hpiiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpiiNumber(String value) {
        this.hpiiNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the personalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDetails }
     *     
     */
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    /**
     * Sets the value of the personalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDetails }
     *     
     */
    public void setPersonalDetails(PersonalDetails value) {
        this.personalDetails = value;
    }

    /**
     * Gets the value of the individualNameRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the individualNameRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualNameRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualNameRecord property.
     */
    public List<IndividualNameRecord> getIndividualNameRecord() {
        if (individualNameRecord == null) {
            individualNameRecord = new ArrayList<>();
        }
        return this.individualNameRecord;
    }

    /**
     * Gets the value of the addressRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addressRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddressRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the addressRecord property.
     */
    public List<AddressRecord> getAddressRecord() {
        if (addressRecord == null) {
            addressRecord = new ArrayList<>();
        }
        return this.addressRecord;
    }

    /**
     * Gets the value of the providerTypeRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the providerTypeRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderTypeRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderTypeRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerTypeRecord property.
     */
    public List<ProviderTypeRecord> getProviderTypeRecord() {
        if (providerTypeRecord == null) {
            providerTypeRecord = new ArrayList<>();
        }
        return this.providerTypeRecord;
    }

    /**
     * Gets the value of the electronicCommunicationRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the electronicCommunicationRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElectronicCommunicationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunicationRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the electronicCommunicationRecord property.
     */
    public List<ElectronicCommunicationRecord> getElectronicCommunicationRecord() {
        if (electronicCommunicationRecord == null) {
            electronicCommunicationRecord = new ArrayList<>();
        }
        return this.electronicCommunicationRecord;
    }

    /**
     * Gets the value of the deathNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DeathNotificationType }
     *     
     */
    public DeathNotificationType getDeathNotification() {
        return deathNotification;
    }

    /**
     * Sets the value of the deathNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeathNotificationType }
     *     
     */
    public void setDeathNotification(DeathNotificationType value) {
        this.deathNotification = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setCertificate(CertificateType value) {
        this.certificate = value;
    }

}
