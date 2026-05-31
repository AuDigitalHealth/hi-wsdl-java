
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._5_0.SearchForProviderIndividualResult;


/**
 * <p>Java class for BatchSearchForProviderIndividualResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="BatchSearchForProviderIndividualResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0}requestIdentifier"/>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0}searchForProviderIndividualResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSearchForProviderIndividualResultType", propOrder = {
    "requestIdentifier",
    "searchForProviderIndividualResult"
})
public class BatchSearchForProviderIndividualResultType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0", required = true)
    protected String requestIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchIndividual/5.0.0", required = true)
    protected SearchForProviderIndividualResult searchForProviderIndividualResult;

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
     * Gets the value of the searchForProviderIndividualResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchForProviderIndividualResult }
     *     
     */
    public SearchForProviderIndividualResult getSearchForProviderIndividualResult() {
        return searchForProviderIndividualResult;
    }

    /**
     * Sets the value of the searchForProviderIndividualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchForProviderIndividualResult }
     *     
     */
    public void setSearchForProviderIndividualResult(SearchForProviderIndividualResult value) {
        this.searchForProviderIndividualResult = value;
    }

}
