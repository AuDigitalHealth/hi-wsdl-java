
package au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="providerIndividualResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0}providerIndividualResponse" maxOccurs="unbounded" minOccurs="0"/>
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
    "providerIndividualResponses"
})
@XmlRootElement(name = "manageTdsProviderIndividualResult")
public class ManageTdsProviderIndividualResult {

    protected List<ProviderIndividualResponse> providerIndividualResponses;

    /**
     * Gets the value of the providerIndividualResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerIndividualResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderIndividualResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderIndividualResponse }
     * 
     * 
     */
    public List<ProviderIndividualResponse> getProviderIndividualResponses() {
        if (providerIndividualResponses == null) {
            providerIndividualResponses = new ArrayList<ProviderIndividualResponse>();
        }
        return this.providerIndividualResponses;
    }

}
