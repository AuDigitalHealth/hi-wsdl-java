
package au.net.electronichealth.ns.hi.svc.providerbatchasyncsearchforproviderorganisation._5_1;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1.BatchSearchForProviderOrganisationCriteriaType;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0}batchSearchForProviderOrganisationCriteria" maxOccurs="50"/&gt;
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the batchSearchForProviderOrganisationCriteria property.</p>
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
            batchSearchForProviderOrganisationCriteria = new ArrayList<>();
        }
        return this.batchSearchForProviderOrganisationCriteria;
    }

}
