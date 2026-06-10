
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderorganisation._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.submitsearchproviderorganisation._5_1.SubmitSearchForProviderOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderOrganisation/5.1.0}submitSearchForProviderOrganisationResult"/&gt;
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
    "submitSearchForProviderOrganisationResult"
})
@XmlRootElement(name = "submitSearchForProviderOrganisationResponse")
public class SubmitSearchForProviderOrganisationResponse {

    /**
     * Search for Provider Organisation Batch Request element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderOrganisation/5.1.0", required = true)
    protected SubmitSearchForProviderOrganisationResult submitSearchForProviderOrganisationResult;

    /**
     * Search for Provider Organisation Batch Request element
     * 
     * @return
     *     possible object is
     *     {@link SubmitSearchForProviderOrganisationResult }
     *     
     */
    public SubmitSearchForProviderOrganisationResult getSubmitSearchForProviderOrganisationResult() {
        return submitSearchForProviderOrganisationResult;
    }

    /**
     * Sets the value of the submitSearchForProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitSearchForProviderOrganisationResult }
     *     
     * @see #getSubmitSearchForProviderOrganisationResult()
     */
    public void setSubmitSearchForProviderOrganisationResult(SubmitSearchForProviderOrganisationResult value) {
        this.submitSearchForProviderOrganisationResult = value;
    }

}
