package psd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import psd.PropertyType.TypePropertyEnumeratedValue;
import psd.PropertyType.TypePropertyEnumeratedValue.EnumList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enumListWithType", propOrder = {
	"dataType",
    "enumItem"
})
public class EnumListWithType extends PropertyType.TypePropertyEnumeratedValue.EnumList {

	@XmlElement(name = "DataType", required = true)
    protected DataType dataType;
	@XmlElement(name = "EnumItem")
    protected List<String> enumItem;
    @XmlAttribute(name = "name", required = true)
    protected String name;

	/**
     * Ruft den Wert der dataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Legt den Wert der dataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }
    
    /**
     * Gets the value of the enumItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnumItem() {
        if (enumItem == null) {
            enumItem = new ArrayList<String>();
        }
        return this.enumItem;
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
}
