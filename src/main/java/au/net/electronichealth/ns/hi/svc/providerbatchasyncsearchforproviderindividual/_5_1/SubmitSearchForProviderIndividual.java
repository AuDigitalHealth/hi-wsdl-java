
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1.BatchSearchForProviderIndividualCriteriaType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0}batchSearchForProviderIndividualCriteria" maxOccurs="50"/&gt;
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
    "batchSearchForProviderIndividualCriteria"
})
@XmlRootElement(name = "submitSearchForProviderIndividual")
public class SubmitSearchForProviderIndividual {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0", required = true)
    protected List<BatchSearchForProviderIndividualCriteriaType> batchSearchForProviderIndividualCriteria;

    /**
     * Gets the value of the batchSearchForProviderIndividualCriteria property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchSearchForProviderIndividualCriteria property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getBatchSearchForProviderIndividualCriteria().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link BatchSearchForProviderIndividualCriteriaType }
     * 
     * 
     */
    public List<BatchSearchForProviderIndividualCriteriaType> getBatchSearchForProviderIndividualCriteria() {
        if (batchSearchForProviderIndividualCriteria == null) {
            batchSearchForProviderIndividualCriteria = new ArrayList<BatchSearchForProviderIndividualCriteriaType>();
        }
        return this.batchSearchForProviderIndividualCriteria;
    }

}
