
package au.net.electronichealth.ns.hi.svc.providersearchforproviderindividual._5_0;

import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._5_0.SearchForProviderIndividualResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0}searchForProviderIndividualResult"/&gt;
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
    "searchForProviderIndividualResult"
})
@XmlRootElement(name = "searchForProviderIndividualResponse")
public class SearchForProviderIndividualResponse {

    /**
     * Search for Provider Individual Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0", required = true)
    protected SearchForProviderIndividualResult searchForProviderIndividualResult;

    /**
     * Search for Provider Individual Response element
     * 
     * @return
     *     possible object is
     *     {@link SearchForProviderIndividualResult }
     *     
     */
    public SearchForProviderIndividualResult getSearchForProviderIndividualResult() {
        return searchForProviderIndividualResult;
    }

    /**
     * Sets the value of the searchForProviderIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchForProviderIndividualResult }
     *     
     * @see #getSearchForProviderIndividualResult()
     */
    public void setSearchForProviderIndividualResult(SearchForProviderIndividualResult value) {
        this.searchForProviderIndividualResult = value;
    }

}
