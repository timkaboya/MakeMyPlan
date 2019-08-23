
package vis.greece.makemyplan.salesorderbackend.contract.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to the specific field or component within the VBO that generated the failure.
 * 
 * <p>Java class for DataRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PathName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PathValueText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRefType", propOrder = {
    "pathName",
    "pathValueText"
})
public class DataRefType {

    @XmlElement(name = "PathName", required = true)
    protected String pathName;
    @XmlElement(name = "PathValueText")
    protected String pathValueText;

    /**
     * Gets the value of the pathName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * Sets the value of the pathName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathName(String value) {
        this.pathName = value;
    }

    /**
     * Gets the value of the pathValueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathValueText() {
        return pathValueText;
    }

    /**
     * Sets the value of the pathValueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathValueText(String value) {
        this.pathValueText = value;
    }

}
