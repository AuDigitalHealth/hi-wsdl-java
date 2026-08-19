
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderindividual._5_1;

import au.net.electronichealth.ns.hi.xsd.providermessages.submitsearchproviderindividual._5_1.SubmitSearchForProviderIndividualResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderIndividual/5.1.0}submitSearchForProviderIndividualResult"/&gt;
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
    "submitSearchForProviderIndividualResult"
})
@XmlRootElement(name = "submitSearchForProviderIndividualResponse")
public class SubmitSearchForProviderIndividualResponse {

    /**
     * Submit Batch Search for Provider Individual Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderIndividual/5.1.0", required = true)
    protected SubmitSearchForProviderIndividualResult submitSearchForProviderIndividualResult;

    /**
     * Submit Batch Search for Provider Individual Response element
     * 
     * @return
     *     possible object is
     *     {@link SubmitSearchForProviderIndividualResult }
     *     
     */
    public SubmitSearchForProviderIndividualResult getSubmitSearchForProviderIndividualResult() {
        return submitSearchForProviderIndividualResult;
    }

    /**
     * Sets the value of the submitSearchForProviderIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitSearchForProviderIndividualResult }
     *     
     * @see #getSubmitSearchForProviderIndividualResult()
     */
    public void setSubmitSearchForProviderIndividualResult(SubmitSearchForProviderIndividualResult value) {
        this.submitSearchForProviderIndividualResult = value;
    }

}
