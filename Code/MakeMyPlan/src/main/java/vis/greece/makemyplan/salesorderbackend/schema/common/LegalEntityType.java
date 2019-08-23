
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.AmountType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for LegalEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnualRevenueAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateBusinessName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="DUNSNumbers" type="{http://group.vodafone.com/schema/common/v1}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployees" type="{http://group.vodafone.com/schema/common/v1}NumberOfEmployeesType" minOccurs="0"/>
 *         &lt;element name="RegisteredNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Industry" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="SubIndustry" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="LegalParent" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="LocalTradingName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="OtherRegisterNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="VATRegistration" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
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
@XmlType(name = "LegalEntityType", propOrder = {
    "annualRevenueAmount",
    "domesticUltimateBusinessName",
    "dunsNumbers",
    "numberOfEmployees",
    "registeredNumber",
    "industry",
    "subIndustry",
    "legalParent",
    "localTradingName",
    "otherRegisterNumber",
    "vatRegistration"
})
public class LegalEntityType {

    @XmlElement(name = "AnnualRevenueAmount")
    protected AmountType annualRevenueAmount;
    @XmlElement(name = "DomesticUltimateBusinessName")
    protected TextType domesticUltimateBusinessName;
    @XmlElement(name = "DUNSNumbers")
    protected DUNSNumberType dunsNumbers;
    @XmlElement(name = "NumberOfEmployees")
    protected NumberOfEmployeesType numberOfEmployees;
    @XmlElement(name = "RegisteredNumber")
    protected IDType registeredNumber;
    @XmlElement(name = "Industry")
    protected TextType industry;
    @XmlElement(name = "SubIndustry")
    protected TextType subIndustry;
    @XmlElement(name = "LegalParent")
    protected TextType legalParent;
    @XmlElement(name = "LocalTradingName")
    protected TextType localTradingName;
    @XmlElement(name = "OtherRegisterNumber")
    protected IDType otherRegisterNumber;
    @XmlElement(name = "VATRegistration")
    protected IDType vatRegistration;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the annualRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAnnualRevenueAmount() {
        return annualRevenueAmount;
    }

    /**
     * Sets the value of the annualRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAnnualRevenueAmount(AmountType value) {
        this.annualRevenueAmount = value;
    }

    /**
     * Gets the value of the domesticUltimateBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDomesticUltimateBusinessName() {
        return domesticUltimateBusinessName;
    }

    /**
     * Sets the value of the domesticUltimateBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDomesticUltimateBusinessName(TextType value) {
        this.domesticUltimateBusinessName = value;
    }

    /**
     * Gets the value of the dunsNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSNumberType }
     *     
     */
    public DUNSNumberType getDUNSNumbers() {
        return dunsNumbers;
    }

    /**
     * Sets the value of the dunsNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSNumberType }
     *     
     */
    public void setDUNSNumbers(DUNSNumberType value) {
        this.dunsNumbers = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfEmployeesType }
     *     
     */
    public NumberOfEmployeesType getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfEmployeesType }
     *     
     */
    public void setNumberOfEmployees(NumberOfEmployeesType value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the registeredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRegisteredNumber() {
        return registeredNumber;
    }

    /**
     * Sets the value of the registeredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRegisteredNumber(IDType value) {
        this.registeredNumber = value;
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
     * Gets the value of the legalParent property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLegalParent() {
        return legalParent;
    }

    /**
     * Sets the value of the legalParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLegalParent(TextType value) {
        this.legalParent = value;
    }

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
     * Gets the value of the otherRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getOtherRegisterNumber() {
        return otherRegisterNumber;
    }

    /**
     * Sets the value of the otherRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setOtherRegisterNumber(IDType value) {
        this.otherRegisterNumber = value;
    }

    /**
     * Gets the value of the vatRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getVATRegistration() {
        return vatRegistration;
    }

    /**
     * Sets the value of the vatRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setVATRegistration(IDType value) {
        this.vatRegistration = value;
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
