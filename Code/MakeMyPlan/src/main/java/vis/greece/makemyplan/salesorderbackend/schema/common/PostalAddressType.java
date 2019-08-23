
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for PostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Street" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Town" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BuildingName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BuildingNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="County" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Occupant" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PrimaryClassification" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="SubLocality" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="SubStreet" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="SubUnit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BuildingLetter" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="TownSuffix" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="StreetSuffix" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="StreetType" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="LevelNr" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="LevelType" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PrivateStreetName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Portal" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PortalDoor" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/common/v1}CharacteristicsType" minOccurs="0"/>
 *         &lt;element name="StreetNr" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="StreetNrSuffix" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="StreetNrLast" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="StreetNrLastSuffix" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="GeoLocation" type="{http://group.vodafone.com/schema/common/v1}GeographicLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = {
    "street",
    "town",
    "buildingName",
    "buildingNumber",
    "country",
    "county",
    "occupant",
    "postCode",
    "primaryClassification",
    "subLocality",
    "subStreet",
    "subUnit",
    "buildingLetter",
    "townSuffix",
    "countryCode",
    "type",
    "streetSuffix",
    "streetType",
    "levelNr",
    "levelType",
    "privateStreetName",
    "portal",
    "portalDoor",
    "characteristics",
    "streetNr",
    "streetNrSuffix",
    "streetNrLast",
    "streetNrLastSuffix",
    "geoLocation"
})
@XmlSeeAlso({
    PostalAddressWithLocationType.class
})
public class PostalAddressType {

    @XmlElement(name = "Street")
    protected TextType street;
    @XmlElement(name = "Town")
    protected TextType town;
    @XmlElement(name = "BuildingName")
    protected TextType buildingName;
    @XmlElement(name = "BuildingNumber")
    protected NumericType buildingNumber;
    @XmlElement(name = "Country")
    protected TextType country;
    @XmlElement(name = "County")
    protected TextType county;
    @XmlElement(name = "Occupant")
    protected TextType occupant;
    @XmlElement(name = "PostCode")
    protected TextType postCode;
    @XmlElement(name = "PrimaryClassification")
    protected TextType primaryClassification;
    @XmlElement(name = "SubLocality")
    protected TextType subLocality;
    @XmlElement(name = "SubStreet")
    protected TextType subStreet;
    @XmlElement(name = "SubUnit")
    protected TextType subUnit;
    @XmlElement(name = "BuildingLetter")
    protected TextType buildingLetter;
    @XmlElement(name = "TownSuffix")
    protected TextType townSuffix;
    @XmlElement(name = "CountryCode")
    protected TextType countryCode;
    @XmlElement(name = "Type")
    protected TextType type;
    @XmlElement(name = "StreetSuffix")
    protected TextType streetSuffix;
    @XmlElement(name = "StreetType")
    protected TextType streetType;
    @XmlElement(name = "LevelNr")
    protected TextType levelNr;
    @XmlElement(name = "LevelType")
    protected TextType levelType;
    @XmlElement(name = "PrivateStreetName")
    protected TextType privateStreetName;
    @XmlElement(name = "Portal")
    protected TextType portal;
    @XmlElement(name = "PortalDoor")
    protected TextType portalDoor;
    @XmlElement(name = "Characteristics")
    protected CharacteristicsType characteristics;
    @XmlElement(name = "StreetNr")
    protected TextType streetNr;
    @XmlElement(name = "StreetNrSuffix")
    protected TextType streetNrSuffix;
    @XmlElement(name = "StreetNrLast")
    protected TextType streetNrLast;
    @XmlElement(name = "StreetNrLastSuffix")
    protected TextType streetNrLastSuffix;
    @XmlElement(name = "GeoLocation")
    protected GeographicLocationType geoLocation;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreet(TextType value) {
        this.street = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setTown(TextType value) {
        this.town = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBuildingName(TextType value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setBuildingNumber(NumericType value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountry(TextType value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCounty(TextType value) {
        this.county = value;
    }

    /**
     * Gets the value of the occupant property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getOccupant() {
        return occupant;
    }

    /**
     * Sets the value of the occupant property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setOccupant(TextType value) {
        this.occupant = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPostCode(TextType value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the primaryClassification property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPrimaryClassification() {
        return primaryClassification;
    }

    /**
     * Sets the value of the primaryClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPrimaryClassification(TextType value) {
        this.primaryClassification = value;
    }

    /**
     * Gets the value of the subLocality property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSubLocality() {
        return subLocality;
    }

    /**
     * Sets the value of the subLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSubLocality(TextType value) {
        this.subLocality = value;
    }

    /**
     * Gets the value of the subStreet property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSubStreet() {
        return subStreet;
    }

    /**
     * Sets the value of the subStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSubStreet(TextType value) {
        this.subStreet = value;
    }

    /**
     * Gets the value of the subUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSubUnit() {
        return subUnit;
    }

    /**
     * Sets the value of the subUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSubUnit(TextType value) {
        this.subUnit = value;
    }

    /**
     * Gets the value of the buildingLetter property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBuildingLetter() {
        return buildingLetter;
    }

    /**
     * Sets the value of the buildingLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBuildingLetter(TextType value) {
        this.buildingLetter = value;
    }

    /**
     * Gets the value of the townSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getTownSuffix() {
        return townSuffix;
    }

    /**
     * Sets the value of the townSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setTownSuffix(TextType value) {
        this.townSuffix = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountryCode(TextType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setType(TextType value) {
        this.type = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetSuffix(TextType value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetType(TextType value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the levelNr property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLevelNr() {
        return levelNr;
    }

    /**
     * Sets the value of the levelNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLevelNr(TextType value) {
        this.levelNr = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLevelType(TextType value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the privateStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPrivateStreetName() {
        return privateStreetName;
    }

    /**
     * Sets the value of the privateStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPrivateStreetName(TextType value) {
        this.privateStreetName = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPortal(TextType value) {
        this.portal = value;
    }

    /**
     * Gets the value of the portalDoor property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPortalDoor() {
        return portalDoor;
    }

    /**
     * Sets the value of the portalDoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPortalDoor(TextType value) {
        this.portalDoor = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsType }
     *     
     */
    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsType }
     *     
     */
    public void setCharacteristics(CharacteristicsType value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the streetNr property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetNr() {
        return streetNr;
    }

    /**
     * Sets the value of the streetNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetNr(TextType value) {
        this.streetNr = value;
    }

    /**
     * Gets the value of the streetNrSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetNrSuffix() {
        return streetNrSuffix;
    }

    /**
     * Sets the value of the streetNrSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetNrSuffix(TextType value) {
        this.streetNrSuffix = value;
    }

    /**
     * Gets the value of the streetNrLast property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetNrLast() {
        return streetNrLast;
    }

    /**
     * Sets the value of the streetNrLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetNrLast(TextType value) {
        this.streetNrLast = value;
    }

    /**
     * Gets the value of the streetNrLastSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStreetNrLastSuffix() {
        return streetNrLastSuffix;
    }

    /**
     * Sets the value of the streetNrLastSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStreetNrLastSuffix(TextType value) {
        this.streetNrLastSuffix = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicLocationType }
     *     
     */
    public GeographicLocationType getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicLocationType }
     *     
     */
    public void setGeoLocation(GeographicLocationType value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setActionCode(ActionCodeType value) {
        this.actionCode = value;
    }

}
