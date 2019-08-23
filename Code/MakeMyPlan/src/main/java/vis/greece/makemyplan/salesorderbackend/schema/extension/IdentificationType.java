
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;
import vis.greece.makemyplan.salesorderbackend.schema.common.ActionCodeType;
import vis.greece.makemyplan.salesorderbackend.schema.common.ValidityPeriodType;


/**
 * An identification associated to the Customer
 * 
 * <p>Java class for IdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *         &lt;element name="IssuingAuthority" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *         &lt;element name="IssuingDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType"/>
 *         &lt;element name="ValidityPeriod" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}CharacteristicsListType" minOccurs="0"/>
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
@XmlType(name = "IdentificationType", propOrder = {
    "id",
    "type",
    "issuingAuthority",
    "issuingDate",
    "validityPeriod",
    "characteristics"
})
public class IdentificationType {

    @XmlElement(name = "ID", required = true)
    protected TextType id;
    @XmlElement(name = "Type", required = true)
    protected TextType type;
    @XmlElement(name = "IssuingAuthority", required = true)
    protected TextType issuingAuthority;
    @XmlElement(name = "IssuingDate", required = true)
    protected DateTimeType issuingDate;
    @XmlElement(name = "ValidityPeriod")
    protected ValidityPeriodType validityPeriod;
    @XmlElement(name = "Characteristics")
    protected CharacteristicsListType characteristics;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setID(TextType value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setType(TextType value) {
        this.type = value;
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setIssuingAuthority(TextType value) {
        this.issuingAuthority = value;
    }

    /**
     * Gets the value of the issuingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getIssuingDate() {
        return issuingDate;
    }

    /**
     * Sets the value of the issuingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setIssuingDate(DateTimeType value) {
        this.issuingDate = value;
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

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsListType }
     *     
     */
    public CharacteristicsListType getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsListType }
     *     
     */
    public void setCharacteristics(CharacteristicsListType value) {
        this.characteristics = value;
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
