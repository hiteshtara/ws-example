
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grant master budget validity
 * 
 * <p>Java class for ZBAPI0035BUDGETVALIDITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035BUDGETVALIDITY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BDGT_PHASE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RELEASE_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BDGT_VLDTY_NBR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FROM_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="TO_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="BLOCK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ZBAPI0035BUDGETVALIDITY", propOrder = {
    "bdgtphase",
    "releasestatus",
    "bdgtvldtynbr",
    "fromdate",
    "todate",
    "block"
})
public class ZBAPI0035BUDGETVALIDITY {

    @XmlElement(name = "BDGT_PHASE")
    protected String bdgtphase;
    @XmlElement(name = "RELEASE_STATUS")
    protected String releasestatus;
    @XmlElement(name = "BDGT_VLDTY_NBR")
    protected String bdgtvldtynbr;
    @XmlElement(name = "FROM_DATE")
    protected String fromdate;
    @XmlElement(name = "TO_DATE")
    protected String todate;
    @XmlElement(name = "BLOCK")
    protected String block;

    /**
     * Gets the value of the bdgtphase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDGTPHASE() {
        return bdgtphase;
    }

    /**
     * Sets the value of the bdgtphase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDGTPHASE(String value) {
        this.bdgtphase = value;
    }

    /**
     * Gets the value of the releasestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASESTATUS() {
        return releasestatus;
    }

    /**
     * Sets the value of the releasestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASESTATUS(String value) {
        this.releasestatus = value;
    }

    /**
     * Gets the value of the bdgtvldtynbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDGTVLDTYNBR() {
        return bdgtvldtynbr;
    }

    /**
     * Sets the value of the bdgtvldtynbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDGTVLDTYNBR(String value) {
        this.bdgtvldtynbr = value;
    }

    /**
     * Gets the value of the fromdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMDATE() {
        return fromdate;
    }

    /**
     * Sets the value of the fromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMDATE(String value) {
        this.fromdate = value;
    }

    /**
     * Gets the value of the todate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODATE() {
        return todate;
    }

    /**
     * Sets the value of the todate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODATE(String value) {
        this.todate = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCK() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCK(String value) {
        this.block = value;
    }

}
