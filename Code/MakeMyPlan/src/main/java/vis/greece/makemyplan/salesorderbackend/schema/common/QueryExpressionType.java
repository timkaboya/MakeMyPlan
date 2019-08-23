
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A query expression that allows complex queries to be formulated out of a series of value expressions (criteria).
 * 
 * <p>Java class for QueryExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueExpression" type="{http://group.vodafone.com/schema/common/v1}ValueExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LogicalOperatorCode" type="{http://group.vodafone.com/schema/common/v1}LogicalOperatorCodeType" />
 *       &lt;attribute name="NegationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpressionType", propOrder = {
    "valueExpression"
})
public class QueryExpressionType {

    @XmlElement(name = "ValueExpression")
    protected List<ValueExpressionType> valueExpression;
    @XmlAttribute(name = "LogicalOperatorCode")
    protected LogicalOperatorCodeType logicalOperatorCode;
    @XmlAttribute(name = "NegationIndicator")
    protected String negationIndicator;

    /**
     * Gets the value of the valueExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueExpressionType }
     * 
     * 
     */
    public List<ValueExpressionType> getValueExpression() {
        if (valueExpression == null) {
            valueExpression = new ArrayList<ValueExpressionType>();
        }
        return this.valueExpression;
    }

    /**
     * Gets the value of the logicalOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperatorCodeType }
     *     
     */
    public LogicalOperatorCodeType getLogicalOperatorCode() {
        return logicalOperatorCode;
    }

    /**
     * Sets the value of the logicalOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperatorCodeType }
     *     
     */
    public void setLogicalOperatorCode(LogicalOperatorCodeType value) {
        this.logicalOperatorCode = value;
    }

    /**
     * Gets the value of the negationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegationIndicator() {
        return negationIndicator;
    }

    /**
     * Sets the value of the negationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegationIndicator(String value) {
        this.negationIndicator = value;
    }

}
