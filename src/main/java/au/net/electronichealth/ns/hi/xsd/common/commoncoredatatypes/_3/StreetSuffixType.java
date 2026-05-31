
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetSuffixType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="StreetSuffixType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CN"/>
 *     <enumeration value="E"/>
 *     <enumeration value="EX"/>
 *     <enumeration value="LR"/>
 *     <enumeration value="N"/>
 *     <enumeration value="NE"/>
 *     <enumeration value="NW"/>
 *     <enumeration value="S"/>
 *     <enumeration value="SE"/>
 *     <enumeration value="SW"/>
 *     <enumeration value="UP"/>
 *     <enumeration value="W"/>
 *   </restriction>
 * </simpleType>
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
