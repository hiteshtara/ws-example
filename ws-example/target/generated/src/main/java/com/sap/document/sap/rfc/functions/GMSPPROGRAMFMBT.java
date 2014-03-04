
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sponsored Program Master Data - Budget Transfer
 * 						Objects
 * 
 * <p>Java class for GMSPPROGRAM_FMBT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMSPPROGRAM_FMBT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLIENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPONSORED_PROG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FM_AREA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FUNDS_CENTER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FUNCTIONAL_AREA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEASURE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DEFAULT_BUDGET" minOccurs="0">
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
@XmlType(name = "GMSPPROGRAM_FMBT", propOrder = {
    "client",
    "sponsoredprog",
    "fmarea",
    "fundscenter",
    "functionalarea",
    "measure",
    "defaultbudget"
})
public class GMSPPROGRAMFMBT {

    @XmlElement(name = "CLIENT")
    protected String client;
    @XmlElement(name = "SPONSORED_PROG")
    protected String sponsoredprog;
    @XmlElement(name = "FM_AREA")
    protected String fmarea;
    @XmlElement(name = "FUNDS_CENTER")
    protected String fundscenter;
    @XmlElement(name = "FUNCTIONAL_AREA")
    protected String functionalarea;
    @XmlElement(name = "MEASURE")
    protected String measure;
    @XmlElement(name = "DEFAULT_BUDGET")
    protected String defaultbudget;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENT() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENT(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the sponsoredprog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPONSOREDPROG() {
        return sponsoredprog;
    }

    /**
     * Sets the value of the sponsoredprog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPONSOREDPROG(String value) {
        this.sponsoredprog = value;
    }

    /**
     * Gets the value of the fmarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMAREA() {
        return fmarea;
    }

    /**
     * Sets the value of the fmarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMAREA(String value) {
        this.fmarea = value;
    }

    /**
     * Gets the value of the fundscenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDSCENTER() {
        return fundscenter;
    }

    /**
     * Sets the value of the fundscenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDSCENTER(String value) {
        this.fundscenter = value;
    }

    /**
     * Gets the value of the functionalarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONALAREA() {
        return functionalarea;
    }

    /**
     * Sets the value of the functionalarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONALAREA(String value) {
        this.functionalarea = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEASURE() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEASURE(String value) {
        this.measure = value;
    }

    /**
     * Gets the value of the defaultbudget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTBUDGET() {
        return defaultbudget;
    }

    /**
     * Sets the value of the defaultbudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTBUDGET(String value) {
        this.defaultbudget = value;
    }

}
