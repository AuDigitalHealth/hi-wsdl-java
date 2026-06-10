
package au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.AddressRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2.ElectronicCommunicationRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2.EndpointLocatorServiceRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedIndividualType;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedOrganisationType;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2.OrganisationDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2.OrganisationNameRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2.OrganisationServiceRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryOrganisationEntryRecord;


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
 *         &lt;element name="hpioNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpioNumberType"/&gt;
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0}organisationDetails"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0}organisationNameRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}organisationServiceRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}addressRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0}electronicCommunicationRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0}endpointLocatorServiceRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="linkedIndividuals" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedIndividualType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="linkedOrganisations" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedOrganisationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="directoryServiceEntries" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderdirectoryService/3.2.0}ProviderDirectoryOrganisationEntryRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessages" minOccurs="0"/&gt;
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
    "hpioNumber",
    "status",
    "organisationDetails",
    "organisationNameRecord",
    "organisationServiceRecord",
    "addressRecord",
    "electronicCommunicationRecord",
    "endpointLocatorServiceRecord",
    "linkedIndividuals",
    "linkedOrganisations",
    "directoryServiceEntries",
    "serviceMessages"
})
@XmlRootElement(name = "readProviderOrganisationResult")
public class ReadProviderOrganisationResult {

    @XmlElement(required = true)
    protected String hpioNumber;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0", required = true)
    protected OrganisationDetails organisationDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0", required = true)
    protected List<OrganisationNameRecord> organisationNameRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0", required = true)
    protected List<OrganisationServiceRecord> organisationServiceRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", required = true)
    protected List<AddressRecord> addressRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0", required = true)
    protected List<ElectronicCommunicationRecord> electronicCommunicationRecord;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0")
    protected List<EndpointLocatorServiceRecord> endpointLocatorServiceRecord;
    protected List<LinkedIndividualType> linkedIndividuals;
    protected List<LinkedOrganisationType> linkedOrganisations;
    protected List<ProviderDirectoryOrganisationEntryRecord> directoryServiceEntries;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

    /**
     * Gets the value of the hpioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpioNumber() {
        return hpioNumber;
    }

    /**
     * Sets the value of the hpioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpioNumber(String value) {
        this.hpioNumber = value;
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
     * Gets the value of the organisationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationDetails }
     *     
     */
    public OrganisationDetails getOrganisationDetails() {
        return organisationDetails;
    }

    /**
     * Sets the value of the organisationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationDetails }
     *     
     */
    public void setOrganisationDetails(OrganisationDetails value) {
        this.organisationDetails = value;
    }

    /**
     * Gets the value of the organisationNameRecord property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationNameRecord property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getOrganisationNameRecord().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationNameRecord }
     * 
     * 
     */
    public List<OrganisationNameRecord> getOrganisationNameRecord() {
        if (organisationNameRecord == null) {
            organisationNameRecord = new ArrayList<OrganisationNameRecord>();
        }
        return this.organisationNameRecord;
    }

    /**
     * Gets the value of the organisationServiceRecord property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationServiceRecord property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getOrganisationServiceRecord().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceRecord }
     * 
     * 
     */
    public List<OrganisationServiceRecord> getOrganisationServiceRecord() {
        if (organisationServiceRecord == null) {
            organisationServiceRecord = new ArrayList<OrganisationServiceRecord>();
        }
        return this.organisationServiceRecord;
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
     * Gets the value of the endpointLocatorServiceRecord property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointLocatorServiceRecord property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getEndpointLocatorServiceRecord().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointLocatorServiceRecord }
     * 
     * 
     */
    public List<EndpointLocatorServiceRecord> getEndpointLocatorServiceRecord() {
        if (endpointLocatorServiceRecord == null) {
            endpointLocatorServiceRecord = new ArrayList<EndpointLocatorServiceRecord>();
        }
        return this.endpointLocatorServiceRecord;
    }

    /**
     * Gets the value of the linkedIndividuals property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedIndividuals property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getLinkedIndividuals().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedIndividualType }
     * 
     * 
     */
    public List<LinkedIndividualType> getLinkedIndividuals() {
        if (linkedIndividuals == null) {
            linkedIndividuals = new ArrayList<LinkedIndividualType>();
        }
        return this.linkedIndividuals;
    }

    /**
     * Gets the value of the linkedOrganisations property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedOrganisations property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getLinkedOrganisations().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directoryServiceEntries property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getDirectoryServiceEntries().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderDirectoryOrganisationEntryRecord }
     * 
     * 
     */
    public List<ProviderDirectoryOrganisationEntryRecord> getDirectoryServiceEntries() {
        if (directoryServiceEntries == null) {
            directoryServiceEntries = new ArrayList<ProviderDirectoryOrganisationEntryRecord>();
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
