
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.common.SpecificationType;


/**
 * <p>Java class for VoucherType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Specification" type="{http://group.vodafone.com/schema/common/v1}SpecificationType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedVoucherType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherType", propOrder = {
    "specification",
    "extension"
})
public class VoucherType
    extends BaseComponentType
{

    @XmlElement(name = "Specification")
    protected SpecificationType specification;
    @XmlElement(name = "Extension")
    protected ExtendedVoucherType extension;

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
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVoucherType }
     *     
     */
    public ExtendedVoucherType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVoucherType }
     *     
     */
    public void setExtension(ExtendedVoucherType value) {
        this.extension = value;
    }

}
