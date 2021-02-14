
package au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2;

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
import au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2.EndpointLocatorServiceRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedIndividualType;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedOrganisationType;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2.OrganisationDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2.OrganisationNameRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2.OrganisationServiceRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryOrganisationEntryRecord;


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
 *         &lt;element name="hpioNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpioNumberType"/>
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0}organisationDetails"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0}organisationNameRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}organisationServiceRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}addressRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0}electronicCommunicationRecord" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0}endpointLocatorServiceRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkedIndividuals" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedIndividualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkedOrganisations" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedOrganisationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directoryServiceEntries" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderdirectoryService/3.2.0}ProviderDirectoryOrganisationEntryRecord" maxOccurs="unbounded" minOccurs="0"/>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationNameRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationNameRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationServiceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationServiceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * Gets the value of the endpointLocatorServiceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointLocatorServiceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointLocatorServiceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedIndividuals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedIndividuals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
