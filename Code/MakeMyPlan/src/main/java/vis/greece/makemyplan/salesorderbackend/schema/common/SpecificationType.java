
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A specification of the set of characteristics the define a particular object.
 * 
 * <p>Java class for SpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsValue" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://group.vodafone.com/schema/common/v1}CharactersticsValueType">
 *                 &lt;attribute name="characteristicName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
 *               &lt;/extension>
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
@XmlType(name = "SpecificationType", propOrder = {
    "characteristicsValue"
})
@XmlSeeAlso({
	vis.greece.makemyplan.salesorderbackend.schema.extension.SpecificationType.class
})
public class SpecificationType
    extends BaseComponentType
{

    @XmlElement(name = "CharacteristicsValue")
    protected List<SpecificationType.CharacteristicsValue> characteristicsValue;

    /**
     * Gets the value of the characteristicsValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicsValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicsValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationType.CharacteristicsValue }
     * 
     * 
     */
    public List<SpecificationType.CharacteristicsValue> getCharacteristicsValue() {
        if (characteristicsValue == null) {
            characteristicsValue = new ArrayList<SpecificationType.CharacteristicsValue>();
        }
        return this.characteristicsValue;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}CharactersticsValueType">
     *       &lt;attribute name="characteristicName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CharacteristicsValue
        extends CharactersticsValueType
    {

        @XmlAttribute(name = "characteristicName")
        protected String characteristicName;
        @XmlAttribute(name = "actionCode")
        protected ActionCodeType actionCode;

        /**
         * Gets the value of the characteristicName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharacteristicName() {
            return characteristicName;
        }

        /**
         * Sets the value of the characteristicName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharacteristicName(String value) {
            this.characteristicName = value;
        }

        /**
         * Gets the value of the actionCode property.
         * 
         * @return
         *     possible object is
         *     {@link ActionCodeType }
         *     
         */
        public ActionCodeType getActionCode() {
            return actionCode;
        }

        /**
         * Sets the value of the actionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionCodeType }
         *     
         */
        public void setActionCode(ActionCodeType value) {
            this.actionCode = value;
        }

    }

}
