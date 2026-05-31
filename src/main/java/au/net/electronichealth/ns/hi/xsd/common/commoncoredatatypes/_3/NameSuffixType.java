package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for NameSuffixType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NameSuffixType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BM"/>
 *     <enumeration value="BEM"/>
 *     <enumeration value="COMDC"/>
 *     <enumeration value="CH"/>
 *     <enumeration value="AC"/>
 *     <enumeration value="CV"/>
 *     <enumeration value="DCMG"/>
 *     <enumeration value="DCB"/>
 *     <enumeration value="DBE"/>
 *     <enumeration value="DCVO"/>
 *     <enumeration value="AD"/>
 *     <enumeration value="DFM"/>
 *     <enumeration value="DSC"/>
 *     <enumeration value="DSM"/>
 *     <enumeration value="VIII"/>
 *     <enumeration value="ESQ"/>
 *     <enumeration value="V"/>
 *     <enumeration value="I"/>
 *     <enumeration value="IV"/>
 *     <enumeration value="GC"/>
 *     <enumeration value="JNR"/>
 *     <enumeration value="JP"/>
 *     <enumeration value="KB"/>
 *     <enumeration value="KCMG"/>
 *     <enumeration value="KCB"/>
 *     <enumeration value="KBE"/>
 *     <enumeration value="KCVO"/>
 *     <enumeration value="AK"/>
 *     <enumeration value="KG"/>
 *     <enumeration value="KT"/>
 *     <enumeration value="MD"/>
 *     <enumeration value="OAM"/>
 *     <enumeration value="MP"/>
 *     <enumeration value="MHA"/>
 *     <enumeration value="MHR"/>
 *     <enumeration value="MLA"/>
 *     <enumeration value="MLC"/>
 *     <enumeration value="AM"/>
 *     <enumeration value="MBE"/>
 *     <enumeration value="MC"/>
 *     <enumeration value="IX"/>
 *     <enumeration value="OC"/>
 *     <enumeration value="AO"/>
 *     <enumeration value="OBE"/>
 *     <enumeration value="OM"/>
 *     <enumeration value="QC"/>
 *     <enumeration value="II"/>
 *     <enumeration value="SNR"/>
 *     <enumeration value="VII"/>
 *     <enumeration value="VI"/>
 *     <enumeration value="SC"/>
 *     <enumeration value="X"/>
 *     <enumeration value="III"/>
 *     <enumeration value="VC"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 */
@XmlType(name = "NameSuffixType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum NameSuffixType {


    /**
     * Bravery Medal
     */
    BM,

    /**
     * British Empire Medal
     */
    BEM,

    /**
     * Commissioner of Declarations
     */
    COMDC,

    /**
     * Companion of Honour
     */
    CH,

    /**
     * Companion of the Order of Australia
     */
    AC,

    /**
     * Cross of Valour
     */
    CV,

    /**
     * Dame Commander of the Order of Saint Michael and Saint George
     */
    DCMG,

    /**
     * Dame Commander of the Order of the Bath
     */
    DCB,

    /**
     * Dame Commander of the Order of the British Empire
     */
    DBE,

    /**
     * Dame Commander of the Royal Victorian Order
     */
    DCVO,

    /**
     * Dame of the Order of Australia
     */
    AD,

    /**
     * Distinguished Flying Medal
     */
    DFM,

    /**
     * Distinguished Service Cross
     */
    DSC,

    /**
     * Distinguished Service Medal
     */
    DSM,

    /**
     * Eighth
     */
    VIII,

    /**
     * Esquire
     */
    ESQ,

    /**
     * Fifth
     */
    V,

    /**
     * First
     */
    I,

    /**
     * Fourth
     */
    IV,

    /**
     * George Cross
     */
    GC,

    /**
     * Junior
     */
    JNR,

    /**
     * Justice of the Peace
     */
    JP,

    /**
     * Knight Bachelor
     */
    KB,

    /**
     * Knight Commander of the Order of Saint Michael and Saint George
     */
    KCMG,

    /**
     * Knight Commander of the Order of the Bath
     */
    KCB,

    /**
     * Knight Commander of the Order of the British Empire
     */
    KBE,

    /**
     * Knight Commander of the Royal Victorian Order
     */
    KCVO,

    /**
     * Knight of the Order of Australia
     */
    AK,

    /**
     * Knight of the Garter
     */
    KG,

    /**
     * Knight of the Thistle
     */
    KT,

    /**
     * MD
     */
    MD,

    /**
     * Medal of the Order of Australia
     */
    OAM,

    /**
     * Member of Parliament
     */
    MP,

    /**
     * Member of the House of Assembly
     */
    MHA,

    /**
     * Member of the House of Representatives
     */
    MHR,

    /**
     * Member of the Legislative Assembly
     */
    MLA,

    /**
     * Member of the Legislative Council
     */
    MLC,

    /**
     * Member of the Order of Australia
     */
    AM,

    /**
     * Member of the Order of the British Empire
     */
    MBE,

    /**
     * Military Cross
     */
    MC,

    /**
     * Ninth
     */
    IX,

    /**
     * Officer Commanding
     */
    OC,

    /**
     * Officer of the Order of Australia
     */
    AO,

    /**
     * Officer of the Order of the British Empire
     */
    OBE,

    /**
     * Order of Merit
     */
    OM,

    /**
     * Queens Counsel
     */
    QC,

    /**
     * Second
     */
    II,

    /**
     * Senior
     */
    SNR,

    /**
     * Seventh
     */
    VII,

    /**
     * Sixth
     */
    VI,

    /**
     * Star of Courage
     */
    SC,

    /**
     * Tenth
     */
    X,

    /**
     * Third
     */
    III,

    /**
     * Victoria Cross
     */
    VC;

    public String value() {
        return name();
    }

    public static NameSuffixType fromValue(String v) {
        return valueOf(v);
    }
}
