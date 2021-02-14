
package au.net.electronichealth.ns.hi.xsd.providermessages.readreferencedata._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.ReferenceSetType;


/**
 * <p>Java class for ElementReferenceValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementReferenceValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ElementNameType"/>
 *         &lt;element name="referenceSet" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ReferenceSetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceSetType }
     * 
     * 
     */
    public List<ReferenceSetType> getReferenceSet() {
        if (referenceSet == null) {
            referenceSet = new ArrayList<ReferenceSetType>();
        }
        return this.referenceSet;
    }

}
