
package vis.greece.makemyplan.model.red;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ParentMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
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
    "parentMSISDN"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "ParentMSISDN", required = true)
    protected String parentMSISDN;

    /**
     * Gets the value of the parentMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMSISDN() {
        return parentMSISDN;
    }

    /**
     * Sets the value of the parentMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMSISDN(String value) {
        this.parentMSISDN = value;
    }

}
