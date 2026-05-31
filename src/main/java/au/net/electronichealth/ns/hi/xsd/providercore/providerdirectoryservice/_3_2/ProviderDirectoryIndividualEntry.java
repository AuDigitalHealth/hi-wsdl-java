
package au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ProviderDirectoryIndividualEntry complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ProviderDirectoryIndividualEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType"/&gt;
 *         &lt;element name="addressExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType"/&gt;
 *         &lt;element name="electronicCommunicationExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="providerTypeExternalId" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalComments" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}AdditionalCommentsType" minOccurs="0"/&gt;
 *         &lt;element name="display" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="priorityNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}PriorityNumberType"/&gt;
 *         &lt;element name="displayPersonalDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderDirectoryIndividualEntry", propOrder = {
    "nameExternalId",
    "addressExternalId",
    "electronicCommunicationExternalId",
    "providerTypeExternalId",
    "additionalComments",
    "display",
    "priorityNumber",
    "displayPersonalDetails"
})
@XmlSeeAlso({
    ProviderDirectoryIndividualEntryRecord.class
})
public class ProviderDirectoryIndividualEntry {

    protected int nameExternalId;
    protected int addressExternalId;
    @XmlElement(type = Integer.class)
    protected List<Integer> electronicCommunicationExternalId;
    @XmlElement(type = Integer.class)
    protected List<Integer> providerTypeExternalId;
    protected String additionalComments;
    protected boolean display;
    protected int priorityNumber;
    protected boolean displayPersonalDetails;

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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the electronicCommunicationExternalId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElectronicCommunicationExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the electronicCommunicationExternalId property.
     */
    public List<Integer> getElectronicCommunicationExternalId() {
        if (electronicCommunicationExternalId == null) {
            electronicCommunicationExternalId = new ArrayList<>();
        }
        return this.electronicCommunicationExternalId;
    }

    /**
     * Gets the value of the providerTypeExternalId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the providerTypeExternalId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderTypeExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerTypeExternalId property.
     */
    public List<Integer> getProviderTypeExternalId() {
        if (providerTypeExternalId == null) {
            providerTypeExternalId = new ArrayList<>();
        }
        return this.providerTypeExternalId;
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

    /**
     * Gets the value of the displayPersonalDetails property.
     * 
     */
    public boolean isDisplayPersonalDetails() {
        return displayPersonalDetails;
    }

    /**
     * Sets the value of the displayPersonalDetails property.
     * 
     */
    public void setDisplayPersonalDetails(boolean value) {
        this.displayPersonalDetails = value;
    }

}
