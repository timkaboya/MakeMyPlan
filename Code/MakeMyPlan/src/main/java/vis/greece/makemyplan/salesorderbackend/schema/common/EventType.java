
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * An Event happens at a Point in Time. An Event will always be the result of an Activity and often Triggers another Activity.
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="EventImpact" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="InteractionEvent" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "eventImpact",
    "interactionEvent",
    "validityPeriod"
})
public class EventType
    extends BaseComponentType
{

    @XmlElement(name = "EventImpact")
    protected TextType eventImpact;
    @XmlElement(name = "InteractionEvent")
    protected IndicatorType interactionEvent;
    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodType validityPeriod;

    /**
     * Gets the value of the eventImpact property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getEventImpact() {
        return eventImpact;
    }

    /**
     * Sets the value of the eventImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setEventImpact(TextType value) {
        this.eventImpact = value;
    }

    /**
     * Gets the value of the interactionEvent property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getInteractionEvent() {
        return interactionEvent;
    }

    /**
     * Sets the value of the interactionEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setInteractionEvent(IndicatorType value) {
        this.interactionEvent = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriodType }
     *     
     */
    public ValidityPeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriodType }
     *     
     */
    public void setValidityPeriod(ValidityPeriodType value) {
        this.validityPeriod = value;
    }

}
