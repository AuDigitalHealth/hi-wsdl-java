
package au.net.electronichealth.ns.hi.svc.providersearchtdsproviderindividual._5_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1.SearchTdsProviderIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}searchTdsProviderIndividualResult"/>
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
    "searchTdsProviderIndividualResult"
})
@XmlRootElement(name = "searchTdsProviderIndividualResponse")
public class SearchTdsProviderIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0", required = true)
    protected SearchTdsProviderIndividualResult searchTdsProviderIndividualResult;

    /**
     * Gets the value of the searchTdsProviderIndividualResult property.
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
     */
    public void setSearchTdsProviderIndividualResult(SearchTdsProviderIndividualResult value) {
        this.searchTdsProviderIndividualResult = value;
    }

}
