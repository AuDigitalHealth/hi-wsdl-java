
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BirthPluralityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BirthPluralityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="9"/>
 *     &lt;length value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
