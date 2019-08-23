
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;


/**
 * <p>Java class for CustomerCreditRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCreditRatingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="CreditRatingConditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Condition" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ConditionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedCustomerCreditRatingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditRatingType", propOrder = {
    "creditRatingConditions",
    "extension"
})
public class CustomerCreditRatingType
    extends BaseComponentType
{

    @XmlElement(name = "CreditRatingConditions")
    protected CustomerCreditRatingType.CreditRatingConditions creditRatingConditions;
    @XmlElement(name = "Extension")
    protected ExtendedCustomerCreditRatingType extension;

    /**
     * Gets the value of the creditRatingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditRatingType.CreditRatingConditions }
     *     
     */
    public CustomerCreditRatingType.CreditRatingConditions getCreditRatingConditions() {
        return creditRatingConditions;
    }

    /**
     * Sets the value of the creditRatingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditRatingType.CreditRatingConditions }
     *     
     */
    public void setCreditRatingConditions(CustomerCreditRatingType.CreditRatingConditions value) {
        this.creditRatingConditions = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerCreditRatingType }
     *     
     */
    public ExtendedCustomerCreditRatingType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerCreditRatingType }
     *     
     */
    public void setExtension(ExtendedCustomerCreditRatingType value) {
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
     *         &lt;element name="Condition" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ConditionType" maxOccurs="unbounded"/>
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
        "condition"
    })
    public static class CreditRatingConditions {

        @XmlElement(name = "Condition", required = true)
        protected List<ConditionType> condition;

        /**
         * Gets the value of the condition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the condition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConditionType }
         * 
         * 
         */
        public List<ConditionType> getCondition() {
            if (condition == null) {
                condition = new ArrayList<ConditionType>();
            }
            return this.condition;
        }

    }

}
