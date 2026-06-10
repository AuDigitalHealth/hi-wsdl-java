
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SeverityType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="SeverityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fatal"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Informational"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "SeverityType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum SeverityType {

    @XmlEnumValue("Fatal")
    FATAL("Fatal"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Informational")
    INFORMATIONAL("Informational");
    private final String value;

    SeverityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityType fromValue(String v) {
        for (SeverityType c: SeverityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
