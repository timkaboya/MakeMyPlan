
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details of the data set on which to report.
 * 
 * <p>Java class for ReportQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryExpression" type="{http://group.vodafone.com/schema/common/v1}QueryExpressionType"/>
 *         &lt;element name="GroupingExpression" type="{http://group.vodafone.com/schema/common/v1}GroupingExpressionType"/>
 *         &lt;element name="AggregateFunctions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Function" type="{http://group.vodafone.com/schema/common/v1}AggregateFunctionType" maxOccurs="unbounded"/>
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
@XmlType(name = "ReportQueryType", propOrder = {
    "queryExpression",
    "groupingExpression",
    "aggregateFunctions"
})
public class ReportQueryType {

    @XmlElement(name = "QueryExpression", required = true)
    protected QueryExpressionType queryExpression;
    @XmlElement(name = "GroupingExpression", required = true)
    protected GroupingExpressionType groupingExpression;
    @XmlElement(name = "AggregateFunctions", required = true)
    protected ReportQueryType.AggregateFunctions aggregateFunctions;

    /**
     * Gets the value of the queryExpression property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getQueryExpression() {
        return queryExpression;
    }

    /**
     * Sets the value of the queryExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setQueryExpression(QueryExpressionType value) {
        this.queryExpression = value;
    }

    /**
     * Gets the value of the groupingExpression property.
     * 
     * @return
     *     possible object is
     *     {@link GroupingExpressionType }
     *     
     */
    public GroupingExpressionType getGroupingExpression() {
        return groupingExpression;
    }

    /**
     * Sets the value of the groupingExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingExpressionType }
     *     
     */
    public void setGroupingExpression(GroupingExpressionType value) {
        this.groupingExpression = value;
    }

    /**
     * Gets the value of the aggregateFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQueryType.AggregateFunctions }
     *     
     */
    public ReportQueryType.AggregateFunctions getAggregateFunctions() {
        return aggregateFunctions;
    }

    /**
     * Sets the value of the aggregateFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQueryType.AggregateFunctions }
     *     
     */
    public void setAggregateFunctions(ReportQueryType.AggregateFunctions value) {
        this.aggregateFunctions = value;
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
     *         &lt;element name="Function" type="{http://group.vodafone.com/schema/common/v1}AggregateFunctionType" maxOccurs="unbounded"/>
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
        "function"
    })
    public static class AggregateFunctions {

        @XmlElement(name = "Function", required = true)
        protected List<AggregateFunctionType> function;

        /**
         * Gets the value of the function property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the function property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFunction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AggregateFunctionType }
         * 
         * 
         */
        public List<AggregateFunctionType> getFunction() {
            if (function == null) {
                function = new ArrayList<AggregateFunctionType>();
            }
            return this.function;
        }

    }

}
