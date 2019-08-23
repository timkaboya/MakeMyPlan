
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * Notes related to the entity
 * 
 * <p>Java class for NoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="AgentID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="CreatedDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteType", propOrder = {
    "content",
    "agentID",
    "createdDateTime",
    "lastModifiedDateTime"
})
public class NoteType
    extends BaseComponentType
{

    @XmlElement(name = "Content")
    protected TextType content;
    @XmlElement(name = "AgentID")
    protected IDType agentID;
    @XmlElement(name = "CreatedDateTime")
    protected DateTimeType createdDateTime;
    @XmlElement(name = "LastModifiedDateTime")
    protected DateTimeType lastModifiedDateTime;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setContent(TextType value) {
        this.content = value;
    }

    /**
     * Gets the value of the agentID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAgentID(IDType value) {
        this.agentID = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCreatedDateTime(DateTimeType value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLastModifiedDateTime(DateTimeType value) {
        this.lastModifiedDateTime = value;
    }

}
