
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.QuantityType;


/**
 * <p>Java class for NumberOfEmployeesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfEmployeesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/>
 *         &lt;element name="TeleSales" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/>
 *         &lt;element name="FieldSales" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/>
 *         &lt;element name="TechSupport" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/>
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
@XmlType(name = "NumberOfEmployeesType", propOrder = {
    "total",
    "teleSales",
    "fieldSales",
    "techSupport"
})
public class NumberOfEmployeesType {

    @XmlElement(name = "Total")
    protected QuantityType total;
    @XmlElement(name = "TeleSales")
    protected QuantityType teleSales;
    @XmlElement(name = "FieldSales")
    protected QuantityType fieldSales;
    @XmlElement(name = "TechSupport")
    protected QuantityType techSupport;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTotal(QuantityType value) {
        this.total = value;
    }

    /**
     * Gets the value of the teleSales property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTeleSales() {
        return teleSales;
    }

    /**
     * Sets the value of the teleSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTeleSales(QuantityType value) {
        this.teleSales = value;
    }

    /**
     * Gets the value of the fieldSales property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getFieldSales() {
        return fieldSales;
    }

    /**
     * Sets the value of the fieldSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setFieldSales(QuantityType value) {
        this.fieldSales = value;
    }

    /**
     * Gets the value of the techSupport property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTechSupport() {
        return techSupport;
    }

    /**
     * Sets the value of the techSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTechSupport(QuantityType value) {
        this.techSupport = value;
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
