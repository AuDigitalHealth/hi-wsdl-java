
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for IHIRecordStatusType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="IHIRecordStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Provisional"/&gt;
 *     &lt;enumeration value="Unverified"/&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
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
    public static IHIRecordStatusType fromValue(String v) {
        for (IHIRecordStatusType c: IHIRecordStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
