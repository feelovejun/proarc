/*
 * Copyright (C) 2014 Robert Simonovsky
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package cz.cas.lib.proarc.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * structLinkType: Complex Type for Structural Map Linking The Structural Map
 * Linking section allows for the specification of hyperlinks between different
 * components of a METS structure delineated in a structural map. structLink
 * contains a single, repeatable element, smLink. Each smLink element indicates
 * a hyperlink between two nodes in the structMap. The structMap nodes recorded
 * in smLink are identified using their XML ID attribute values.
 * 
 * 
 * <p>
 * Java class for structLinkType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="structLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="smLink">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute ref="{http://www.w3.org/1999/xlink}arcrole"/>
 *                 &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
 *                 &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
 *                 &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
 *                 &lt;attribute ref="{http://www.w3.org/1999/xlink}to use="required""/>
 *                 &lt;attribute ref="{http://www.w3.org/1999/xlink}from use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="smLinkGrp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="smLocatorLink" maxOccurs="unbounded" minOccurs="2">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.w3.org/1999/xlink}locatorLink"/>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="smArcLink" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.w3.org/1999/xlink}arcLink"/>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;attribute name="ARCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}extendedLink"/>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="ARCLINKORDER" default="unordered">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ordered"/>
 *                       &lt;enumeration value="unordered"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structLinkType", namespace = "http://www.loc.gov/METS/", propOrder = {
        "smLinkOrSmLinkGrp"
})
@XmlSeeAlso({
        cz.cas.lib.proarc.mets.MetsType.StructLink.class
})
public class StructLinkType {

    @XmlElements({
            @XmlElement(name = "smLink", namespace = "http://www.loc.gov/METS/", type = StructLinkType.SmLink.class),
            @XmlElement(name = "smLinkGrp", namespace = "http://www.loc.gov/METS/", type = StructLinkType.SmLinkGrp.class)
    })
    protected List<Object> smLinkOrSmLinkGrp;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the smLinkOrSmLinkGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the smLinkOrSmLinkGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSmLinkOrSmLinkGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructLinkType.SmLink } {@link StructLinkType.SmLinkGrp }
     * 
     * 
     */
    public List<Object> getSmLinkOrSmLinkGrp() {
        if (smLinkOrSmLinkGrp == null) {
            smLinkOrSmLinkGrp = new ArrayList<Object>();
        }
        return this.smLinkOrSmLinkGrp;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute ref="{http://www.w3.org/1999/xlink}arcrole"/>
     *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
     *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
     *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
     *       &lt;attribute ref="{http://www.w3.org/1999/xlink}to use="required""/>
     *       &lt;attribute ref="{http://www.w3.org/1999/xlink}from use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SmLink {

        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
        protected String arcrole;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;
        @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
        protected String show;
        @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
        protected String actuate;
        @XmlAttribute(name = "to", namespace = "http://www.w3.org/1999/xlink", required = true)
        protected String to;
        @XmlAttribute(name = "from", namespace = "http://www.w3.org/1999/xlink", required = true)
        protected String from;

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * 
         * xlink:arcrole - the role of the link, as per the xlink specification.
         * See http://www.w3.org/TR/xlink/
         * 
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getArcrole() {
            return arcrole;
        }

        /**
         * Sets the value of the arcrole property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setArcrole(String value) {
            this.arcrole = value;
        }

        /**
         * 
         * xlink:title - a title for the link (if needed), as per the xlink
         * specification. See http://www.w3.org/TR/xlink/
         * 
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * 
         * xlink:show - see the xlink specification at
         * http://www.w3.org/TR/xlink/
         * 
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getShow() {
            return show;
        }

        /**
         * Sets the value of the show property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setShow(String value) {
            this.show = value;
        }

        /**
         * 
         * xlink:actuate - see the xlink specification at
         * http://www.w3.org/TR/xlink/
         * 
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getActuate() {
            return actuate;
        }

        /**
         * Sets the value of the actuate property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setActuate(String value) {
            this.actuate = value;
        }

        /**
         * 
         * xlink:to - the value of the label for the element in the structMap
         * you are linking to.
         * 
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setTo(String value) {
            this.to = value;
        }

        /**
         * 
         * xlink:from - the value of the label for the element in the structMap
         * you are linking from.
         * 
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setFrom(String value) {
            this.from = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="smLocatorLink" maxOccurs="unbounded" minOccurs="2">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}locatorLink"/>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="smArcLink" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.w3.org/1999/xlink}arcLink"/>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;attribute name="ARCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}extendedLink"/>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="ARCLINKORDER" default="unordered">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ordered"/>
     *             &lt;enumeration value="unordered"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "smLocatorLink",
            "smArcLink"
    })
    public static class SmLinkGrp {

        @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
        protected List<StructLinkType.SmLinkGrp.SmLocatorLink> smLocatorLink;
        @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
        protected List<StructLinkType.SmLinkGrp.SmArcLink> smArcLink;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "ARCLINKORDER")
        protected String arclinkorder;
        @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
        protected String type;
        @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
        protected String role;
        @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
        protected String title;

        /**
         * Gets the value of the smLocatorLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the smLocatorLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getSmLocatorLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructLinkType.SmLinkGrp.SmLocatorLink }
         * 
         * 
         */
        public List<StructLinkType.SmLinkGrp.SmLocatorLink> getSmLocatorLink() {
            if (smLocatorLink == null) {
                smLocatorLink = new ArrayList<StructLinkType.SmLinkGrp.SmLocatorLink>();
            }
            return this.smLocatorLink;
        }

        /**
         * Gets the value of the smArcLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the smArcLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getSmArcLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructLinkType.SmLinkGrp.SmArcLink }
         * 
         * 
         */
        public List<StructLinkType.SmLinkGrp.SmArcLink> getSmArcLink() {
            if (smArcLink == null) {
                smArcLink = new ArrayList<StructLinkType.SmLinkGrp.SmArcLink>();
            }
            return this.smArcLink;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the arclinkorder property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getARCLINKORDER() {
            if (arclinkorder == null) {
                return "unordered";
            } else {
                return arclinkorder;
            }
        }

        /**
         * Sets the value of the arclinkorder property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setARCLINKORDER(String value) {
            this.arclinkorder = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getType() {
            if (type == null) {
                return "extended";
            } else {
                return type;
            }
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * 
         * The structMap arc link element <smArcLink> is of xlink:type "arc" It
         * can be used to establish a traversal link between two <div> elements
         * as identified by <smLocatorLink> elements within the same smLinkGrp
         * element. The associated xlink:from and xlink:to attributes identify
         * the from and to sides of the arc link by referencing the xlink:label
         * attribute values on the participating smLocatorLink elements.
         * 
         * 
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}arcLink"/>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;attribute name="ARCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SmArcLink {

            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "ARCTYPE")
            protected String arctype;
            @XmlAttribute(name = "ADMID")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> admid;
            @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
            protected String type;
            @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
            protected String arcrole;
            @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
            protected String title;
            @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
            protected String show;
            @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
            protected String actuate;
            @XmlAttribute(name = "from", namespace = "http://www.w3.org/1999/xlink")
            protected String from;
            @XmlAttribute(name = "to", namespace = "http://www.w3.org/1999/xlink")
            protected String to;

            /**
             * Gets the value of the id property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the arctype property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getARCTYPE() {
                return arctype;
            }

            /**
             * Sets the value of the arctype property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setARCTYPE(String value) {
                this.arctype = value;
            }

            /**
             * Gets the value of the admid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the admid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getADMID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getADMID() {
                if (admid == null) {
                    admid = new ArrayList<Object>();
                }
                return this.admid;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getType() {
                if (type == null) {
                    return "arc";
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the arcrole property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getArcrole() {
                return arcrole;
            }

            /**
             * Sets the value of the arcrole property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setArcrole(String value) {
                this.arcrole = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the show property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShow() {
                return show;
            }

            /**
             * Sets the value of the show property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setShow(String value) {
                this.show = value;
            }

            /**
             * Gets the value of the actuate property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getActuate() {
                return actuate;
            }

            /**
             * Sets the value of the actuate property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setActuate(String value) {
                this.actuate = value;
            }

            /**
             * Gets the value of the from property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getFrom() {
                return from;
            }

            /**
             * Sets the value of the from property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setFrom(String value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getTo() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setTo(String value) {
                this.to = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}locatorLink"/>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SmLocatorLink {

            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
            protected String type;
            @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String href;
            @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
            protected String role;
            @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
            protected String title;
            @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
            protected String label;

            /**
             * Gets the value of the id property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getType() {
                if (type == null) {
                    return "locator";
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the href property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getHref() {
                return href;
            }

            /**
             * Sets the value of the href property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setHref(String value) {
                this.href = value;
            }

            /**
             * Gets the value of the role property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getRole() {
                return role;
            }

            /**
             * Sets the value of the role property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setRole(String value) {
                this.role = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the label property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getLabel() {
                return label;
            }

            /**
             * Sets the value of the label property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setLabel(String value) {
                this.label = value;
            }

        }

    }

}
