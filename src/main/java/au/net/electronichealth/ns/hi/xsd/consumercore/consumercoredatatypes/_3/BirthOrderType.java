
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BirthOrderType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="BirthOrderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "BirthOrderType", namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreDatatypes/3.0")
@XmlEnum
public enum BirthOrderType {


    /**
     * Singleton or first of a multiple birth.
     * 
     */
    @XmlEnumValue("1")
    VALUE_1("1"),

    /**
     * Second of a multiple birth
     * 
     */
    @XmlEnumValue("2")
    VALUE_2("2"),

    /**
     * Third of a multiple birth
     * 
     */
    @XmlEnumValue("3")
    VALUE_3("3"),

    /**
     * Fourth of a multiple birth
     * 
     */
    @XmlEnumValue("4")
    VALUE_4("4"),

    /**
     * Fifth of a multiple birth
     * 
     */
    @XmlEnumValue("5")
    VALUE_5("5"),

    /**
     * Sixth of a multiple birth
     * 
     */
    @XmlEnumValue("6")
    VALUE_6("6"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("8")
    VALUE_7("8"),

    /**
     * Not Stated
     * 
     */
    @XmlEnumValue("9")
    VALUE_8("9");
    private final String value;

    BirthOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BirthOrderType fromValue(String v) {
        for (BirthOrderType c: BirthOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
