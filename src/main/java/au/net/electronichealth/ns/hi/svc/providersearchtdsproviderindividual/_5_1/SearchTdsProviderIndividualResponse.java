
package au.net.electronichealth.ns.hi.svc.providersearchtdsproviderindividual._5_1;

import au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1.SearchTdsProviderIndividualResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}searchTdsProviderIndividualResult"/&gt;
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
    "searchTdsProviderIndividualResult"
})
@XmlRootElement(name = "searchTdsProviderIndividualResponse")
public class SearchTdsProviderIndividualResponse {

    /**
     * TDS Search For Provider Individual Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", required = true)
    protected SearchTdsProviderIndividualResult searchTdsProviderIndividualResult;

    /**
     * TDS Search For Provider Individual Response element
     * 
     * @return
     *     possible object is
     *     {@link SearchTdsProviderIndividualResult }
     *     
     */
    public SearchTdsProviderIndividualResult getSearchTdsProviderIndividualResult() {
        return searchTdsProviderIndividualResult;
    }

    /**
     * Sets the value of the searchTdsProviderIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTdsProviderIndividualResult }
     *     
     * @see #getSearchTdsProviderIndividualResult()
     */
    public void setSearchTdsProviderIndividualResult(SearchTdsProviderIndividualResult value) {
        this.searchTdsProviderIndividualResult = value;
    }

}
