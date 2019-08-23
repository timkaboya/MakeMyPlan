
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedRecurringPriceType;


/**
 * <p>Java class for RecurringPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}RecurringPriceType">
 *       &lt;sequence>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CharacteristicsType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedRecurringPriceType" minOccurs="0"/>
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
    "characteristics",
    "extension"
})
public class RecurringPriceType
    extends vis.greece.makemyplan.salesorderbackend.schema.common.RecurringPriceType
{

    @XmlElement(name = "Characteristics")
    protected CharacteristicsType characteristics;
    @XmlElement(name = "Extension")
    protected ExtendedRecurringPriceType extension;

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsType }
     *     
     */
    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsType }
     *     
     */
    public void setCharacteristics(CharacteristicsType value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedRecurringPriceType }
     *     
     */
    public ExtendedRecurringPriceType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedRecurringPriceType }
     *     
     */
    public void setExtension(ExtendedRecurringPriceType value) {
        this.extension = value;
    }

}
