
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional data for grant master creation
 * 					
 * 
 * <p>Java class for ZBAPI0035HEADERADD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035HEADERADD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLING_RULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SALESORG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTR_CHAN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIVISION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBS_ELEMENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORDERID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INSTALLMENT_AMT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="23"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MILESTONE_TOTAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="23"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTH_GROUP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AWARD_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRANT_TOTAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="23"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFDA_NBR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXCHANGE_RATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXCHANGE_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="FROM_FACTOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TO_FACTOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FY_VARIANT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDC_RULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPLITTING_RULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CS_RULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FUNDING_ORIGIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLOCKING_IND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRE_AWARD_COSTS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LETTER_OF_CREDIT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAYMENT_RULE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CS_RATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="3"/>
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
@XmlType(name = "ZBAPI0035HEADERADD", propOrder = {
    "billingrule",
    "salesorg",
    "distrchan",
    "division",
    "wbselement",
    "orderid",
    "installmentamt",
    "milestonetotal",
    "authgroup",
    "awardtype",
    "granttotal",
    "cfdanbr",
    "exchangerate",
    "exchangedate",
    "fromfactor",
    "tofactor",
    "fyvariant",
    "idcrule",
    "splittingrule",
    "csrule",
    "fundingorigin",
    "blockingind",
    "preawardcosts",
    "letterofcredit",
    "paymentrule",
    "csrate"
})
public class ZBAPI0035HEADERADD {

    @XmlElement(name = "BILLING_RULE")
    protected String billingrule;
    @XmlElement(name = "SALESORG")
    protected String salesorg;
    @XmlElement(name = "DISTR_CHAN")
    protected String distrchan;
    @XmlElement(name = "DIVISION")
    protected String division;
    @XmlElement(name = "WBS_ELEMENT")
    protected String wbselement;
    @XmlElement(name = "ORDERID")
    protected String orderid;
    @XmlElement(name = "INSTALLMENT_AMT")
    protected BigDecimal installmentamt;
    @XmlElement(name = "MILESTONE_TOTAL")
    protected BigDecimal milestonetotal;
    @XmlElement(name = "AUTH_GROUP")
    protected String authgroup;
    @XmlElement(name = "AWARD_TYPE")
    protected String awardtype;
    @XmlElement(name = "GRANT_TOTAL")
    protected BigDecimal granttotal;
    @XmlElement(name = "CFDA_NBR")
    protected String cfdanbr;
    @XmlElement(name = "EXCHANGE_RATE")
    protected BigDecimal exchangerate;
    @XmlElement(name = "EXCHANGE_DATE")
    protected String exchangedate;
    @XmlElement(name = "FROM_FACTOR")
    protected BigDecimal fromfactor;
    @XmlElement(name = "TO_FACTOR")
    protected BigDecimal tofactor;
    @XmlElement(name = "FY_VARIANT")
    protected String fyvariant;
    @XmlElement(name = "IDC_RULE")
    protected String idcrule;
    @XmlElement(name = "SPLITTING_RULE")
    protected String splittingrule;
    @XmlElement(name = "CS_RULE")
    protected String csrule;
    @XmlElement(name = "FUNDING_ORIGIN")
    protected String fundingorigin;
    @XmlElement(name = "BLOCKING_IND")
    protected String blockingind;
    @XmlElement(name = "PRE_AWARD_COSTS")
    protected String preawardcosts;
    @XmlElement(name = "LETTER_OF_CREDIT")
    protected String letterofcredit;
    @XmlElement(name = "PAYMENT_RULE")
    protected String paymentrule;
    @XmlElement(name = "CS_RATE")
    protected BigDecimal csrate;

    /**
     * Gets the value of the billingrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLINGRULE() {
        return billingrule;
    }

    /**
     * Sets the value of the billingrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLINGRULE(String value) {
        this.billingrule = value;
    }

    /**
     * Gets the value of the salesorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALESORG() {
        return salesorg;
    }

    /**
     * Sets the value of the salesorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALESORG(String value) {
        this.salesorg = value;
    }

    /**
     * Gets the value of the distrchan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRCHAN() {
        return distrchan;
    }

    /**
     * Sets the value of the distrchan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRCHAN(String value) {
        this.distrchan = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVISION() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVISION(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the wbselement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSELEMENT() {
        return wbselement;
    }

    /**
     * Sets the value of the wbselement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSELEMENT(String value) {
        this.wbselement = value;
    }

    /**
     * Gets the value of the orderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERID() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERID(String value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the installmentamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINSTALLMENTAMT() {
        return installmentamt;
    }

    /**
     * Sets the value of the installmentamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINSTALLMENTAMT(BigDecimal value) {
        this.installmentamt = value;
    }

    /**
     * Gets the value of the milestonetotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMILESTONETOTAL() {
        return milestonetotal;
    }

    /**
     * Sets the value of the milestonetotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMILESTONETOTAL(BigDecimal value) {
        this.milestonetotal = value;
    }

    /**
     * Gets the value of the authgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHGROUP() {
        return authgroup;
    }

    /**
     * Sets the value of the authgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHGROUP(String value) {
        this.authgroup = value;
    }

    /**
     * Gets the value of the awardtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWARDTYPE() {
        return awardtype;
    }

    /**
     * Sets the value of the awardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWARDTYPE(String value) {
        this.awardtype = value;
    }

    /**
     * Gets the value of the granttotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGRANTTOTAL() {
        return granttotal;
    }

    /**
     * Sets the value of the granttotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGRANTTOTAL(BigDecimal value) {
        this.granttotal = value;
    }

    /**
     * Gets the value of the cfdanbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDANBR() {
        return cfdanbr;
    }

    /**
     * Sets the value of the cfdanbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDANBR(String value) {
        this.cfdanbr = value;
    }

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXCHANGERATE(BigDecimal value) {
        this.exchangerate = value;
    }

    /**
     * Gets the value of the exchangedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCHANGEDATE() {
        return exchangedate;
    }

    /**
     * Sets the value of the exchangedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCHANGEDATE(String value) {
        this.exchangedate = value;
    }

    /**
     * Gets the value of the fromfactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFROMFACTOR() {
        return fromfactor;
    }

    /**
     * Sets the value of the fromfactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFROMFACTOR(BigDecimal value) {
        this.fromfactor = value;
    }

    /**
     * Gets the value of the tofactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOFACTOR() {
        return tofactor;
    }

    /**
     * Sets the value of the tofactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOFACTOR(BigDecimal value) {
        this.tofactor = value;
    }

    /**
     * Gets the value of the fyvariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFYVARIANT() {
        return fyvariant;
    }

    /**
     * Sets the value of the fyvariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFYVARIANT(String value) {
        this.fyvariant = value;
    }

    /**
     * Gets the value of the idcrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCRULE() {
        return idcrule;
    }

    /**
     * Sets the value of the idcrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCRULE(String value) {
        this.idcrule = value;
    }

    /**
     * Gets the value of the splittingrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPLITTINGRULE() {
        return splittingrule;
    }

    /**
     * Sets the value of the splittingrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPLITTINGRULE(String value) {
        this.splittingrule = value;
    }

    /**
     * Gets the value of the csrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSRULE() {
        return csrule;
    }

    /**
     * Sets the value of the csrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSRULE(String value) {
        this.csrule = value;
    }

    /**
     * Gets the value of the fundingorigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDINGORIGIN() {
        return fundingorigin;
    }

    /**
     * Sets the value of the fundingorigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDINGORIGIN(String value) {
        this.fundingorigin = value;
    }

    /**
     * Gets the value of the blockingind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCKINGIND() {
        return blockingind;
    }

    /**
     * Sets the value of the blockingind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCKINGIND(String value) {
        this.blockingind = value;
    }

    /**
     * Gets the value of the preawardcosts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREAWARDCOSTS() {
        return preawardcosts;
    }

    /**
     * Sets the value of the preawardcosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREAWARDCOSTS(String value) {
        this.preawardcosts = value;
    }

    /**
     * Gets the value of the letterofcredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLETTEROFCREDIT() {
        return letterofcredit;
    }

    /**
     * Sets the value of the letterofcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLETTEROFCREDIT(String value) {
        this.letterofcredit = value;
    }

    /**
     * Gets the value of the paymentrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTRULE() {
        return paymentrule;
    }

    /**
     * Sets the value of the paymentrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTRULE(String value) {
        this.paymentrule = value;
    }

    /**
     * Gets the value of the csrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCSRATE() {
        return csrate;
    }

    /**
     * Sets the value of the csrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCSRATE(BigDecimal value) {
        this.csrate = value;
    }

}
