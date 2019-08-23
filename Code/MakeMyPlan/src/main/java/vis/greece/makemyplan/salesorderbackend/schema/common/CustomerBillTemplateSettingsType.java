
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for CustomerBillTemplateSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillTemplateSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillFormat" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="InvoiceLanguage" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BrailleOption" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillTemplateSettingsType", propOrder = {
    "billFormat",
    "invoiceLanguage",
    "brailleOption"
})
public class CustomerBillTemplateSettingsType {

    @XmlElement(name = "BillFormat")
    protected TextType billFormat;
    @XmlElement(name = "InvoiceLanguage")
    protected TextType invoiceLanguage;
    @XmlElement(name = "BrailleOption")
    protected TextType brailleOption;

    /**
     * Gets the value of the billFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBillFormat() {
        return billFormat;
    }

    /**
     * Sets the value of the billFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBillFormat(TextType value) {
        this.billFormat = value;
    }

    /**
     * Gets the value of the invoiceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInvoiceLanguage() {
        return invoiceLanguage;
    }

    /**
     * Sets the value of the invoiceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInvoiceLanguage(TextType value) {
        this.invoiceLanguage = value;
    }

    /**
     * Gets the value of the brailleOption property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBrailleOption() {
        return brailleOption;
    }

    /**
     * Sets the value of the brailleOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBrailleOption(TextType value) {
        this.brailleOption = value;
    }

}
