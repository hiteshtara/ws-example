
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grant master sponsored objects
 * 					
 * 
 * <p>Java class for ZBAPI0035SPONSOREDOBJECTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035SPONSOREDOBJECTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FUND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
 *         &lt;element name="SPONSORED_CLASS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLAN_ALLOWED" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUDGET_ALLOWED" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTUALS_ALLOWED" minOccurs="0">
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
@XmlType(name = "ZBAPI0035SPONSOREDOBJECTS", propOrder = {
    "fund",
    "sponsoredprog",
    "sponsoredclass",
    "planallowed",
    "budgetallowed",
    "actualsallowed"
})
public class ZBAPI0035SPONSOREDOBJECTS {

    @XmlElement(name = "FUND")
    protected String fund;
    @XmlElement(name = "SPONSORED_PROG")
    protected String sponsoredprog;
    @XmlElement(name = "SPONSORED_CLASS")
    protected String sponsoredclass;
    @XmlElement(name = "PLAN_ALLOWED")
    protected String planallowed;
    @XmlElement(name = "BUDGET_ALLOWED")
    protected String budgetallowed;
    @XmlElement(name = "ACTUALS_ALLOWED")
    protected String actualsallowed;

    /**
     * Gets the value of the fund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUND() {
        return fund;
    }

    /**
     * Sets the value of the fund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUND(String value) {
        this.fund = value;
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
     * Gets the value of the sponsoredclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPONSOREDCLASS() {
        return sponsoredclass;
    }

    /**
     * Sets the value of the sponsoredclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPONSOREDCLASS(String value) {
        this.sponsoredclass = value;
    }

    /**
     * Gets the value of the planallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANALLOWED() {
        return planallowed;
    }

    /**
     * Sets the value of the planallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANALLOWED(String value) {
        this.planallowed = value;
    }

    /**
     * Gets the value of the budgetallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDGETALLOWED() {
        return budgetallowed;
    }

    /**
     * Sets the value of the budgetallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDGETALLOWED(String value) {
        this.budgetallowed = value;
    }

    /**
     * Gets the value of the actualsallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTUALSALLOWED() {
        return actualsallowed;
    }

    /**
     * Sets the value of the actualsallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTUALSALLOWED(String value) {
        this.actualsallowed = value;
    }

}
