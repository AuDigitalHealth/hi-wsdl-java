
package au.net.electronichealth.ns.hi.svc.providerreadproviderorganisation._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2.ReadProviderOrganisationResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}readProviderOrganisationResult"/>
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
    "readProviderOrganisationResult"
})
@XmlRootElement(name = "readProviderOrganisationResponse")
public class ReadProviderOrganisationResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0", required = true)
    protected ReadProviderOrganisationResult readProviderOrganisationResult;

    /**
     * Gets the value of the readProviderOrganisationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadProviderOrganisationResult }
     *     
     */
    public ReadProviderOrganisationResult getReadProviderOrganisationResult() {
        return readProviderOrganisationResult;
    }

    /**
     * Sets the value of the readProviderOrganisationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadProviderOrganisationResult }
     *     
     */
    public void setReadProviderOrganisationResult(ReadProviderOrganisationResult value) {
        this.readProviderOrganisationResult = value;
    }

}
