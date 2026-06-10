
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderindividual._5_1;

import au.net.electronichealth.ns.hi.xsd.providermessages.retrievesearchproviderindividual._5_1.RetrieveSearchForProviderIndividualResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderIndividual/5.1.0}retrieveSearchForProviderIndividualResult"/&gt;
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
    "retrieveSearchForProviderIndividualResult"
})
@XmlRootElement(name = "retrieveSearchForProviderIndividualResponse")
public class RetrieveSearchForProviderIndividualResponse {

    /**
     * Retrieve Batch Search for Provider Individual Results Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderIndividual/5.1.0", required = true)
    protected RetrieveSearchForProviderIndividualResult retrieveSearchForProviderIndividualResult;

    /**
     * Retrieve Batch Search for Provider Individual Results Response element
     * 
     * @return
     *     possible object is
     *     {@link RetrieveSearchForProviderIndividualResult }
     *     
     */
    public RetrieveSearchForProviderIndividualResult getRetrieveSearchForProviderIndividualResult() {
        return retrieveSearchForProviderIndividualResult;
    }

    /**
     * Sets the value of the retrieveSearchForProviderIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveSearchForProviderIndividualResult }
     *     
     * @see #getRetrieveSearchForProviderIndividualResult()
     */
    public void setRetrieveSearchForProviderIndividualResult(RetrieveSearchForProviderIndividualResult value) {
        this.retrieveSearchForProviderIndividualResult = value;
    }

}
