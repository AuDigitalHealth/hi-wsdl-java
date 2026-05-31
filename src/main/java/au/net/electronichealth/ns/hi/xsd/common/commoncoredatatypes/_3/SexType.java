
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SexType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="F"/>
 *     <enumeration value="I"/>
 *     <enumeration value="M"/>
 *     <enumeration value="N"/>
 *     <length value="1"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SexType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum SexType {


    /**
     * Female
     * 
     */
    F,

    /**
     * Intersex or indeterminate
     * 
     */
    I,

    /**
     * Male
     * 
     */
    M,

    /**
     * Not stated/inadequately described
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static SexType fromValue(String v) {
        return valueOf(v);
    }

}
