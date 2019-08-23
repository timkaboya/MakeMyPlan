
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;


/**
 * <p>Java class for ExtendedSalesOrderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedSalesOrderDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmationChecksApproved" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="EligibilityCheck" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedSalesOrderDetailsType", propOrder = {
    "confirmationChecksApproved",
    "eligibilityCheck"
})
public class ExtendedSalesOrderDetailsType {

    @XmlElement(name = "ConfirmationChecksApproved")
    protected IndicatorType confirmationChecksApproved;
    @XmlElement(name = "EligibilityCheck")
    protected IndicatorType eligibilityCheck;

    /**
     * Gets the value of the confirmationChecksApproved property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getConfirmationChecksApproved() {
        return confirmationChecksApproved;
    }

    /**
     * Sets the value of the confirmationChecksApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setConfirmationChecksApproved(IndicatorType value) {
        this.confirmationChecksApproved = value;
    }

    /**
     * Gets the value of the eligibilityCheck property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getEligibilityCheck() {
        return eligibilityCheck;
    }

    /**
     * Sets the value of the eligibilityCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setEligibilityCheck(IndicatorType value) {
        this.eligibilityCheck = value;
    }

}
