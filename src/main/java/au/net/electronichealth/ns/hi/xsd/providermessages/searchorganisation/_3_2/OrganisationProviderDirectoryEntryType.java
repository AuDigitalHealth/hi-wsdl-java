
package au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.Address;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2.ElectronicCommunication;
import au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2.EndpointLocatorService;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedOrganisationType;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedProviderType;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2.OrganisationDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2.OrganisationName;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationservice._3_2.OrganisationService;


/**
 * <p>Java class for OrganisationProviderDirectoryEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationProviderDirectoryEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hpioNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpioNumberType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0}organisationName"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0}organisationDetails" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0}organisationService" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}address"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0}electronicCommunication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0}endpointLocatorService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkedProviders" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedProviderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkedOrganisations" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedOrganisationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalComments" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}AdditionalCommentsType" minOccurs="0"/>
 *         &lt;element name="priorityNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}PriorityNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationProviderDirectoryEntryType", propOrder = {
    "hpioNumber",
    "organisationName",
    "organisationDetails",
    "organisationService",
    "address",
    "electronicCommunication",
    "endpointLocatorService",
    "linkedProviders",
    "linkedOrganisations",
    "additionalComments",
    "priorityNumber"
})
public class OrganisationProviderDirectoryEntryType {

    @XmlElement(required = true)
    protected String hpioNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationName/3.2.0", required = true)
    protected OrganisationName organisationName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0")
    protected OrganisationDetails organisationDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationService/3.2.0", required = true)
    protected List<OrganisationService> organisationService;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", required = true)
    protected Address address;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0")
    protected List<ElectronicCommunication> electronicCommunication;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0")
    protected List<EndpointLocatorService> endpointLocatorService;
    protected List<LinkedProviderType> linkedProviders;
    protected List<LinkedOrganisationType> linkedOrganisations;
    protected String additionalComments;
    protected Integer priorityNumber;

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
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationName }
     *     
     */
    public OrganisationName getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationName }
     *     
     */
    public void setOrganisationName(OrganisationName value) {
        this.organisationName = value;
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
     * Gets the value of the organisationService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationService }
     * 
     * 
     */
    public List<OrganisationService> getOrganisationService() {
        if (organisationService == null) {
            organisationService = new ArrayList<OrganisationService>();
        }
        return this.organisationService;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the electronicCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunication }
     * 
     * 
     */
    public List<ElectronicCommunication> getElectronicCommunication() {
        if (electronicCommunication == null) {
            electronicCommunication = new ArrayList<ElectronicCommunication>();
        }
        return this.electronicCommunication;
    }

    /**
     * Gets the value of the endpointLocatorService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointLocatorService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointLocatorService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointLocatorService }
     * 
     * 
     */
    public List<EndpointLocatorService> getEndpointLocatorService() {
        if (endpointLocatorService == null) {
            endpointLocatorService = new ArrayList<EndpointLocatorService>();
        }
        return this.endpointLocatorService;
    }

    /**
     * Gets the value of the linkedProviders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedProviders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedProviderType }
     * 
     * 
     */
    public List<LinkedProviderType> getLinkedProviders() {
        if (linkedProviders == null) {
            linkedProviders = new ArrayList<LinkedProviderType>();
        }
        return this.linkedProviders;
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
     * Gets the value of the additionalComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalComments() {
        return additionalComments;
    }

    /**
     * Sets the value of the additionalComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalComments(String value) {
        this.additionalComments = value;
    }

    /**
     * Gets the value of the priorityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Sets the value of the priorityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriorityNumber(Integer value) {
        this.priorityNumber = value;
    }

}
