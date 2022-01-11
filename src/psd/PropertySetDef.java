//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.22 um 01:19:51 PM CEST 
//


package psd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IfcVersion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Applicability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplicableClasses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicableTypeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyDefs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyDef" type="{}PropertyDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PsetDefinitionAliases" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PsetDefinitionAlias" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ifdguid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ifcVersion",
    "name",
    "definition",
    "applicability",
    "applicableClasses",
    "applicableTypeValue",
    "propertyDefs",
    "psetDefinitionAliases"
})
@XmlRootElement(name = "PropertySetDef")
public class PropertySetDef {

    @XmlElement(name = "IfcVersion", required = true)
    protected PropertySetDef.IfcVersion ifcVersion;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Definition", required = true)
    protected String definition;
    @XmlElement(name = "Applicability", required = true)
    protected String applicability;
    @XmlElement(name = "ApplicableClasses")
    protected PropertySetDef.ApplicableClasses applicableClasses;
    @XmlElement(name = "ApplicableTypeValue")
    protected String applicableTypeValue;
    @XmlElement(name = "PropertyDefs", required = true)
    protected PropertySetDef.PropertyDefs propertyDefs;
    @XmlElement(name = "PsetDefinitionAliases")
    protected PropertySetDef.PsetDefinitionAliases psetDefinitionAliases;
    @XmlAttribute(name = "ifdguid")
    protected String ifdguid;

    /**
     * Ruft den Wert der ifcVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.IfcVersion }
     *     
     */
    public PropertySetDef.IfcVersion getIfcVersion() {
        return ifcVersion;
    }

    /**
     * Legt den Wert der ifcVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.IfcVersion }
     *     
     */
    public void setIfcVersion(PropertySetDef.IfcVersion value) {
        this.ifcVersion = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der definition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Legt den Wert der definition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Ruft den Wert der applicability-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicability() {
        return applicability;
    }

    /**
     * Legt den Wert der applicability-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicability(String value) {
        this.applicability = value;
    }

    /**
     * Ruft den Wert der applicableClasses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.ApplicableClasses }
     *     
     */
    public PropertySetDef.ApplicableClasses getApplicableClasses() {
        return applicableClasses;
    }

    /**
     * Legt den Wert der applicableClasses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.ApplicableClasses }
     *     
     */
    public void setApplicableClasses(PropertySetDef.ApplicableClasses value) {
        this.applicableClasses = value;
    }

    /**
     * Ruft den Wert der applicableTypeValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableTypeValue() {
        return applicableTypeValue;
    }

    /**
     * Legt den Wert der applicableTypeValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableTypeValue(String value) {
        this.applicableTypeValue = value;
    }

    /**
     * Ruft den Wert der propertyDefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.PropertyDefs }
     *     
     */
    public PropertySetDef.PropertyDefs getPropertyDefs() {
        return propertyDefs;
    }

    /**
     * Legt den Wert der propertyDefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.PropertyDefs }
     *     
     */
    public void setPropertyDefs(PropertySetDef.PropertyDefs value) {
        this.propertyDefs = value;
    }

    /**
     * Ruft den Wert der psetDefinitionAliases-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.PsetDefinitionAliases }
     *     
     */
    public PropertySetDef.PsetDefinitionAliases getPsetDefinitionAliases() {
        return psetDefinitionAliases;
    }

    /**
     * Legt den Wert der psetDefinitionAliases-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.PsetDefinitionAliases }
     *     
     */
    public void setPsetDefinitionAliases(PropertySetDef.PsetDefinitionAliases value) {
        this.psetDefinitionAliases = value;
    }

    /**
     * Ruft den Wert der ifdguid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfdguid() {
        return ifdguid;
    }

    /**
     * Legt den Wert der ifdguid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfdguid(String value) {
        this.ifdguid = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "className"
    })
    public static class ApplicableClasses {

        @XmlElement(name = "ClassName")
        protected List<String> className;

        /**
         * Gets the value of the className property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the className property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getClassName() {
            if (className == null) {
                className = new ArrayList<String>();
            }
            return this.className;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IfcVersion {

        @XmlAttribute(name = "version")
        protected String version;
        @XmlAttribute(name = "schema")
        protected String schema;

        /**
         * Ruft den Wert der version-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Legt den Wert der version-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Ruft den Wert der schema-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchema() {
            return schema;
        }

        /**
         * Legt den Wert der schema-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchema(String value) {
            this.schema = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PropertyDef" type="{}PropertyDef" maxOccurs="unbounded" minOccurs="0"/>
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
        "propertyDef"
    })
    public static class PropertyDefs {

        @XmlElement(name = "PropertyDef")
        protected List<PropertyDef> propertyDef;

        /**
         * Gets the value of the propertyDef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyDef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyDef }
         * 
         * 
         */
        public List<PropertyDef> getPropertyDef() {
            if (propertyDef == null) {
                propertyDef = new ArrayList<PropertyDef>();
            }
            return this.propertyDef;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PsetDefinitionAlias" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "psetDefinitionAlias"
    })
    public static class PsetDefinitionAliases {

        @XmlElement(name = "PsetDefinitionAlias")
        protected List<PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias> psetDefinitionAlias;

        /**
         * Gets the value of the psetDefinitionAlias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the psetDefinitionAlias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPsetDefinitionAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias }
         * 
         * 
         */
        public List<PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias> getPsetDefinitionAlias() {
            if (psetDefinitionAlias == null) {
                psetDefinitionAlias = new ArrayList<PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias>();
            }
            return this.psetDefinitionAlias;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class PsetDefinitionAlias {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang")
            protected String lang;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der lang-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Legt den Wert der lang-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }

}
