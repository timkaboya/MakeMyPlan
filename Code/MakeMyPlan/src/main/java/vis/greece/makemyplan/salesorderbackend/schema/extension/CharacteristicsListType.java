
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacteristicsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsValue" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}CharactersticsValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicsListType", propOrder = {
    "characteristicsValue"
})
public class CharacteristicsListType {

    @XmlElement(name = "CharacteristicsValue")
    protected List<CharactersticsValueType> characteristicsValue;

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
     * {@link CharactersticsValueType }
     * 
     * 
     */
    public List<CharactersticsValueType> getCharacteristicsValue() {
        if (characteristicsValue == null) {
            characteristicsValue = new ArrayList<CharactersticsValueType>();
        }
        return this.characteristicsValue;
    }

}
