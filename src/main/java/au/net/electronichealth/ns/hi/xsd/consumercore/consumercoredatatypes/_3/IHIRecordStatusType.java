
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IHIRecordStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IHIRecordStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Provisional"/>
 *     &lt;enumeration value="Unverified"/>
 *     &lt;enumeration value="Verified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IHIRecordStatusType", namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreDatatypes/3.0")
@XmlEnum
public enum IHIRecordStatusType {


    /**
     * Provisional
     * 
     */
    @XmlEnumValue("Provisional")
    PROVISIONAL("Provisional"),

    /**
     * Unverified
     * 
     */
    @XmlEnumValue("Unverified")
    UNVERIFIED("Unverified"),

    /**
     * Verified
     * 
     */
    @XmlEnumValue("Verified")
    VERIFIED("Verified");
    private final String value;

    IHIRecordStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IHIRecordStatusType fromValue(String v) {
        for (IHIRecordStatusType c: IHIRecordStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
