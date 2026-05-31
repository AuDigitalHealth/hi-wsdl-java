
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for LevelType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="LevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="FL"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="LG"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="OD"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="PTHS"/&gt;
 *     &lt;enumeration value="PLF"/&gt;
 *     &lt;enumeration value="PLZA"/&gt;
 *     &lt;enumeration value="PDM"/&gt;
 *     &lt;enumeration value="RT"/&gt;
 *     &lt;enumeration value="SB"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
