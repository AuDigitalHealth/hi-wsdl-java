
package au.net.electronichealth.ns.hi.svc.providermanageproviderorganisation._3_2;

import au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderorganisation._3_2.ManageProviderOrganisationResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0}manageProviderOrganisationResult"/&gt;
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
    "manageProviderOrganisationResult"
})
@XmlRootElement(name = "manageProviderOrganisationResponse")
public class ManageProviderOrganisationResponse {

    /**
     * Manage Provider/Administrative Organisation
     *                 Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0", required = true)
    protected ManageProviderOrganisationResult manageProviderOrganisationResult;

    /**
     * Manage Provider/Administrative Organisation
     *                 Response element
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
     * @see #getManageProviderOrganisationResult()
     */
    public void setManageProviderOrganisationResult(ManageProviderOrganisationResult value) {
        this.manageProviderOrganisationResult = value;
    }

}
