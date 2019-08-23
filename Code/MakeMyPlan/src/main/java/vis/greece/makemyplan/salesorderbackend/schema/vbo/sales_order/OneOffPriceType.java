
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedOneOffPriceType;


/**
 * <p>Java class for OneOffPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneOffPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}OneOffPriceType">
 *       &lt;sequence>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CharacteristicsType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedOneOffPriceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneOffPriceType", propOrder = {
    "characteristics",
    "extension"
})
public class OneOffPriceType
    extends vis.greece.makemyplan.salesorderbackend.schema.common.OneOffPriceType
{

    @XmlElement(name = "Characteristics")
    protected CharacteristicsType characteristics;
    @XmlElement(name = "Extension")
    protected ExtendedOneOffPriceType extension;

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
     *     {@link ExtendedOneOffPriceType }
     *     
     */
    public ExtendedOneOffPriceType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedOneOffPriceType }
     *     
     */
    public void setExtension(ExtendedOneOffPriceType value) {
        this.extension = value;
    }

}
