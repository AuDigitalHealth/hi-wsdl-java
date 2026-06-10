
package au.net.electronichealth.ns.hi.svc.providermanageprovideradministrativeindividual._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.manageprovideradministrativeindividual._3_2.ManageProviderAdministrativeIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderAdministrativeIndividual/3.2.0}manageProviderAdministrativeIndividualResult"/&gt;
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
    "manageProviderAdministrativeIndividualResult"
})
@XmlRootElement(name = "manageProviderAdministrativeIndividualResponse")
public class ManageProviderAdministrativeIndividualResponse {

    /**
     * Manage Provider/Administrative Individual
     *                 Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderAdministrativeIndividual/3.2.0", required = true)
    protected ManageProviderAdministrativeIndividualResult manageProviderAdministrativeIndividualResult;

    /**
     * Manage Provider/Administrative Individual
     *                 Response element
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
     * @see #getManageProviderAdministrativeIndividualResult()
     */
    public void setManageProviderAdministrativeIndividualResult(ManageProviderAdministrativeIndividualResult value) {
        this.manageProviderAdministrativeIndividualResult = value;
    }

}
