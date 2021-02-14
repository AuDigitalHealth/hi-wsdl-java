
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.consumermessages.searchihi._3.SearchIHIResult;


/**
 * <p>Java class for SearchIHIResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchIHIResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0}searchIHIResult"/>
 *         &lt;element name="requestIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}UniqueIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchIHIResultType", propOrder = {
    "searchIHIResult",
    "requestIdentifier"
})
public class SearchIHIResultType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0", required = true)
    protected SearchIHIResult searchIHIResult;
    @XmlElement(required = true)
    protected String requestIdentifier;

    /**
     * Gets the value of the searchIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIHIResult }
     *     
     */
    public SearchIHIResult getSearchIHIResult() {
        return searchIHIResult;
    }

    /**
     * Sets the value of the searchIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIHIResult }
     *     
     */
    public void setSearchIHIResult(SearchIHIResult value) {
        this.searchIHIResult = value;
    }

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

}
