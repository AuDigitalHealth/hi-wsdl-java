
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAccuracyIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateAccuracyIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="AAA"/>
 *     &lt;enumeration value="AAE"/>
 *     &lt;enumeration value="AAU"/>
 *     &lt;enumeration value="AEA"/>
 *     &lt;enumeration value="AEE"/>
 *     &lt;enumeration value="AEU"/>
 *     &lt;enumeration value="AUA"/>
 *     &lt;enumeration value="AUE"/>
 *     &lt;enumeration value="AUU"/>
 *     &lt;enumeration value="EAA"/>
 *     &lt;enumeration value="EAE"/>
 *     &lt;enumeration value="EAU"/>
 *     &lt;enumeration value="EEA"/>
 *     &lt;enumeration value="EEE"/>
 *     &lt;enumeration value="EEU"/>
 *     &lt;enumeration value="EUA"/>
 *     &lt;enumeration value="EUE"/>
 *     &lt;enumeration value="EUU"/>
 *     &lt;enumeration value="UAA"/>
 *     &lt;enumeration value="UAE"/>
 *     &lt;enumeration value="UAU"/>
 *     &lt;enumeration value="UEA"/>
 *     &lt;enumeration value="UEE"/>
 *     &lt;enumeration value="UEU"/>
 *     &lt;enumeration value="UUA"/>
 *     &lt;enumeration value="UUE"/>
 *     &lt;enumeration value="UUU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
