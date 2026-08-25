
package au.net.electronichealth.ns.hi.svc.providermanageproviderdirectoryentry._3_2;

import au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderdirectoryentry._3_2.ManageProviderDirectoryEntryResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}manageProviderDirectoryEntryResult"/&gt;
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
    "manageProviderDirectoryEntryResult"
})
@XmlRootElement(name = "manageProviderDirectoryEntryResponse")
public class ManageProviderDirectoryEntryResponse {

    /**
     * Manage PDS Entry Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", required = true)
    protected ManageProviderDirectoryEntryResult manageProviderDirectoryEntryResult;

    /**
     * Manage PDS Entry Response element
     * 
     * @return
     *     possible object is
     *     {@link ManageProviderDirectoryEntryResult }
     *     
     */
    public ManageProviderDirectoryEntryResult getManageProviderDirectoryEntryResult() {
        return manageProviderDirectoryEntryResult;
    }

    /**
     * Sets the value of the manageProviderDirectoryEntryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageProviderDirectoryEntryResult }
     *     
     * @see #getManageProviderDirectoryEntryResult()
     */
    public void setManageProviderDirectoryEntryResult(ManageProviderDirectoryEntryResult value) {
        this.manageProviderDirectoryEntryResult = value;
    }

}
