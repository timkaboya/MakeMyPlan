
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
 * <p>Java class for DirectDebitPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidityPeriod" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
 *         &lt;element name="HolderName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="SortCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="BIC" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="MandateNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="MandateStatus" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="MandateStatusDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="SendCorrespondence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ReUseContact" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="DebitMaxAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="BankName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BankAddress" type="{http://group.vodafone.com/schema/common/v1}PostalAddressType" minOccurs="0"/>
 *         &lt;element name="BankAccountType" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *         &lt;element name="Alias" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitPaymentType", propOrder = {
    "validityPeriod",
    "holderName",
    "accountNumber",
    "sortCode",
    "iban",
    "bic",
    "mandateNumber",
    "mandateStatus",
    "mandateStatusDate",
    "sendCorrespondence",
    "reUseContact",
    "debitMaxAmount",
    "bankName",
    "bankAddress",
    "bankAccountType",
    "alias",
    "description"
})
public class DirectDebitPaymentType {

    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodType validityPeriod;
    @XmlElement(name = "HolderName")
    protected TextType holderName;
    @XmlElement(name = "AccountNumber")
    protected NumericType accountNumber;
    @XmlElement(name = "SortCode")
    protected NumericType sortCode;
    @XmlElement(name = "IBAN")
    protected NumericType iban;
    @XmlElement(name = "BIC")
    protected TextType bic;
    @XmlElement(name = "MandateNumber")
    protected TextType mandateNumber;
    @XmlElement(name = "MandateStatus")
    protected NumericType mandateStatus;
    @XmlElement(name = "MandateStatusDate")
    protected DateType mandateStatusDate;
    @XmlElement(name = "SendCorrespondence")
    protected IndicatorType sendCorrespondence;
    @XmlElement(name = "ReUseContact")
    protected IndicatorType reUseContact;
    @XmlElement(name = "DebitMaxAmount")
    protected NumericType debitMaxAmount;
    @XmlElement(name = "BankName")
    protected TextType bankName;
    @XmlElement(name = "BankAddress")
    protected PostalAddressType bankAddress;
    @XmlElement(name = "BankAccountType")
    protected CodeType bankAccountType;
    @XmlElement(name = "Alias")
    protected TextType alias;
    @XmlElement(name = "Description")
    protected TextType description;

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriodType }
     *     
     */
    public ValidityPeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriodType }
     *     
     */
    public void setValidityPeriod(ValidityPeriodType value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the holderName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setHolderName(TextType value) {
        this.holderName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setAccountNumber(NumericType value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the sortCode property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getSortCode() {
        return sortCode;
    }

    /**
     * Sets the value of the sortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setSortCode(NumericType value) {
        this.sortCode = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setIBAN(NumericType value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBIC(TextType value) {
        this.bic = value;
    }

    /**
     * Gets the value of the mandateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMandateNumber() {
        return mandateNumber;
    }

    /**
     * Sets the value of the mandateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMandateNumber(TextType value) {
        this.mandateNumber = value;
    }

    /**
     * Gets the value of the mandateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getMandateStatus() {
        return mandateStatus;
    }

    /**
     * Sets the value of the mandateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setMandateStatus(NumericType value) {
        this.mandateStatus = value;
    }

    /**
     * Gets the value of the mandateStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getMandateStatusDate() {
        return mandateStatusDate;
    }

    /**
     * Sets the value of the mandateStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setMandateStatusDate(DateType value) {
        this.mandateStatusDate = value;
    }

    /**
     * Gets the value of the sendCorrespondence property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getSendCorrespondence() {
        return sendCorrespondence;
    }

    /**
     * Sets the value of the sendCorrespondence property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setSendCorrespondence(IndicatorType value) {
        this.sendCorrespondence = value;
    }

    /**
     * Gets the value of the reUseContact property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getReUseContact() {
        return reUseContact;
    }

    /**
     * Sets the value of the reUseContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setReUseContact(IndicatorType value) {
        this.reUseContact = value;
    }

    /**
     * Gets the value of the debitMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getDebitMaxAmount() {
        return debitMaxAmount;
    }

    /**
     * Sets the value of the debitMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setDebitMaxAmount(NumericType value) {
        this.debitMaxAmount = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBankName(TextType value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getBankAddress() {
        return bankAddress;
    }

    /**
     * Sets the value of the bankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setBankAddress(PostalAddressType value) {
        this.bankAddress = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBankAccountType(CodeType value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAlias(TextType value) {
        this.alias = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
    }

}
