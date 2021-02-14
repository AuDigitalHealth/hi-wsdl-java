
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryfororganisation._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._3_2.SearchHIProviderDirectoryForOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0}searchHIProviderDirectoryForOrganisationResult"/>
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
    "searchHIProviderDirectoryForOrganisationResult"
})
@XmlRootElement(name = "searchHIProviderDirectoryForOrganisationResponse")
public class SearchHIProviderDirectoryForOrganisationResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/3.2.0", required = true)
    protected SearchHIProviderDirectoryForOrganisationResult searchHIProviderDirectoryForOrganisationResult;

    /**
     * Gets the value of the searchHIProviderDirectoryForOrganisationResult property.
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
     */
    public void setSearchHIProviderDirectoryForOrganisationResult(SearchHIProviderDirectoryForOrganisationResult value) {
        this.searchHIProviderDirectoryForOrganisationResult = value;
    }

}
