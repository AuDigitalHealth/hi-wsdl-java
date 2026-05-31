
package au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfDeathNotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SourceOfDeathNotificationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="D"/>
 *     <enumeration value="P"/>
 *     <enumeration value="R"/>
 *     <enumeration value="T"/>
 *     <enumeration value="O"/>
 *     <enumeration value="U"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceOfDeathNotificationType")
@XmlEnum
public enum SourceOfDeathNotificationType {


    /**
     * Official death certificate or death register
     * 
     */
    D,

    /**
     * Health Care Provider
     * 
     */
    P,

    /**
     * Relative
     * 
     */
    R,

    /**
     * Trusted Data Source
     * 
     */
    T,

    /**
     * Other
     * 
     */
    O,

    /**
     * Unknown
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static SourceOfDeathNotificationType fromValue(String v) {
        return valueOf(v);
    }

}
