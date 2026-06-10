
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for DateAccuracyIndicatorType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="DateAccuracyIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="3"/&gt;
 *     &lt;enumeration value="AAA"/&gt;
 *     &lt;enumeration value="AAE"/&gt;
 *     &lt;enumeration value="AAU"/&gt;
 *     &lt;enumeration value="AEA"/&gt;
 *     &lt;enumeration value="AEE"/&gt;
 *     &lt;enumeration value="AEU"/&gt;
 *     &lt;enumeration value="AUA"/&gt;
 *     &lt;enumeration value="AUE"/&gt;
 *     &lt;enumeration value="AUU"/&gt;
 *     &lt;enumeration value="EAA"/&gt;
 *     &lt;enumeration value="EAE"/&gt;
 *     &lt;enumeration value="EAU"/&gt;
 *     &lt;enumeration value="EEA"/&gt;
 *     &lt;enumeration value="EEE"/&gt;
 *     &lt;enumeration value="EEU"/&gt;
 *     &lt;enumeration value="EUA"/&gt;
 *     &lt;enumeration value="EUE"/&gt;
 *     &lt;enumeration value="EUU"/&gt;
 *     &lt;enumeration value="UAA"/&gt;
 *     &lt;enumeration value="UAE"/&gt;
 *     &lt;enumeration value="UAU"/&gt;
 *     &lt;enumeration value="UEA"/&gt;
 *     &lt;enumeration value="UEE"/&gt;
 *     &lt;enumeration value="UEU"/&gt;
 *     &lt;enumeration value="UUA"/&gt;
 *     &lt;enumeration value="UUE"/&gt;
 *     &lt;enumeration value="UUU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
