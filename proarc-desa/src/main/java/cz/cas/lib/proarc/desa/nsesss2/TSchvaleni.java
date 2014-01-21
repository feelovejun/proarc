//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.21 at 01:10:09 AM CET 
//


package cz.cas.lib.proarc.desa.nsesss2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sada elementů pro popis individuálního procesu schválení entity.
 * 
 * <p>Java class for tSchvaleni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSchvaleni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatumSchvaleni" type="{http://www.mvcr.cz/nsesss/v2}tDatum"/>
 *         &lt;element name="Schvalovatel" type="{http://www.mvcr.cz/nsesss/v2}tOsobaInterni"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSchvaleni", namespace = "http://www.mvcr.cz/nsesss/v2", propOrder = {
    "datumSchvaleni",
    "schvalovatel"
})
public class TSchvaleni {

    @XmlElement(name = "DatumSchvaleni", namespace = "http://www.mvcr.cz/nsesss/v2", required = true)
    protected TDatum datumSchvaleni;
    @XmlElement(name = "Schvalovatel", namespace = "http://www.mvcr.cz/nsesss/v2", required = true)
    protected TOsobaInterni schvalovatel;

    /**
     * Gets the value of the datumSchvaleni property.
     * 
     * @return
     *     possible object is
     *     {@link TDatum }
     *     
     */
    public TDatum getDatumSchvaleni() {
        return datumSchvaleni;
    }

    /**
     * Sets the value of the datumSchvaleni property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDatum }
     *     
     */
    public void setDatumSchvaleni(TDatum value) {
        this.datumSchvaleni = value;
    }

    /**
     * Gets the value of the schvalovatel property.
     * 
     * @return
     *     possible object is
     *     {@link TOsobaInterni }
     *     
     */
    public TOsobaInterni getSchvalovatel() {
        return schvalovatel;
    }

    /**
     * Sets the value of the schvalovatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOsobaInterni }
     *     
     */
    public void setSchvalovatel(TOsobaInterni value) {
        this.schvalovatel = value;
    }

}