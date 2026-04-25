
package au.net.electronichealth.ns.hi.svc.providermanageproviderorganisation._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderorganisation._3_2.ManageProviderOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0}manageProviderOrganisationResult"/>
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
    "manageProviderOrganisationResult"
})
@XmlRootElement(name = "manageProviderOrganisationResponse")
public class ManageProviderOrganisationResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0", required = true)
    protected ManageProviderOrganisationResult manageProviderOrganisationResult;

    /**
     * Gets the value of the manageProviderOrganisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ManageProviderOrganisationResult }
     *     
     */
    public ManageProviderOrganisationResult getManageProviderOrganisationResult() {
        return manageProviderOrganisationResult;
    }

    /**
     * Sets the value of the manageProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageProviderOrganisationResult }
     *     
     */
    public void setManageProviderOrganisationResult(ManageProviderOrganisationResult value) {
        this.manageProviderOrganisationResult = value;
    }

}
