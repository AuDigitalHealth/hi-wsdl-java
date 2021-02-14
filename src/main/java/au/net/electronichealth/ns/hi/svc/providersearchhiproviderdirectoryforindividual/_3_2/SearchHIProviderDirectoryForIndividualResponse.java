
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryforindividual._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2.SearchHIProviderDirectoryForIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}searchHIProviderDirectoryForIndividualResult"/>
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
    "searchHIProviderDirectoryForIndividualResult"
})
@XmlRootElement(name = "searchHIProviderDirectoryForIndividualResponse")
public class SearchHIProviderDirectoryForIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0", required = true)
    protected SearchHIProviderDirectoryForIndividualResult searchHIProviderDirectoryForIndividualResult;

    /**
     * Gets the value of the searchHIProviderDirectoryForIndividualResult property.
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
     */
    public void setSearchHIProviderDirectoryForIndividualResult(SearchHIProviderDirectoryForIndividualResult value) {
        this.searchHIProviderDirectoryForIndividualResult = value;
    }

}
