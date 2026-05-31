
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderorganisation._5_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.retrievesearchproviderorganisation._5_1.RetrieveSearchForProviderOrganisationResult;


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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderOrganisation/5.1.0}retrieveSearchForProviderOrganisationResult"/>
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
    "retrieveSearchForProviderOrganisationResult"
})
@XmlRootElement(name = "retrieveSearchForProviderOrganisationResponse")
public class RetrieveSearchForProviderOrganisationResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/RetrieveSearchProviderOrganisation/5.1.0", required = true)
    protected RetrieveSearchForProviderOrganisationResult retrieveSearchForProviderOrganisationResult;

    /**
     * Gets the value of the retrieveSearchForProviderOrganisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveSearchForProviderOrganisationResult }
     *     
     */
    public RetrieveSearchForProviderOrganisationResult getRetrieveSearchForProviderOrganisationResult() {
        return retrieveSearchForProviderOrganisationResult;
    }

    /**
     * Sets the value of the retrieveSearchForProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveSearchForProviderOrganisationResult }
     *     
     */
    public void setRetrieveSearchForProviderOrganisationResult(RetrieveSearchForProviderOrganisationResult value) {
        this.retrieveSearchForProviderOrganisationResult = value;
    }

}
