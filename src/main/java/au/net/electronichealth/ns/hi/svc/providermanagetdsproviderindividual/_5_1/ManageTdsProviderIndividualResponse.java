
package au.net.electronichealth.ns.hi.svc.providermanagetdsproviderindividual._5_1;

import au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2.ManageTdsProviderIndividualResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0}manageTdsProviderIndividualResult"/&gt;
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
    "manageTdsProviderIndividualResult"
})
@XmlRootElement(name = "manageTdsProviderIndividualResponse")
public class ManageTdsProviderIndividualResponse {

    /**
     * Manage Provider Individual Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0", required = true)
    protected ManageTdsProviderIndividualResult manageTdsProviderIndividualResult;

    /**
     * Manage Provider Individual Response element
     * 
     * @return
     *     possible object is
     *     {@link ManageTdsProviderIndividualResult }
     *     
     */
    public ManageTdsProviderIndividualResult getManageTdsProviderIndividualResult() {
        return manageTdsProviderIndividualResult;
    }

    /**
     * Sets the value of the manageTdsProviderIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageTdsProviderIndividualResult }
     *     
     * @see #getManageTdsProviderIndividualResult()
     */
    public void setManageTdsProviderIndividualResult(ManageTdsProviderIndividualResult value) {
        this.manageTdsProviderIndividualResult = value;
    }

}
