
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;


/**
 * A Postal Address with a Geographic Location appended to capture both the address and the Latitude/Longitude.
 * 
 * <p>Java class for PostalAddressWithLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressWithLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PostalAddressType">
 *       &lt;sequence>
 *         &lt;element name="LocationCoordinates" type="{http://group.vodafone.com/schema/common/v1}GeographicLocationType" minOccurs="0"/>
 *         &lt;element name="IDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressWithLocationType", propOrder = {
    "locationCoordinates",
    "iDs"
})
public class PostalAddressWithLocationType
    extends PostalAddressType
{

    @XmlElement(name = "LocationCoordinates")
    protected GeographicLocationType locationCoordinates;
    @XmlElement(name = "IDs")
    protected PostalAddressWithLocationType.IDs iDs;

    /**
     * Gets the value of the locationCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicLocationType }
     *     
     */
    public GeographicLocationType getLocationCoordinates() {
        return locationCoordinates;
    }

    /**
     * Sets the value of the locationCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicLocationType }
     *     
     */
    public void setLocationCoordinates(GeographicLocationType value) {
        this.locationCoordinates = value;
    }

    /**
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressWithLocationType.IDs }
     *     
     */
    public PostalAddressWithLocationType.IDs getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressWithLocationType.IDs }
     *     
     */
    public void setIDs(PostalAddressWithLocationType.IDs value) {
        this.iDs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class IDs {

        @XmlElement(name = "ID", required = true)
        protected List<IDType> id;

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDType }
         * 
         * 
         */
        public List<IDType> getID() {
            if (id == null) {
                id = new ArrayList<IDType>();
            }
            return this.id;
        }

    }

}
