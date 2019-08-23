
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedSalesOrderPartsType;


/**
 * <p>Java class for SalesOrderPartsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderPartsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillToContactPoint" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderContactPointType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerAccount" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CustomerAccountType" minOccurs="0"/>
 *         &lt;element name="CustomerAgreement" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CustomerAgreementType" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}ChannelType" minOccurs="0"/>
 *         &lt;element name="FulfilmentOrders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FulfilmentOrder" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}FulfilmentOrderType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SalesQuote" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesQuoteType" minOccurs="0"/>
 *         &lt;element name="ShipToContactPoint" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderContactPointType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderPriceType" minOccurs="0"/>
 *         &lt;element name="LineItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineItem" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}LineItemType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedSalesOrderPartsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderPartsType", propOrder = {
    "billToContactPoint",
    "customerAccount",
    "customerAgreement",
    "channel",
    "fulfilmentOrders",
    "salesQuote",
    "shipToContactPoint",
    "totalPrice",
    "lineItems",
    "extension"
})
public class SalesOrderPartsType {

    @XmlElement(name = "BillToContactPoint")
    protected List<SalesOrderContactPointType> billToContactPoint;
    @XmlElement(name = "CustomerAccount")
    protected CustomerAccountType customerAccount;
    @XmlElement(name = "CustomerAgreement")
    protected CustomerAgreementType customerAgreement;
    @XmlElement(name = "Channel")
    protected ChannelType channel;
    @XmlElement(name = "FulfilmentOrders")
    protected SalesOrderPartsType.FulfilmentOrders fulfilmentOrders;
    @XmlElement(name = "SalesQuote")
    protected SalesQuoteType salesQuote;
    @XmlElement(name = "ShipToContactPoint")
    protected List<SalesOrderContactPointType> shipToContactPoint;
    @XmlElement(name = "TotalPrice")
    protected SalesOrderPriceType totalPrice;
    @XmlElement(name = "LineItems")
    protected SalesOrderPartsType.LineItems lineItems;
    @XmlElement(name = "Extension")
    protected ExtendedSalesOrderPartsType extension;

    /**
     * Gets the value of the billToContactPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billToContactPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillToContactPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderContactPointType }
     * 
     * 
     */
    public List<SalesOrderContactPointType> getBillToContactPoint() {
        if (billToContactPoint == null) {
            billToContactPoint = new ArrayList<SalesOrderContactPointType>();
        }
        return this.billToContactPoint;
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
     * Gets the value of the customerAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAgreementType }
     *     
     */
    public CustomerAgreementType getCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * Sets the value of the customerAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAgreementType }
     *     
     */
    public void setCustomerAgreement(CustomerAgreementType value) {
        this.customerAgreement = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannel(ChannelType value) {
        this.channel = value;
    }

    /**
     * Gets the value of the fulfilmentOrders property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderPartsType.FulfilmentOrders }
     *     
     */
    public SalesOrderPartsType.FulfilmentOrders getFulfilmentOrders() {
        return fulfilmentOrders;
    }

    /**
     * Sets the value of the fulfilmentOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderPartsType.FulfilmentOrders }
     *     
     */
    public void setFulfilmentOrders(SalesOrderPartsType.FulfilmentOrders value) {
        this.fulfilmentOrders = value;
    }

    /**
     * Gets the value of the salesQuote property.
     * 
     * @return
     *     possible object is
     *     {@link SalesQuoteType }
     *     
     */
    public SalesQuoteType getSalesQuote() {
        return salesQuote;
    }

    /**
     * Sets the value of the salesQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesQuoteType }
     *     
     */
    public void setSalesQuote(SalesQuoteType value) {
        this.salesQuote = value;
    }

    /**
     * Gets the value of the shipToContactPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToContactPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToContactPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderContactPointType }
     * 
     * 
     */
    public List<SalesOrderContactPointType> getShipToContactPoint() {
        if (shipToContactPoint == null) {
            shipToContactPoint = new ArrayList<SalesOrderContactPointType>();
        }
        return this.shipToContactPoint;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderPriceType }
     *     
     */
    public SalesOrderPriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderPriceType }
     *     
     */
    public void setTotalPrice(SalesOrderPriceType value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderPartsType.LineItems }
     *     
     */
    public SalesOrderPartsType.LineItems getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderPartsType.LineItems }
     *     
     */
    public void setLineItems(SalesOrderPartsType.LineItems value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType }
     *     
     */
    public ExtendedSalesOrderPartsType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType }
     *     
     */
    public void setExtension(ExtendedSalesOrderPartsType value) {
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
     *         &lt;element name="FulfilmentOrder" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}FulfilmentOrderType" maxOccurs="unbounded"/>
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
        "fulfilmentOrder"
    })
    public static class FulfilmentOrders {

        @XmlElement(name = "FulfilmentOrder", required = true)
        protected List<FulfilmentOrderType> fulfilmentOrder;

        /**
         * Gets the value of the fulfilmentOrder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fulfilmentOrder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFulfilmentOrder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FulfilmentOrderType }
         * 
         * 
         */
        public List<FulfilmentOrderType> getFulfilmentOrder() {
            if (fulfilmentOrder == null) {
                fulfilmentOrder = new ArrayList<FulfilmentOrderType>();
            }
            return this.fulfilmentOrder;
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
     *         &lt;element name="LineItem" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}LineItemType" maxOccurs="unbounded"/>
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
        "lineItem"
    })
    public static class LineItems {

        @XmlElement(name = "LineItem", required = true)
        protected List<LineItemType> lineItem;

        /**
         * Gets the value of the lineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineItemType }
         * 
         * 
         */
        public List<LineItemType> getLineItem() {
            if (lineItem == null) {
                lineItem = new ArrayList<LineItemType>();
            }
            return this.lineItem;
        }

    }

}
