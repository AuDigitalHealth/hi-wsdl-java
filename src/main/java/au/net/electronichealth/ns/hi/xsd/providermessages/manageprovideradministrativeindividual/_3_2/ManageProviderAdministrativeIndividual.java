
package au.net.electronichealth.ns.hi.xsd.providermessages.manageprovideradministrativeindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AddressRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2.CertificateType;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2.ElectronicCommunicationRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2.IndividualNameRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.DeathNotificationType;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.PersonalDetails;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderAdministrativeIndividual/3.2.0}qualifiedIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}personalDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0}individualNameRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}addressRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0}electronicCommunicationRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "qualifiedIdentifier",
    "personalDetails",
    "individualNameRecord",
    "addressRecord",
    "electronicCommunicationRecord",
    "deathNotification",
    "certificate"
})
@XmlRootElement(name = "manageProviderAdministrativeIndividual")
public class ManageProviderAdministrativeIndividual {

    protected String qualifiedIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0")
    protected PersonalDetails personalDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0")
    protected List<IndividualNameRecord> individualNameRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0")
    protected List<AddressRecord> addressRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0")
    protected List<ElectronicCommunicationRecord> electronicCommunicationRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0")
    protected DeathNotificationType deathNotification;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0")
    protected CertificateType certificate;

    /**
     * Gets the value of the qualifiedIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedIdentifier() {
        return qualifiedIdentifier;
    }

    /**
     * Sets the value of the qualifiedIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedIdentifier(String value) {
        this.qualifiedIdentifier = value;
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualNameRecord property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getIndividualNameRecord().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameRecord }
     * 
     * 
     */
    public List<IndividualNameRecord> getIndividualNameRecord() {
        if (individualNameRecord == null) {
            individualNameRecord = new ArrayList<IndividualNameRecord>();
        }
        return this.individualNameRecord;
    }

    /**
     * Gets the value of the addressRecord property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressRecord property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getAddressRecord().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link AddressRecord }
     * 
     * 
     */
    public List<AddressRecord> getAddressRecord() {
        if (addressRecord == null) {
            addressRecord = new ArrayList<AddressRecord>();
        }
        return this.addressRecord;
    }

    /**
     * Gets the value of the electronicCommunicationRecord property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCommunicationRecord property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getElectronicCommunicationRecord().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunicationRecord }
     * 
     * 
     */
    public List<ElectronicCommunicationRecord> getElectronicCommunicationRecord() {
        if (electronicCommunicationRecord == null) {
            electronicCommunicationRecord = new ArrayList<ElectronicCommunicationRecord>();
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
