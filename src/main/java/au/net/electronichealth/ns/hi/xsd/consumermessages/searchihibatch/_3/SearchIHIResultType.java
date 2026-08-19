
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import au.net.electronichealth.ns.hi.xsd.consumermessages.searchihi._3.SearchIHIResult;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SearchIHIResultType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SearchIHIResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0}searchIHIResult"/&gt;
 *         &lt;element name="requestIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}UniqueIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
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
