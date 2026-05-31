
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IHIStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="IHIStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Active"/>
 *     <enumeration value="Deceased"/>
 *     <enumeration value="Expired"/>
 *     <enumeration value="Resolved"/>
 *     <enumeration value="Retired"/>
 *   </restriction>
 * </simpleType>
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
