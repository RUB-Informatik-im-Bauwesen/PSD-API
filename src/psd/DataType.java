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
import javax.xml.bind.annotation.XmlType;


/**
 * The element of data type.
 * 
 * <p>Java-Klasse für DataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" default="IfcText">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="IfcAmountOfSubstanceMeasure"/>
 *             &lt;enumeration value="IfcAreaMeasure"/>
 *             &lt;enumeration value="IfcComplexNumber"/>
 *             &lt;enumeration value="IfcContextDependentMeasure"/>
 *             &lt;enumeration value="IfcCountMeasure"/>
 *             &lt;enumeration value="IfcDescriptiveMeasure"/>
 *             &lt;enumeration value="IfcElectricCurrentMeasure"/>
 *             &lt;enumeration value="IfcLengthMeasure"/>
 *             &lt;enumeration value="IfcLuminousIntensityMeasure"/>
 *             &lt;enumeration value="IfcMassMeasure"/>
 *             &lt;enumeration value="IfcNonNegativeLengthMeasure"/>
 *             &lt;enumeration value="IfcNormalisedRatioMeasure"/>
 *             &lt;enumeration value="IfcNumericMeasure"/>
 *             &lt;enumeration value="IfcParameterValue"/>
 *             &lt;enumeration value="IfcPlaneAngleMeasure"/>
 *             &lt;enumeration value="IfcPositiveLengthMeasure"/>
 *             &lt;enumeration value="IfcPositivePlaneAngleMeasure"/>
 *             &lt;enumeration value="IfcPositiveRatioMeasure"/>
 *             &lt;enumeration value="IfcRatioMeasure"/>
 *             &lt;enumeration value="IfcSolidAngleMeasure"/>
 *             &lt;enumeration value="IfcThermodynamicTemperatureMeasure"/>
 *             &lt;enumeration value="IfcTimeMeasure"/>
 *             &lt;enumeration value="IfcVolumeMeasure"/>
 *             &lt;enumeration value="IfcBoolean"/>
 *             &lt;enumeration value="IfcDate"/>
 *             &lt;enumeration value="IfcDateTime"/>
 *             &lt;enumeration value="IfcDuration"/>
 *             &lt;enumeration value="IfcIdentifier"/>
 *             &lt;enumeration value="IfcInteger"/>
 *             &lt;enumeration value="IfcLabel"/>
 *             &lt;enumeration value="IfcLogical"/>
 *             &lt;enumeration value="IfcReal"/>
 *             &lt;enumeration value="IfcText"/>
 *             &lt;enumeration value="IfcTime"/>
 *             &lt;enumeration value="IfcTimeStamp"/>
 *             &lt;enumeration value="IfcAbsorbedDoseMeasure"/>
 *             &lt;enumeration value="IfcAccelerationMeasure"/>
 *             &lt;enumeration value="IfcAngularVelocityMeasure"/>
 *             &lt;enumeration value="IfcAreaDensityMeasure"/>
 *             &lt;enumeration value="IfcCompoundPlaneAngleMeasure"/>
 *             &lt;enumeration value="IfcCurvatureMeasure"/>
 *             &lt;enumeration value="IfcDoseEquivalentMeasure"/>
 *             &lt;enumeration value="IfcDynamicViscosityMeasure"/>
 *             &lt;enumeration value="IfcElectricCapacitanceMeasure"/>
 *             &lt;enumeration value="IfcElectricChargeMeasure"/>
 *             &lt;enumeration value="IfcElectricConductanceMeasure"/>
 *             &lt;enumeration value="IfcElectricResistanceMeasure"/>
 *             &lt;enumeration value="IfcElectricVoltageMeasure"/>
 *             &lt;enumeration value="IfcEnergyMeasure"/>
 *             &lt;enumeration value="IfcForceMeasure"/>
 *             &lt;enumeration value="IfcFrequencyMeasure"/>
 *             &lt;enumeration value="IfcHeatFluxDensityMeasure"/>
 *             &lt;enumeration value="IfcHeatingValueMeasure"/>
 *             &lt;enumeration value="IfcIlluminanceMeasure"/>
 *             &lt;enumeration value="IfcInductanceMeasure"/>
 *             &lt;enumeration value="IfcIntegerCountRateMeasure"/>
 *             &lt;enumeration value="IfcIonConcentrationMeasure"/>
 *             &lt;enumeration value="IfcIsothermalMoistureCapacityMeasure"/>
 *             &lt;enumeration value="IfcKinematicViscosityMeasure"/>
 *             &lt;enumeration value="IfcLinearForceMeasure"/>
 *             &lt;enumeration value="IfcLinearMomentMeasure"/>
 *             &lt;enumeration value="IfcLinearStiffnessMeasure"/>
 *             &lt;enumeration value="IfcLinearVelocityMeasure"/>
 *             &lt;enumeration value="IfcLuminousFluxMeasure"/>
 *             &lt;enumeration value="IfcLuminousIntensityDistributionMeasure"/>
 *             &lt;enumeration value="IfcMagneticFluxDensityMeasure"/>
 *             &lt;enumeration value="IfcMagneticFluxMeasure"/>
 *             &lt;enumeration value="IfcMassDensityMeasure"/>
 *             &lt;enumeration value="IfcMassFlowRateMeasure"/>
 *             &lt;enumeration value="IfcMassPerLengthMeasure"/>
 *             &lt;enumeration value="IfcModulusOfElasticityMeasure"/>
 *             &lt;enumeration value="IfcModulusOfLinearSubgradeReactionMeasure"/>
 *             &lt;enumeration value="IfcModulusOfRotationalSubgradeReactionMeasure"/>
 *             &lt;enumeration value="IfcModulusOfSubgradeReactionMeasure"/>
 *             &lt;enumeration value="IfcMoistureDiffusivityMeasure"/>
 *             &lt;enumeration value="IfcMolecularWeightMeasure"/>
 *             &lt;enumeration value="IfcMomentOfInertiaMeasure"/>
 *             &lt;enumeration value="IfcMonetaryMeasure"/>
 *             &lt;enumeration value="IfcPHMeasure"/>
 *             &lt;enumeration value="IfcPlanarForceMeasure"/>
 *             &lt;enumeration value="IfcPowerMeasure"/>
 *             &lt;enumeration value="IfcPressureMeasure"/>
 *             &lt;enumeration value="IfcRadioActivityMeasure"/>
 *             &lt;enumeration value="IfcRotationalFrequencyMeasure"/>
 *             &lt;enumeration value="IfcRotationalMassMeasure"/>
 *             &lt;enumeration value="IfcRotationalStiffnessMeasure"/>
 *             &lt;enumeration value="IfcSectionModulusMeasure"/>
 *             &lt;enumeration value="IfcSectionalAreaIntegralMeasure"/>
 *             &lt;enumeration value="IfcShearModulusMeasure"/>
 *             &lt;enumeration value="IfcSoundPowerLevelMeasure"/>
 *             &lt;enumeration value="IfcSoundPowerMeasure"/>
 *             &lt;enumeration value="IfcSoundPressureLevelMeasure"/>
 *             &lt;enumeration value="IfcSoundPressureMeasure"/>
 *             &lt;enumeration value="IfcSpecificHeatCapacityMeasure"/>
 *             &lt;enumeration value="IfcTemperatureGradientMeasure"/>
 *             &lt;enumeration value="IfcTemperatureRateOfChangeMeasure"/>
 *             &lt;enumeration value="IfcThermalAdmittanceMeasure"/>
 *             &lt;enumeration value="IfcThermalConductivityMeasure"/>
 *             &lt;enumeration value="IfcThermalExpansionCoefficientMeasure"/>
 *             &lt;enumeration value="IfcThermalResistanceMeasure"/>
 *             &lt;enumeration value="IfcThermalTransmittanceMeasure"/>
 *             &lt;enumeration value="IfcTorqueMeasure"/>
 *             &lt;enumeration value="IfcVaporPermeabilityMeasure"/>
 *             &lt;enumeration value="IfcVolumetricFlowRateMeasure"/>
 *             &lt;enumeration value="IfcWarpingConstantMeasure"/>
 *             &lt;enumeration value="IfcWarpingMomentMeasure"/>
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
@XmlType(name = "DataType")
public class DataType {

    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "IfcText";
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
