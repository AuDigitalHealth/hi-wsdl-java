
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LevelType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="B"/>
 *     <enumeration value="FL"/>
 *     <enumeration value="G"/>
 *     <enumeration value="L"/>
 *     <enumeration value="LG"/>
 *     <enumeration value="M"/>
 *     <enumeration value="OD"/>
 *     <enumeration value="P"/>
 *     <enumeration value="PTHS"/>
 *     <enumeration value="PLF"/>
 *     <enumeration value="PLZA"/>
 *     <enumeration value="PDM"/>
 *     <enumeration value="RT"/>
 *     <enumeration value="SB"/>
 *     <enumeration value="UG"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LevelType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum LevelType {


    /**
     * Basement
     * 
     */
    B,

    /**
     * Floor
     * 
     */
    FL,

    /**
     * Ground
     * 
     */
    G,

    /**
     * Level
     * 
     */
    L,

    /**
     * Lower Ground
     * 
     */
    LG,

    /**
     * Mezzanine
     * 
     */
    M,

    /**
     * Observation Deck
     * 
     */
    OD,

    /**
     * Parking
     * 
     */
    P,

    /**
     * Penthouse
     * 
     */
    PTHS,

    /**
     * Platform
     * 
     */
    PLF,

    /**
     * Plaza
     * 
     */
    PLZA,

    /**
     * Podium
     * 
     */
    PDM,

    /**
     * Rooftop
     * 
     */
    RT,

    /**
     * Sub Basement
     * 
     */
    SB,

    /**
     * Upper Ground
     * 
     */
    UG;

    public String value() {
        return name();
    }

    public static LevelType fromValue(String v) {
        return valueOf(v);
    }

}
