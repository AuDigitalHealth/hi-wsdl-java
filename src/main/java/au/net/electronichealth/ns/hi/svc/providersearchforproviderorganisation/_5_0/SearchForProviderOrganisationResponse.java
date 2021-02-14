
package au.net.electronichealth.ns.hi.svc.providersearchforproviderorganisation._5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._5_0.SearchForProviderOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0}searchForProviderOrganisationResult"/>
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
    "searchForProviderOrganisationResult"
})
@XmlRootElement(name = "searchForProviderOrganisationResponse")
public class SearchForProviderOrganisationResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0", required = true)
    protected SearchForProviderOrganisationResult searchForProviderOrganisationResult;

    /**
     * Gets the value of the searchForProviderOrganisationResult property.
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
     */
    public void setSearchForProviderOrganisationResult(SearchForProviderOrganisationResult value) {
        this.searchForProviderOrganisationResult = value;
    }

}
