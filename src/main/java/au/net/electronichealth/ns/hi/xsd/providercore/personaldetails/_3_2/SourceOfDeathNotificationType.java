
package au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for SourceOfDeathNotificationType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="SourceOfDeathNotificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
