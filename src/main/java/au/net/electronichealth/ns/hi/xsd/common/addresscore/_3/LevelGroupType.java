
package au.net.electronichealth.ns.hi.xsd.common.addresscore._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.LevelType;


/**
 * <p>Java class for LevelGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LevelGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}levelType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}levelNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevelGroupType", propOrder = {
    "levelType",
    "levelNumber"
})
public class LevelGroupType {

    @XmlElement(required = true)
    protected LevelType levelType;
    protected String levelNumber;

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setLevelType(LevelType value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the levelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNumber(String value) {
        this.levelNumber = value;
    }

}
