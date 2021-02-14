
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualNameUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndividualNameUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndividualNameUsageType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum IndividualNameUsageType {


    /**
     * Maiden name (Name at birth)
     * 
     */
    M,

    /**
     * Newborn name
     * 
     */
    N,

    /**
     * Other name (Alias)
     * 
     */
    O,

    /**
     * Professional or business name
     * 
     */
    B,

    /**
     * Registered name (Legal name)
     * 
     */
    L,

    /**
     * Reporting name
     * 
     */
    R;

    public String value() {
        return name();
    }

    public static IndividualNameUsageType fromValue(String v) {
        return valueOf(v);
    }

}
