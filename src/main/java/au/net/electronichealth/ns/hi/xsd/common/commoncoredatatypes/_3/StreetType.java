
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for StreetType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="StreetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCS"/&gt;
 *     &lt;enumeration value="ALLY"/&gt;
 *     &lt;enumeration value="ALWY"/&gt;
 *     &lt;enumeration value="AMBL"/&gt;
 *     &lt;enumeration value="ANCG"/&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="ARC"/&gt;
 *     &lt;enumeration value="ART"/&gt;
 *     &lt;enumeration value="AVE"/&gt;
 *     &lt;enumeration value="BASN"/&gt;
 *     &lt;enumeration value="BCH"/&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="BLK"/&gt;
 *     &lt;enumeration value="BWLK"/&gt;
 *     &lt;enumeration value="BVD"/&gt;
 *     &lt;enumeration value="BRCE"/&gt;
 *     &lt;enumeration value="BRAE"/&gt;
 *     &lt;enumeration value="BRK"/&gt;
 *     &lt;enumeration value="BDGE"/&gt;
 *     &lt;enumeration value="BDWY"/&gt;
 *     &lt;enumeration value="BROW"/&gt;
 *     &lt;enumeration value="BYPA"/&gt;
 *     &lt;enumeration value="BYWY"/&gt;
 *     &lt;enumeration value="CAUS"/&gt;
 *     &lt;enumeration value="CTR"/&gt;
 *     &lt;enumeration value="CNWY"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CIR"/&gt;
 *     &lt;enumeration value="CLT"/&gt;
 *     &lt;enumeration value="CCT"/&gt;
 *     &lt;enumeration value="CRCS"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CLDE"/&gt;
 *     &lt;enumeration value="CMMN"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="CPS"/&gt;
 *     &lt;enumeration value="CNR"/&gt;
 *     &lt;enumeration value="CSO"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="CTYD"/&gt;
 *     &lt;enumeration value="COVE"/&gt;
 *     &lt;enumeration value="CRES"/&gt;
 *     &lt;enumeration value="CRST"/&gt;
 *     &lt;enumeration value="CRSS"/&gt;
 *     &lt;enumeration value="CRSG"/&gt;
 *     &lt;enumeration value="CRD"/&gt;
 *     &lt;enumeration value="COWY"/&gt;
 *     &lt;enumeration value="CUWY"/&gt;
 *     &lt;enumeration value="CDS"/&gt;
 *     &lt;enumeration value="CTTG"/&gt;
 *     &lt;enumeration value="DALE"/&gt;
 *     &lt;enumeration value="DELL"/&gt;
 *     &lt;enumeration value="DEVN"/&gt;
 *     &lt;enumeration value="DIP"/&gt;
 *     &lt;enumeration value="DSTR"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="DRWY"/&gt;
 *     &lt;enumeration value="EDGE"/&gt;
 *     &lt;enumeration value="ELB"/&gt;
 *     &lt;enumeration value="END"/&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="EXP"/&gt;
 *     &lt;enumeration value="EXTN"/&gt;
 *     &lt;enumeration value="FAWY"/&gt;
 *     &lt;enumeration value="FTRK"/&gt;
 *     &lt;enumeration value="FITR"/&gt;
 *     &lt;enumeration value="FLAT"/&gt;
 *     &lt;enumeration value="FOLW"/&gt;
 *     &lt;enumeration value="FTWY"/&gt;
 *     &lt;enumeration value="FSHR"/&gt;
 *     &lt;enumeration value="FORM"/&gt;
 *     &lt;enumeration value="FWY"/&gt;
 *     &lt;enumeration value="FRNT"/&gt;
 *     &lt;enumeration value="FRTG"/&gt;
 *     &lt;enumeration value="GAP"/&gt;
 *     &lt;enumeration value="GDN"/&gt;
 *     &lt;enumeration value="GDNS"/&gt;
 *     &lt;enumeration value="GTE"/&gt;
 *     &lt;enumeration value="GTES"/&gt;
 *     &lt;enumeration value="GLD"/&gt;
 *     &lt;enumeration value="GLEN"/&gt;
 *     &lt;enumeration value="GRA"/&gt;
 *     &lt;enumeration value="GRN"/&gt;
 *     &lt;enumeration value="GRND"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="GLY"/&gt;
 *     &lt;enumeration value="HTS"/&gt;
 *     &lt;enumeration value="HRD"/&gt;
 *     &lt;enumeration value="HWY"/&gt;
 *     &lt;enumeration value="HILL"/&gt;
 *     &lt;enumeration value="INTG"/&gt;
 *     &lt;enumeration value="INTN"/&gt;
 *     &lt;enumeration value="JNC"/&gt;
 *     &lt;enumeration value="KEY"/&gt;
 *     &lt;enumeration value="LDG"/&gt;
 *     &lt;enumeration value="LANE"/&gt;
 *     &lt;enumeration value="LNWY"/&gt;
 *     &lt;enumeration value="LEES"/&gt;
 *     &lt;enumeration value="LINE"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LKT"/&gt;
 *     &lt;enumeration value="LOOP"/&gt;
 *     &lt;enumeration value="LWR"/&gt;
 *     &lt;enumeration value="MALL"/&gt;
 *     &lt;enumeration value="MNDR"/&gt;
 *     &lt;enumeration value="MEW"/&gt;
 *     &lt;enumeration value="MEWS"/&gt;
 *     &lt;enumeration value="MWY"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NOOK"/&gt;
 *     &lt;enumeration value="OTLK"/&gt;
 *     &lt;enumeration value="PDE"/&gt;
 *     &lt;enumeration value="PARK"/&gt;
 *     &lt;enumeration value="PKLD"/&gt;
 *     &lt;enumeration value="PKWY"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="PHWY"/&gt;
 *     &lt;enumeration value="PIAZ"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PLAT"/&gt;
 *     &lt;enumeration value="PLZA"/&gt;
 *     &lt;enumeration value="PKT"/&gt;
 *     &lt;enumeration value="PNT"/&gt;
 *     &lt;enumeration value="PORT"/&gt;
 *     &lt;enumeration value="PROM"/&gt;
 *     &lt;enumeration value="QUAD"/&gt;
 *     &lt;enumeration value="QDGL"/&gt;
 *     &lt;enumeration value="QDRT"/&gt;
 *     &lt;enumeration value="QY"/&gt;
 *     &lt;enumeration value="QYS"/&gt;
 *     &lt;enumeration value="RMBL"/&gt;
 *     &lt;enumeration value="RAMP"/&gt;
 *     &lt;enumeration value="RNGE"/&gt;
 *     &lt;enumeration value="RCH"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *     &lt;enumeration value="REST"/&gt;
 *     &lt;enumeration value="RTT"/&gt;
 *     &lt;enumeration value="RIDE"/&gt;
 *     &lt;enumeration value="RDGE"/&gt;
 *     &lt;enumeration value="RGWY"/&gt;
 *     &lt;enumeration value="ROWY"/&gt;
 *     &lt;enumeration value="RING"/&gt;
 *     &lt;enumeration value="RISE"/&gt;
 *     &lt;enumeration value="RVR"/&gt;
 *     &lt;enumeration value="RVWY"/&gt;
 *     &lt;enumeration value="RVRA"/&gt;
 *     &lt;enumeration value="RD"/&gt;
 *     &lt;enumeration value="RDS"/&gt;
 *     &lt;enumeration value="RDSD"/&gt;
 *     &lt;enumeration value="RDWY"/&gt;
 *     &lt;enumeration value="RNDE"/&gt;
 *     &lt;enumeration value="RSBL"/&gt;
 *     &lt;enumeration value="RTY"/&gt;
 *     &lt;enumeration value="RND"/&gt;
 *     &lt;enumeration value="RTE"/&gt;
 *     &lt;enumeration value="ROW"/&gt;
 *     &lt;enumeration value="RUE"/&gt;
 *     &lt;enumeration value="RUN"/&gt;
 *     &lt;enumeration value="SWY"/&gt;
 *     &lt;enumeration value="SHUN"/&gt;
 *     &lt;enumeration value="SDNG"/&gt;
 *     &lt;enumeration value="SLPE"/&gt;
 *     &lt;enumeration value="SND"/&gt;
 *     &lt;enumeration value="SPUR"/&gt;
 *     &lt;enumeration value="SQ"/&gt;
 *     &lt;enumeration value="STRS"/&gt;
 *     &lt;enumeration value="SHWY"/&gt;
 *     &lt;enumeration value="STPS"/&gt;
 *     &lt;enumeration value="STRA"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="STRP"/&gt;
 *     &lt;enumeration value="SBWY"/&gt;
 *     &lt;enumeration value="TARN"/&gt;
 *     &lt;enumeration value="TCE"/&gt;
 *     &lt;enumeration value="THOR"/&gt;
 *     &lt;enumeration value="TLWY"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TOR"/&gt;
 *     &lt;enumeration value="TWRS"/&gt;
 *     &lt;enumeration value="TRK"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TRLR"/&gt;
 *     &lt;enumeration value="TRI"/&gt;
 *     &lt;enumeration value="TKWY"/&gt;
 *     &lt;enumeration value="TURN"/&gt;
 *     &lt;enumeration value="UPAS"/&gt;
 *     &lt;enumeration value="UPR"/&gt;
 *     &lt;enumeration value="VALE"/&gt;
 *     &lt;enumeration value="VDCT"/&gt;
 *     &lt;enumeration value="VIEW"/&gt;
 *     &lt;enumeration value="VLLS"/&gt;
 *     &lt;enumeration value="VSTA"/&gt;
 *     &lt;enumeration value="WADE"/&gt;
 *     &lt;enumeration value="WALK"/&gt;
 *     &lt;enumeration value="WKWY"/&gt;
 *     &lt;enumeration value="WAY"/&gt;
 *     &lt;enumeration value="WHRF"/&gt;
 *     &lt;enumeration value="WYND"/&gt;
 *     &lt;enumeration value="YARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "StreetType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum StreetType {


    /**
     * ACCESS
     * 
     */
    ACCS,

    /**
     * ALLEY
     * 
     */
    ALLY,

    /**
     * ALLEYWAY
     * 
     */
    ALWY,

    /**
     * AMBLE
     * 
     */
    AMBL,

    /**
     * ANCHORAGE
     * 
     */
    ANCG,

    /**
     * APPROACH
     * 
     */
    APP,

    /**
     * ARCADE
     * 
     */
    ARC,

    /**
     * ARTERY
     * 
     */
    ART,

    /**
     * AVENUE
     * 
     */
    AVE,

    /**
     * BASIN
     * 
     */
    BASN,

    /**
     * BEACH
     * 
     */
    BCH,

    /**
     * BEND
     * 
     */
    BEND,

    /**
     * BLOCK
     * 
     */
    BLK,

    /**
     * BOARDWALK
     * 
     */
    BWLK,

    /**
     * BOULEVARD
     * 
     */
    BVD,

    /**
     * BRACE
     * 
     */
    BRCE,

    /**
     * BRAE
     * 
     */
    BRAE,

    /**
     * BREAK
     * 
     */
    BRK,

    /**
     * BRIDGE
     * 
     */
    BDGE,

    /**
     * BROADWAY
     * 
     */
    BDWY,

    /**
     * BROW
     * 
     */
    BROW,

    /**
     * BYPASS
     * 
     */
    BYPA,

    /**
     * BYWAY
     * 
     */
    BYWY,

    /**
     * CAUSEWAY
     * 
     */
    CAUS,

    /**
     * CENTRE
     * 
     */
    CTR,

    /**
     * CENTREWAY
     * 
     */
    CNWY,

    /**
     * CHASE
     * 
     */
    CH,

    /**
     * CIRCLE
     * 
     */
    CIR,

    /**
     * CIRCLET
     * 
     */
    CLT,

    /**
     * CIRCUIT
     * 
     */
    CCT,

    /**
     * CIRCUS
     * 
     */
    CRCS,

    /**
     * CLOSE
     * 
     */
    CL,

    /**
     * COLONNADE
     * 
     */
    CLDE,

    /**
     * COMMON
     * 
     */
    CMMN,

    /**
     * CONCOURSE
     * 
     */
    CON,

    /**
     * COPSE
     * 
     */
    CPS,

    /**
     * CORNER
     * 
     */
    CNR,

    /**
     * CORSO
     * 
     */
    CSO,

    /**
     * COURT
     * 
     */
    CT,

    /**
     * COURTYARD
     * 
     */
    CTYD,

    /**
     * COVE
     * 
     */
    COVE,

    /**
     * CRESCENT
     * 
     */
    CRES,

    /**
     * CREST
     * 
     */
    CRST,

    /**
     * CROSS
     * 
     */
    CRSS,

    /**
     * CROSSING
     * 
     */
    CRSG,

    /**
     * CROSSROAD
     * 
     */
    CRD,

    /**
     * CROSSWAY
     * 
     */
    COWY,

    /**
     * CRUISEWAY
     * 
     */
    CUWY,

    /**
     * CUL-DE-SAC
     * 
     */
    CDS,

    /**
     * CUTTING
     * 
     */
    CTTG,

    /**
     * DALE
     * 
     */
    DALE,

    /**
     * DELL
     * 
     */
    DELL,

    /**
     * DEVIATION
     * 
     */
    DEVN,

    /**
     * DIP
     * 
     */
    DIP,

    /**
     * DISTRIBUTOR
     * 
     */
    DSTR,

    /**
     * DRIVE
     * 
     */
    DR,

    /**
     * DRIVEWAY
     * 
     */
    DRWY,

    /**
     * EDGE
     * 
     */
    EDGE,

    /**
     * ELBOW
     * 
     */
    ELB,

    /**
     * END
     * 
     */
    END,

    /**
     * ENTRANCE
     * 
     */
    ENT,

    /**
     * ESPLANADE
     * 
     */
    ESP,

    /**
     * ESTATE
     * 
     */
    EST,

    /**
     * EXPRESSWAY
     * 
     */
    EXP,

    /**
     * EXTENSION
     * 
     */
    EXTN,

    /**
     * FAIRWAY
     * 
     */
    FAWY,

    /**
     * FIRE TRACK
     * 
     */
    FTRK,

    /**
     * FIRETRAIL
     * 
     */
    FITR,

    /**
     * FLAT
     * 
     */
    FLAT,

    /**
     * FOLLOW
     * 
     */
    FOLW,

    /**
     * FOOTWAY
     * 
     */
    FTWY,

    /**
     * FORESHORE
     * 
     */
    FSHR,

    /**
     * FORMATION
     * 
     */
    FORM,

    /**
     * FREEWAY
     * 
     */
    FWY,

    /**
     * FRONT
     * 
     */
    FRNT,

    /**
     * FRONTAGE
     * 
     */
    FRTG,

    /**
     * GAP
     * 
     */
    GAP,

    /**
     * GARDEN
     * 
     */
    GDN,

    /**
     * GARDENS
     * 
     */
    GDNS,

    /**
     * GATE
     * 
     */
    GTE,

    /**
     * GATES
     * 
     */
    GTES,

    /**
     * GLADE
     * 
     */
    GLD,

    /**
     * GLEN
     * 
     */
    GLEN,

    /**
     * GRANGE
     * 
     */
    GRA,

    /**
     * GREEN
     * 
     */
    GRN,

    /**
     * GROUND
     * 
     */
    GRND,

    /**
     * GROVE
     * 
     */
    GR,

    /**
     * GULLY
     * 
     */
    GLY,

    /**
     * HEIGHTS
     * 
     */
    HTS,

    /**
     * HIGHROAD
     * 
     */
    HRD,

    /**
     * HIGHWAY
     * 
     */
    HWY,

    /**
     * HILL
     * 
     */
    HILL,

    /**
     * INTERCHANGE
     * 
     */
    INTG,

    /**
     * INTERSECTION
     * 
     */
    INTN,

    /**
     * JUNCTION
     * 
     */
    JNC,

    /**
     * KEY
     * 
     */
    KEY,

    /**
     * LANDING
     * 
     */
    LDG,

    /**
     * LANE
     * 
     */
    LANE,

    /**
     * LANEWAY
     * 
     */
    LNWY,

    /**
     * LEES
     * 
     */
    LEES,

    /**
     * LINE
     * 
     */
    LINE,

    /**
     * LINK
     * 
     */
    LINK,

    /**
     * LITTLE
     * 
     */
    LT,

    /**
     * LOOKOUT
     * 
     */
    LKT,

    /**
     * LOOP
     * 
     */
    LOOP,

    /**
     * LOWER
     * 
     */
    LWR,

    /**
     * MALL
     * 
     */
    MALL,

    /**
     * MEANDER
     * 
     */
    MNDR,

    /**
     * MEW
     * 
     */
    MEW,

    /**
     * MEWS
     * 
     */
    MEWS,

    /**
     * MOTORWAY
     * 
     */
    MWY,

    /**
     * MOUNT
     * 
     */
    MT,

    /**
     * NOOK
     * 
     */
    NOOK,

    /**
     * OUTLOOK
     * 
     */
    OTLK,

    /**
     * PARADE
     * 
     */
    PDE,

    /**
     * PARK
     * 
     */
    PARK,

    /**
     * PARKLANDS
     * 
     */
    PKLD,

    /**
     * PARKWAY
     * 
     */
    PKWY,

    /**
     * PART
     * 
     */
    PART,

    /**
     * PASS
     * 
     */
    PASS,

    /**
     * PATH
     * 
     */
    PATH,

    /**
     * PATHWAY
     * 
     */
    PHWY,

    /**
     * PIAZZA
     * 
     */
    PIAZ,

    /**
     * PLACE
     * 
     */
    PL,

    /**
     * PLATEAU
     * 
     */
    PLAT,

    /**
     * PLAZA
     * 
     */
    PLZA,

    /**
     * POCKET
     * 
     */
    PKT,

    /**
     * POINT
     * 
     */
    PNT,

    /**
     * PORT
     * 
     */
    PORT,

    /**
     * PROMENADE
     * 
     */
    PROM,

    /**
     * QUAD
     * 
     */
    QUAD,

    /**
     * QUADRANGLE
     * 
     */
    QDGL,

    /**
     * QUADRANT
     * 
     */
    QDRT,

    /**
     * QUAY
     * 
     */
    QY,

    /**
     * QUAYS
     * 
     */
    QYS,

    /**
     * RAMBLE
     * 
     */
    RMBL,

    /**
     * RAMP
     * 
     */
    RAMP,

    /**
     * RANGE
     * 
     */
    RNGE,

    /**
     * REACH
     * 
     */
    RCH,

    /**
     * RESERVE
     * 
     */
    RES,

    /**
     * REST
     * 
     */
    REST,

    /**
     * RETREAT
     * 
     */
    RTT,

    /**
     * RIDE
     * 
     */
    RIDE,

    /**
     * RIDGE
     * 
     */
    RDGE,

    /**
     * RIDGEWAY
     * 
     */
    RGWY,

    /**
     * RIGHT OF WAY
     * 
     */
    ROWY,

    /**
     * RING
     * 
     */
    RING,

    /**
     * RISE
     * 
     */
    RISE,

    /**
     * RIVER
     * 
     */
    RVR,

    /**
     * RIVERWAY
     * 
     */
    RVWY,

    /**
     * RIVIERA
     * 
     */
    RVRA,

    /**
     * ROAD
     * 
     */
    RD,

    /**
     * ROADS
     * 
     */
    RDS,

    /**
     * ROADSIDE
     * 
     */
    RDSD,

    /**
     * ROADWAY
     * 
     */
    RDWY,

    /**
     * RONDE
     * 
     */
    RNDE,

    /**
     * ROSEBOWL
     * 
     */
    RSBL,

    /**
     * ROTARY
     * 
     */
    RTY,

    /**
     * ROUND
     * 
     */
    RND,

    /**
     * ROUTE
     * 
     */
    RTE,

    /**
     * ROW
     * 
     */
    ROW,

    /**
     * RUE
     * 
     */
    RUE,

    /**
     * RUN
     * 
     */
    RUN,

    /**
     * SERVICE WAY
     * 
     */
    SWY,

    /**
     * SHUNT
     * 
     */
    SHUN,

    /**
     * SIDING
     * 
     */
    SDNG,

    /**
     * SLOPE
     * 
     */
    SLPE,

    /**
     * SOUND
     * 
     */
    SND,

    /**
     * SPUR
     * 
     */
    SPUR,

    /**
     * SQUARE
     * 
     */
    SQ,

    /**
     * STAIRS
     * 
     */
    STRS,

    /**
     * STATE HIGHWAY
     * 
     */
    SHWY,

    /**
     * STEPS
     * 
     */
    STPS,

    /**
     * STRAND
     * 
     */
    STRA,

    /**
     * STREET
     * 
     */
    ST,

    /**
     * STRIP
     * 
     */
    STRP,

    /**
     * SUBWAY
     * 
     */
    SBWY,

    /**
     * TARN
     * 
     */
    TARN,

    /**
     * TERRACE
     * 
     */
    TCE,

    /**
     * THOROUGHFARE
     * 
     */
    THOR,

    /**
     * TOLLWAY
     * 
     */
    TLWY,

    /**
     * TOP
     * 
     */
    TOP,

    /**
     * TOR
     * 
     */
    TOR,

    /**
     * TOWERS
     * 
     */
    TWRS,

    /**
     * TRACK
     * 
     */
    TRK,

    /**
     * TRAIL
     * 
     */
    TRL,

    /**
     * TRAILER
     * 
     */
    TRLR,

    /**
     * TRIANGLE
     * 
     */
    TRI,

    /**
     * TRUNKWAY
     * 
     */
    TKWY,

    /**
     * TURN
     * 
     */
    TURN,

    /**
     * UNDERPASS
     * 
     */
    UPAS,

    /**
     * UPPER
     * 
     */
    UPR,

    /**
     * VALE
     * 
     */
    VALE,

    /**
     * VIADUCT
     * 
     */
    VDCT,

    /**
     * VIEW
     * 
     */
    VIEW,

    /**
     * VILLAS
     * 
     */
    VLLS,

    /**
     * VISTA
     * 
     */
    VSTA,

    /**
     * WADE
     * 
     */
    WADE,

    /**
     * WALK
     * 
     */
    WALK,

    /**
     * WALKWAY
     * 
     */
    WKWY,

    /**
     * WAY
     * 
     */
    WAY,

    /**
     * WHARF
     * 
     */
    WHRF,

    /**
     * WYND
     * 
     */
    WYND,

    /**
     * YARD
     * 
     */
    YARD;

    public String value() {
        return name();
    }

    public static StreetType fromValue(String v) {
        return valueOf(v);
    }

}
