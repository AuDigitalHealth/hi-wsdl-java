
package au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderdirectoryentry._3_2;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DetailsResponseType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="individualEntryResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organisationEntryResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteIndividualEntryResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deleteOrganisationEntryResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "individualEntryResponses",
    "organisationEntryResponses",
    "deleteIndividualEntryResponses",
    "deleteOrganisationEntryResponses",
    "serviceMessages"
})
@XmlRootElement(name = "manageProviderDirectoryEntryResult")
public class ManageProviderDirectoryEntryResult {

    protected List<DetailsResponseType> individualEntryResponses;
    protected List<DetailsResponseType> organisationEntryResponses;
    protected List<DetailsResponseType> deleteIndividualEntryResponses;
    protected List<DetailsResponseType> deleteOrganisationEntryResponses;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

    /**
     * Gets the value of the individualEntryResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the individualEntryResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualEntryResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualEntryResponses property.
     */
    public List<DetailsResponseType> getIndividualEntryResponses() {
        if (individualEntryResponses == null) {
            individualEntryResponses = new ArrayList<>();
        }
        return this.individualEntryResponses;
    }

    /**
     * Gets the value of the organisationEntryResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the organisationEntryResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisationEntryResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisationEntryResponses property.
     */
    public List<DetailsResponseType> getOrganisationEntryResponses() {
        if (organisationEntryResponses == null) {
            organisationEntryResponses = new ArrayList<>();
        }
        return this.organisationEntryResponses;
    }

    /**
     * Gets the value of the deleteIndividualEntryResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deleteIndividualEntryResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteIndividualEntryResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteIndividualEntryResponses property.
     */
    public List<DetailsResponseType> getDeleteIndividualEntryResponses() {
        if (deleteIndividualEntryResponses == null) {
            deleteIndividualEntryResponses = new ArrayList<>();
        }
        return this.deleteIndividualEntryResponses;
    }

    /**
     * Gets the value of the deleteOrganisationEntryResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deleteOrganisationEntryResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteOrganisationEntryResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteOrganisationEntryResponses property.
     */
    public List<DetailsResponseType> getDeleteOrganisationEntryResponses() {
        if (deleteOrganisationEntryResponses == null) {
            deleteOrganisationEntryResponses = new ArrayList<>();
        }
        return this.deleteOrganisationEntryResponses;
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
