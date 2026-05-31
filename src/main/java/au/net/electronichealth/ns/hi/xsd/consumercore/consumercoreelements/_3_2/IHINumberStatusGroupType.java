
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3_2.IHIRecordStatusType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3_2.IHIStatusType;


/**
 * <p>Java class for IHINumberStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IHINumberStatusGroupType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}ihiNumber"/>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}ihiRecordStatus"/>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0}ihiStatus"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IHINumberStatusGroupType", propOrder = {
    "ihiNumber",
    "ihiRecordStatus",
    "ihiStatus"
})
public class IHINumberStatusGroupType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String ihiNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected IHIRecordStatusType ihiRecordStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected IHIStatusType ihiStatus;

    /**
     * Gets the value of the ihiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhiNumber() {
        return ihiNumber;
    }

    /**
     * Sets the value of the ihiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhiNumber(String value) {
        this.ihiNumber = value;
    }

    /**
     * Gets the value of the ihiRecordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IHIRecordStatusType }
     *     
     */
    public IHIRecordStatusType getIhiRecordStatus() {
        return ihiRecordStatus;
    }

    /**
     * Sets the value of the ihiRecordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IHIRecordStatusType }
     *     
     */
    public void setIhiRecordStatus(IHIRecordStatusType value) {
        this.ihiRecordStatus = value;
    }

    /**
     * Gets the value of the ihiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IHIStatusType }
     *     
     */
    public IHIStatusType getIhiStatus() {
        return ihiStatus;
    }

    /**
     * Sets the value of the ihiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IHIStatusType }
     *     
     */
    public void setIhiStatus(IHIStatusType value) {
        this.ihiStatus = value;
    }

}
