
package au.net.electronichealth.ns.hi.xsd.providermessages.readreferencedata._3_2;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.ReferenceSetType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ElementReferenceValuesType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ElementReferenceValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elementName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ElementNameType"/&gt;
 *         &lt;element name="referenceSet" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ReferenceSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementReferenceValuesType", propOrder = {
    "elementName",
    "referenceSet"
})
public class ElementReferenceValuesType {

    @XmlElement(required = true)
    protected String elementName;
    protected List<ReferenceSetType> referenceSet;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the referenceSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the referenceSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReferenceSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceSetType }
     * </p>
     * 
     * 
     * @return
     *     The value of the referenceSet property.
     */
    public List<ReferenceSetType> getReferenceSet() {
        if (referenceSet == null) {
            referenceSet = new ArrayList<>();
        }
        return this.referenceSet;
    }

}
