
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderorganisation._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.retrievesearchproviderorganisation._5_1.RetrieveSearchForProviderOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderOrganisation/5.1.0}retrieveSearchForProviderOrganisationResult"/&gt;
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
    "retrieveSearchForProviderOrganisationResult"
})
@XmlRootElement(name = "retrieveSearchForProviderOrganisationResponse")
public class RetrieveSearchForProviderOrganisationResponse {

    /**
     * Retrieve Batch Search for Provider Organisation Results Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderOrganisation/5.1.0", required = true)
    protected RetrieveSearchForProviderOrganisationResult retrieveSearchForProviderOrganisationResult;

    /**
     * Retrieve Batch Search for Provider Organisation Results Response element
     * 
     * @return
     *     possible object is
     *     {@link RetrieveSearchForProviderOrganisationResult }
     *     
     */
    public RetrieveSearchForProviderOrganisationResult getRetrieveSearchForProviderOrganisationResult() {
        return retrieveSearchForProviderOrganisationResult;
    }

    /**
     * Sets the value of the retrieveSearchForProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveSearchForProviderOrganisationResult }
     *     
     * @see #getRetrieveSearchForProviderOrganisationResult()
     */
    public void setRetrieveSearchForProviderOrganisationResult(RetrieveSearchForProviderOrganisationResult value) {
        this.retrieveSearchForProviderOrganisationResult = value;
    }

}
