
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sponsored Program Structure for KCRM interface
 * 					
 * 
 * <p>Java class for ZGMSPPROGRAMSTRUCTURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMSPPROGRAMSTRUCTURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPPROGRAM_UPDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPPROGRAM_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
 *         &lt;element name="VALIDATE_FMBT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALIDATE_FMBA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LD_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
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
 *         &lt;element name="CREATED_BY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREATED_ON" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="MODIFIED_BY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MODIFIED_ON" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ZZVALID_FROM" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ZZVALID_TO" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ZZSUBRECIPIENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZDOCNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZAWARDNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZREFERENCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZOFFCAMPUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESCRIPTION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTH_GROUP_DESCRIPTION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZORD_CAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OVERHEAD_KEY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BASE_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FRINGE_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUDGET_TDC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="23"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUDGET_FA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="23"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUSINESS_AREA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KCRM_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
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
 *         &lt;element name="PRIME_SPONSOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="T_RESPONSIBLE" type="{urn:sap-com:document:sap:rfc:functions}ZFI_GMSPRESPONSIBLE_TAB_KCRM" minOccurs="0"/>
 *         &lt;element name="T_GMSPPROGRAM_FMBT" type="{urn:sap-com:document:sap:rfc:functions}GMSPPROGRAM_FMBT_TT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZGMSPPROGRAMSTRUCTURE", propOrder = {
    "spprogramupdate",
    "spprogramnumber",
    "sponsoredprog",
    "validatefmbt",
    "validatefmba",
    "ldcode",
    "authgroup",
    "createdby",
    "createdon",
    "modifiedby",
    "modifiedon",
    "zzvalidfrom",
    "zzvalidto",
    "zzsubrecipient",
    "zzdocno",
    "zzawardno",
    "zzreference",
    "zzoffcampus",
    "description",
    "authgroupdescription",
    "zzordcat",
    "overheadkey",
    "basecode",
    "fringecode",
    "budgettdc",
    "budgetfa",
    "businessarea",
    "kcrmstatus",
    "sponsor",
    "primesponsor",
    "tresponsible",
    "tgmspprogramfmbt"
})
public class ZGMSPPROGRAMSTRUCTURE {

    @XmlElement(name = "SPPROGRAM_UPDATE")
    protected String spprogramupdate;
    @XmlElement(name = "SPPROGRAM_NUMBER")
    protected String spprogramnumber;
    @XmlElement(name = "SPONSORED_PROG")
    protected String sponsoredprog;
    @XmlElement(name = "VALIDATE_FMBT")
    protected String validatefmbt;
    @XmlElement(name = "VALIDATE_FMBA")
    protected String validatefmba;
    @XmlElement(name = "LD_CODE")
    protected String ldcode;
    @XmlElement(name = "AUTH_GROUP")
    protected String authgroup;
    @XmlElement(name = "CREATED_BY")
    protected String createdby;
    @XmlElement(name = "CREATED_ON")
    protected String createdon;
    @XmlElement(name = "MODIFIED_BY")
    protected String modifiedby;
    @XmlElement(name = "MODIFIED_ON")
    protected String modifiedon;
    @XmlElement(name = "ZZVALID_FROM")
    protected String zzvalidfrom;
    @XmlElement(name = "ZZVALID_TO")
    protected String zzvalidto;
    @XmlElement(name = "ZZSUBRECIPIENT")
    protected String zzsubrecipient;
    @XmlElement(name = "ZZDOCNO")
    protected String zzdocno;
    @XmlElement(name = "ZZAWARDNO")
    protected String zzawardno;
    @XmlElement(name = "ZZREFERENCE")
    protected String zzreference;
    @XmlElement(name = "ZZOFFCAMPUS")
    protected String zzoffcampus;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "AUTH_GROUP_DESCRIPTION")
    protected String authgroupdescription;
    @XmlElement(name = "ZZORD_CAT")
    protected String zzordcat;
    @XmlElement(name = "OVERHEAD_KEY")
    protected String overheadkey;
    @XmlElement(name = "BASE_CODE")
    protected String basecode;
    @XmlElement(name = "FRINGE_CODE")
    protected String fringecode;
    @XmlElement(name = "BUDGET_TDC")
    protected BigDecimal budgettdc;
    @XmlElement(name = "BUDGET_FA")
    protected BigDecimal budgetfa;
    @XmlElement(name = "BUSINESS_AREA")
    protected String businessarea;
    @XmlElement(name = "KCRM_STATUS")
    protected String kcrmstatus;
    @XmlElement(name = "SPONSOR")
    protected String sponsor;
    @XmlElement(name = "PRIME_SPONSOR")
    protected String primesponsor;
    @XmlElement(name = "T_RESPONSIBLE")
    protected ZFIGMSPRESPONSIBLETABKCRM tresponsible;
    @XmlElement(name = "T_GMSPPROGRAM_FMBT")
    protected GMSPPROGRAMFMBTTT tgmspprogramfmbt;

    /**
     * Gets the value of the spprogramupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPPROGRAMUPDATE() {
        return spprogramupdate;
    }

    /**
     * Sets the value of the spprogramupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPPROGRAMUPDATE(String value) {
        this.spprogramupdate = value;
    }

    /**
     * Gets the value of the spprogramnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPPROGRAMNUMBER() {
        return spprogramnumber;
    }

    /**
     * Sets the value of the spprogramnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPPROGRAMNUMBER(String value) {
        this.spprogramnumber = value;
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
     * Gets the value of the validatefmbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATEFMBT() {
        return validatefmbt;
    }

    /**
     * Sets the value of the validatefmbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATEFMBT(String value) {
        this.validatefmbt = value;
    }

    /**
     * Gets the value of the validatefmba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATEFMBA() {
        return validatefmba;
    }

    /**
     * Sets the value of the validatefmba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATEFMBA(String value) {
        this.validatefmba = value;
    }

    /**
     * Gets the value of the ldcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDCODE() {
        return ldcode;
    }

    /**
     * Sets the value of the ldcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDCODE(String value) {
        this.ldcode = value;
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
     * Gets the value of the createdby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATEDBY() {
        return createdby;
    }

    /**
     * Sets the value of the createdby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATEDBY(String value) {
        this.createdby = value;
    }

    /**
     * Gets the value of the createdon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATEDON() {
        return createdon;
    }

    /**
     * Sets the value of the createdon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATEDON(String value) {
        this.createdon = value;
    }

    /**
     * Gets the value of the modifiedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFIEDBY() {
        return modifiedby;
    }

    /**
     * Sets the value of the modifiedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFIEDBY(String value) {
        this.modifiedby = value;
    }

    /**
     * Gets the value of the modifiedon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFIEDON() {
        return modifiedon;
    }

    /**
     * Sets the value of the modifiedon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFIEDON(String value) {
        this.modifiedon = value;
    }

    /**
     * Gets the value of the zzvalidfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZVALIDFROM() {
        return zzvalidfrom;
    }

    /**
     * Sets the value of the zzvalidfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZVALIDFROM(String value) {
        this.zzvalidfrom = value;
    }

    /**
     * Gets the value of the zzvalidto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZVALIDTO() {
        return zzvalidto;
    }

    /**
     * Sets the value of the zzvalidto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZVALIDTO(String value) {
        this.zzvalidto = value;
    }

    /**
     * Gets the value of the zzsubrecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSUBRECIPIENT() {
        return zzsubrecipient;
    }

    /**
     * Sets the value of the zzsubrecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSUBRECIPIENT(String value) {
        this.zzsubrecipient = value;
    }

    /**
     * Gets the value of the zzdocno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZDOCNO() {
        return zzdocno;
    }

    /**
     * Sets the value of the zzdocno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZDOCNO(String value) {
        this.zzdocno = value;
    }

    /**
     * Gets the value of the zzawardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAWARDNO() {
        return zzawardno;
    }

    /**
     * Sets the value of the zzawardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAWARDNO(String value) {
        this.zzawardno = value;
    }

    /**
     * Gets the value of the zzreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZREFERENCE() {
        return zzreference;
    }

    /**
     * Sets the value of the zzreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZREFERENCE(String value) {
        this.zzreference = value;
    }

    /**
     * Gets the value of the zzoffcampus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZOFFCAMPUS() {
        return zzoffcampus;
    }

    /**
     * Sets the value of the zzoffcampus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZOFFCAMPUS(String value) {
        this.zzoffcampus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the authgroupdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHGROUPDESCRIPTION() {
        return authgroupdescription;
    }

    /**
     * Sets the value of the authgroupdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHGROUPDESCRIPTION(String value) {
        this.authgroupdescription = value;
    }

    /**
     * Gets the value of the zzordcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZORDCAT() {
        return zzordcat;
    }

    /**
     * Sets the value of the zzordcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZORDCAT(String value) {
        this.zzordcat = value;
    }

    /**
     * Gets the value of the overheadkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERHEADKEY() {
        return overheadkey;
    }

    /**
     * Sets the value of the overheadkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERHEADKEY(String value) {
        this.overheadkey = value;
    }

    /**
     * Gets the value of the basecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASECODE() {
        return basecode;
    }

    /**
     * Sets the value of the basecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASECODE(String value) {
        this.basecode = value;
    }

    /**
     * Gets the value of the fringecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRINGECODE() {
        return fringecode;
    }

    /**
     * Sets the value of the fringecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRINGECODE(String value) {
        this.fringecode = value;
    }

    /**
     * Gets the value of the budgettdc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBUDGETTDC() {
        return budgettdc;
    }

    /**
     * Sets the value of the budgettdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBUDGETTDC(BigDecimal value) {
        this.budgettdc = value;
    }

    /**
     * Gets the value of the budgetfa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBUDGETFA() {
        return budgetfa;
    }

    /**
     * Sets the value of the budgetfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBUDGETFA(BigDecimal value) {
        this.budgetfa = value;
    }

    /**
     * Gets the value of the businessarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSINESSAREA() {
        return businessarea;
    }

    /**
     * Sets the value of the businessarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSINESSAREA(String value) {
        this.businessarea = value;
    }

    /**
     * Gets the value of the kcrmstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCRMSTATUS() {
        return kcrmstatus;
    }

    /**
     * Sets the value of the kcrmstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCRMSTATUS(String value) {
        this.kcrmstatus = value;
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
     * Gets the value of the primesponsor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMESPONSOR() {
        return primesponsor;
    }

    /**
     * Sets the value of the primesponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMESPONSOR(String value) {
        this.primesponsor = value;
    }

    /**
     * Gets the value of the tresponsible property.
     * 
     * @return
     *     possible object is
     *     {@link ZFIGMSPRESPONSIBLETABKCRM }
     *     
     */
    public ZFIGMSPRESPONSIBLETABKCRM getTRESPONSIBLE() {
        return tresponsible;
    }

    /**
     * Sets the value of the tresponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZFIGMSPRESPONSIBLETABKCRM }
     *     
     */
    public void setTRESPONSIBLE(ZFIGMSPRESPONSIBLETABKCRM value) {
        this.tresponsible = value;
    }

    /**
     * Gets the value of the tgmspprogramfmbt property.
     * 
     * @return
     *     possible object is
     *     {@link GMSPPROGRAMFMBTTT }
     *     
     */
    public GMSPPROGRAMFMBTTT getTGMSPPROGRAMFMBT() {
        return tgmspprogramfmbt;
    }

    /**
     * Sets the value of the tgmspprogramfmbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMSPPROGRAMFMBTTT }
     *     
     */
    public void setTGMSPPROGRAMFMBT(GMSPPROGRAMFMBTTT value) {
        this.tgmspprogramfmbt = value;
    }

}
