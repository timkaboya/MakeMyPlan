
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * An aggregate function that allows statistics function to be specified for building the report
 * 
 * <p>Java class for AggregateFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://group.vodafone.com/schema/common/v1}AggregateFunctionCodeType"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateFunctionType", propOrder = {
    "name",
    "path"
})
public class AggregateFunctionType {

    @XmlElement(name = "Name", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected AggregateFunctionCodeType name;
    @XmlElement(name = "Path", required = true)
    protected String path;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateFunctionCodeType }
     *     
     */
    public AggregateFunctionCodeType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateFunctionCodeType }
     *     
     */
    public void setName(AggregateFunctionCodeType value) {
        this.name = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
