
package au.net.electronichealth.ns.hi.svc.providermanagetdsproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2.ProviderIndividual;


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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0}providerIndividuals" maxOccurs="100"/>
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
    "providerIndividuals"
})
@XmlRootElement(name = "manageTdsProviderIndividual")
public class ManageTdsProviderIndividual {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0", required = true)
    protected List<ProviderIndividual> providerIndividuals;

    /**
     * Gets the value of the providerIndividuals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerIndividuals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderIndividuals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderIndividual }
     * 
     * 
     */
    public List<ProviderIndividual> getProviderIndividuals() {
        if (providerIndividuals == null) {
            providerIndividuals = new ArrayList<ProviderIndividual>();
        }
        return this.providerIndividuals;
    }

}
