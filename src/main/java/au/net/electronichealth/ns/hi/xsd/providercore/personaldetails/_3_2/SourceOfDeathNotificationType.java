
package au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfDeathNotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceOfDeathNotificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
