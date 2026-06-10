
package au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;


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
 *         &lt;element name="individualProviderDirectoryEntries" type="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}IndividualProviderDirectoryEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "individualProviderDirectoryEntries",
    "serviceMessages"
})
@XmlRootElement(name = "searchHIProviderDirectoryForIndividualResult")
public class SearchHIProviderDirectoryForIndividualResult {

    protected List<IndividualProviderDirectoryEntryType> individualProviderDirectoryEntries;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

    /**
     * Gets the value of the individualProviderDirectoryEntries property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualProviderDirectoryEntries property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getIndividualProviderDirectoryEntries().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualProviderDirectoryEntryType }
     * 
     * 
     */
    public List<IndividualProviderDirectoryEntryType> getIndividualProviderDirectoryEntries() {
        if (individualProviderDirectoryEntries == null) {
            individualProviderDirectoryEntries = new ArrayList<IndividualProviderDirectoryEntryType>();
        }
        return this.individualProviderDirectoryEntries;
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
