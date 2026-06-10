
package au.net.electronichealth.ns.hi.svc.providersearchforproviderorganisation._5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._5_0.SearchForProviderOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0}searchForProviderOrganisationResult"/&gt;
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
    "searchForProviderOrganisationResult"
})
@XmlRootElement(name = "searchForProviderOrganisationResponse")
public class SearchForProviderOrganisationResponse {

    /**
     * Search for Provider Organisation Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0", required = true)
    protected SearchForProviderOrganisationResult searchForProviderOrganisationResult;

    /**
     * Search for Provider Organisation Response element
     * 
     * @return
     *     possible object is
     *     {@link SearchForProviderOrganisationResult }
     *     
     */
    public SearchForProviderOrganisationResult getSearchForProviderOrganisationResult() {
        return searchForProviderOrganisationResult;
    }

    /**
     * Sets the value of the searchForProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchForProviderOrganisationResult }
     *     
     * @see #getSearchForProviderOrganisationResult()
     */
    public void setSearchForProviderOrganisationResult(SearchForProviderOrganisationResult value) {
        this.searchForProviderOrganisationResult = value;
    }

}
