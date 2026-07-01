
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.searchihi._3.SearchIHI;


/**
 * <p>Java class for SearchIHIRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="SearchIHIRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0}searchIHI"/&gt;
 *         &lt;element name="requestIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}UniqueIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchIHIRequestType", propOrder = {
    "searchIHI",
    "requestIdentifier"
})
public class SearchIHIRequestType {

    /**
     * Search IHI Request
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0", required = true)
    protected SearchIHI searchIHI;
    @XmlElement(required = true)
    protected String requestIdentifier;

    /**
     * Search IHI Request
     * 
     * @return
     *     possible object is
     *     {@link SearchIHI }
     *     
     */
    public SearchIHI getSearchIHI() {
        return searchIHI;
    }

    /**
     * Sets the value of the searchIHI property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIHI }
     *     
     * @see #getSearchIHI()
     */
    public void setSearchIHI(SearchIHI value) {
        this.searchIHI = value;
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
