
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameTitleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NameTitleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABBOT"/>
 *     <enumeration value="AB"/>
 *     <enumeration value="ADML"/>
 *     <enumeration value="ACM"/>
 *     <enumeration value="AIRCDRE"/>
 *     <enumeration value="AM"/>
 *     <enumeration value="AVM"/>
 *     <enumeration value="AC"/>
 *     <enumeration value="ACW"/>
 *     <enumeration value="ALD"/>
 *     <enumeration value="AMBSR"/>
 *     <enumeration value="ARCHBISHOP"/>
 *     <enumeration value="ARCHDEACON"/>
 *     <enumeration value="ASSOC PROF"/>
 *     <enumeration value="BARON"/>
 *     <enumeration value="BARONESS"/>
 *     <enumeration value="BISHOP"/>
 *     <enumeration value="BDR"/>
 *     <enumeration value="BRIG"/>
 *     <enumeration value="BR"/>
 *     <enumeration value="CDT"/>
 *     <enumeration value="CANON"/>
 *     <enumeration value="CAPT"/>
 *     <enumeration value="CAPT, RAN"/>
 *     <enumeration value="CARDNL"/>
 *     <enumeration value="CHAP"/>
 *     <enumeration value="CPO"/>
 *     <enumeration value="COL"/>
 *     <enumeration value="CMDR"/>
 *     <enumeration value="CMM"/>
 *     <enumeration value="CDRE"/>
 *     <enumeration value="CONST"/>
 *     <enumeration value="CONSUL"/>
 *     <enumeration value="CPL"/>
 *     <enumeration value="COUNT"/>
 *     <enumeration value="COUNTESS"/>
 *     <enumeration value="DAME"/>
 *     <enumeration value="DEACON"/>
 *     <enumeration value="DEACONESS"/>
 *     <enumeration value="DEAN"/>
 *     <enumeration value="DEPUTY SUPT"/>
 *     <enumeration value="DIRECTOR"/>
 *     <enumeration value="DR"/>
 *     <enumeration value="EARL"/>
 *     <enumeration value="ENGR"/>
 *     <enumeration value="FR"/>
 *     <enumeration value="FLTLT"/>
 *     <enumeration value="FSGT"/>
 *     <enumeration value="FLGOFF"/>
 *     <enumeration value="GEN"/>
 *     <enumeration value="GOV"/>
 *     <enumeration value="GP CAPT"/>
 *     <enumeration value="HON"/>
 *     <enumeration value="JUDGE"/>
 *     <enumeration value="JUSTICE"/>
 *     <enumeration value="LADY"/>
 *     <enumeration value="LBDR"/>
 *     <enumeration value="LCPL"/>
 *     <enumeration value="LAC"/>
 *     <enumeration value="LACW"/>
 *     <enumeration value="LS"/>
 *     <enumeration value="(ARMY) LT"/>
 *     <enumeration value="LEUT"/>
 *     <enumeration value="LTCOL"/>
 *     <enumeration value="LCDR"/>
 *     <enumeration value="LTGEN"/>
 *     <enumeration value="LTGOV"/>
 *     <enumeration value="LORD"/>
 *     <enumeration value="MADAM"/>
 *     <enumeration value="MADAME"/>
 *     <enumeration value="MAJ"/>
 *     <enumeration value="MAJGEN"/>
 *     <enumeration value="MGR"/>
 *     <enumeration value="MSTR"/>
 *     <enumeration value="MAYOR"/>
 *     <enumeration value="MAYORESS"/>
 *     <enumeration value="MIDN"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="MR"/>
 *     <enumeration value="MON"/>
 *     <enumeration value="MOST REV"/>
 *     <enumeration value="MTHR"/>
 *     <enumeration value="MRS"/>
 *     <enumeration value="MS"/>
 *     <enumeration value="NURSE"/>
 *     <enumeration value="OCDT"/>
 *     <enumeration value="PASTOR"/>
 *     <enumeration value="PO"/>
 *     <enumeration value="PLTOFF"/>
 *     <enumeration value="PTE"/>
 *     <enumeration value="PROF"/>
 *     <enumeration value="RABBI"/>
 *     <enumeration value="RADM"/>
 *     <enumeration value="RECTOR"/>
 *     <enumeration value="RSM"/>
 *     <enumeration value="RSM-A"/>
 *     <enumeration value="REV"/>
 *     <enumeration value="RTHON"/>
 *     <enumeration value="RT REV"/>
 *     <enumeration value="SMN"/>
 *     <enumeration value="2LT"/>
 *     <enumeration value="SEN"/>
 *     <enumeration value="SNR"/>
 *     <enumeration value="SGT"/>
 *     <enumeration value="SIR"/>
 *     <enumeration value="SR"/>
 *     <enumeration value="SISTER SUP"/>
 *     <enumeration value="SQNLDR"/>
 *     <enumeration value="SCDT"/>
 *     <enumeration value="SSGT"/>
 *     <enumeration value="SM"/>
 *     <enumeration value="SBLT"/>
 *     <enumeration value="SUPT"/>
 *     <enumeration value="SWAMI"/>
 *     <enumeration value="VADM"/>
 *     <enumeration value="VCE CMNDR"/>
 *     <enumeration value="VISCOUNT"/>
 *     <enumeration value="WOFF"/>
 *     <enumeration value="WO"/>
 *     <enumeration value="WO1"/>
 *     <enumeration value="WO2"/>
 *     <enumeration value="WOFF-AF"/>
 *     <enumeration value="WO-N"/>
 *     <enumeration value="WCDR"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameTitleType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum NameTitleType {


    /**
     * Abbot
     * 
     */
    @XmlEnumValue("ABBOT")
    VALUE_1("ABBOT"),

    /**
     * Able Seaman
     * 
     */
    @XmlEnumValue("AB")
    VALUE_2("AB"),

    /**
     * Admiral
     * 
     */
    @XmlEnumValue("ADML")
    VALUE_3("ADML"),

    /**
     * Air Chief Marshal
     * 
     */
    @XmlEnumValue("ACM")
    VALUE_4("ACM"),

    /**
     * Air Commodore
     * 
     */
    @XmlEnumValue("AIRCDRE")
    VALUE_5("AIRCDRE"),

    /**
     * Air Marshal
     * 
     */
    @XmlEnumValue("AM")
    VALUE_6("AM"),

    /**
     * Air Vice Marshal
     * 
     */
    @XmlEnumValue("AVM")
    VALUE_7("AVM"),

    /**
     * Aircraftman
     * 
     */
    @XmlEnumValue("AC")
    VALUE_8("AC"),

    /**
     * Aircraftwoman
     * 
     */
    @XmlEnumValue("ACW")
    VALUE_9("ACW"),

    /**
     * Alderman
     * 
     */
    @XmlEnumValue("ALD")
    VALUE_10("ALD"),

    /**
     * Ambassador
     * 
     */
    @XmlEnumValue("AMBSR")
    VALUE_11("AMBSR"),

    /**
     * Archbishop
     * 
     */
    @XmlEnumValue("ARCHBISHOP")
    VALUE_12("ARCHBISHOP"),

    /**
     * Archdeacon
     * 
     */
    @XmlEnumValue("ARCHDEACON")
    VALUE_13("ARCHDEACON"),

    /**
     * Associate Professor
     * 
     */
    @XmlEnumValue("ASSOC PROF")
    VALUE_14("ASSOC PROF"),

    /**
     * Baron
     * 
     */
    @XmlEnumValue("BARON")
    VALUE_15("BARON"),

    /**
     * Baroness
     * 
     */
    @XmlEnumValue("BARONESS")
    VALUE_16("BARONESS"),

    /**
     * Bishop
     * 
     */
    @XmlEnumValue("BISHOP")
    VALUE_17("BISHOP"),

    /**
     * Bombardier
     * 
     */
    @XmlEnumValue("BDR")
    VALUE_18("BDR"),

    /**
     * Brigadier
     * 
     */
    @XmlEnumValue("BRIG")
    VALUE_19("BRIG"),

    /**
     * Brother
     * 
     */
    @XmlEnumValue("BR")
    VALUE_20("BR"),

    /**
     * Cadet
     * 
     */
    @XmlEnumValue("CDT")
    VALUE_21("CDT"),

    /**
     * Canon
     * 
     */
    @XmlEnumValue("CANON")
    VALUE_22("CANON"),

    /**
     * Captain (Army)
     * 
     */
    @XmlEnumValue("CAPT")
    VALUE_23("CAPT"),

    /**
     * Captain (Navy)
     * 
     */
    @XmlEnumValue("CAPT, RAN")
    VALUE_24("CAPT, RAN"),

    /**
     * Cardinal
     * 
     */
    @XmlEnumValue("CARDNL")
    VALUE_25("CARDNL"),

    /**
     * Chaplain
     * 
     */
    @XmlEnumValue("CHAP")
    VALUE_26("CHAP"),

    /**
     * Chief Petty Officer
     * 
     */
    @XmlEnumValue("CPO")
    VALUE_27("CPO"),

    /**
     * Colonel
     * 
     */
    @XmlEnumValue("COL")
    VALUE_28("COL"),

    /**
     * Commander
     * 
     */
    @XmlEnumValue("CMDR")
    VALUE_29("CMDR"),

    /**
     * Commissioner
     * 
     */
    @XmlEnumValue("CMM")
    VALUE_30("CMM"),

    /**
     * Commodore
     * 
     */
    @XmlEnumValue("CDRE")
    VALUE_31("CDRE"),

    /**
     * Constable
     * 
     */
    @XmlEnumValue("CONST")
    VALUE_32("CONST"),

    /**
     * Consul
     * 
     */
    @XmlEnumValue("CONSUL")
    VALUE_33("CONSUL"),

    /**
     * Corporal
     * 
     */
    @XmlEnumValue("CPL")
    VALUE_34("CPL"),

    /**
     * Count
     * 
     */
    @XmlEnumValue("COUNT")
    VALUE_35("COUNT"),

    /**
     * Countess
     * 
     */
    @XmlEnumValue("COUNTESS")
    VALUE_36("COUNTESS"),

    /**
     * Dame
     * 
     */
    @XmlEnumValue("DAME")
    VALUE_37("DAME"),

    /**
     * Deacon
     * 
     */
    @XmlEnumValue("DEACON")
    VALUE_38("DEACON"),

    /**
     * Deaconess
     * 
     */
    @XmlEnumValue("DEACONESS")
    VALUE_39("DEACONESS"),

    /**
     * Dean
     * 
     */
    @XmlEnumValue("DEAN")
    VALUE_40("DEAN"),

    /**
     * Deputy Superintendent
     * 
     */
    @XmlEnumValue("DEPUTY SUPT")
    VALUE_41("DEPUTY SUPT"),

    /**
     * Director
     * 
     */
    @XmlEnumValue("DIRECTOR")
    VALUE_42("DIRECTOR"),

    /**
     * Doctor
     * 
     */
    @XmlEnumValue("DR")
    VALUE_43("DR"),

    /**
     * Earl
     * 
     */
    @XmlEnumValue("EARL")
    VALUE_44("EARL"),

    /**
     * Engineer
     * 
     */
    @XmlEnumValue("ENGR")
    VALUE_45("ENGR"),

    /**
     * Father
     * 
     */
    @XmlEnumValue("FR")
    VALUE_46("FR"),

    /**
     * Flight Lieutenant
     * 
     */
    @XmlEnumValue("FLTLT")
    VALUE_47("FLTLT"),

    /**
     * Flight Sergeant
     * 
     */
    @XmlEnumValue("FSGT")
    VALUE_48("FSGT"),

    /**
     * Flying Officer
     * 
     */
    @XmlEnumValue("FLGOFF")
    VALUE_49("FLGOFF"),

    /**
     * General
     * 
     */
    @XmlEnumValue("GEN")
    VALUE_50("GEN"),

    /**
     * Governor
     * 
     */
    @XmlEnumValue("GOV")
    VALUE_51("GOV"),

    /**
     * Group Captain
     * 
     */
    @XmlEnumValue("GP CAPT")
    VALUE_52("GP CAPT"),

    /**
     * Honourable
     * 
     */
    @XmlEnumValue("HON")
    VALUE_53("HON"),

    /**
     * Judge
     * 
     */
    @XmlEnumValue("JUDGE")
    VALUE_54("JUDGE"),

    /**
     * Justice
     * 
     */
    @XmlEnumValue("JUSTICE")
    VALUE_55("JUSTICE"),

    /**
     * Lady
     * 
     */
    @XmlEnumValue("LADY")
    VALUE_56("LADY"),

    /**
     * Lance Bombardier
     * 
     */
    @XmlEnumValue("LBDR")
    VALUE_57("LBDR"),

    /**
     * Lance Corporal
     * 
     */
    @XmlEnumValue("LCPL")
    VALUE_58("LCPL"),

    /**
     * Leading Aircraftman
     * 
     */
    @XmlEnumValue("LAC")
    VALUE_59("LAC"),

    /**
     * Leading Aircraftwoman
     * 
     */
    @XmlEnumValue("LACW")
    VALUE_60("LACW"),

    /**
     * Leading Seaman
     * 
     */
    @XmlEnumValue("LS")
    VALUE_61("LS"),

    /**
     * Lieutenant
     * 
     */
    @XmlEnumValue("(ARMY) LT")
    VALUE_62("(ARMY) LT"),

    /**
     * Lieutenant (NAVY)
     * 
     */
    @XmlEnumValue("LEUT")
    VALUE_63("LEUT"),

    /**
     * Lieutenant Colonel
     * 
     */
    @XmlEnumValue("LTCOL")
    VALUE_64("LTCOL"),

    /**
     * Lieutenant Commander
     * 
     */
    @XmlEnumValue("LCDR")
    VALUE_65("LCDR"),

    /**
     * Lieutenant General
     * 
     */
    @XmlEnumValue("LTGEN")
    VALUE_66("LTGEN"),

    /**
     * Lieutenant Governor
     * 
     */
    @XmlEnumValue("LTGOV")
    VALUE_67("LTGOV"),

    /**
     * Lord
     * 
     */
    @XmlEnumValue("LORD")
    VALUE_68("LORD"),

    /**
     * Madam
     * 
     */
    @XmlEnumValue("MADAM")
    VALUE_69("MADAM"),

    /**
     * Madame
     * 
     */
    @XmlEnumValue("MADAME")
    VALUE_70("MADAME"),

    /**
     * Major
     * 
     */
    @XmlEnumValue("MAJ")
    VALUE_71("MAJ"),

    /**
     * Major General
     * 
     */
    @XmlEnumValue("MAJGEN")
    VALUE_72("MAJGEN"),

    /**
     * Manager
     * 
     */
    @XmlEnumValue("MGR")
    VALUE_73("MGR"),

    /**
     * Master
     * 
     */
    @XmlEnumValue("MSTR")
    VALUE_74("MSTR"),

    /**
     * Mayor
     * 
     */
    @XmlEnumValue("MAYOR")
    VALUE_75("MAYOR"),

    /**
     * Mayoress
     * 
     */
    @XmlEnumValue("MAYORESS")
    VALUE_76("MAYORESS"),

    /**
     * Midshipman
     * 
     */
    @XmlEnumValue("MIDN")
    VALUE_77("MIDN"),

    /**
     * Miss
     * 
     */
    @XmlEnumValue("MISS")
    VALUE_78("MISS"),

    /**
     * Mister
     * 
     */
    @XmlEnumValue("MR")
    VALUE_79("MR"),

    /**
     * Monsignor
     * 
     */
    @XmlEnumValue("MON")
    VALUE_80("MON"),

    /**
     * Most Reverend
     * 
     */
    @XmlEnumValue("MOST REV")
    VALUE_81("MOST REV"),

    /**
     * Mother
     * 
     */
    @XmlEnumValue("MTHR")
    VALUE_82("MTHR"),

    /**
     * Mrs
     * 
     */
    @XmlEnumValue("MRS")
    VALUE_83("MRS"),

    /**
     * Ms
     * 
     */
    @XmlEnumValue("MS")
    VALUE_84("MS"),

    /**
     * Nurse
     * 
     */
    @XmlEnumValue("NURSE")
    VALUE_85("NURSE"),

    /**
     * Officer Cadet
     * 
     */
    @XmlEnumValue("OCDT")
    VALUE_86("OCDT"),

    /**
     * Pastor
     * 
     */
    @XmlEnumValue("PASTOR")
    VALUE_87("PASTOR"),

    /**
     * Petty Officer
     * 
     */
    @XmlEnumValue("PO")
    VALUE_88("PO"),

    /**
     * Pilot Officer
     * 
     */
    @XmlEnumValue("PLTOFF")
    VALUE_89("PLTOFF"),

    /**
     * Private
     * 
     */
    @XmlEnumValue("PTE")
    VALUE_90("PTE"),

    /**
     * Professor
     * 
     */
    @XmlEnumValue("PROF")
    VALUE_91("PROF"),

    /**
     * Rabbi
     * 
     */
    @XmlEnumValue("RABBI")
    VALUE_92("RABBI"),

    /**
     * Rear Admiral
     * 
     */
    @XmlEnumValue("RADM")
    VALUE_93("RADM"),

    /**
     * Rector
     * 
     */
    @XmlEnumValue("RECTOR")
    VALUE_94("RECTOR"),

    /**
     * Regimental Sergeant Major
     * 
     */
    @XmlEnumValue("RSM")
    VALUE_95("RSM"),

    /**
     * Regimental Sergeant Major of the Army
     * 
     */
    @XmlEnumValue("RSM-A")
    VALUE_96("RSM-A"),

    /**
     * Reverend
     * 
     */
    @XmlEnumValue("REV")
    VALUE_97("REV"),

    /**
     * Right Honourable
     * 
     */
    @XmlEnumValue("RTHON")
    VALUE_98("RTHON"),

    /**
     * Right Reverend
     * 
     */
    @XmlEnumValue("RT REV")
    VALUE_99("RT REV"),

    /**
     * Seaman
     * 
     */
    @XmlEnumValue("SMN")
    VALUE_100("SMN"),

    /**
     * Second Lieutenant
     * 
     */
    @XmlEnumValue("2LT")
    VALUE_101("2LT"),

    /**
     * Senator
     * 
     */
    @XmlEnumValue("SEN")
    VALUE_102("SEN"),

    /**
     * Senior
     * 
     */
    @XmlEnumValue("SNR")
    VALUE_103("SNR"),

    /**
     * Sergeant
     * 
     */
    @XmlEnumValue("SGT")
    VALUE_104("SGT"),

    /**
     * Sir
     * 
     */
    @XmlEnumValue("SIR")
    VALUE_105("SIR"),

    /**
     * Sister
     * 
     */
    @XmlEnumValue("SR")
    VALUE_106("SR"),

    /**
     * Sister Superior
     * 
     */
    @XmlEnumValue("SISTER SUP")
    VALUE_107("SISTER SUP"),

    /**
     * Squadron Leader
     * 
     */
    @XmlEnumValue("SQNLDR")
    VALUE_108("SQNLDR"),

    /**
     * Staff Cadet
     * 
     */
    @XmlEnumValue("SCDT")
    VALUE_109("SCDT"),

    /**
     * Staff Sergeant
     * 
     */
    @XmlEnumValue("SSGT")
    VALUE_110("SSGT"),

    /**
     * Station Master
     * 
     */
    @XmlEnumValue("SM")
    VALUE_111("SM"),

    /**
     * Sub lieutenant
     * 
     */
    @XmlEnumValue("SBLT")
    VALUE_112("SBLT"),

    /**
     * Superintendent
     * 
     */
    @XmlEnumValue("SUPT")
    VALUE_113("SUPT"),

    /**
     * Swami
     * 
     */
    @XmlEnumValue("SWAMI")
    VALUE_114("SWAMI"),

    /**
     * Vice Admiral
     * 
     */
    @XmlEnumValue("VADM")
    VALUE_115("VADM"),

    /**
     * Vice Commander
     * 
     */
    @XmlEnumValue("VCE CMNDR")
    VALUE_116("VCE CMNDR"),

    /**
     * Viscount
     * 
     */
    @XmlEnumValue("VISCOUNT")
    VALUE_117("VISCOUNT"),

    /**
     * Warrant Officer (AIR FORCE)
     * 
     */
    @XmlEnumValue("WOFF")
    VALUE_118("WOFF"),

    /**
     * Warrant Officer (NAVY)
     * 
     */
    @XmlEnumValue("WO")
    VALUE_119("WO"),

    /**
     * Warrant Officer Class 1
     * 
     */
    @XmlEnumValue("WO1")
    VALUE_120("WO1"),

    /**
     * Warrant Officer Class 2
     * 
     */
    @XmlEnumValue("WO2")
    VALUE_121("WO2"),

    /**
     * Warrant Officer of the Air Force
     * 
     */
    @XmlEnumValue("WOFF-AF")
    VALUE_122("WOFF-AF"),

    /**
     * Warrant Officer of the Navy
     * 
     */
    @XmlEnumValue("WO-N")
    VALUE_123("WO-N"),

    /**
     * Wing Commander
     * 
     */
    @XmlEnumValue("WCDR")
    VALUE_124("WCDR");
    private final String value;

    NameTitleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTitleType fromValue(String v) {
        for (NameTitleType c: NameTitleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
