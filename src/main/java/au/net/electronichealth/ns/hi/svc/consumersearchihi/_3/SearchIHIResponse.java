
package au.net.electronichealth.ns.hi.svc.consumersearchihi._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.searchihi._3.SearchIHIResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0}searchIHIResult"/&gt;
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
    "searchIHIResult"
})
@XmlRootElement(name = "searchIHIResponse")
public class SearchIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0", required = true)
    protected SearchIHIResult searchIHIResult;

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

}
