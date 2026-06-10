
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for IndividualNameUsageType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="IndividualNameUsageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
