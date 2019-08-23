
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.AmountType;


/**
 * A definition of the costs associated with this feasibility request.
 * 
 * <p>Java class for AmountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PriceType">
 *       &lt;sequence>
 *         &lt;element name="NetAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="OneOffAmounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneOffAmount" type="{http://group.vodafone.com/schema/common/v1}OneOffAmountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecurringAmounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecurringAmount" type="{http://group.vodafone.com/schema/common/v1}RecurringAmountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsType", propOrder = {
    "netAmount",
    "taxAmount",
    "oneOffAmounts",
    "recurringAmounts"
})
public class AmountsType
    extends PriceType
{

    @XmlElement(name = "NetAmount")
    protected AmountType netAmount;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;
    @XmlElement(name = "OneOffAmounts")
    protected AmountsType.OneOffAmounts oneOffAmounts;
    @XmlElement(name = "RecurringAmounts")
    protected AmountsType.RecurringAmounts recurringAmounts;

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetAmount(AmountType value) {
        this.netAmount = value;
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
     * Gets the value of the oneOffAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsType.OneOffAmounts }
     *     
     */
    public AmountsType.OneOffAmounts getOneOffAmounts() {
        return oneOffAmounts;
    }

    /**
     * Sets the value of the oneOffAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsType.OneOffAmounts }
     *     
     */
    public void setOneOffAmounts(AmountsType.OneOffAmounts value) {
        this.oneOffAmounts = value;
    }

    /**
     * Gets the value of the recurringAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsType.RecurringAmounts }
     *     
     */
    public AmountsType.RecurringAmounts getRecurringAmounts() {
        return recurringAmounts;
    }

    /**
     * Sets the value of the recurringAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsType.RecurringAmounts }
     *     
     */
    public void setRecurringAmounts(AmountsType.RecurringAmounts value) {
        this.recurringAmounts = value;
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
     *         &lt;element name="OneOffAmount" type="{http://group.vodafone.com/schema/common/v1}OneOffAmountType" maxOccurs="unbounded"/>
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
        "oneOffAmount"
    })
    public static class OneOffAmounts {

        @XmlElement(name = "OneOffAmount", required = true)
        protected List<OneOffAmountType> oneOffAmount;

        /**
         * Gets the value of the oneOffAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneOffAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneOffAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneOffAmountType }
         * 
         * 
         */
        public List<OneOffAmountType> getOneOffAmount() {
            if (oneOffAmount == null) {
                oneOffAmount = new ArrayList<OneOffAmountType>();
            }
            return this.oneOffAmount;
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
     *         &lt;element name="RecurringAmount" type="{http://group.vodafone.com/schema/common/v1}RecurringAmountType" maxOccurs="unbounded"/>
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
        "recurringAmount"
    })
    public static class RecurringAmounts {

        @XmlElement(name = "RecurringAmount", required = true)
        protected List<RecurringAmountType> recurringAmount;

        /**
         * Gets the value of the recurringAmount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recurringAmount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecurringAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecurringAmountType }
         * 
         * 
         */
        public List<RecurringAmountType> getRecurringAmount() {
            if (recurringAmount == null) {
                recurringAmount = new ArrayList<RecurringAmountType>();
            }
            return this.recurringAmount;
        }

    }

}
