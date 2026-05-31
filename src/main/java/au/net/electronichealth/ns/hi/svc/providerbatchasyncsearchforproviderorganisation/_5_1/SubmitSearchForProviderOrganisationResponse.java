
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderorganisation._5_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.submitsearchproviderorganisation._5_1.SubmitSearchForProviderOrganisationResult;


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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderOrganisation/5.1.0}submitSearchForProviderOrganisationResult"/>
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
    "submitSearchForProviderOrganisationResult"
})
@XmlRootElement(name = "submitSearchForProviderOrganisationResponse")
public class SubmitSearchForProviderOrganisationResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SubmitSearchProviderOrganisation/5.1.0", required = true)
    protected SubmitSearchForProviderOrganisationResult submitSearchForProviderOrganisationResult;

    /**
     * Gets the value of the submitSearchForProviderOrganisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitSearchForProviderOrganisationResult }
     *     
     */
    public SubmitSearchForProviderOrganisationResult getSubmitSearchForProviderOrganisationResult() {
        return submitSearchForProviderOrganisationResult;
    }

    /**
     * Sets the value of the submitSearchForProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitSearchForProviderOrganisationResult }
     *     
     */
    public void setSubmitSearchForProviderOrganisationResult(SubmitSearchForProviderOrganisationResult value) {
        this.submitSearchForProviderOrganisationResult = value;
    }

}
