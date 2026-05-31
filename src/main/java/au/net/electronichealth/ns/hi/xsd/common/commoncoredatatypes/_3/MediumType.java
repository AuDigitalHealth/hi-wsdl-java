
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MediumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="1"/>
 *     <maxLength value="1"/>
 *     <enumeration value="E"/>
 *     <enumeration value="F"/>
 *     <enumeration value="M"/>
 *     <enumeration value="O"/>
 *     <enumeration value="P"/>
 *     <enumeration value="T"/>
 *     <enumeration value="U"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediumType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum MediumType {


    /**
     * Email
     * 
     */
    E,

    /**
     * Facsimile machine
     * 
     */
    F,

    /**
     * Mobile (cellular) telephone
     * 
     */
    M,

    /**
     * Other
     * 
     */
    O,

    /**
     * Pager
     * 
     */
    P,

    /**
     * Telephone (excluding Mobile)
     * 
     */
    T,

    /**
     * URL
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static MediumType fromValue(String v) {
        return valueOf(v);
    }

}
