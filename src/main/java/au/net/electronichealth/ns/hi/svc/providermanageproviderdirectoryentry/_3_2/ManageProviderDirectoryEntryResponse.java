
package au.net.electronichealth.ns.hi.svc.providermanageproviderdirectoryentry._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderdirectoryentry._3_2.ManageProviderDirectoryEntryResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}manageProviderDirectoryEntryResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "manageProviderDirectoryEntryResult"
})
@XmlRootElement(name = "manageProviderDirectoryEntryResponse")
public class ManageProviderDirectoryEntryResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", required = true)
    protected ManageProviderDirectoryEntryResult manageProviderDirectoryEntryResult;

    /**
     * Gets the value of the manageProviderDirectoryEntryResult property.
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
     */
    public void setManageProviderDirectoryEntryResult(ManageProviderDirectoryEntryResult value) {
        this.manageProviderDirectoryEntryResult = value;
    }

}
