
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AddressPurposeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="B"/>
 *     <enumeration value="M"/>
 *     <enumeration value="U"/>
 *     <enumeration value="R"/>
 *     <enumeration value="T"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressPurposeType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum AddressPurposeType {


    /**
     * Business
     * 
     */
    B,

    /**
     * Mailing or Postal
     * 
     */
    M,

    /**
     * Not Stated / Unknown / Inadequately Described
     * 
     */
    U,

    /**
     * Residential (Permanent)
     * 
     */
    R,

    /**
     * Temporary Accommodation
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static AddressPurposeType fromValue(String v) {
        return valueOf(v);
    }

}
