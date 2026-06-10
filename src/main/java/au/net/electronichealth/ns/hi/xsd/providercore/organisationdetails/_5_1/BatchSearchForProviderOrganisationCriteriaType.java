
package au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._5_0.SearchForProviderOrganisation;


/**
 * <p>Java class for BatchSearchForProviderOrganisationCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="BatchSearchForProviderOrganisationCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0}requestIdentifier"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0}searchForProviderOrganisation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSearchForProviderOrganisationCriteriaType", propOrder = {
    "requestIdentifier",
    "searchForProviderOrganisation"
})
public class BatchSearchForProviderOrganisationCriteriaType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", required = true)
    protected String requestIdentifier;
    /**
     * Search for Provider Organisation Request element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0", required = true)
    protected SearchForProviderOrganisation searchForProviderOrganisation;

    /**
     * Gets the value of the requestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Sets the value of the requestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

    /**
     * Search for Provider Organisation Request element
     * 
     * @return
     *     possible object is
     *     {@link SearchForProviderOrganisation }
     *     
     */
    public SearchForProviderOrganisation getSearchForProviderOrganisation() {
        return searchForProviderOrganisation;
    }

    /**
     * Sets the value of the searchForProviderOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchForProviderOrganisation }
     *     
     * @see #getSearchForProviderOrganisation()
     */
    public void setSearchForProviderOrganisation(SearchForProviderOrganisation value) {
        this.searchForProviderOrganisation = value;
    }

}
