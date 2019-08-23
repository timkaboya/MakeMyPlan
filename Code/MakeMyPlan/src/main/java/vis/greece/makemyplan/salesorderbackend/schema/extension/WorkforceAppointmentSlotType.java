
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.common.TimePeriodType;


/**
 * <p>Java class for WorkforceAppointmentSlotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkforceAppointmentSlotType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="ProposedTime" type="{http://group.vodafone.com/schema/common/v1}TimePeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkforceAppointmentSlotType", propOrder = {
    "proposedTime"
})
public class WorkforceAppointmentSlotType
    extends BaseComponentType
{

    @XmlElement(name = "ProposedTime")
    protected TimePeriodType proposedTime;

    /**
     * Gets the value of the proposedTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getProposedTime() {
        return proposedTime;
    }

    /**
     * Sets the value of the proposedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setProposedTime(TimePeriodType value) {
        this.proposedTime = value;
    }

}
