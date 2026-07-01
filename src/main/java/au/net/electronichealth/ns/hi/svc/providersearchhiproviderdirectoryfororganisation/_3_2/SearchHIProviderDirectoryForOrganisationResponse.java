
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryfororganisation._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._3_2.SearchHIProviderDirectoryForOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}searchHIProviderDirectoryForOrganisationResult"/&gt;
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
    "searchHIProviderDirectoryForOrganisationResult"
})
@XmlRootElement(name = "searchHIProviderDirectoryForOrganisationResponse")
public class SearchHIProviderDirectoryForOrganisationResponse {

    /**
     * Search for Provider Organisation Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", required = true)
    protected SearchHIProviderDirectoryForOrganisationResult searchHIProviderDirectoryForOrganisationResult;

    /**
     * Search for Provider Organisation Response element
     * 
     * @return
     *     possible object is
     *     {@link SearchHIProviderDirectoryForOrganisationResult }
     *     
     */
    public SearchHIProviderDirectoryForOrganisationResult getSearchHIProviderDirectoryForOrganisationResult() {
        return searchHIProviderDirectoryForOrganisationResult;
    }

    /**
     * Sets the value of the searchHIProviderDirectoryForOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchHIProviderDirectoryForOrganisationResult }
     *     
     * @see #getSearchHIProviderDirectoryForOrganisationResult()
     */
    public void setSearchHIProviderDirectoryForOrganisationResult(SearchHIProviderDirectoryForOrganisationResult value) {
        this.searchHIProviderDirectoryForOrganisationResult = value;
    }

}
