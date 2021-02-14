
package au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._5_0.SearchForProviderOrganisationResult;


/**
 * <p>Java class for BatchSearchForProviderOrganisationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchSearchForProviderOrganisationResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0}requestIdentifier"/>
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
@XmlType(name = "BatchSearchForProviderOrganisationResultType", propOrder = {
    "requestIdentifier",
    "searchForProviderOrganisationResult"
})
public class BatchSearchForProviderOrganisationResultType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", required = true)
    protected String requestIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchOrganisation/5.0.0", required = true)
    protected SearchForProviderOrganisationResult searchForProviderOrganisationResult;

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
