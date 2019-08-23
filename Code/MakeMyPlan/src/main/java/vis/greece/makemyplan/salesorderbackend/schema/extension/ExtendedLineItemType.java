
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.OneOffPriceType;


/**
 * <p>Java class for ExtendedLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalOneOffPrice" type="{http://group.vodafone.com/schema/common/v1}OneOffPriceType" minOccurs="0"/>
 *         &lt;element name="Specification" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}SpecificationType" minOccurs="0"/>
 *         &lt;element name="WorkforceAppointmentSlot" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}WorkforceAppointmentSlotType" minOccurs="0"/>
 *         &lt;element name="Subscriber" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}SubscriberType" minOccurs="0"/>
 *         &lt;element name="Vouchers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Voucher" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}VoucherType" maxOccurs="unbounded"/>
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
@XmlType(name = "ExtendedLineItemType", propOrder = {
    "totalOneOffPrice",
    "specification",
    "workforceAppointmentSlot",
    "subscriber",
    "vouchers"
})
public class ExtendedLineItemType {

    @XmlElement(name = "TotalOneOffPrice")
    protected OneOffPriceType totalOneOffPrice;
    @XmlElement(name = "Specification")
    protected SpecificationType specification;
    @XmlElement(name = "WorkforceAppointmentSlot")
    protected WorkforceAppointmentSlotType workforceAppointmentSlot;
    @XmlElement(name = "Subscriber")
    protected SubscriberType subscriber;
    @XmlElement(name = "Vouchers")
    protected ExtendedLineItemType.Vouchers vouchers;

    /**
     * Gets the value of the totalOneOffPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OneOffPriceType }
     *     
     */
    public OneOffPriceType getTotalOneOffPrice() {
        return totalOneOffPrice;
    }

    /**
     * Sets the value of the totalOneOffPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneOffPriceType }
     *     
     */
    public void setTotalOneOffPrice(OneOffPriceType value) {
        this.totalOneOffPrice = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationType }
     *     
     */
    public SpecificationType getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationType }
     *     
     */
    public void setSpecification(SpecificationType value) {
        this.specification = value;
    }

    /**
     * Gets the value of the workforceAppointmentSlot property.
     * 
     * @return
     *     possible object is
     *     {@link WorkforceAppointmentSlotType }
     *     
     */
    public WorkforceAppointmentSlotType getWorkforceAppointmentSlot() {
        return workforceAppointmentSlot;
    }

    /**
     * Sets the value of the workforceAppointmentSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkforceAppointmentSlotType }
     *     
     */
    public void setWorkforceAppointmentSlot(WorkforceAppointmentSlotType value) {
        this.workforceAppointmentSlot = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberType }
     *     
     */
    public SubscriberType getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberType }
     *     
     */
    public void setSubscriber(SubscriberType value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the vouchers property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedLineItemType.Vouchers }
     *     
     */
    public ExtendedLineItemType.Vouchers getVouchers() {
        return vouchers;
    }

    /**
     * Sets the value of the vouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedLineItemType.Vouchers }
     *     
     */
    public void setVouchers(ExtendedLineItemType.Vouchers value) {
        this.vouchers = value;
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
     *         &lt;element name="Voucher" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}VoucherType" maxOccurs="unbounded"/>
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
        "voucher"
    })
    public static class Vouchers {

        @XmlElement(name = "Voucher", required = true)
        protected List<VoucherType> voucher;

        /**
         * Gets the value of the voucher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoucherType }
         * 
         * 
         */
        public List<VoucherType> getVoucher() {
            if (voucher == null) {
                voucher = new ArrayList<VoucherType>();
            }
            return this.voucher;
        }

    }

}
