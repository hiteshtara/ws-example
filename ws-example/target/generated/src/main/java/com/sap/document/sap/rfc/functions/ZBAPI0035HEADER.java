
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Header data for grant master creation
 * 					
 * 
 * <p>Java class for ZBAPI0035HEADER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035HEADER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GRANT_NBR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARENT_TRANSACTION_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRANT_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_REFERENCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INT_REFERENCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPONSOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMP_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRANT_CURR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRANT_CURR_ISO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFECYCLE_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USER_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALID_FROM" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="VALID_TO" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="VALID_FROM_BUDGET" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="VALID_TO_BUDGET" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZBAPI0035HEADER", propOrder = {
    "grantnbr",
    "parenttransactiontype",
    "granttype",
    "extreference",
    "intreference",
    "sponsor",
    "compcode",
    "grantcurr",
    "grantcurriso",
    "lifecyclestatus",
    "userstatus",
    "validfrom",
    "validto",
    "validfrombudget",
    "validtobudget"
})
public class ZBAPI0035HEADER {

    @XmlElement(name = "GRANT_NBR")
    protected String grantnbr;
    @XmlElement(name = "PARENT_TRANSACTION_TYPE")
    protected String parenttransactiontype;
    @XmlElement(name = "GRANT_TYPE")
    protected String granttype;
    @XmlElement(name = "EXT_REFERENCE")
    protected String extreference;
    @XmlElement(name = "INT_REFERENCE")
    protected String intreference;
    @XmlElement(name = "SPONSOR")
    protected String sponsor;
    @XmlElement(name = "COMP_CODE")
    protected String compcode;
    @XmlElement(name = "GRANT_CURR")
    protected String grantcurr;
    @XmlElement(name = "GRANT_CURR_ISO")
    protected String grantcurriso;
    @XmlElement(name = "LIFECYCLE_STATUS")
    protected String lifecyclestatus;
    @XmlElement(name = "USER_STATUS")
    protected String userstatus;
    @XmlElement(name = "VALID_FROM")
    protected String validfrom;
    @XmlElement(name = "VALID_TO")
    protected String validto;
    @XmlElement(name = "VALID_FROM_BUDGET")
    protected String validfrombudget;
    @XmlElement(name = "VALID_TO_BUDGET")
    protected String validtobudget;

    /**
     * Gets the value of the grantnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANTNBR() {
        return grantnbr;
    }

    /**
     * Sets the value of the grantnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANTNBR(String value) {
        this.grantnbr = value;
    }

    /**
     * Gets the value of the parenttransactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTTRANSACTIONTYPE() {
        return parenttransactiontype;
    }

    /**
     * Sets the value of the parenttransactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTTRANSACTIONTYPE(String value) {
        this.parenttransactiontype = value;
    }

    /**
     * Gets the value of the granttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANTTYPE() {
        return granttype;
    }

    /**
     * Sets the value of the granttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANTTYPE(String value) {
        this.granttype = value;
    }

    /**
     * Gets the value of the extreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTREFERENCE() {
        return extreference;
    }

    /**
     * Sets the value of the extreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTREFERENCE(String value) {
        this.extreference = value;
    }

    /**
     * Gets the value of the intreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREFERENCE() {
        return intreference;
    }

    /**
     * Sets the value of the intreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREFERENCE(String value) {
        this.intreference = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPONSOR() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPONSOR(String value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the compcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPCODE() {
        return compcode;
    }

    /**
     * Sets the value of the compcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPCODE(String value) {
        this.compcode = value;
    }

    /**
     * Gets the value of the grantcurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANTCURR() {
        return grantcurr;
    }

    /**
     * Sets the value of the grantcurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANTCURR(String value) {
        this.grantcurr = value;
    }

    /**
     * Gets the value of the grantcurriso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANTCURRISO() {
        return grantcurriso;
    }

    /**
     * Sets the value of the grantcurriso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANTCURRISO(String value) {
        this.grantcurriso = value;
    }

    /**
     * Gets the value of the lifecyclestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFECYCLESTATUS() {
        return lifecyclestatus;
    }

    /**
     * Sets the value of the lifecyclestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFECYCLESTATUS(String value) {
        this.lifecyclestatus = value;
    }

    /**
     * Gets the value of the userstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERSTATUS() {
        return userstatus;
    }

    /**
     * Sets the value of the userstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERSTATUS(String value) {
        this.userstatus = value;
    }

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDFROM() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDFROM(String value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the validto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDTO() {
        return validto;
    }

    /**
     * Sets the value of the validto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDTO(String value) {
        this.validto = value;
    }

    /**
     * Gets the value of the validfrombudget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDFROMBUDGET() {
        return validfrombudget;
    }

    /**
     * Sets the value of the validfrombudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDFROMBUDGET(String value) {
        this.validfrombudget = value;
    }

    /**
     * Gets the value of the validtobudget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDTOBUDGET() {
        return validtobudget;
    }

    /**
     * Sets the value of the validtobudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDTOBUDGET(String value) {
        this.validtobudget = value;
    }

}
