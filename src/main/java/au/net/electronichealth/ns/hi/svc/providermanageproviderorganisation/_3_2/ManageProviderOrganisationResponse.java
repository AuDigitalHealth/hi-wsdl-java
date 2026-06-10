
package au.net.electronichealth.ns.hi.svc.providermanageproviderorganisation._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderorganisation._3_2.ManageProviderOrganisationResult;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderOrganisation/3.2.0}manageProviderOrganisationResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
