
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AddressPurposeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="AddressPurposeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
