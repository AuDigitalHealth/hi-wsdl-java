
package au.net.electronichealth.ns.hi.xsd.providermessages.submitsearchproviderorganisation._5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1.BatchSearchForProviderOrganisationCriteriaType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0}batchSearchForProviderOrganisationCriteria" maxOccurs="50"/&gt;
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
    "batchSearchForProviderOrganisationCriteria"
})
@XmlRootElement(name = "submitSearchForProviderOrganisation")
public class SubmitSearchForProviderOrganisation {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0", required = true)
    protected List<BatchSearchForProviderOrganisationCriteriaType> batchSearchForProviderOrganisationCriteria;

    /**
     * Gets the value of the batchSearchForProviderOrganisationCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchSearchForProviderOrganisationCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBatchSearchForProviderOrganisationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchSearchForProviderOrganisationCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the batchSearchForProviderOrganisationCriteria property.
     */
    public List<BatchSearchForProviderOrganisationCriteriaType> getBatchSearchForProviderOrganisationCriteria() {
        if (batchSearchForProviderOrganisationCriteria == null) {
            batchSearchForProviderOrganisationCriteria = new ArrayList<BatchSearchForProviderOrganisationCriteriaType>();
        }
        return this.batchSearchForProviderOrganisationCriteria;
    }

}
