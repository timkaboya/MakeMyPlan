
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for OrganisationRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationRoleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PartyReferenceType">
 *       &lt;sequence>
 *         &lt;element name="LocalTradingName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="GeoLocation" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="CTPSRegisteration" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="DissolutionDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="FoundationDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="IncorporationDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="NumberOfFamilyMembers" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="OrganisationStatusCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *         &lt;element name="OrganisationStatusDate" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
 *         &lt;element name="SICDescription" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="StandardIndustrialClassification" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Industry" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="SubIndustry" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="TaxIdentificationNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Website" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="ContactPoints" type="{http://group.vodafone.com/schema/common/v1}ContactPointsType" minOccurs="0"/>
 *         &lt;element name="ContactPeople" type="{http://group.vodafone.com/schema/common/v1}ContactPeopleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationRoleType", propOrder = {
    "localTradingName",
    "geoLocation",
    "accountingPeriod",
    "ctpsRegisteration",
    "dissolutionDate",
    "foundationDate",
    "incorporationDate",
    "numberOfFamilyMembers",
    "organisationStatusCode",
    "organisationStatusDate",
    "sicDescription",
    "standardIndustrialClassification",
    "industry",
    "subIndustry",
    "taxIdentificationNumber",
    "website",
    "contactPoints",
    "contactPeople"
})
public class OrganisationRoleType
    extends PartyReferenceType
{

    @XmlElement(name = "LocalTradingName")
    protected TextType localTradingName;
    @XmlElement(name = "GeoLocation")
    protected TextType geoLocation;
    @XmlElement(name = "AccountingPeriod")
    protected TextType accountingPeriod;
    @XmlElement(name = "CTPSRegisteration")
    protected IndicatorType ctpsRegisteration;
    @XmlElement(name = "DissolutionDate")
    protected DateType dissolutionDate;
    @XmlElement(name = "FoundationDate")
    protected DateType foundationDate;
    @XmlElement(name = "IncorporationDate")
    protected DateType incorporationDate;
    @XmlElement(name = "NumberOfFamilyMembers")
    protected NumericType numberOfFamilyMembers;
    @XmlElement(name = "OrganisationStatusCode")
    protected CodeType organisationStatusCode;
    @XmlElement(name = "OrganisationStatusDate")
    protected ValidityPeriodType organisationStatusDate;
    @XmlElement(name = "SICDescription")
    protected TextType sicDescription;
    @XmlElement(name = "StandardIndustrialClassification")
    protected TextType standardIndustrialClassification;
    @XmlElement(name = "Industry")
    protected TextType industry;
    @XmlElement(name = "SubIndustry")
    protected TextType subIndustry;
    @XmlElement(name = "TaxIdentificationNumber")
    protected TextType taxIdentificationNumber;
    @XmlElement(name = "Website")
    protected TextType website;
    @XmlElement(name = "ContactPoints")
    protected ContactPointsType contactPoints;
    @XmlElement(name = "ContactPeople")
    protected ContactPeopleType contactPeople;

    /**
     * Gets the value of the localTradingName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLocalTradingName() {
        return localTradingName;
    }

    /**
     * Sets the value of the localTradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLocalTradingName(TextType value) {
        this.localTradingName = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setGeoLocation(TextType value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the accountingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAccountingPeriod() {
        return accountingPeriod;
    }

    /**
     * Sets the value of the accountingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAccountingPeriod(TextType value) {
        this.accountingPeriod = value;
    }

    /**
     * Gets the value of the ctpsRegisteration property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getCTPSRegisteration() {
        return ctpsRegisteration;
    }

    /**
     * Sets the value of the ctpsRegisteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setCTPSRegisteration(IndicatorType value) {
        this.ctpsRegisteration = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDissolutionDate(DateType value) {
        this.dissolutionDate = value;
    }

    /**
     * Gets the value of the foundationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFoundationDate() {
        return foundationDate;
    }

    /**
     * Sets the value of the foundationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFoundationDate(DateType value) {
        this.foundationDate = value;
    }

    /**
     * Gets the value of the incorporationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getIncorporationDate() {
        return incorporationDate;
    }

    /**
     * Sets the value of the incorporationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setIncorporationDate(DateType value) {
        this.incorporationDate = value;
    }

    /**
     * Gets the value of the numberOfFamilyMembers property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getNumberOfFamilyMembers() {
        return numberOfFamilyMembers;
    }

    /**
     * Sets the value of the numberOfFamilyMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setNumberOfFamilyMembers(NumericType value) {
        this.numberOfFamilyMembers = value;
    }

    /**
     * Gets the value of the organisationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOrganisationStatusCode() {
        return organisationStatusCode;
    }

    /**
     * Sets the value of the organisationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOrganisationStatusCode(CodeType value) {
        this.organisationStatusCode = value;
    }

    /**
     * Gets the value of the organisationStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriodType }
     *     
     */
    public ValidityPeriodType getOrganisationStatusDate() {
        return organisationStatusDate;
    }

    /**
     * Sets the value of the organisationStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriodType }
     *     
     */
    public void setOrganisationStatusDate(ValidityPeriodType value) {
        this.organisationStatusDate = value;
    }

    /**
     * Gets the value of the sicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSICDescription() {
        return sicDescription;
    }

    /**
     * Sets the value of the sicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSICDescription(TextType value) {
        this.sicDescription = value;
    }

    /**
     * Gets the value of the standardIndustrialClassification property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getStandardIndustrialClassification() {
        return standardIndustrialClassification;
    }

    /**
     * Sets the value of the standardIndustrialClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setStandardIndustrialClassification(TextType value) {
        this.standardIndustrialClassification = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setIndustry(TextType value) {
        this.industry = value;
    }

    /**
     * Gets the value of the subIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSubIndustry() {
        return subIndustry;
    }

    /**
     * Sets the value of the subIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSubIndustry(TextType value) {
        this.subIndustry = value;
    }

    /**
     * Gets the value of the taxIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Sets the value of the taxIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setTaxIdentificationNumber(TextType value) {
        this.taxIdentificationNumber = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setWebsite(TextType value) {
        this.website = value;
    }

    /**
     * Gets the value of the contactPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPointsType }
     *     
     */
    public ContactPointsType getContactPoints() {
        return contactPoints;
    }

    /**
     * Sets the value of the contactPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPointsType }
     *     
     */
    public void setContactPoints(ContactPointsType value) {
        this.contactPoints = value;
    }

    /**
     * Gets the value of the contactPeople property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPeopleType }
     *     
     */
    public ContactPeopleType getContactPeople() {
        return contactPeople;
    }

    /**
     * Sets the value of the contactPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPeopleType }
     *     
     */
    public void setContactPeople(ContactPeopleType value) {
        this.contactPeople = value;
    }

}
