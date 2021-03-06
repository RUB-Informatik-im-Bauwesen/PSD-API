//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.22 um 01:19:51 PM CEST 
//


package psd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PropertyDefNameAliases_QNAME = new QName("", "NameAliases");
    private final static QName _PropertyDefDefinitionAliases_QNAME = new QName("", "DefinitionAliases");
    private final static QName _PropertyDefValueDef_QNAME = new QName("", "ValueDef");
    private final static QName _PropertyDefDefinition_QNAME = new QName("", "Definition");
    private final static QName _PropertyDefPropertyType_QNAME = new QName("", "PropertyType");
    private final static QName _PropertyDefName_QNAME = new QName("", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertySetDef }
     * 
     */
    public PropertySetDef createPropertySetDef() {
        return new PropertySetDef();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyListValue }
     * 
     */
    public PropertyType.TypePropertyListValue createPropertyTypeTypePropertyListValue() {
        return new PropertyType.TypePropertyListValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyTableValue }
     * 
     */
    public PropertyType.TypePropertyTableValue createPropertyTypeTypePropertyTableValue() {
        return new PropertyType.TypePropertyTableValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyBoundedValue }
     * 
     */
    public PropertyType.TypePropertyBoundedValue createPropertyTypeTypePropertyBoundedValue() {
        return new PropertyType.TypePropertyBoundedValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef }
     * 
     */
    public PropertyType.TypePropertyBoundedValue.ValueRangeDef createPropertyTypeTypePropertyBoundedValueValueRangeDef() {
        return new PropertyType.TypePropertyBoundedValue.ValueRangeDef();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyEnumeratedValue }
     * 
     */
    public PropertyType.TypePropertyEnumeratedValue createPropertyTypeTypePropertyEnumeratedValue() {
        return new PropertyType.TypePropertyEnumeratedValue();
    }

    /**
     * Create an instance of {@link PropertyDef }
     * 
     */
    public PropertyDef createPropertyDef() {
        return new PropertyDef();
    }

    /**
     * Create an instance of {@link PropertyDef.DefinitionAliases }
     * 
     */
    public PropertyDef.DefinitionAliases createPropertyDefDefinitionAliases() {
        return new PropertyDef.DefinitionAliases();
    }

    /**
     * Create an instance of {@link PropertyDef.NameAliases }
     * 
     */
    public PropertyDef.NameAliases createPropertyDefNameAliases() {
        return new PropertyDef.NameAliases();
    }

    /**
     * Create an instance of {@link PropertyDef.ValueDef }
     * 
     */
    public PropertyDef.ValueDef createPropertyDefValueDef() {
        return new PropertyDef.ValueDef();
    }

    /**
     * Create an instance of {@link PropertySetDef.PsetDefinitionAliases }
     * 
     */
    public PropertySetDef.PsetDefinitionAliases createPropertySetDefPsetDefinitionAliases() {
        return new PropertySetDef.PsetDefinitionAliases();
    }

    /**
     * Create an instance of {@link PropertySetDef.IfcVersion }
     * 
     */
    public PropertySetDef.IfcVersion createPropertySetDefIfcVersion() {
        return new PropertySetDef.IfcVersion();
    }

    /**
     * Create an instance of {@link PropertySetDef.ApplicableClasses }
     * 
     */
    public PropertySetDef.ApplicableClasses createPropertySetDefApplicableClasses() {
        return new PropertySetDef.ApplicableClasses();
    }

    /**
     * Create an instance of {@link PropertySetDef.PropertyDefs }
     * 
     */
    public PropertySetDef.PropertyDefs createPropertySetDefPropertyDefs() {
        return new PropertySetDef.PropertyDefs();
    }

    /**
     * Create an instance of {@link UnitType }
     * 
     */
    public UnitType createUnitType() {
        return new UnitType();
    }

    /**
     * Create an instance of {@link Values }
     * 
     */
    public Values createValues() {
        return new Values();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link ReferenceSelect }
     * 
     */
    public ReferenceSelect createReferenceSelect() {
        return new ReferenceSelect();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertySingleValue }
     * 
     */
    public PropertyType.TypePropertySingleValue createPropertyTypeTypePropertySingleValue() {
        return new PropertyType.TypePropertySingleValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyReferenceValue }
     * 
     */
    public PropertyType.TypePropertyReferenceValue createPropertyTypeTypePropertyReferenceValue() {
        return new PropertyType.TypePropertyReferenceValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypeComplexProperty }
     * 
     */
    public PropertyType.TypeComplexProperty createPropertyTypeTypeComplexProperty() {
        return new PropertyType.TypeComplexProperty();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyListValue.ListValue }
     * 
     */
    public PropertyType.TypePropertyListValue.ListValue createPropertyTypeTypePropertyListValueListValue() {
        return new PropertyType.TypePropertyListValue.ListValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyTableValue.DefiningValue }
     * 
     */
    public PropertyType.TypePropertyTableValue.DefiningValue createPropertyTypeTypePropertyTableValueDefiningValue() {
        return new PropertyType.TypePropertyTableValue.DefiningValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyTableValue.DefinedValue }
     * 
     */
    public PropertyType.TypePropertyTableValue.DefinedValue createPropertyTypeTypePropertyTableValueDefinedValue() {
        return new PropertyType.TypePropertyTableValue.DefinedValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue }
     * 
     */
    public PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue createPropertyTypeTypePropertyBoundedValueValueRangeDefLowerBoundValue() {
        return new PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue }
     * 
     */
    public PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue createPropertyTypeTypePropertyBoundedValueValueRangeDefUpperBoundValue() {
        return new PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue();
    }

    /**
     * Create an instance of {@link PropertyType.TypePropertyEnumeratedValue.EnumList }
     * 
     */
    public PropertyType.TypePropertyEnumeratedValue.EnumList createPropertyTypeTypePropertyEnumeratedValueEnumList() {
        return new PropertyType.TypePropertyEnumeratedValue.EnumList();
    }

    /**
     * Create an instance of {@link PropertyDef.DefinitionAliases.DefinitionAlias }
     * 
     */
    public PropertyDef.DefinitionAliases.DefinitionAlias createPropertyDefDefinitionAliasesDefinitionAlias() {
        return new PropertyDef.DefinitionAliases.DefinitionAlias();
    }

    /**
     * Create an instance of {@link PropertyDef.NameAliases.NameAlias }
     * 
     */
    public PropertyDef.NameAliases.NameAlias createPropertyDefNameAliasesNameAlias() {
        return new PropertyDef.NameAliases.NameAlias();
    }

    /**
     * Create an instance of {@link PropertyDef.ValueDef.MinValue }
     * 
     */
    public PropertyDef.ValueDef.MinValue createPropertyDefValueDefMinValue() {
        return new PropertyDef.ValueDef.MinValue();
    }

    /**
     * Create an instance of {@link PropertyDef.ValueDef.MaxValue }
     * 
     */
    public PropertyDef.ValueDef.MaxValue createPropertyDefValueDefMaxValue() {
        return new PropertyDef.ValueDef.MaxValue();
    }

    /**
     * Create an instance of {@link PropertyDef.ValueDef.DefaultValue }
     * 
     */
    public PropertyDef.ValueDef.DefaultValue createPropertyDefValueDefDefaultValue() {
        return new PropertyDef.ValueDef.DefaultValue();
    }

    /**
     * Create an instance of {@link PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias }
     * 
     */
    public PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias createPropertySetDefPsetDefinitionAliasesPsetDefinitionAlias() {
        return new PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyDef.NameAliases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NameAliases", scope = PropertyDef.class)
    public JAXBElement<PropertyDef.NameAliases> createPropertyDefNameAliases(PropertyDef.NameAliases value) {
        return new JAXBElement<PropertyDef.NameAliases>(_PropertyDefNameAliases_QNAME, PropertyDef.NameAliases.class, PropertyDef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyDef.DefinitionAliases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DefinitionAliases", scope = PropertyDef.class)
    public JAXBElement<PropertyDef.DefinitionAliases> createPropertyDefDefinitionAliases(PropertyDef.DefinitionAliases value) {
        return new JAXBElement<PropertyDef.DefinitionAliases>(_PropertyDefDefinitionAliases_QNAME, PropertyDef.DefinitionAliases.class, PropertyDef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyDef.ValueDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ValueDef", scope = PropertyDef.class)
    public JAXBElement<PropertyDef.ValueDef> createPropertyDefValueDef(PropertyDef.ValueDef value) {
        return new JAXBElement<PropertyDef.ValueDef>(_PropertyDefValueDef_QNAME, PropertyDef.ValueDef.class, PropertyDef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Definition", scope = PropertyDef.class)
    public JAXBElement<String> createPropertyDefDefinition(String value) {
        return new JAXBElement<String>(_PropertyDefDefinition_QNAME, String.class, PropertyDef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PropertyType", scope = PropertyDef.class)
    public JAXBElement<PropertyType> createPropertyDefPropertyType(PropertyType value) {
        return new JAXBElement<PropertyType>(_PropertyDefPropertyType_QNAME, PropertyType.class, PropertyDef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name", scope = PropertyDef.class)
    public JAXBElement<String> createPropertyDefName(String value) {
        return new JAXBElement<String>(_PropertyDefName_QNAME, String.class, PropertyDef.class, value);
    }

}
