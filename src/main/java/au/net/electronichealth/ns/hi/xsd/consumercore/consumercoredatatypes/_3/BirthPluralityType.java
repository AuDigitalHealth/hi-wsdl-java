
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BirthPluralityType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="BirthPluralityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;length value="1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "BirthPluralityType", namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreDatatypes/3.0")
@XmlEnum
public enum BirthPluralityType {


    /**
     * Singleton
     * 
     */
    @XmlEnumValue("1")
    VALUE_1("1"),

    /**
     * Twins
     * 
     */
    @XmlEnumValue("2")
    VALUE_2("2"),

    /**
     * Triplets
     * 
     */
    @XmlEnumValue("3")
    VALUE_3("3"),

    /**
     * Quadruplets
     * 
     */
    @XmlEnumValue("4")
    VALUE_4("4"),

    /**
     * Quintuplets
     * 
     */
    @XmlEnumValue("5")
    VALUE_5("5"),

    /**
     * Sextuplets
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

    BirthPluralityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BirthPluralityType fromValue(String v) {
        for (BirthPluralityType c: BirthPluralityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
