
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;


/**
 * A type definition for Extended Business Object Reference
 * 
 * <p>Java class for RelatedObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedRelatedObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedObjectType", propOrder = {
    "extension"
})
public class RelatedObjectType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedRelatedObjectType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedRelatedObjectType }
     *     
     */
    public ExtendedRelatedObjectType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedRelatedObjectType }
     *     
     */
    public void setExtension(ExtendedRelatedObjectType value) {
        this.extension = value;
    }

}
