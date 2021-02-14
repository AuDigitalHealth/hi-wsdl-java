
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="FL"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="LG"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="OD"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="PTHS"/>
 *     &lt;enumeration value="PLF"/>
 *     &lt;enumeration value="PLZA"/>
 *     &lt;enumeration value="PDM"/>
 *     &lt;enumeration value="RT"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="UG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
