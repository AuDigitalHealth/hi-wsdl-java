
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for IHIRecordStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="IHIRecordStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Provisional"/&gt;
 *     &lt;enumeration value="Unverified"/&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
