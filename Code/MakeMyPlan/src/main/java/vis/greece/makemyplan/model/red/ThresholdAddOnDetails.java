
package vis.greece.makemyplan.model.red;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThresholdAddOnDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdAddOnDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddOnName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="AddOnAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="AddOnAttributeValue" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThresholdAddOnDetails", propOrder = {
    "addOnName",
    "addOnAttributeName",
    "addOnAttributeValue"
})
public class ThresholdAddOnDetails {

    @XmlElement(name = "AddOnName", required = true)
    protected String addOnName;
    @XmlElement(name = "AddOnAttributeName", required = true)
    protected String addOnAttributeName;
    @XmlElement(name = "AddOnAttributeValue", required = true)
    protected String addOnAttributeValue;

    /**
     * Gets the value of the addOnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddOnName() {
        return addOnName;
    }

    /**
     * Sets the value of the addOnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddOnName(String value) {
        this.addOnName = value;
    }

    /**
     * Gets the value of the addOnAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddOnAttributeName() {
        return addOnAttributeName;
    }

    /**
     * Sets the value of the addOnAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddOnAttributeName(String value) {
        this.addOnAttributeName = value;
    }

    /**
     * Gets the value of the addOnAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddOnAttributeValue() {
        return addOnAttributeValue;
    }

    /**
     * Sets the value of the addOnAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddOnAttributeValue(String value) {
        this.addOnAttributeValue = value;
    }

}
