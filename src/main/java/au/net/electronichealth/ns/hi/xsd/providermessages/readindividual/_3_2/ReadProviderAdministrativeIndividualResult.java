
package au.net.electronichealth.ns.hi.xsd.providermessages.readindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AddressRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2.ElectronicCommunicationRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2.IndividualNameRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedOrganisationType;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.PersonalDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryIndividualEntryRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2.ProviderTypeRecord;


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
 *         &lt;element name="qualifiedIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}QualifiedIdentifierType"/>
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}personalDetails"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0}individualNameRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}addressRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0}electronicCommunicationRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}providerTypeRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkedOrganisations" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedOrganisationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directoryServiceEntries" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderdirectoryService/3.2.0}ProviderDirectoryIndividualEntryRecord" maxOccurs="unbounded" minOccurs="0"/>
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
    "qualifiedIdentifier",
    "status",
    "personalDetails",
    "individualNameRecord",
    "addressRecord",
    "electronicCommunicationRecord",
    "providerTypeRecord",
    "linkedOrganisations",
    "directoryServiceEntries",
    "serviceMessages"
})
@XmlRootElement(name = "readProviderAdministrativeIndividualResult")
public class ReadProviderAdministrativeIndividualResult {

    @XmlElement(required = true)
    protected String qualifiedIdentifier;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0", required = true)
    protected PersonalDetails personalDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0", required = true)
    protected List<IndividualNameRecord> individualNameRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", required = true)
    protected List<AddressRecord> addressRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0", required = true)
    protected List<ElectronicCommunicationRecord> electronicCommunicationRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0")
    protected List<ProviderTypeRecord> providerTypeRecord;
    protected List<LinkedOrganisationType> linkedOrganisations;
    protected List<ProviderDirectoryIndividualEntryRecord> directoryServiceEntries;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualNameRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualNameRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCommunicationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicCommunicationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * Gets the value of the providerTypeRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerTypeRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderTypeRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderTypeRecord }
     * 
     * 
     */
    public List<ProviderTypeRecord> getProviderTypeRecord() {
        if (providerTypeRecord == null) {
            providerTypeRecord = new ArrayList<ProviderTypeRecord>();
        }
        return this.providerTypeRecord;
    }

    /**
     * Gets the value of the linkedOrganisations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedOrganisations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedOrganisations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedOrganisationType }
     * 
     * 
     */
    public List<LinkedOrganisationType> getLinkedOrganisations() {
        if (linkedOrganisations == null) {
            linkedOrganisations = new ArrayList<LinkedOrganisationType>();
        }
        return this.linkedOrganisations;
    }

    /**
     * Gets the value of the directoryServiceEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directoryServiceEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectoryServiceEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderDirectoryIndividualEntryRecord }
     * 
     * 
     */
    public List<ProviderDirectoryIndividualEntryRecord> getDirectoryServiceEntries() {
        if (directoryServiceEntries == null) {
            directoryServiceEntries = new ArrayList<ProviderDirectoryIndividualEntryRecord>();
        }
        return this.directoryServiceEntries;
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
