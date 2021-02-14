
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceOfDeathNotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceOfDeathNotificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceOfDeathNotificationType", namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreDatatypes/3.0")
@XmlEnum
public enum SourceOfDeathNotificationType {


    /**
     * Health Care Provider
     * 
     */
    H;

    public String value() {
        return name();
    }

    public static SourceOfDeathNotificationType fromValue(String v) {
        return valueOf(v);
    }

}
