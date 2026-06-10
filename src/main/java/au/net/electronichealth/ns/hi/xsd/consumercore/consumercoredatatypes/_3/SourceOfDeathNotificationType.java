
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SourceOfDeathNotificationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SourceOfDeathNotificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;length value="1"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
