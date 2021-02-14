
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetSuffixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StreetSuffixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StreetSuffixType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum StreetSuffixType {


    /**
     * Central
     * 
     */
    CN,

    /**
     * East
     * 
     */
    E,

    /**
     * Extension
     * 
     */
    EX,

    /**
     * Lower
     * 
     */
    LR,

    /**
     * North
     * 
     */
    N,

    /**
     * North East
     * 
     */
    NE,

    /**
     * North West
     * 
     */
    NW,

    /**
     * South
     * 
     */
    S,

    /**
     * South East
     * 
     */
    SE,

    /**
     * South West
     * 
     */
    SW,

    /**
     * Upper
     * 
     */
    UP,

    /**
     * West
     * 
     */
    W;

    public String value() {
        return name();
    }

    public static StreetSuffixType fromValue(String v) {
        return valueOf(v);
    }

}
