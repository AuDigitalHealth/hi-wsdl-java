
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IHIStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IHIStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Deceased"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Resolved"/>
 *     &lt;enumeration value="Retired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IHIStatusType", namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreDatatypes/3.0")
@XmlEnum
public enum IHIStatusType {


    /**
     * Active
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Deceased
     * 
     */
    @XmlEnumValue("Deceased")
    DECEASED("Deceased"),

    /**
     * Expired
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Resolved
     * 
     */
    @XmlEnumValue("Resolved")
    RESOLVED("Resolved"),

    /**
     * Retired
     * 
     */
    @XmlEnumValue("Retired")
    RETIRED("Retired");
    private final String value;

    IHIStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IHIStatusType fromValue(String v) {
        for (IHIStatusType c: IHIStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
