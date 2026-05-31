
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for IHIStatusType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="IHIStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Deceased"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="Resolved"/&gt;
 *     &lt;enumeration value="Retired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static IHIStatusType fromValue(String v) {
        for (IHIStatusType c: IHIStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
