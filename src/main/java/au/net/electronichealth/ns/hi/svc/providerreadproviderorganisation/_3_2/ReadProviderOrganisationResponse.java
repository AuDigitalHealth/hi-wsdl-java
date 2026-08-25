
package au.net.electronichealth.ns.hi.svc.providerreadproviderorganisation._3_2;

import au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2.ReadProviderOrganisationResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}readProviderOrganisationResult"/&gt;
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
    "readProviderOrganisationResult"
})
@XmlRootElement(name = "readProviderOrganisationResponse")
public class ReadProviderOrganisationResponse {

    /**
     * Read Provider Organisation Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0", required = true)
    protected ReadProviderOrganisationResult readProviderOrganisationResult;

    /**
     * Read Provider Organisation Response element
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
     * @see #getReadProviderOrganisationResult()
     */
    public void setReadProviderOrganisationResult(ReadProviderOrganisationResult value) {
        this.readProviderOrganisationResult = value;
    }

}
