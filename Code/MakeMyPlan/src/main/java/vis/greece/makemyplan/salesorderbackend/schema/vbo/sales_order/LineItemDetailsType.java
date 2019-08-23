
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.QuantityType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;
import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;


/**
 * <p>Java class for LineItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Priority" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="ApprovalDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActivationDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DeletionDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpiryDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="CompletedDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OrderDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PricingDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RequestedDeliveryDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PromisedDeliveryDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RequestedShipDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ServiceRequiredDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SavedIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="CustomerAgreedToPayDepositIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ShipmentInstruction" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="SubstitutionAllowedIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDetailsType", propOrder = {
    "priority",
    "approvalDateTime",
    "activationDateTime",
    "deletionDateTime",
    "expiryDateTime",
    "completedDateTime",
    "orderDateTime",
    "pricingDateTime",
    "scheduledDeliveryDateTime",
    "requestedDeliveryDateTime",
    "promisedDeliveryDateTime",
    "requestedShipDateTime",
    "serviceRequiredDateTime",
    "savedIndicator",
    "customerAgreedToPayDepositIndicator",
    "shipmentInstruction",
    "substitutionAllowedIndicator",
    "quantity"
})
@XmlSeeAlso({
    LineItemType.class
})
public class LineItemDetailsType
    extends BaseComponentType
{

    @XmlElement(name = "Priority")
    protected NumericType priority;
    @XmlElement(name = "ApprovalDateTime")
    protected DateTimeType approvalDateTime;
    @XmlElement(name = "ActivationDateTime")
    protected DateTimeType activationDateTime;
    @XmlElement(name = "DeletionDateTime")
    protected DateTimeType deletionDateTime;
    @XmlElement(name = "ExpiryDateTime")
    protected DateTimeType expiryDateTime;
    @XmlElement(name = "CompletedDateTime")
    protected DateTimeType completedDateTime;
    @XmlElement(name = "OrderDateTime")
    protected DateTimeType orderDateTime;
    @XmlElement(name = "PricingDateTime")
    protected DateTimeType pricingDateTime;
    @XmlElement(name = "ScheduledDeliveryDateTime")
    protected DateTimeType scheduledDeliveryDateTime;
    @XmlElement(name = "RequestedDeliveryDateTime")
    protected DateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "PromisedDeliveryDateTime")
    protected DateTimeType promisedDeliveryDateTime;
    @XmlElement(name = "RequestedShipDateTime")
    protected DateTimeType requestedShipDateTime;
    @XmlElement(name = "ServiceRequiredDateTime")
    protected DateTimeType serviceRequiredDateTime;
    @XmlElement(name = "SavedIndicator")
    protected IndicatorType savedIndicator;
    @XmlElement(name = "CustomerAgreedToPayDepositIndicator")
    protected IndicatorType customerAgreedToPayDepositIndicator;
    @XmlElement(name = "ShipmentInstruction")
    protected TextType shipmentInstruction;
    @XmlElement(name = "SubstitutionAllowedIndicator")
    protected IndicatorType substitutionAllowedIndicator;
    @XmlElement(name = "Quantity")
    protected QuantityType quantity;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setPriority(NumericType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the approvalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getApprovalDateTime() {
        return approvalDateTime;
    }

    /**
     * Sets the value of the approvalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setApprovalDateTime(DateTimeType value) {
        this.approvalDateTime = value;
    }

    /**
     * Gets the value of the activationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getActivationDateTime() {
        return activationDateTime;
    }

    /**
     * Sets the value of the activationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setActivationDateTime(DateTimeType value) {
        this.activationDateTime = value;
    }

    /**
     * Gets the value of the deletionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDeletionDateTime() {
        return deletionDateTime;
    }

    /**
     * Sets the value of the deletionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDeletionDateTime(DateTimeType value) {
        this.deletionDateTime = value;
    }

    /**
     * Gets the value of the expiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Sets the value of the expiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpiryDateTime(DateTimeType value) {
        this.expiryDateTime = value;
    }

    /**
     * Gets the value of the completedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the value of the completedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCompletedDateTime(DateTimeType value) {
        this.completedDateTime = value;
    }

    /**
     * Gets the value of the orderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOrderDateTime() {
        return orderDateTime;
    }

    /**
     * Sets the value of the orderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOrderDateTime(DateTimeType value) {
        this.orderDateTime = value;
    }

    /**
     * Gets the value of the pricingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPricingDateTime() {
        return pricingDateTime;
    }

    /**
     * Sets the value of the pricingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPricingDateTime(DateTimeType value) {
        this.pricingDateTime = value;
    }

    /**
     * Gets the value of the scheduledDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getScheduledDeliveryDateTime() {
        return scheduledDeliveryDateTime;
    }

    /**
     * Sets the value of the scheduledDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setScheduledDeliveryDateTime(DateTimeType value) {
        this.scheduledDeliveryDateTime = value;
    }

    /**
     * Gets the value of the requestedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRequestedDeliveryDateTime() {
        return requestedDeliveryDateTime;
    }

    /**
     * Sets the value of the requestedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRequestedDeliveryDateTime(DateTimeType value) {
        this.requestedDeliveryDateTime = value;
    }

    /**
     * Gets the value of the promisedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPromisedDeliveryDateTime() {
        return promisedDeliveryDateTime;
    }

    /**
     * Sets the value of the promisedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPromisedDeliveryDateTime(DateTimeType value) {
        this.promisedDeliveryDateTime = value;
    }

    /**
     * Gets the value of the requestedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRequestedShipDateTime() {
        return requestedShipDateTime;
    }

    /**
     * Sets the value of the requestedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRequestedShipDateTime(DateTimeType value) {
        this.requestedShipDateTime = value;
    }

    /**
     * Gets the value of the serviceRequiredDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getServiceRequiredDateTime() {
        return serviceRequiredDateTime;
    }

    /**
     * Sets the value of the serviceRequiredDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setServiceRequiredDateTime(DateTimeType value) {
        this.serviceRequiredDateTime = value;
    }

    /**
     * Gets the value of the savedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getSavedIndicator() {
        return savedIndicator;
    }

    /**
     * Sets the value of the savedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setSavedIndicator(IndicatorType value) {
        this.savedIndicator = value;
    }

    /**
     * Gets the value of the customerAgreedToPayDepositIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getCustomerAgreedToPayDepositIndicator() {
        return customerAgreedToPayDepositIndicator;
    }

    /**
     * Sets the value of the customerAgreedToPayDepositIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setCustomerAgreedToPayDepositIndicator(IndicatorType value) {
        this.customerAgreedToPayDepositIndicator = value;
    }

    /**
     * Gets the value of the shipmentInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getShipmentInstruction() {
        return shipmentInstruction;
    }

    /**
     * Sets the value of the shipmentInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setShipmentInstruction(TextType value) {
        this.shipmentInstruction = value;
    }

    /**
     * Gets the value of the substitutionAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getSubstitutionAllowedIndicator() {
        return substitutionAllowedIndicator;
    }

    /**
     * Sets the value of the substitutionAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setSubstitutionAllowedIndicator(IndicatorType value) {
        this.substitutionAllowedIndicator = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

}
