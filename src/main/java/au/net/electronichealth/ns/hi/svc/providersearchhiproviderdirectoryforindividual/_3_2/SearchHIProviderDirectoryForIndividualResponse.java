
package au.net.electronichealth.ns.hi.svc.providersearchhiproviderdirectoryforindividual._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._3_2.SearchHIProviderDirectoryForIndividualResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/3.2.0}searchHIProviderDirectoryForIndividualResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
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
