
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for PublicEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticUltimateBusinessName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="DUNSNumbers" type="{http://group.vodafone.com/schema/common/v1}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="NumberOfEmployees" type="{http://group.vodafone.com/schema/common/v1}NumberOfEmployeesType" minOccurs="0"/>
 *         &lt;element name="OtherRegisterNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
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
@XmlType(name = "PublicEntityType", propOrder = {
    "domesticUltimateBusinessName",
    "dunsNumbers",
    "numberOfEmployees",
    "otherRegisterNumber"
})
public class PublicEntityType {

    @XmlElement(name = "DomesticUltimateBusinessName")
    protected TextType domesticUltimateBusinessName;
    @XmlElement(name = "DUNSNumbers")
    protected DUNSNumberType dunsNumbers;
    @XmlElement(name = "NumberOfEmployees")
    protected NumberOfEmployeesType numberOfEmployees;
    @XmlElement(name = "OtherRegisterNumber")
    protected IDType otherRegisterNumber;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the domesticUltimateBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDomesticUltimateBusinessName() {
        return domesticUltimateBusinessName;
    }

    /**
     * Sets the value of the domesticUltimateBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDomesticUltimateBusinessName(TextType value) {
        this.domesticUltimateBusinessName = value;
    }

    /**
     * Gets the value of the dunsNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSNumberType }
     *     
     */
    public DUNSNumberType getDUNSNumbers() {
        return dunsNumbers;
    }

    /**
     * Sets the value of the dunsNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSNumberType }
     *     
     */
    public void setDUNSNumbers(DUNSNumberType value) {
        this.dunsNumbers = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfEmployeesType }
     *     
     */
    public NumberOfEmployeesType getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfEmployeesType }
     *     
     */
    public void setNumberOfEmployees(NumberOfEmployeesType value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the otherRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getOtherRegisterNumber() {
        return otherRegisterNumber;
    }

    /**
     * Sets the value of the otherRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setOtherRegisterNumber(IDType value) {
        this.otherRegisterNumber = value;
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
