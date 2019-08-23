
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * A component representing an expression of a query criteria used in a Get List. For example, find me the matching set of business objects where the Path Equals the Value. The Equals being the operator code, e.g. equals, less than, etc.
 * 
 * <p>Java class for ValueExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="QueryOperatorCode" type="{http://group.vodafone.com/schema/common/v1}QueryOperatorCodeType" />
 *       &lt;attribute name="Path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueExpressionType", propOrder = {
    "value"
})
public class ValueExpressionType {

    @XmlElement(name = "Value")
    protected List<TextType> value;
    @XmlAttribute(name = "QueryOperatorCode")
    protected QueryOperatorCodeType queryOperatorCode;
    @XmlAttribute(name = "Path")
    protected String path;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getValue() {
        if (value == null) {
            value = new ArrayList<TextType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the queryOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOperatorCodeType }
     *     
     */
    public QueryOperatorCodeType getQueryOperatorCode() {
        return queryOperatorCode;
    }

    /**
     * Sets the value of the queryOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOperatorCodeType }
     *     
     */
    public void setQueryOperatorCode(QueryOperatorCodeType value) {
        this.queryOperatorCode = value;
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
