
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISO3166-1_Alpha2_CountryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISO3166-1_Alpha2_CountryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AX"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AW"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BS"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="BY"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="BJ"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BQ"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="KH"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="TD"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="CW"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="GQ"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GF"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="TF"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="GH"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GP"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GG"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="GY"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HM"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IQ"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JM"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="JE"/>
 *     &lt;enumeration value="JO"/>
 *     &lt;enumeration value="KZ"/>
 *     &lt;enumeration value="KE"/>
 *     &lt;enumeration value="KI"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="LY"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MQ"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="YT"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="QA"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="BL"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="LC"/>
 *     &lt;enumeration value="MF"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="VC"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SX"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="LK"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SJ"/>
 *     &lt;enumeration value="SZ"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="SY"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="TJ"/>
 *     &lt;enumeration value="TZ"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UM"/>
 *     &lt;enumeration value="UY"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VU"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VG"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="YE"/>
 *     &lt;enumeration value="ZM"/>
 *     &lt;enumeration value="ZW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISO3166-1_Alpha2_CountryCodeType")
@XmlEnum
public enum ISO31661Alpha2CountryCodeType {


    /**
     * AFGHANISTAN
     * 
     */
    AF,

    /**
     * �LAND ISLANDS
     * 
     */
    AX,

    /**
     * ALBANIA
     * 
     */
    AL,

    /**
     * ALGERIA
     * 
     */
    DZ,

    /**
     * AMERICAN SAMOA
     * 
     */
    AS,

    /**
     * ANDORRA
     * 
     */
    AD,

    /**
     * ANGOLA
     * 
     */
    AO,

    /**
     * ANGUILLA
     * 
     */
    AI,

    /**
     * ANTARCTICA
     * 
     */
    AQ,

    /**
     * ANTIGUA AND BARBUDA
     * 
     */
    AG,

    /**
     * ARGENTINA
     * 
     */
    AR,

    /**
     * ARMENIA
     * 
     */
    AM,

    /**
     * ARUBA
     * 
     */
    AW,

    /**
     * AUSTRALIA
     * 
     */
    AU,

    /**
     * AUSTRIA
     * 
     */
    AT,

    /**
     * AZERBAIJAN
     * 
     */
    AZ,

    /**
     * BAHAMAS
     * 
     */
    BS,

    /**
     * BAHRAIN
     * 
     */
    BH,

    /**
     * BANGLADESH
     * 
     */
    BD,

    /**
     * BARBADOS
     * 
     */
    BB,

    /**
     * BELARUS
     * 
     */
    BY,

    /**
     * BELGIUM
     * 
     */
    BE,

    /**
     * BELIZE
     * 
     */
    BZ,

    /**
     * BENIN
     * 
     */
    BJ,

    /**
     * BERMUDA
     * 
     */
    BM,

    /**
     * BHUTAN
     * 
     */
    BT,

    /**
     * BOLIVIA, PLURINATIONAL STATE OF
     * 
     */
    BO,

    /**
     * BONAIRE, SINT EUSTATIUS AND SABA
     * 
     */
    BQ,

    /**
     * BOSNIA AND HERZEGOVINA
     * 
     */
    BA,

    /**
     * BOTSWANA
     * 
     */
    BW,

    /**
     * BOUVET ISLAND
     * 
     */
    BV,

    /**
     * BRAZIL
     * 
     */
    BR,

    /**
     * BRITISH INDIAN OCEAN TERRITORY
     * 
     */
    IO,

    /**
     * BRUNEI DARUSSALAM
     * 
     */
    BN,

    /**
     * BULGARIA
     * 
     */
    BG,

    /**
     * BURKINA FASO
     * 
     */
    BF,

    /**
     * BURUNDI
     * 
     */
    BI,

    /**
     * CAMBODIA
     * 
     */
    KH,

    /**
     * CAMEROON
     * 
     */
    CM,

    /**
     * CANADA
     * 
     */
    CA,

    /**
     * CAPE VERDE
     * 
     */
    CV,

    /**
     * CAYMAN ISLANDS
     * 
     */
    KY,

    /**
     * CENTRAL AFRICAN REPUBLIC
     * 
     */
    CF,

    /**
     * CHAD
     * 
     */
    TD,

    /**
     * CHILE
     * 
     */
    CL,

    /**
     * CHINA
     * 
     */
    CN,

    /**
     * CHRISTMAS ISLAND
     * 
     */
    CX,

    /**
     * COCOS (KEELING) ISLANDS
     * 
     */
    CC,

    /**
     * COLOMBIA
     * 
     */
    CO,

    /**
     * COMOROS
     * 
     */
    KM,

    /**
     * CONGO
     * 
     */
    CG,

    /**
     * CONGO, THE DEMOCRATIC REPUBLIC OF THE
     * 
     */
    CD,

    /**
     * COOK ISLANDS
     * 
     */
    CK,

    /**
     * COSTA RICA
     * 
     */
    CR,

    /**
     * C�TE D'IVOIRE
     * 
     */
    CI,

    /**
     * CROATIA
     * 
     */
    HR,

    /**
     * CURA�AO
     * 
     */
    CW,

    /**
     * CUBA
     * 
     */
    CU,

    /**
     * CYPRUS
     * 
     */
    CY,

    /**
     * CZECH REPUBLIC
     * 
     */
    CZ,

    /**
     * DENMARK
     * 
     */
    DK,

    /**
     * DJIBOUTI
     * 
     */
    DJ,

    /**
     * DOMINICA
     * 
     */
    DM,

    /**
     * DOMINICAN REPUBLIC
     * 
     */
    DO,

    /**
     * ECUADOR
     * 
     */
    EC,

    /**
     * EGYPT
     * 
     */
    EG,

    /**
     * EL SALVADOR
     * 
     */
    SV,

    /**
     * EQUATORIAL GUINEA
     * 
     */
    GQ,

    /**
     * ERITREA
     * 
     */
    ER,

    /**
     * ESTONIA
     * 
     */
    EE,

    /**
     * ETHIOPIA
     * 
     */
    ET,

    /**
     * FALKLAND ISLANDS (MALVINAS)
     * 
     */
    FK,

    /**
     * FAROE ISLANDS
     * 
     */
    FO,

    /**
     * FIJI
     * 
     */
    FJ,

    /**
     * FINLAND
     * 
     */
    FI,

    /**
     * FRANCE
     * 
     */
    FR,

    /**
     * FRENCH GUIANA
     * 
     */
    GF,

    /**
     * FRENCH POLYNESIA
     * 
     */
    PF,

    /**
     * FRENCH SOUTHERN TERRITORIES
     * 
     */
    TF,

    /**
     * GABON
     * 
     */
    GA,

    /**
     * GAMBIA
     * 
     */
    GM,

    /**
     * GEORGIA
     * 
     */
    GE,

    /**
     * GERMANY
     * 
     */
    DE,

    /**
     * GHANA
     * 
     */
    GH,

    /**
     * GIBRALTAR
     * 
     */
    GI,

    /**
     * GREECE
     * 
     */
    GR,

    /**
     * GREENLAND
     * 
     */
    GL,

    /**
     * GRENADA
     * 
     */
    GD,

    /**
     * GUADELOUPE
     * 
     */
    GP,

    /**
     * GUAM
     * 
     */
    GU,

    /**
     * GUATEMALA
     * 
     */
    GT,

    /**
     * GUERNSEY
     * 
     */
    GG,

    /**
     * GUINEA
     * 
     */
    GN,

    /**
     * GUINEA-BISSAU
     * 
     */
    GW,

    /**
     * GUYANA
     * 
     */
    GY,

    /**
     * HAITI
     * 
     */
    HT,

    /**
     * HEARD ISLAND AND MCDONALD ISLANDS
     * 
     */
    HM,

    /**
     * HOLY SEE (VATICAN CITY STATE)
     * 
     */
    VA,

    /**
     * HONDURAS
     * 
     */
    HN,

    /**
     * HONG KONG
     * 
     */
    HK,

    /**
     * HUNGARY
     * 
     */
    HU,

    /**
     * ICELAND
     * 
     */
    IS,

    /**
     * INDIA
     * 
     */
    IN,

    /**
     * INDONESIA
     * 
     */
    ID,

    /**
     * IRAN, ISLAMIC REPUBLIC OF
     * 
     */
    IR,

    /**
     * IRAQ
     * 
     */
    IQ,

    /**
     * IRELAND
     * 
     */
    IE,

    /**
     * ISLE OF MAN
     * 
     */
    IM,

    /**
     * ISRAEL
     * 
     */
    IL,

    /**
     * ITALY
     * 
     */
    IT,

    /**
     * JAMAICA
     * 
     */
    JM,

    /**
     * JAPAN
     * 
     */
    JP,

    /**
     * JERSEY
     * 
     */
    JE,

    /**
     * JORDAN
     * 
     */
    JO,

    /**
     * KAZAKHSTAN
     * 
     */
    KZ,

    /**
     * KENYA
     * 
     */
    KE,

    /**
     * KIRIBATI
     * 
     */
    KI,

    /**
     * KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF
     * 
     */
    KP,

    /**
     * KOREA, REPUBLIC OF
     * 
     */
    KR,

    /**
     * KUWAIT
     * 
     */
    KW,

    /**
     * KYRGYZSTAN
     * 
     */
    KG,

    /**
     * LAO PEOPLE'S DEMOCRATIC REPUBLIC
     * 
     */
    LA,

    /**
     * LATVIA
     * 
     */
    LV,

    /**
     * LEBANON
     * 
     */
    LB,

    /**
     * LESOTHO
     * 
     */
    LS,

    /**
     * LIBERIA
     * 
     */
    LR,

    /**
     * LIBYA
     * 
     */
    LY,

    /**
     * LIECHTENSTEIN
     * 
     */
    LI,

    /**
     * LITHUANIA
     * 
     */
    LT,

    /**
     * LUXEMBOURG
     * 
     */
    LU,

    /**
     * MACAO
     * 
     */
    MO,

    /**
     * MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF
     * 
     */
    MK,

    /**
     * MADAGASCAR
     * 
     */
    MG,

    /**
     * MALAWI
     * 
     */
    MW,

    /**
     * MALAYSIA
     * 
     */
    MY,

    /**
     * MALDIVES
     * 
     */
    MV,

    /**
     * MALI
     * 
     */
    ML,

    /**
     * MALTA
     * 
     */
    MT,

    /**
     * MARSHALL ISLANDS
     * 
     */
    MH,

    /**
     * MARTINIQUE
     * 
     */
    MQ,

    /**
     * MAURITANIA
     * 
     */
    MR,

    /**
     * MAURITIUS
     * 
     */
    MU,

    /**
     * MAYOTTE
     * 
     */
    YT,

    /**
     * MEXICO
     * 
     */
    MX,

    /**
     * MICRONESIA, FEDERATED STATES OF
     * 
     */
    FM,

    /**
     * MOLDOVA, REPUBLIC OF
     * 
     */
    MD,

    /**
     * MONACO
     * 
     */
    MC,

    /**
     * MONGOLIA
     * 
     */
    MN,

    /**
     * MONTENEGRO
     * 
     */
    ME,

    /**
     * MONTSERRAT
     * 
     */
    MS,

    /**
     * MOROCCO
     * 
     */
    MA,

    /**
     * MOZAMBIQUE
     * 
     */
    MZ,

    /**
     * MYANMAR
     * 
     */
    MM,

    /**
     * NAMIBIA
     * 
     */
    NA,

    /**
     * NAURU
     * 
     */
    NR,

    /**
     * NEPAL
     * 
     */
    NP,

    /**
     * NETHERLANDS
     * 
     */
    NL,

    /**
     * NEW CALEDONIA
     * 
     */
    NC,

    /**
     * NEW ZEALAND
     * 
     */
    NZ,

    /**
     * NICARAGUA
     * 
     */
    NI,

    /**
     * NIGER
     * 
     */
    NE,

    /**
     * NIGERIA
     * 
     */
    NG,

    /**
     * NIUE
     * 
     */
    NU,

    /**
     * NORFOLK ISLAND
     * 
     */
    NF,

    /**
     * NORTHERN MARIANA ISLANDS
     * 
     */
    MP,

    /**
     * NORWAY
     * 
     */
    NO,

    /**
     * OMAN
     * 
     */
    OM,

    /**
     * PAKISTAN
     * 
     */
    PK,

    /**
     * PALAU
     * 
     */
    PW,

    /**
     * PALESTINIAN TERRITORY, OCCUPIED
     * 
     */
    PS,

    /**
     * PANAMA
     * 
     */
    PA,

    /**
     * PAPUA NEW GUINEA
     * 
     */
    PG,

    /**
     * PARAGUAY
     * 
     */
    PY,

    /**
     * PERU
     * 
     */
    PE,

    /**
     * PHILIPPINES
     * 
     */
    PH,

    /**
     * PITCAIRN
     * 
     */
    PN,

    /**
     * POLAND
     * 
     */
    PL,

    /**
     * PORTUGAL
     * 
     */
    PT,

    /**
     * PUERTO RICO
     * 
     */
    PR,

    /**
     * QATAR
     * 
     */
    QA,

    /**
     * R�UNION
     * 
     */
    RE,

    /**
     * ROMANIA
     * 
     */
    RO,

    /**
     * RUSSIAN FEDERATION
     * 
     */
    RU,

    /**
     * RWANDA
     * 
     */
    RW,

    /**
     * SAINT BARTH�LEMY
     * 
     */
    BL,

    /**
     * SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
     * 
     */
    SH,

    /**
     * SAINT KITTS AND NEVIS
     * 
     */
    KN,

    /**
     * SAINT LUCIA
     * 
     */
    LC,

    /**
     * SAINT MARTIN (FRENCH PART)
     * 
     */
    MF,

    /**
     * SAINT PIERRE AND MIQUELON
     * 
     */
    PM,

    /**
     * SAINT VINCENT AND THE GRENADINES
     * 
     */
    VC,

    /**
     * SAMOA
     * 
     */
    WS,

    /**
     * SAN MARINO
     * 
     */
    SM,

    /**
     * SAO TOME AND PRINCIPE
     * 
     */
    ST,

    /**
     * SAUDI ARABIA
     * 
     */
    SA,

    /**
     * SENEGAL
     * 
     */
    SN,

    /**
     * SERBIA
     * 
     */
    RS,

    /**
     * SEYCHELLES
     * 
     */
    SC,

    /**
     * SIERRA LEONE
     * 
     */
    SL,

    /**
     * SINGAPORE
     * 
     */
    SG,

    /**
     * SINT MAARTEN (DUTCH PART)
     * 
     */
    SX,

    /**
     * SLOVAKIA
     * 
     */
    SK,

    /**
     * SLOVENIA
     * 
     */
    SI,

    /**
     * SOLOMON ISLANDS
     * 
     */
    SB,

    /**
     * SOMALIA
     * 
     */
    SO,

    /**
     * SOUTH AFRICA
     * 
     */
    ZA,

    /**
     * SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS
     * 
     */
    GS,

    /**
     * SOUTH SUDAN
     * 
     */
    SS,

    /**
     * SPAIN
     * 
     */
    ES,

    /**
     * SRI LANKA
     * 
     */
    LK,

    /**
     * SUDAN
     * 
     */
    SD,

    /**
     * SURINAME
     * 
     */
    SR,

    /**
     * SVALBARD AND JAN MAYEN
     * 
     */
    SJ,

    /**
     * SWAZILAND
     * 
     */
    SZ,

    /**
     * SWEDEN
     * 
     */
    SE,

    /**
     * SWITZERLAND
     * 
     */
    CH,

    /**
     * SYRIAN ARAB REPUBLIC
     * 
     */
    SY,

    /**
     * TAIWAN, PROVINCE OF CHINA
     * 
     */
    TW,

    /**
     * TAJIKISTAN
     * 
     */
    TJ,

    /**
     * TANZANIA, UNITED REPUBLIC OF
     * 
     */
    TZ,

    /**
     * THAILAND
     * 
     */
    TH,

    /**
     * TIMOR-LESTE
     * 
     */
    TL,

    /**
     * TOGO
     * 
     */
    TG,

    /**
     * TOKELAU
     * 
     */
    TK,

    /**
     * TONGA
     * 
     */
    TO,

    /**
     * TRINIDAD AND TOBAGO
     * 
     */
    TT,

    /**
     * TUNISIA
     * 
     */
    TN,

    /**
     * TURKEY
     * 
     */
    TR,

    /**
     * TURKMENISTAN
     * 
     */
    TM,

    /**
     * TURKS AND CAICOS ISLANDS
     * 
     */
    TC,

    /**
     * TUVALU
     * 
     */
    TV,

    /**
     * UGANDA
     * 
     */
    UG,

    /**
     * UKRAINE
     * 
     */
    UA,

    /**
     * UNITED ARAB EMIRATES
     * 
     */
    AE,

    /**
     * UNITED KINGDOM
     * 
     */
    GB,

    /**
     * UNITED STATES
     * 
     */
    US,

    /**
     * UNITED STATES MINOR OUTLYING ISLANDS
     * 
     */
    UM,

    /**
     * URUGUAY
     * 
     */
    UY,

    /**
     * UZBEKISTAN
     * 
     */
    UZ,

    /**
     * VANUATU
     * 
     */
    VU,

    /**
     * VENEZUELA, BOLIVARIAN REPUBLIC OF
     * 
     */
    VE,

    /**
     * VIET NAM
     * 
     */
    VN,

    /**
     * VIRGIN ISLANDS, BRITISH
     * 
     */
    VG,

    /**
     * VIRGIN ISLANDS, U.S.
     * 
     */
    VI,

    /**
     * WALLIS AND FUTUNA
     * 
     */
    WF,

    /**
     * WESTERN SAHARA
     * 
     */
    EH,

    /**
     * YEMEN
     * 
     */
    YE,

    /**
     * ZAMBIA
     * 
     */
    ZM,

    /**
     * ZIMBABWE
     * 
     */
    ZW;

    public String value() {
        return name();
    }

    public static ISO31661Alpha2CountryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
