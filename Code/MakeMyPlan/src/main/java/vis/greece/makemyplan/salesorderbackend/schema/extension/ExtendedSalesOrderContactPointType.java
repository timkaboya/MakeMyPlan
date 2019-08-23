
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.GeographicLocationType;


/**
 * <p>Java class for ExtendedSalesOrderContactPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedSalesOrderContactPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicLocation" type="{http://group.vodafone.com/schema/common/v1}GeographicLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedSalesOrderContactPointType", propOrder = {
    "geographicLocation"
})
public class ExtendedSalesOrderContactPointType {

    @XmlElement(name = "GeographicLocation")
    protected GeographicLocationType geographicLocation;

    /**
     * Gets the value of the geographicLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicLocationType }
     *     
     */
    public GeographicLocationType getGeographicLocation() {
        return geographicLocation;
    }

    /**
     * Sets the value of the geographicLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicLocationType }
     *     
     */
    public void setGeographicLocation(GeographicLocationType value) {
        this.geographicLocation = value;
    }

}
