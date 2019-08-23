
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data object that allows report specification to be specified against various business objects for the calculation of aggregate functions.
 * 
 * <p>Java class for ReportSpecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSpecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportQuery" type="{http://group.vodafone.com/schema/common/v1}ReportQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSpecType", propOrder = {
    "reportQuery"
})
public class ReportSpecType {

    @XmlElement(name = "ReportQuery", required = true)
    protected ReportQueryType reportQuery;

    /**
     * Gets the value of the reportQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQueryType }
     *     
     */
    public ReportQueryType getReportQuery() {
        return reportQuery;
    }

    /**
     * Sets the value of the reportQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQueryType }
     *     
     */
    public void setReportQuery(ReportQueryType value) {
        this.reportQuery = value;
    }

}
