
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * A public holiday, national holiday or legal holiday is a holiday generally established by law and is usually a non-working day during the year. The public holidays are generally days of celebration, like the anniversary of a significant historical event, or can be a religious celebration. Holidays can land on a specific day of the year, be tied to a certain day of the week in a certain month or follow other calendar systems like the Lunar Calendar.
 * 
 * <p>Java class for PublicHolidayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicHolidayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicHolidayType", propOrder = {
    "date",
    "description"
})
public class PublicHolidayType {

    @XmlElement(name = "Date", required = true)
    protected DateType date;
    @XmlElement(name = "Description", required = true)
    protected TextType description;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
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
