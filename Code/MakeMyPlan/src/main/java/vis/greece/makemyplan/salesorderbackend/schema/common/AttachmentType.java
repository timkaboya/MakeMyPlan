
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.BinaryObjectType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.MeasureType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.AttachmentsType;


/**
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="BinaryObject" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}BinaryObjectType" minOccurs="0"/>
 *         &lt;element name="Size" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}MeasureType" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://group.vodafone.com/schema/common/v1}ReferenceType" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="ModifiedDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ModifiedBy" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "binaryObject",
    "size",
    "reference",
    "createdDate",
    "createdBy",
    "owner",
    "modifiedDate",
    "modifiedBy"
})
@XmlSeeAlso({
    AttachmentsType.class
})
public class AttachmentType
    extends BaseComponentType
{

    @XmlElement(name = "BinaryObject")
    protected BinaryObjectType binaryObject;
    @XmlElement(name = "Size")
    protected MeasureType size;
    @XmlElement(name = "Reference")
    protected ReferenceType reference;
    @XmlElement(name = "CreatedDate")
    protected DateTimeType createdDate;
    @XmlElement(name = "CreatedBy")
    protected IDType createdBy;
    @XmlElement(name = "Owner")
    protected TextType owner;
    @XmlElement(name = "ModifiedDate")
    protected DateTimeType modifiedDate;
    @XmlElement(name = "ModifiedBy")
    protected IDType modifiedBy;

    /**
     * Gets the value of the binaryObject property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getBinaryObject() {
        return binaryObject;
    }

    /**
     * Sets the value of the binaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setBinaryObject(BinaryObjectType value) {
        this.binaryObject = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSize(MeasureType value) {
        this.size = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCreatedDate(DateTimeType value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCreatedBy(IDType value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setOwner(TextType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setModifiedDate(DateTimeType value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setModifiedBy(IDType value) {
        this.modifiedBy = value;
    }

}
