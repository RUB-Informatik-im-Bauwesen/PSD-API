//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.22 um 01:19:51 PM CEST 
//


package psd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The element of reference select.
 * 
 * <p>Java-Klasse für ReferenceSelect complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSelect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="reftype">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="IfcMaterialDefinition"/>
 *             &lt;enumeration value="IfcPerson"/>
 *             &lt;enumeration value="IfcOrganization"/>
 *             &lt;enumeration value="IfcPersonAndOrganization"/>
 *             &lt;enumeration value="IfcExternalReference"/>
 *             &lt;enumeration value="IfcTimeSeries"/>
 *             &lt;enumeration value="IfcAddress"/>
 *             &lt;enumeration value="IfcAppliedValue"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="libraryname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sectionref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSelect")
@XmlSeeAlso({
    psd.PropertyType.TypePropertyReferenceValue.class
})
public class ReferenceSelect {

    @XmlAttribute(name = "reftype")
    protected String reftype;
    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "libraryname")
    protected String libraryname;
    @XmlAttribute(name = "sectionref")
    protected String sectionref;

    /**
     * Ruft den Wert der reftype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReftype() {
        return reftype;
    }

    /**
     * Legt den Wert der reftype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReftype(String value) {
        this.reftype = value;
    }

    /**
     * Ruft den Wert der guid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Legt den Wert der guid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der libraryname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryname() {
        return libraryname;
    }

    /**
     * Legt den Wert der libraryname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryname(String value) {
        this.libraryname = value;
    }

    /**
     * Ruft den Wert der sectionref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionref() {
        return sectionref;
    }

    /**
     * Legt den Wert der sectionref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionref(String value) {
        this.sectionref = value;
    }

}
