
package au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderDirectoryOrganisationEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderDirectoryOrganisationEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType"/>
 *         &lt;element name="addressExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType"/>
 *         &lt;element name="electronicCommunicationExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organisationServiceExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endpointLocatorServiceExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalComments" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}AdditionalCommentsType" minOccurs="0"/>
 *         &lt;element name="display" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayPrivateDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priorityNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}PriorityNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderDirectoryOrganisationEntry", propOrder = {
    "nameExternalId",
    "addressExternalId",
    "electronicCommunicationExternalId",
    "organisationServiceExternalId",
    "endpointLocatorServiceExternalId",
    "additionalComments",
    "display",
    "displayPrivateDetails",
    "priorityNumber"
})
@XmlSeeAlso({
    ProviderDirectoryOrganisationEntryRecord.class
})
public class ProviderDirectoryOrganisationEntry {

    protected int nameExternalId;
    protected int addressExternalId;
    @XmlElement(type = Integer.class)
    protected List<Integer> electronicCommunicationExternalId;
    @XmlElement(type = Integer.class)
    protected List<Integer> organisationServiceExternalId;
    @XmlElement(type = Integer.class)
    protected List<Integer> endpointLocatorServiceExternalId;
    protected String additionalComments;
    protected boolean display;
    protected boolean displayPrivateDetails;
    protected int priorityNumber;

    /**
     * Gets the value of the nameExternalId property.
     * 
     */
    public int getNameExternalId() {
        return nameExternalId;
    }

    /**
     * Sets the value of the nameExternalId property.
     * 
     */
    public void setNameExternalId(int value) {
        this.nameExternalId = value;
    }

    /**
     * Gets the value of the addressExternalId property.
     * 
     */
    public int getAddressExternalId() {
        return addressExternalId;
    }

    /**
     * Sets the value of the addressExternalId property.
     * 
     */
    public void setAddressExternalId(int value) {
        this.addressExternalId = value;
    }

    /**
     * Gets the value of the electronicCommunicationExternalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCommunicationExternalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicCommunicationExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getElectronicCommunicationExternalId() {
        if (electronicCommunicationExternalId == null) {
            electronicCommunicationExternalId = new ArrayList<Integer>();
        }
        return this.electronicCommunicationExternalId;
    }

    /**
     * Gets the value of the organisationServiceExternalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationServiceExternalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationServiceExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOrganisationServiceExternalId() {
        if (organisationServiceExternalId == null) {
            organisationServiceExternalId = new ArrayList<Integer>();
        }
        return this.organisationServiceExternalId;
    }

    /**
     * Gets the value of the endpointLocatorServiceExternalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointLocatorServiceExternalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointLocatorServiceExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEndpointLocatorServiceExternalId() {
        if (endpointLocatorServiceExternalId == null) {
            endpointLocatorServiceExternalId = new ArrayList<Integer>();
        }
        return this.endpointLocatorServiceExternalId;
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
     * Gets the value of the display property.
     * 
     */
    public boolean isDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     */
    public void setDisplay(boolean value) {
        this.display = value;
    }

    /**
     * Gets the value of the displayPrivateDetails property.
     * 
     */
    public boolean isDisplayPrivateDetails() {
        return displayPrivateDetails;
    }

    /**
     * Sets the value of the displayPrivateDetails property.
     * 
     */
    public void setDisplayPrivateDetails(boolean value) {
        this.displayPrivateDetails = value;
    }

    /**
     * Gets the value of the priorityNumber property.
     * 
     */
    public int getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Sets the value of the priorityNumber property.
     * 
     */
    public void setPriorityNumber(int value) {
        this.priorityNumber = value;
    }

}
