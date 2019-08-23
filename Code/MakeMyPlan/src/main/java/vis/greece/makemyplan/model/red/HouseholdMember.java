
package vis.greece.makemyplan.model.red;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseholdMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="TariffPlan" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ThresholdAddOnDetails" type="{http://accenture.com/eai/Red4All}ThresholdAddOnDetails" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdMember", propOrder = {
    "memberMSISDN",
    "tariffPlan",
    "thresholdAddOnDetails"
})
public class HouseholdMember {

    @XmlElement(name = "MemberMSISDN", required = true)
    protected String memberMSISDN;
    @XmlElement(name = "TariffPlan", required = true)
    protected String tariffPlan;
    @XmlElement(name = "ThresholdAddOnDetails")
    protected ThresholdAddOnDetails thresholdAddOnDetails;

    /**
     * Gets the value of the memberMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberMSISDN() {
        return memberMSISDN;
    }

    /**
     * Sets the value of the memberMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberMSISDN(String value) {
        this.memberMSISDN = value;
    }

    /**
     * Gets the value of the tariffPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlan() {
        return tariffPlan;
    }

    /**
     * Sets the value of the tariffPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlan(String value) {
        this.tariffPlan = value;
    }

    /**
     * Gets the value of the thresholdAddOnDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdAddOnDetails }
     *     
     */
    public ThresholdAddOnDetails getThresholdAddOnDetails() {
        return thresholdAddOnDetails;
    }

    /**
     * Sets the value of the thresholdAddOnDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdAddOnDetails }
     *     
     */
    public void setThresholdAddOnDetails(ThresholdAddOnDetails value) {
        this.thresholdAddOnDetails = value;
    }

}
