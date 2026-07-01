
package au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.IndividualNameUsageType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DateAndAccuracyType;


/**
 * <p>Java class for NameUsageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="NameUsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}usage" maxOccurs="unbounded"/&gt;
 *         &lt;element name="startDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType"/&gt;
 *         &lt;element name="endDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameUsageType", propOrder = {
    "usage",
    "startDate",
    "endDate"
})
public class NameUsageType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected List<IndividualNameUsageType> usage;
    @XmlElement(required = true)
    protected DateAndAccuracyType startDate;
    protected DateAndAccuracyType endDate;

    /**
     * Gets the value of the usage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameUsageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the usage property.
     */
    public List<IndividualNameUsageType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<IndividualNameUsageType>();
        }
        return this.usage;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public DateAndAccuracyType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public void setStartDate(DateAndAccuracyType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public DateAndAccuracyType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAccuracyType }
     *     
     */
    public void setEndDate(DateAndAccuracyType value) {
        this.endDate = value;
    }

}
