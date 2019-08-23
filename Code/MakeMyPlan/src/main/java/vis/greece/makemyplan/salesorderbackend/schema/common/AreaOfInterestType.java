
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;


/**
 * <p>Java class for AreaOfInterestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaOfInterestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaOfInterest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaOfInterest" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaOfInterestType", propOrder = {
    "areaOfInterest"
})
public class AreaOfInterestType {

    @XmlElement(name = "AreaOfInterest")
    protected List<AreaOfInterestType.AreaOfInterest> areaOfInterest;

    /**
     * Gets the value of the areaOfInterest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaOfInterest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaOfInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaOfInterestType.AreaOfInterest }
     * 
     * 
     */
    public List<AreaOfInterestType.AreaOfInterest> getAreaOfInterest() {
        if (areaOfInterest == null) {
            areaOfInterest = new ArrayList<AreaOfInterestType.AreaOfInterest>();
        }
        return this.areaOfInterest;
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
     *         &lt;element name="AreaOfInterest" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType"/>
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
        "areaOfInterest"
    })
    public static class AreaOfInterest {

        @XmlElement(name = "AreaOfInterest", required = true)
        protected CodeType areaOfInterest;

        /**
         * Gets the value of the areaOfInterest property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getAreaOfInterest() {
            return areaOfInterest;
        }

        /**
         * Sets the value of the areaOfInterest property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setAreaOfInterest(CodeType value) {
            this.areaOfInterest = value;
        }

    }

}
