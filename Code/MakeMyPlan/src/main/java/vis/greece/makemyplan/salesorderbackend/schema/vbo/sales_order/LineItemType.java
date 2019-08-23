
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.schema.common.StatusHistoryType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedLineItemType;


/**
 * <p>Java class for LineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}LineItemDetailsType">
 *       &lt;sequence>
 *         &lt;element name="RelatedLineItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedLineItem" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RelatedLineItemType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductOfferings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductOffering" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}ProductOfferingType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Subscription" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SubscriptionType" minOccurs="0"/>
 *         &lt;element name="BillToParty" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CommonPartyType" minOccurs="0"/>
 *         &lt;element name="BillToContactPoint" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderContactPointType" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CommonPartyType" minOccurs="0"/>
 *         &lt;element name="ShipToContactPoints" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderContactPointType" minOccurs="0"/>
 *         &lt;element name="CustomerAccount" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CustomerAccountType" minOccurs="0"/>
 *         &lt;element name="FulfilmentOrder" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}FulfilmentOrderType" minOccurs="0"/>
 *         &lt;element name="SalesQuoteLineItem" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesQuoteLineItemType" minOccurs="0"/>
 *         &lt;element name="OneOffPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneOffPrice" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}OneOffPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecurringPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecurringPrice" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RecurringPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Agent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDs">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payment" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}PaymentType" minOccurs="0"/>
 *         &lt;element name="StatusHistory" type="{http://group.vodafone.com/schema/common/v1}StatusHistoryType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedLineItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemType", propOrder = {
    "relatedLineItems",
    "productOfferings",
    "subscription",
    "billToParty",
    "billToContactPoint",
    "shipToParty",
    "shipToContactPoints",
    "customerAccount",
    "fulfilmentOrder",
    "salesQuoteLineItem",
    "oneOffPrices",
    "recurringPrices",
    "agent",
    "payment",
    "statusHistory",
    "extension"
})
public class LineItemType
    extends LineItemDetailsType
{

    @XmlElement(name = "RelatedLineItems")
    protected LineItemType.RelatedLineItems relatedLineItems;
    @XmlElement(name = "ProductOfferings")
    protected LineItemType.ProductOfferings productOfferings;
    @XmlElement(name = "Subscription")
    protected SubscriptionType subscription;
    @XmlElement(name = "BillToParty")
    protected CommonPartyType billToParty;
    @XmlElement(name = "BillToContactPoint")
    protected SalesOrderContactPointType billToContactPoint;
    @XmlElement(name = "ShipToParty")
    protected CommonPartyType shipToParty;
    @XmlElement(name = "ShipToContactPoints")
    protected SalesOrderContactPointType shipToContactPoints;
    @XmlElement(name = "CustomerAccount")
    protected CustomerAccountType customerAccount;
    @XmlElement(name = "FulfilmentOrder")
    protected FulfilmentOrderType fulfilmentOrder;
    @XmlElement(name = "SalesQuoteLineItem")
    protected SalesQuoteLineItemType salesQuoteLineItem;
    @XmlElement(name = "OneOffPrices")
    protected LineItemType.OneOffPrices oneOffPrices;
    @XmlElement(name = "RecurringPrices")
    protected LineItemType.RecurringPrices recurringPrices;
    @XmlElement(name = "Agent")
    protected LineItemType.Agent agent;
    @XmlElement(name = "Payment")
    protected PaymentType payment;
    @XmlElement(name = "StatusHistory")
    protected StatusHistoryType statusHistory;
    @XmlElement(name = "Extension")
    protected ExtendedLineItemType extension;

    /**
     * Gets the value of the relatedLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType.RelatedLineItems }
     *     
     */
    public LineItemType.RelatedLineItems getRelatedLineItems() {
        return relatedLineItems;
    }

    /**
     * Sets the value of the relatedLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType.RelatedLineItems }
     *     
     */
    public void setRelatedLineItems(LineItemType.RelatedLineItems value) {
        this.relatedLineItems = value;
    }

    /**
     * Gets the value of the productOfferings property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType.ProductOfferings }
     *     
     */
    public LineItemType.ProductOfferings getProductOfferings() {
        return productOfferings;
    }

    /**
     * Sets the value of the productOfferings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType.ProductOfferings }
     *     
     */
    public void setProductOfferings(LineItemType.ProductOfferings value) {
        this.productOfferings = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionType }
     *     
     */
    public SubscriptionType getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionType }
     *     
     */
    public void setSubscription(SubscriptionType value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the billToParty property.
     * 
     * @return
     *     possible object is
     *     {@link CommonPartyType }
     *     
     */
    public CommonPartyType getBillToParty() {
        return billToParty;
    }

    /**
     * Sets the value of the billToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonPartyType }
     *     
     */
    public void setBillToParty(CommonPartyType value) {
        this.billToParty = value;
    }

    /**
     * Gets the value of the billToContactPoint property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderContactPointType }
     *     
     */
    public SalesOrderContactPointType getBillToContactPoint() {
        return billToContactPoint;
    }

    /**
     * Sets the value of the billToContactPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderContactPointType }
     *     
     */
    public void setBillToContactPoint(SalesOrderContactPointType value) {
        this.billToContactPoint = value;
    }

    /**
     * Gets the value of the shipToParty property.
     * 
     * @return
     *     possible object is
     *     {@link CommonPartyType }
     *     
     */
    public CommonPartyType getShipToParty() {
        return shipToParty;
    }

    /**
     * Sets the value of the shipToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonPartyType }
     *     
     */
    public void setShipToParty(CommonPartyType value) {
        this.shipToParty = value;
    }

    /**
     * Gets the value of the shipToContactPoints property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderContactPointType }
     *     
     */
    public SalesOrderContactPointType getShipToContactPoints() {
        return shipToContactPoints;
    }

    /**
     * Sets the value of the shipToContactPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderContactPointType }
     *     
     */
    public void setShipToContactPoints(SalesOrderContactPointType value) {
        this.shipToContactPoints = value;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType }
     *     
     */
    public CustomerAccountType getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType }
     *     
     */
    public void setCustomerAccount(CustomerAccountType value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the fulfilmentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentOrderType }
     *     
     */
    public FulfilmentOrderType getFulfilmentOrder() {
        return fulfilmentOrder;
    }

    /**
     * Sets the value of the fulfilmentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentOrderType }
     *     
     */
    public void setFulfilmentOrder(FulfilmentOrderType value) {
        this.fulfilmentOrder = value;
    }

    /**
     * Gets the value of the salesQuoteLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link SalesQuoteLineItemType }
     *     
     */
    public SalesQuoteLineItemType getSalesQuoteLineItem() {
        return salesQuoteLineItem;
    }

    /**
     * Sets the value of the salesQuoteLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesQuoteLineItemType }
     *     
     */
    public void setSalesQuoteLineItem(SalesQuoteLineItemType value) {
        this.salesQuoteLineItem = value;
    }

    /**
     * Gets the value of the oneOffPrices property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType.OneOffPrices }
     *     
     */
    public LineItemType.OneOffPrices getOneOffPrices() {
        return oneOffPrices;
    }

    /**
     * Sets the value of the oneOffPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType.OneOffPrices }
     *     
     */
    public void setOneOffPrices(LineItemType.OneOffPrices value) {
        this.oneOffPrices = value;
    }

    /**
     * Gets the value of the recurringPrices property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType.RecurringPrices }
     *     
     */
    public LineItemType.RecurringPrices getRecurringPrices() {
        return recurringPrices;
    }

    /**
     * Sets the value of the recurringPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType.RecurringPrices }
     *     
     */
    public void setRecurringPrices(LineItemType.RecurringPrices value) {
        this.recurringPrices = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType.Agent }
     *     
     */
    public LineItemType.Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType.Agent }
     *     
     */
    public void setAgent(LineItemType.Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPayment(PaymentType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * @return
     *     possible object is
     *     {@link StatusHistoryType }
     *     
     */
    public StatusHistoryType getStatusHistory() {
        return statusHistory;
    }

    /**
     * Sets the value of the statusHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusHistoryType }
     *     
     */
    public void setStatusHistory(StatusHistoryType value) {
        this.statusHistory = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedLineItemType }
     *     
     */
    public ExtendedLineItemType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedLineItemType }
     *     
     */
    public void setExtension(ExtendedLineItemType value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IDs">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "iDs"
    })
    public static class Agent {

        @XmlElement(name = "IDs", required = true)
        protected LineItemType.Agent.IDs iDs;

        /**
         * Gets the value of the iDs property.
         * 
         * @return
         *     possible object is
         *     {@link LineItemType.Agent.IDs }
         *     
         */
        public LineItemType.Agent.IDs getIDs() {
            return iDs;
        }

        /**
         * Sets the value of the iDs property.
         * 
         * @param value
         *     allowed object is
         *     {@link LineItemType.Agent.IDs }
         *     
         */
        public void setIDs(LineItemType.Agent.IDs value) {
            this.iDs = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id"
        })
        public static class IDs {

            @XmlElement(name = "ID", required = true)
            protected List<IDType> id;

            /**
             * Gets the value of the id property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the id property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link IDType }
             * 
             * 
             */
            public List<IDType> getID() {
                if (id == null) {
                    id = new ArrayList<IDType>();
                }
                return this.id;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OneOffPrice" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}OneOffPriceType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oneOffPrice"
    })
    public static class OneOffPrices {

        @XmlElement(name = "OneOffPrice", required = true)
        protected List<OneOffPriceType> oneOffPrice;

        /**
         * Gets the value of the oneOffPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneOffPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneOffPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneOffPriceType }
         * 
         * 
         */
        public List<OneOffPriceType> getOneOffPrice() {
            if (oneOffPrice == null) {
                oneOffPrice = new ArrayList<OneOffPriceType>();
            }
            return this.oneOffPrice;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProductOffering" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}ProductOfferingType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "productOffering"
    })
    public static class ProductOfferings {

        @XmlElement(name = "ProductOffering", required = true)
        protected List<ProductOfferingType> productOffering;

        /**
         * Gets the value of the productOffering property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productOffering property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductOffering().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductOfferingType }
         * 
         * 
         */
        public List<ProductOfferingType> getProductOffering() {
            if (productOffering == null) {
                productOffering = new ArrayList<ProductOfferingType>();
            }
            return this.productOffering;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RecurringPrice" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RecurringPriceType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recurringPrice"
    })
    public static class RecurringPrices {

        @XmlElement(name = "RecurringPrice", required = true)
        protected List<RecurringPriceType> recurringPrice;

        /**
         * Gets the value of the recurringPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recurringPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecurringPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecurringPriceType }
         * 
         * 
         */
        public List<RecurringPriceType> getRecurringPrice() {
            if (recurringPrice == null) {
                recurringPrice = new ArrayList<RecurringPriceType>();
            }
            return this.recurringPrice;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RelatedLineItem" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RelatedLineItemType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relatedLineItem"
    })
    public static class RelatedLineItems {

        @XmlElement(name = "RelatedLineItem", required = true)
        protected List<RelatedLineItemType> relatedLineItem;

        /**
         * Gets the value of the relatedLineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedLineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedLineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedLineItemType }
         * 
         * 
         */
        public List<RelatedLineItemType> getRelatedLineItem() {
            if (relatedLineItem == null) {
                relatedLineItem = new ArrayList<RelatedLineItemType>();
            }
            return this.relatedLineItem;
        }

    }

}
