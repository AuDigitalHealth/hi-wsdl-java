
package au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.Address;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._3_2.ElectronicCommunication;
import au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2.IndividualName;
import au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2.LinkedOrganisationType;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.PersonalDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2.ProviderType;


/**
 * <p>Java class for IndividualProviderDirectoryEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualProviderDirectoryEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hpiiNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpiiNumberType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}personalDetails" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0}individualName"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}address"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0}electronicCommunication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}providerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="linkedOrganisations" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/LinkedType/3.2.0}LinkedOrganisationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalComments" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}AdditionalCommentsType" minOccurs="0"/>
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
@XmlType(name = "IndividualProviderDirectoryEntryType", propOrder = {
    "hpiiNumber",
    "personalDetails",
    "individualName",
    "address",
    "electronicCommunication",
    "providerType",
    "linkedOrganisations",
    "additionalComments",
    "priorityNumber"
})
public class IndividualProviderDirectoryEntryType {

    @XmlElement(required = true)
    protected String hpiiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0")
    protected PersonalDetails personalDetails;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0", required = true)
    protected IndividualName individualName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0", required = true)
    protected Address address;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/3.2.0")
    protected List<ElectronicCommunication> electronicCommunication;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0")
    protected List<ProviderType> providerType;
    protected List<LinkedOrganisationType> linkedOrganisations;
    protected String additionalComments;
    protected int priorityNumber;

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
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualName }
     *     
     */
    public IndividualName getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualName }
     *     
     */
    public void setIndividualName(IndividualName value) {
        this.individualName = value;
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
     * Gets the value of the providerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderType }
     * 
     * 
     */
    public List<ProviderType> getProviderType() {
        if (providerType == null) {
            providerType = new ArrayList<ProviderType>();
        }
        return this.providerType;
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
