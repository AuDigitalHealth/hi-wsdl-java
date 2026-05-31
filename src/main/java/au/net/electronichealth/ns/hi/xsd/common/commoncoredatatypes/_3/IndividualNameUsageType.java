
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualNameUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="IndividualNameUsageType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="M"/>
 *     <enumeration value="N"/>
 *     <enumeration value="O"/>
 *     <enumeration value="B"/>
 *     <enumeration value="L"/>
 *     <enumeration value="R"/>
 *   </restriction>
 * </simpleType>
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
