
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANT"/>
 *     &lt;enumeration value="APT"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="BBQ"/>
 *     &lt;enumeration value="BTSD"/>
 *     &lt;enumeration value="BLDG"/>
 *     &lt;enumeration value="BNGW"/>
 *     &lt;enumeration value="CAGE"/>
 *     &lt;enumeration value="CARP"/>
 *     &lt;enumeration value="CARS"/>
 *     &lt;enumeration value="CLUB"/>
 *     &lt;enumeration value="COOL"/>
 *     &lt;enumeration value="CTGE"/>
 *     &lt;enumeration value="DUP"/>
 *     &lt;enumeration value="FY"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="GRGE"/>
 *     &lt;enumeration value="HALL"/>
 *     &lt;enumeration value="HSE"/>
 *     &lt;enumeration value="KSK"/>
 *     &lt;enumeration value="LSE"/>
 *     &lt;enumeration value="LBBY"/>
 *     &lt;enumeration value="LOFT"/>
 *     &lt;enumeration value="LOT"/>
 *     &lt;enumeration value="MSNT"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="PTHS"/>
 *     &lt;enumeration value="RESV"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="SHED"/>
 *     &lt;enumeration value="SHOP"/>
 *     &lt;enumeration value="SIGN"/>
 *     &lt;enumeration value="SITE"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="STOR"/>
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="STU"/>
 *     &lt;enumeration value="SUBS"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="TNCY"/>
 *     &lt;enumeration value="TWR"/>
 *     &lt;enumeration value="TNHS"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="VLLA"/>
 *     &lt;enumeration value="WARD"/>
 *     &lt;enumeration value="WE"/>
 *     &lt;enumeration value="WKSH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum UnitType {


    /**
     * Antenna
     * 
     */
    ANT,

    /**
     * Apartment
     * 
     */
    APT,

    /**
     * Automated Teller Machine
     * 
     */
    ATM,

    /**
     * Barbeque
     * 
     */
    BBQ,

    /**
     * Boatshed
     * 
     */
    BTSD,

    /**
     * Building
     * 
     */
    BLDG,

    /**
     * Bungalow
     * 
     */
    BNGW,

    /**
     * Cage
     * 
     */
    CAGE,

    /**
     * Carpark
     * 
     */
    CARP,

    /**
     * Carspace
     * 
     */
    CARS,

    /**
     * Club
     * 
     */
    CLUB,

    /**
     * Coolroom
     * 
     */
    COOL,

    /**
     * Cottage
     * 
     */
    CTGE,

    /**
     * Duplex
     * 
     */
    DUP,

    /**
     * Factory
     * 
     */
    FY,

    /**
     * Flat
     * 
     */
    F,

    /**
     * Garage
     * 
     */
    GRGE,

    /**
     * Hall
     * 
     */
    HALL,

    /**
     * House
     * 
     */
    HSE,

    /**
     * Kiosk
     * 
     */
    KSK,

    /**
     * Lease
     * 
     */
    LSE,

    /**
     * Lobby
     * 
     */
    LBBY,

    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Lot
     * 
     */
    LOT,

    /**
     * Maisonette
     * 
     */
    MSNT,

    /**
     * Marine berth
     * 
     */
    MB,

    /**
     * Office
     * 
     */
    OFF,

    /**
     * Penthouse
     * 
     */
    PTHS,

    /**
     * Reserve
     * 
     */
    RESV,

    /**
     * Room
     * 
     */
    RM,

    /**
     * Shed
     * 
     */
    SHED,

    /**
     * Shop
     * 
     */
    SHOP,

    /**
     * Sign
     * 
     */
    SIGN,

    /**
     * Site
     * 
     */
    SITE,

    /**
     * Stall
     * 
     */
    SL,

    /**
     * Store
     * 
     */
    STOR,

    /**
     * Strata Unit
     * 
     */
    STR,

    /**
     * Studio
     * 
     */
    STU,

    /**
     * Substation
     * 
     */
    SUBS,

    /**
     * Suite
     * 
     */
    SE,

    /**
     * Tenancy
     * 
     */
    TNCY,

    /**
     * Tower
     * 
     */
    TWR,

    /**
     * Townhouse
     * 
     */
    TNHS,

    /**
     * Unit
     * 
     */
    U,

    /**
     * Villa
     * 
     */
    VLLA,

    /**
     * Ward
     * 
     */
    WARD,

    /**
     * Warehouse
     * 
     */
    WE,

    /**
     * Workshop
     * 
     */
    WKSH;

    public String value() {
        return name();
    }

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}
