
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressPurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
