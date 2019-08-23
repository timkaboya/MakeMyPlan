
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;


/**
 * A type that supports defining schedule jobs. It supports both one-time and recurring schedules. One-Time  - the task is executed at a specified datetime. Recurring - the task is executed repeatedly according to the specified frequency.
 * 
 * <p>Java class for ScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="FromDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="Recurrence" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Frequency" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType"/>
 *                   &lt;element name="Interval" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *                   &lt;element name="Specific" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Days" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="NumericDay" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" maxOccurs="unbounded" minOccurs="0"/>
 *                                         &lt;element name="NameDay" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Name" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *                                                   &lt;element name="Occurrence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Times" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Time" type="{http://group.vodafone.com/schema/common/v1}ScheduleTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RunLimit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/common/v1}CharacteristicsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleType", propOrder = {
    "fromDate",
    "toDate",
    "recurrence",
    "characteristics"
})
public class ScheduleType
    extends BaseComponentType
{

    @XmlElement(name = "FromDate")
    protected DateType fromDate;
    @XmlElement(name = "ToDate")
    protected DateType toDate;
    @XmlElement(name = "Recurrence")
    protected ScheduleType.Recurrence recurrence;
    @XmlElement(name = "Characteristics")
    protected CharacteristicsType characteristics;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFromDate(DateType value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setToDate(DateType value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType.Recurrence }
     *     
     */
    public ScheduleType.Recurrence getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType.Recurrence }
     *     
     */
    public void setRecurrence(ScheduleType.Recurrence value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsType }
     *     
     */
    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsType }
     *     
     */
    public void setCharacteristics(CharacteristicsType value) {
        this.characteristics = value;
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
     *         &lt;element name="Frequency" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType"/>
     *         &lt;element name="Interval" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
     *         &lt;element name="Specific" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Days" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="NumericDay" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" maxOccurs="unbounded" minOccurs="0"/>
     *                               &lt;element name="NameDay" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="Name" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
     *                                         &lt;element name="Occurrence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Times" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Time" type="{http://group.vodafone.com/schema/common/v1}ScheduleTimeType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RunLimit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
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
        "frequency",
        "interval",
        "specific",
        "runLimit"
    })
    public static class Recurrence {

        @XmlElement(name = "Frequency", required = true)
        protected CodeType frequency;
        @XmlElement(name = "Interval")
        protected NumericType interval;
        @XmlElement(name = "Specific")
        protected ScheduleType.Recurrence.Specific specific;
        @XmlElement(name = "RunLimit")
        protected NumericType runLimit;

        /**
         * Gets the value of the frequency property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getFrequency() {
            return frequency;
        }

        /**
         * Sets the value of the frequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setFrequency(CodeType value) {
            this.frequency = value;
        }

        /**
         * Gets the value of the interval property.
         * 
         * @return
         *     possible object is
         *     {@link NumericType }
         *     
         */
        public NumericType getInterval() {
            return interval;
        }

        /**
         * Sets the value of the interval property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericType }
         *     
         */
        public void setInterval(NumericType value) {
            this.interval = value;
        }

        /**
         * Gets the value of the specific property.
         * 
         * @return
         *     possible object is
         *     {@link ScheduleType.Recurrence.Specific }
         *     
         */
        public ScheduleType.Recurrence.Specific getSpecific() {
            return specific;
        }

        /**
         * Sets the value of the specific property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScheduleType.Recurrence.Specific }
         *     
         */
        public void setSpecific(ScheduleType.Recurrence.Specific value) {
            this.specific = value;
        }

        /**
         * Gets the value of the runLimit property.
         * 
         * @return
         *     possible object is
         *     {@link NumericType }
         *     
         */
        public NumericType getRunLimit() {
            return runLimit;
        }

        /**
         * Sets the value of the runLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericType }
         *     
         */
        public void setRunLimit(NumericType value) {
            this.runLimit = value;
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
         *         &lt;element name="Days" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="NumericDay" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" maxOccurs="unbounded" minOccurs="0"/>
         *                     &lt;element name="NameDay" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="Name" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
         *                               &lt;element name="Occurrence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Times" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Time" type="{http://group.vodafone.com/schema/common/v1}ScheduleTimeType" maxOccurs="unbounded" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "days",
            "times"
        })
        public static class Specific {

            @XmlElement(name = "Days")
            protected ScheduleType.Recurrence.Specific.Days days;
            @XmlElement(name = "Times")
            protected ScheduleType.Recurrence.Specific.Times times;

            /**
             * Gets the value of the days property.
             * 
             * @return
             *     possible object is
             *     {@link ScheduleType.Recurrence.Specific.Days }
             *     
             */
            public ScheduleType.Recurrence.Specific.Days getDays() {
                return days;
            }

            /**
             * Sets the value of the days property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScheduleType.Recurrence.Specific.Days }
             *     
             */
            public void setDays(ScheduleType.Recurrence.Specific.Days value) {
                this.days = value;
            }

            /**
             * Gets the value of the times property.
             * 
             * @return
             *     possible object is
             *     {@link ScheduleType.Recurrence.Specific.Times }
             *     
             */
            public ScheduleType.Recurrence.Specific.Times getTimes() {
                return times;
            }

            /**
             * Sets the value of the times property.
             * 
             * @param value
             *     allowed object is
             *     {@link ScheduleType.Recurrence.Specific.Times }
             *     
             */
            public void setTimes(ScheduleType.Recurrence.Specific.Times value) {
                this.times = value;
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
             *         &lt;choice>
             *           &lt;element name="NumericDay" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" maxOccurs="unbounded" minOccurs="0"/>
             *           &lt;element name="NameDay" maxOccurs="unbounded" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="Name" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
             *                     &lt;element name="Occurrence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
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
                "numericDay",
                "nameDay"
            })
            public static class Days {

                @XmlElement(name = "NumericDay")
                protected List<NumericType> numericDay;
                @XmlElement(name = "NameDay")
                protected List<ScheduleType.Recurrence.Specific.Days.NameDay> nameDay;

                /**
                 * Gets the value of the numericDay property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the numericDay property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNumericDay().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NumericType }
                 * 
                 * 
                 */
                public List<NumericType> getNumericDay() {
                    if (numericDay == null) {
                        numericDay = new ArrayList<NumericType>();
                    }
                    return this.numericDay;
                }

                /**
                 * Gets the value of the nameDay property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nameDay property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNameDay().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ScheduleType.Recurrence.Specific.Days.NameDay }
                 * 
                 * 
                 */
                public List<ScheduleType.Recurrence.Specific.Days.NameDay> getNameDay() {
                    if (nameDay == null) {
                        nameDay = new ArrayList<ScheduleType.Recurrence.Specific.Days.NameDay>();
                    }
                    return this.nameDay;
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
                 *         &lt;element name="Name" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
                 *         &lt;element name="Occurrence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
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
                    "name",
                    "occurrence"
                })
                public static class NameDay {

                    @XmlElement(name = "Name")
                    protected CodeType name;
                    @XmlElement(name = "Occurrence")
                    protected CodeType occurrence;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodeType }
                     *     
                     */
                    public CodeType getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodeType }
                     *     
                     */
                    public void setName(CodeType value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the occurrence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodeType }
                     *     
                     */
                    public CodeType getOccurrence() {
                        return occurrence;
                    }

                    /**
                     * Sets the value of the occurrence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodeType }
                     *     
                     */
                    public void setOccurrence(CodeType value) {
                        this.occurrence = value;
                    }

                }

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
             *         &lt;element name="Time" type="{http://group.vodafone.com/schema/common/v1}ScheduleTimeType" maxOccurs="unbounded" minOccurs="0"/>
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
                "time"
            })
            public static class Times {

                @XmlElement(name = "Time")
                protected List<ScheduleTimeType> time;

                /**
                 * Gets the value of the time property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the time property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTime().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ScheduleTimeType }
                 * 
                 * 
                 */
                public List<ScheduleTimeType> getTime() {
                    if (time == null) {
                        time = new ArrayList<ScheduleTimeType>();
                    }
                    return this.time;
                }

            }

        }

    }

}
