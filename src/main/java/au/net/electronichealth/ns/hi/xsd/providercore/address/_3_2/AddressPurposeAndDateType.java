
package au.net.electronichealth.ns.hi.xsd.providercore.address._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.AddressPurposeType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DateAndAccuracyType;


/**
 * <p>Java class for AddressPurposeAndDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPurposeAndDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}purpose" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DateAndAccuracyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPurposeAndDateType", propOrder = {
    "purpose",
    "startDate",
    "endDate"
})
public class AddressPurposeAndDateType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected List<AddressPurposeType> purpose;
    protected DateAndAccuracyType startDate;
    protected DateAndAccuracyType endDate;

    /**
     * Gets the value of the purpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressPurposeType }
     * 
     * 
     */
    public List<AddressPurposeType> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<AddressPurposeType>();
        }
        return this.purpose;
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
