
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderindividual._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.retrievesearchproviderindividual._5_1.RetrieveSearchForProviderIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderIndividual/5.1.0}retrieveSearchForProviderIndividualResult"/>
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
    "retrieveSearchForProviderIndividualResult"
})
@XmlRootElement(name = "retrieveSearchForProviderIndividualResponse")
public class RetrieveSearchForProviderIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderIndividual/5.1.0", required = true)
    protected RetrieveSearchForProviderIndividualResult retrieveSearchForProviderIndividualResult;

    /**
     * Gets the value of the retrieveSearchForProviderIndividualResult property.
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
     */
    public void setRetrieveSearchForProviderIndividualResult(RetrieveSearchForProviderIndividualResult value) {
        this.retrieveSearchForProviderIndividualResult = value;
    }

}
