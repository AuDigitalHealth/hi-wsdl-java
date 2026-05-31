
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderindividual._5_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.submitsearchproviderindividual._5_1.SubmitSearchForProviderIndividualResult;


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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderIndividual/5.1.0}submitSearchForProviderIndividualResult"/>
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
    "submitSearchForProviderIndividualResult"
})
@XmlRootElement(name = "submitSearchForProviderIndividualResponse")
public class SubmitSearchForProviderIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderIndividual/5.1.0", required = true)
    protected SubmitSearchForProviderIndividualResult submitSearchForProviderIndividualResult;

    /**
     * Gets the value of the submitSearchForProviderIndividualResult property.
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
     */
    public void setSubmitSearchForProviderIndividualResult(SubmitSearchForProviderIndividualResult value) {
        this.submitSearchForProviderIndividualResult = value;
    }

}
