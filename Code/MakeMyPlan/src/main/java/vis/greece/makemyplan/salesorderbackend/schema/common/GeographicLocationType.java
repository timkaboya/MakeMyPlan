
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.MeasureType;


/**
 * <p>Java class for GeographicLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AltitudeMeasure" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}MeasureType" minOccurs="0"/>
 *         &lt;element name="LatitudeMeasure" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}MeasureType" minOccurs="0"/>
 *         &lt;element name="LongitudeMeasure" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}MeasureType" minOccurs="0"/>
 *         &lt;element name="LatitudeDirectionCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *         &lt;element name="LongitudeDirectionCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *         &lt;element name="SystemID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
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
@XmlType(name = "GeographicLocationType", propOrder = {
    "altitudeMeasure",
    "latitudeMeasure",
    "longitudeMeasure",
    "latitudeDirectionCode",
    "longitudeDirectionCode",
    "systemID"
})
public class GeographicLocationType {

    @XmlElement(name = "AltitudeMeasure")
    protected MeasureType altitudeMeasure;
    @XmlElement(name = "LatitudeMeasure")
    protected MeasureType latitudeMeasure;
    @XmlElement(name = "LongitudeMeasure")
    protected MeasureType longitudeMeasure;
    @XmlElement(name = "LatitudeDirectionCode")
    protected CodeType latitudeDirectionCode;
    @XmlElement(name = "LongitudeDirectionCode")
    protected CodeType longitudeDirectionCode;
    @XmlElement(name = "SystemID")
    protected IDType systemID;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the altitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Sets the value of the altitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAltitudeMeasure(MeasureType value) {
        this.altitudeMeasure = value;
    }

    /**
     * Gets the value of the latitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLatitudeMeasure() {
        return latitudeMeasure;
    }

    /**
     * Sets the value of the latitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLatitudeMeasure(MeasureType value) {
        this.latitudeMeasure = value;
    }

    /**
     * Gets the value of the longitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLongitudeMeasure() {
        return longitudeMeasure;
    }

    /**
     * Sets the value of the longitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLongitudeMeasure(MeasureType value) {
        this.longitudeMeasure = value;
    }

    /**
     * Gets the value of the latitudeDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    /**
     * Sets the value of the latitudeDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLatitudeDirectionCode(CodeType value) {
        this.latitudeDirectionCode = value;
    }

    /**
     * Gets the value of the longitudeDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    /**
     * Sets the value of the longitudeDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLongitudeDirectionCode(CodeType value) {
        this.longitudeDirectionCode = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSystemID(IDType value) {
        this.systemID = value;
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
