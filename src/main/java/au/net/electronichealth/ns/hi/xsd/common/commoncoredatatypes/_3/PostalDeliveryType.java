
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalDeliveryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PostalDeliveryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Care PO"/>
 *     <enumeration value="CMA"/>
 *     <enumeration value="CMB"/>
 *     <enumeration value="GPO Box"/>
 *     <enumeration value="Locked Bag"/>
 *     <enumeration value="MS"/>
 *     <enumeration value="PO Box"/>
 *     <enumeration value="POR"/>
 *     <enumeration value="Private Bag"/>
 *     <enumeration value="RSD"/>
 *     <enumeration value="RMB"/>
 *     <enumeration value="RMS"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostalDeliveryType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum PostalDeliveryType {


    /**
     * Care-of Post Office (also known as Poste Restante)
     * 
     */
    @XmlEnumValue("Care PO")
    CARE_PO("Care PO"),

    /**
     * Community Mail Agent
     * 
     */
    CMA("CMA"),

    /**
     * Community Mail Bag
     * 
     */
    CMB("CMB"),

    /**
     * General Post Office Box
     * 
     */
    @XmlEnumValue("GPO Box")
    GPO_BOX("GPO Box"),

    /**
     * Locked Mail Bag Service
     * 
     */
    @XmlEnumValue("Locked Bag")
    LOCKED_BAG("Locked Bag"),

    /**
     * Mail Service
     * 
     */
    MS("MS"),

    /**
     * Post Office Box
     * 
     */
    @XmlEnumValue("PO Box")
    PO_BOX("PO Box"),

    /**
     * Post Restante (also known as Care-of Post Office)
     * 
     */
    POR("POR"),

    /**
     * Private Mail Bag Service
     * 
     */
    @XmlEnumValue("Private Bag")
    PRIVATE_BAG("Private Bag"),

    /**
     * Roadside Delivery
     * 
     */
    RSD("RSD"),

    /**
     * Roadside Mail Box/Bag
     * 
     */
    RMB("RMB"),

    /**
     * Roadside Mail Service
     * 
     */
    RMS("RMS");
    private final String value;

    PostalDeliveryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostalDeliveryType fromValue(String v) {
        for (PostalDeliveryType c: PostalDeliveryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
