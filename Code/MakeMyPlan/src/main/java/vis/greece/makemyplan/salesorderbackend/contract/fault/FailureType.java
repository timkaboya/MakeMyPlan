
package vis.greece.makemyplan.salesorderbackend.contract.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import vis.greece.makemyplan.salesorderbackend.schema.common.FaultSeverityCodeType;



/**
 * A component that describes individual failures within the fault. This component is used to support multiple causes to the fault, i.e. where the fault is generated from one or more API calls or one or more validation failures.
 * 
 * <p>Java class for FailureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataRef" type="{http://group.vodafone.com/contract/vfo/fault/v1}DataRefType" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://group.vodafone.com/schema/common/v1}FaultSeverityCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureType", propOrder = {
    "code",
    "text",
    "dataRef",
    "severity"
})
public class FailureType {

    @XmlElement(name = "Code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String code;
    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlElement(name = "DataRef")
    protected DataRefType dataRef;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "normalizedString")
    protected FaultSeverityCodeType severity;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the dataRef property.
     * 
     * @return
     *     possible object is
     *     {@link DataRefType }
     *     
     */
    public DataRefType getDataRef() {
        return dataRef;
    }

    /**
     * Sets the value of the dataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRefType }
     *     
     */
    public void setDataRef(DataRefType value) {
        this.dataRef = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link FaultSeverityCodeType }
     *     
     */
    public FaultSeverityCodeType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultSeverityCodeType }
     *     
     */
    public void setSeverity(FaultSeverityCodeType value) {
        this.severity = value;
    }

}
