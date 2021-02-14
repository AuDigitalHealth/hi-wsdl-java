
package au.net.electronichealth.ns.hi.svc.providersearchforproviderindividual._5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._5_0.SearchForProviderIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0}searchForProviderIndividualResult"/>
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
    "searchForProviderIndividualResult"
})
@XmlRootElement(name = "searchForProviderIndividualResponse")
public class SearchForProviderIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0", required = true)
    protected SearchForProviderIndividualResult searchForProviderIndividualResult;

    /**
     * Gets the value of the searchForProviderIndividualResult property.
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
     */
    public void setSearchForProviderIndividualResult(SearchForProviderIndividualResult value) {
        this.searchForProviderIndividualResult = value;
    }

}
