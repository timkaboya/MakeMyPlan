
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
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ListOfHouseHoldMembers" type="{http://accenture.com/eai/Red4All}ListOfHouseHoldMembers" minOccurs="0" form="qualified"/>
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
    "responseCode",
    "responseMessage",
    "listOfHouseHoldMembers"
})
@XmlRootElement(name = "Response")
public class Response {

    @XmlElement(required = true)
    protected String responseCode;
    @XmlElement(required = true)
    protected String responseMessage;
    @XmlElement(name = "ListOfHouseHoldMembers")
    protected ListOfHouseHoldMembers listOfHouseHoldMembers;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the listOfHouseHoldMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfHouseHoldMembers }
     *     
     */
    public ListOfHouseHoldMembers getListOfHouseHoldMembers() {
        return listOfHouseHoldMembers;
    }

    /**
     * Sets the value of the listOfHouseHoldMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfHouseHoldMembers }
     *     
     */
    public void setListOfHouseHoldMembers(ListOfHouseHoldMembers value) {
        this.listOfHouseHoldMembers = value;
    }

}
