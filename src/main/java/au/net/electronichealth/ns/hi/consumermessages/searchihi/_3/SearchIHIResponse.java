
package au.net.electronichealth.ns.hi.consumermessages.searchihi._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHI/3.0}searchIHIResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    @XmlElement(required = true)
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
