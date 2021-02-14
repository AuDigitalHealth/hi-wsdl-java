
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="searchIHIBatchRequest" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIRequestType" maxOccurs="2000"/>
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
    "searchIHIBatchRequest"
})
@XmlRootElement(name = "submitSearchIHIBatch")
public class SubmitSearchIHIBatch {

    @XmlElement(required = true)
    protected List<SearchIHIRequestType> searchIHIBatchRequest;

    /**
     * Gets the value of the searchIHIBatchRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchIHIBatchRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchIHIBatchRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchIHIRequestType }
     * 
     * 
     */
    public List<SearchIHIRequestType> getSearchIHIBatchRequest() {
        if (searchIHIBatchRequest == null) {
            searchIHIBatchRequest = new ArrayList<SearchIHIRequestType>();
        }
        return this.searchIHIBatchRequest;
    }

}
