
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;


/**
 * <p>Java class for DUNSNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DUNSNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="GlobalDUNSNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="ParentDUNSNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="DomesticUlimateDUNSNumber" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
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
@XmlType(name = "DUNSNumberType", propOrder = {
    "dunsNumber",
    "globalDUNSNumber",
    "parentDUNSNumber",
    "domesticUlimateDUNSNumber"
})
public class DUNSNumberType {

    @XmlElement(name = "DUNSNumber")
    protected IDType dunsNumber;
    @XmlElement(name = "GlobalDUNSNumber")
    protected IDType globalDUNSNumber;
    @XmlElement(name = "ParentDUNSNumber")
    protected IDType parentDUNSNumber;
    @XmlElement(name = "DomesticUlimateDUNSNumber")
    protected IDType domesticUlimateDUNSNumber;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDUNSNumber(IDType value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the globalDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGlobalDUNSNumber() {
        return globalDUNSNumber;
    }

    /**
     * Sets the value of the globalDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGlobalDUNSNumber(IDType value) {
        this.globalDUNSNumber = value;
    }

    /**
     * Gets the value of the parentDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getParentDUNSNumber() {
        return parentDUNSNumber;
    }

    /**
     * Sets the value of the parentDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setParentDUNSNumber(IDType value) {
        this.parentDUNSNumber = value;
    }

    /**
     * Gets the value of the domesticUlimateDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDomesticUlimateDUNSNumber() {
        return domesticUlimateDUNSNumber;
    }

    /**
     * Sets the value of the domesticUlimateDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDomesticUlimateDUNSNumber(IDType value) {
        this.domesticUlimateDUNSNumber = value;
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
