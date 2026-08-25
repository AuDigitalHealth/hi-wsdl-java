
package au.net.electronichealth.ns.hi.svc.consumersearchihibatchasync._3;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3.SearchIHIRequestType;
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
 *         &lt;element name="searchIHIBatchRequest" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}SearchIHIRequestType" maxOccurs="2000"/&gt;
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
    "searchIHIBatchRequest"
})
@XmlRootElement(name = "submitSearchIHIBatch")
public class SubmitSearchIHIBatch {

    @XmlElement(required = true)
    protected List<SearchIHIRequestType> searchIHIBatchRequest;

    /**
     * Gets the value of the searchIHIBatchRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the searchIHIBatchRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchIHIBatchRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchIHIRequestType }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchIHIBatchRequest property.
     */
    public List<SearchIHIRequestType> getSearchIHIBatchRequest() {
        if (searchIHIBatchRequest == null) {
            searchIHIBatchRequest = new ArrayList<>();
        }
        return this.searchIHIBatchRequest;
    }

}
