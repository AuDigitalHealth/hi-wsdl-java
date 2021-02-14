
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._5_0.SearchForProviderIndividual;


/**
 * <p>Java class for BatchSearchForProviderIndividualCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchSearchForProviderIndividualCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0}requestIdentifier"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0}searchForProviderIndividual"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSearchForProviderIndividualCriteriaType", propOrder = {
    "requestIdentifier",
    "searchForProviderIndividual"
})
public class BatchSearchForProviderIndividualCriteriaType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", required = true)
    protected String requestIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0", required = true)
    protected SearchForProviderIndividual searchForProviderIndividual;

    /**
     * Gets the value of the requestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * Sets the value of the requestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdentifier(String value) {
        this.requestIdentifier = value;
    }

    /**
     * Gets the value of the searchForProviderIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link SearchForProviderIndividual }
     *     
     */
    public SearchForProviderIndividual getSearchForProviderIndividual() {
        return searchForProviderIndividual;
    }

    /**
     * Sets the value of the searchForProviderIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchForProviderIndividual }
     *     
     */
    public void setSearchForProviderIndividual(SearchForProviderIndividual value) {
        this.searchForProviderIndividual = value;
    }

}
