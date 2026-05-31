
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="UnitType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ANT"/>
 *     <enumeration value="APT"/>
 *     <enumeration value="ATM"/>
 *     <enumeration value="BBQ"/>
 *     <enumeration value="BTSD"/>
 *     <enumeration value="BLDG"/>
 *     <enumeration value="BNGW"/>
 *     <enumeration value="CAGE"/>
 *     <enumeration value="CARP"/>
 *     <enumeration value="CARS"/>
 *     <enumeration value="CLUB"/>
 *     <enumeration value="COOL"/>
 *     <enumeration value="CTGE"/>
 *     <enumeration value="DUP"/>
 *     <enumeration value="FY"/>
 *     <enumeration value="F"/>
 *     <enumeration value="GRGE"/>
 *     <enumeration value="HALL"/>
 *     <enumeration value="HSE"/>
 *     <enumeration value="KSK"/>
 *     <enumeration value="LSE"/>
 *     <enumeration value="LBBY"/>
 *     <enumeration value="LOFT"/>
 *     <enumeration value="LOT"/>
 *     <enumeration value="MSNT"/>
 *     <enumeration value="MB"/>
 *     <enumeration value="OFF"/>
 *     <enumeration value="PTHS"/>
 *     <enumeration value="RESV"/>
 *     <enumeration value="RM"/>
 *     <enumeration value="SHED"/>
 *     <enumeration value="SHOP"/>
 *     <enumeration value="SIGN"/>
 *     <enumeration value="SITE"/>
 *     <enumeration value="SL"/>
 *     <enumeration value="STOR"/>
 *     <enumeration value="STR"/>
 *     <enumeration value="STU"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="SE"/>
 *     <enumeration value="TNCY"/>
 *     <enumeration value="TWR"/>
 *     <enumeration value="TNHS"/>
 *     <enumeration value="U"/>
 *     <enumeration value="VLLA"/>
 *     <enumeration value="WARD"/>
 *     <enumeration value="WE"/>
 *     <enumeration value="WKSH"/>
 *   </restriction>
 * </simpleType>
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
