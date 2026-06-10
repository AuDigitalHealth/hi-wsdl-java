
package au.net.electronichealth.ns.hi.svc.providerreadproviderorganisation._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2.ReadProviderOrganisationResult;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}readProviderOrganisationResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
