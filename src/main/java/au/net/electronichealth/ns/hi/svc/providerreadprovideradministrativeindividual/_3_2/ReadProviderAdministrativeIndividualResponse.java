
package au.net.electronichealth.ns.hi.svc.providerreadprovideradministrativeindividual._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.readindividual._3_2.ReadProviderAdministrativeIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadIndividual/3.2.0}readProviderAdministrativeIndividualResult"/>
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
    "readProviderAdministrativeIndividualResult"
})
@XmlRootElement(name = "readProviderAdministrativeIndividualResponse")
public class ReadProviderAdministrativeIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadIndividual/3.2.0", required = true)
    protected ReadProviderAdministrativeIndividualResult readProviderAdministrativeIndividualResult;

    /**
     * Gets the value of the readProviderAdministrativeIndividualResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadProviderAdministrativeIndividualResult }
     *     
     */
    public ReadProviderAdministrativeIndividualResult getReadProviderAdministrativeIndividualResult() {
        return readProviderAdministrativeIndividualResult;
    }

    /**
     * Sets the value of the readProviderAdministrativeIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadProviderAdministrativeIndividualResult }
     *     
     */
    public void setReadProviderAdministrativeIndividualResult(ReadProviderAdministrativeIndividualResult value) {
        this.readProviderAdministrativeIndividualResult = value;
    }

}
