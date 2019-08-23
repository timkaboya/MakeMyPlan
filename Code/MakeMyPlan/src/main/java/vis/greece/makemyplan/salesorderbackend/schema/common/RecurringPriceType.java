
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.AmountType;


/**
 * <p>Java class for RecurringPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PriceTypeWithID">
 *       &lt;sequence>
 *         &lt;element name="Activation" type="{http://group.vodafone.com/schema/common/v1}PriceType" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://group.vodafone.com/schema/common/v1}PriceFrequencyType" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringPriceType", propOrder = {
    "activation",
    "frequency",
    "netAmount",
    "taxAmount"
})
@XmlSeeAlso({
    vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.RecurringPriceType.class,
    RecurringAmountType.class
})
public class RecurringPriceType
    extends PriceTypeWithID
{

    @XmlElement(name = "Activation")
    protected PriceType activation;
    @XmlElement(name = "Frequency")
    protected PriceFrequencyType frequency;
    @XmlElement(name = "NetAmount")
    protected AmountType netAmount;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setActivation(PriceType value) {
        this.activation = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFrequencyType }
     *     
     */
    public PriceFrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFrequencyType }
     *     
     */
    public void setFrequency(PriceFrequencyType value) {
        this.frequency = value;
    }

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

}
