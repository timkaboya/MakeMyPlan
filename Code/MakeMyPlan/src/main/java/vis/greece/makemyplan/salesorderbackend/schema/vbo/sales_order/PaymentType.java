
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.AmountType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedPaymentType;


/**
 * Payment details associated with a line item
 * 
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDs" minOccurs="0">
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
 *         &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="BillingAccountID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedPaymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "iDs",
    "amount",
    "taxAmount",
    "billingAccountID",
    "extension"
})
public class PaymentType {

    @XmlElement(name = "IDs")
    protected PaymentType.IDs iDs;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;
    @XmlElement(name = "BillingAccountID")
    protected IDType billingAccountID;
    @XmlElement(name = "Extension")
    protected ExtendedPaymentType extension;

    /**
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType.IDs }
     *     
     */
    public PaymentType.IDs getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType.IDs }
     *     
     */
    public void setIDs(PaymentType.IDs value) {
        this.iDs = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the billingAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBillingAccountID() {
        return billingAccountID;
    }

    /**
     * Sets the value of the billingAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBillingAccountID(IDType value) {
        this.billingAccountID = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPaymentType }
     *     
     */
    public ExtendedPaymentType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPaymentType }
     *     
     */
    public void setExtension(ExtendedPaymentType value) {
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
