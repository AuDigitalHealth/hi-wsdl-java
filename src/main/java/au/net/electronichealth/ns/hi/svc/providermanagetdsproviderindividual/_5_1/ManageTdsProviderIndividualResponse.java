
package au.net.electronichealth.ns.hi.svc.providermanagetdsproviderindividual._5_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2.ManageTdsProviderIndividualResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0}manageTdsProviderIndividualResult"/>
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
    "manageTdsProviderIndividualResult"
})
@XmlRootElement(name = "manageTdsProviderIndividualResponse")
public class ManageTdsProviderIndividualResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0", required = true)
    protected ManageTdsProviderIndividualResult manageTdsProviderIndividualResult;

    /**
     * Gets the value of the manageTdsProviderIndividualResult property.
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
     */
    public void setManageTdsProviderIndividualResult(ManageTdsProviderIndividualResult value) {
        this.manageTdsProviderIndividualResult = value;
    }

}
