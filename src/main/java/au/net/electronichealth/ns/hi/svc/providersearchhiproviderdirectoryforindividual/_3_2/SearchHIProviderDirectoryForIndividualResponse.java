
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryforindividual._3_2;

import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2.SearchHIProviderDirectoryForIndividualResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}searchHIProviderDirectoryForIndividualResult"/&gt;
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
    "searchHIProviderDirectoryForIndividualResult"
})
@XmlRootElement(name = "searchHIProviderDirectoryForIndividualResponse")
public class SearchHIProviderDirectoryForIndividualResponse {

    /**
     * Search for Provider Individual Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", required = true)
    protected SearchHIProviderDirectoryForIndividualResult searchHIProviderDirectoryForIndividualResult;

    /**
     * Search for Provider Individual Response element
     * 
     * @return
     *     possible object is
     *     {@link SearchHIProviderDirectoryForIndividualResult }
     *     
     */
    public SearchHIProviderDirectoryForIndividualResult getSearchHIProviderDirectoryForIndividualResult() {
        return searchHIProviderDirectoryForIndividualResult;
    }

    /**
     * Sets the value of the searchHIProviderDirectoryForIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchHIProviderDirectoryForIndividualResult }
     *     
     * @see #getSearchHIProviderDirectoryForIndividualResult()
     */
    public void setSearchHIProviderDirectoryForIndividualResult(SearchHIProviderDirectoryForIndividualResult value) {
        this.searchHIProviderDirectoryForIndividualResult = value;
    }

}
