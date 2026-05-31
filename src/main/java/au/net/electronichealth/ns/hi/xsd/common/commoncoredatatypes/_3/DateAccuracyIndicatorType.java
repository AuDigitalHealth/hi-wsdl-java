
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAccuracyIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DateAccuracyIndicatorType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="3"/>
 *     <enumeration value="AAA"/>
 *     <enumeration value="AAE"/>
 *     <enumeration value="AAU"/>
 *     <enumeration value="AEA"/>
 *     <enumeration value="AEE"/>
 *     <enumeration value="AEU"/>
 *     <enumeration value="AUA"/>
 *     <enumeration value="AUE"/>
 *     <enumeration value="AUU"/>
 *     <enumeration value="EAA"/>
 *     <enumeration value="EAE"/>
 *     <enumeration value="EAU"/>
 *     <enumeration value="EEA"/>
 *     <enumeration value="EEE"/>
 *     <enumeration value="EEU"/>
 *     <enumeration value="EUA"/>
 *     <enumeration value="EUE"/>
 *     <enumeration value="EUU"/>
 *     <enumeration value="UAA"/>
 *     <enumeration value="UAE"/>
 *     <enumeration value="UAU"/>
 *     <enumeration value="UEA"/>
 *     <enumeration value="UEE"/>
 *     <enumeration value="UEU"/>
 *     <enumeration value="UUA"/>
 *     <enumeration value="UUE"/>
 *     <enumeration value="UUU"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateAccuracyIndicatorType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum DateAccuracyIndicatorType {


    /**
     * Accurate day, accurate month, accurate year
     * 
     */
    AAA,

    /**
     * Accurate day, accurate month, estimated year
     * 
     */
    AAE,

    /**
     * Accurate day, accurate month, unknown year
     * 
     */
    AAU,

    /**
     * Accurate day, estimated month, accurate year
     * 
     */
    AEA,

    /**
     * Accurate day, estimated month, estimated year
     * 
     */
    AEE,

    /**
     * Accurate day, estimated month, unknown year
     * 
     */
    AEU,

    /**
     * Accurate day, unknown month, accurate year
     * 
     */
    AUA,

    /**
     * Accurate day, unknown month, estimated year
     * 
     */
    AUE,

    /**
     * Accurate day, unknown month, unknown year
     * 
     */
    AUU,

    /**
     * Estimated day, accurate month, accurate year
     * 
     */
    EAA,

    /**
     * Estimated day, accurate month, estimated year
     * 
     */
    EAE,

    /**
     * Estimated day, accurate month, unknown year
     * 
     */
    EAU,

    /**
     * Estimated day, estimated month, accurate year
     * 
     */
    EEA,

    /**
     * Estimated day, estimated month, estimated year
     * 
     */
    EEE,

    /**
     * Estimated day, estimated month, unknown year
     * 
     */
    EEU,

    /**
     * Estimated day, unknown month, accurate year
     * 
     */
    EUA,

    /**
     * Estimated day, unknown month, estimated year
     * 
     */
    EUE,

    /**
     * Estimated day, unknown month, unknown year
     * 
     */
    EUU,

    /**
     * Unknown day, accurate month, accurate year
     * 
     */
    UAA,

    /**
     * Unknown day, accurate month, estimated year
     * 
     */
    UAE,

    /**
     * Unknown day, accurate month, unknown year
     * 
     */
    UAU,

    /**
     * Unknown day, estimated month, accurate year
     * 
     */
    UEA,

    /**
     * Unknown day, estimated month, estimated year
     * 
     */
    UEE,

    /**
     * Unknown day, estimated month, unknown year
     * 
     */
    UEU,

    /**
     * Unknown day, unknown month, accurate year
     * 
     */
    UUA,

    /**
     * Unknown day, unknown month, estimated year
     * 
     */
    UUE,

    /**
     * Unknown day, unknown month, unknown year
     * 
     */
    UUU;

    public String value() {
        return name();
    }

    public static DateAccuracyIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
