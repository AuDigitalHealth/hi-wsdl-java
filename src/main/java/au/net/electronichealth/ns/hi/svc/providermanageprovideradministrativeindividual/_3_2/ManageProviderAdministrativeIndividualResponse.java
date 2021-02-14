
package au.net.electronichealth.ns.hi.svc.providermanageprovideradministrativeindividual._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.manageprovideradministrativeindividual._3_2.ManageProviderAdministrativeIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderAdministrativeIndividual/3.2.0}manageProviderAdministrativeIndividualResult"/>
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
    "manageProviderAdministrativeIndividualResult"
})
@XmlRootElement(name = "manageProviderAdministrativeIndividualResponse")
public class ManageProviderAdministrativeIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderAdministrativeIndividual/3.2.0", required = true)
    protected ManageProviderAdministrativeIndividualResult manageProviderAdministrativeIndividualResult;

    /**
     * Gets the value of the manageProviderAdministrativeIndividualResult property.
     * 
     * @return
     *     possible object is
     *     {@link ManageProviderAdministrativeIndividualResult }
     *     
     */
    public ManageProviderAdministrativeIndividualResult getManageProviderAdministrativeIndividualResult() {
        return manageProviderAdministrativeIndividualResult;
    }

    /**
     * Sets the value of the manageProviderAdministrativeIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageProviderAdministrativeIndividualResult }
     *     
     */
    public void setManageProviderAdministrativeIndividualResult(ManageProviderAdministrativeIndividualResult value) {
        this.manageProviderAdministrativeIndividualResult = value;
    }

}
