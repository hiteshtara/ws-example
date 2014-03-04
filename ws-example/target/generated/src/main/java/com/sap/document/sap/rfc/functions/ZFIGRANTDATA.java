
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional fields for Grant Master
 * 					
 * 
 * <p>Java class for ZFIGRANTDATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZFIGRANTDATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZZINVOICE_FREQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZINVOICE_FORM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZADV_PYMNT_IND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZLD_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZMJR_PRJCT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZPRPRTY_OWNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZCOST_SHARE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZAVC_TOLERANCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZNSF_CTGRY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZA133_CLSTR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZAWARD_TITLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZFUND_CENTER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZINT_EARNED" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZPROJ_BEGDA" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ZZPROJ_ENDDA" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ZZAWARDNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZSPONSOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZINVOICE_CODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZMAIN_SPONSOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZZBILL_PARTNER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
@XmlType(name = "ZFIGRANTDATA", propOrder = {
    "zzinvoicefreq",
    "zzinvoiceform",
    "zzadvpymntind",
    "zzldcode",
    "zzmjrprjct",
    "zzprprtyownr",
    "zzcostshare",
    "zzavctolerance",
    "zznsfctgry",
    "zza133CLSTR",
    "zzawardtitle",
    "zzfundcenter",
    "zzintearned",
    "zzprojbegda",
    "zzprojendda",
    "zzawardno",
    "zzsponsor",
    "zzinvoicecode",
    "zzmainsponsor",
    "zzbillpartner"
})
public class ZFIGRANTDATA {

    @XmlElement(name = "ZZINVOICE_FREQ")
    protected String zzinvoicefreq;
    @XmlElement(name = "ZZINVOICE_FORM")
    protected String zzinvoiceform;
    @XmlElement(name = "ZZADV_PYMNT_IND")
    protected String zzadvpymntind;
    @XmlElement(name = "ZZLD_CODE")
    protected String zzldcode;
    @XmlElement(name = "ZZMJR_PRJCT")
    protected String zzmjrprjct;
    @XmlElement(name = "ZZPRPRTY_OWNR")
    protected String zzprprtyownr;
    @XmlElement(name = "ZZCOST_SHARE")
    protected String zzcostshare;
    @XmlElement(name = "ZZAVC_TOLERANCE")
    protected String zzavctolerance;
    @XmlElement(name = "ZZNSF_CTGRY")
    protected String zznsfctgry;
    @XmlElement(name = "ZZA133_CLSTR")
    protected String zza133CLSTR;
    @XmlElement(name = "ZZAWARD_TITLE")
    protected String zzawardtitle;
    @XmlElement(name = "ZZFUND_CENTER")
    protected String zzfundcenter;
    @XmlElement(name = "ZZINT_EARNED")
    protected String zzintearned;
    @XmlElement(name = "ZZPROJ_BEGDA")
    protected String zzprojbegda;
    @XmlElement(name = "ZZPROJ_ENDDA")
    protected String zzprojendda;
    @XmlElement(name = "ZZAWARDNO")
    protected String zzawardno;
    @XmlElement(name = "ZZSPONSOR")
    protected String zzsponsor;
    @XmlElement(name = "ZZINVOICE_CODE")
    protected String zzinvoicecode;
    @XmlElement(name = "ZZMAIN_SPONSOR")
    protected String zzmainsponsor;
    @XmlElement(name = "ZZBILL_PARTNER")
    protected String zzbillpartner;

    /**
     * Gets the value of the zzinvoicefreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZINVOICEFREQ() {
        return zzinvoicefreq;
    }

    /**
     * Sets the value of the zzinvoicefreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZINVOICEFREQ(String value) {
        this.zzinvoicefreq = value;
    }

    /**
     * Gets the value of the zzinvoiceform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZINVOICEFORM() {
        return zzinvoiceform;
    }

    /**
     * Sets the value of the zzinvoiceform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZINVOICEFORM(String value) {
        this.zzinvoiceform = value;
    }

    /**
     * Gets the value of the zzadvpymntind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZADVPYMNTIND() {
        return zzadvpymntind;
    }

    /**
     * Sets the value of the zzadvpymntind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZADVPYMNTIND(String value) {
        this.zzadvpymntind = value;
    }

    /**
     * Gets the value of the zzldcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZLDCODE() {
        return zzldcode;
    }

    /**
     * Sets the value of the zzldcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZLDCODE(String value) {
        this.zzldcode = value;
    }

    /**
     * Gets the value of the zzmjrprjct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMJRPRJCT() {
        return zzmjrprjct;
    }

    /**
     * Sets the value of the zzmjrprjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMJRPRJCT(String value) {
        this.zzmjrprjct = value;
    }

    /**
     * Gets the value of the zzprprtyownr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPRPRTYOWNR() {
        return zzprprtyownr;
    }

    /**
     * Sets the value of the zzprprtyownr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPRPRTYOWNR(String value) {
        this.zzprprtyownr = value;
    }

    /**
     * Gets the value of the zzcostshare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZCOSTSHARE() {
        return zzcostshare;
    }

    /**
     * Sets the value of the zzcostshare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZCOSTSHARE(String value) {
        this.zzcostshare = value;
    }

    /**
     * Gets the value of the zzavctolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAVCTOLERANCE() {
        return zzavctolerance;
    }

    /**
     * Sets the value of the zzavctolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAVCTOLERANCE(String value) {
        this.zzavctolerance = value;
    }

    /**
     * Gets the value of the zznsfctgry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZNSFCTGRY() {
        return zznsfctgry;
    }

    /**
     * Sets the value of the zznsfctgry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZNSFCTGRY(String value) {
        this.zznsfctgry = value;
    }

    /**
     * Gets the value of the zza133CLSTR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZA133CLSTR() {
        return zza133CLSTR;
    }

    /**
     * Sets the value of the zza133CLSTR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZA133CLSTR(String value) {
        this.zza133CLSTR = value;
    }

    /**
     * Gets the value of the zzawardtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZAWARDTITLE() {
        return zzawardtitle;
    }

    /**
     * Sets the value of the zzawardtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZAWARDTITLE(String value) {
        this.zzawardtitle = value;
    }

    /**
     * Gets the value of the zzfundcenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZFUNDCENTER() {
        return zzfundcenter;
    }

    /**
     * Sets the value of the zzfundcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZFUNDCENTER(String value) {
        this.zzfundcenter = value;
    }

    /**
     * Gets the value of the zzintearned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZINTEARNED() {
        return zzintearned;
    }

    /**
     * Sets the value of the zzintearned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZINTEARNED(String value) {
        this.zzintearned = value;
    }

    /**
     * Gets the value of the zzprojbegda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPROJBEGDA() {
        return zzprojbegda;
    }

    /**
     * Sets the value of the zzprojbegda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPROJBEGDA(String value) {
        this.zzprojbegda = value;
    }

    /**
     * Gets the value of the zzprojendda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZPROJENDDA() {
        return zzprojendda;
    }

    /**
     * Sets the value of the zzprojendda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZPROJENDDA(String value) {
        this.zzprojendda = value;
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
     * Gets the value of the zzsponsor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZSPONSOR() {
        return zzsponsor;
    }

    /**
     * Sets the value of the zzsponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZSPONSOR(String value) {
        this.zzsponsor = value;
    }

    /**
     * Gets the value of the zzinvoicecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZINVOICECODE() {
        return zzinvoicecode;
    }

    /**
     * Sets the value of the zzinvoicecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZINVOICECODE(String value) {
        this.zzinvoicecode = value;
    }

    /**
     * Gets the value of the zzmainsponsor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZMAINSPONSOR() {
        return zzmainsponsor;
    }

    /**
     * Sets the value of the zzmainsponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZMAINSPONSOR(String value) {
        this.zzmainsponsor = value;
    }

    /**
     * Gets the value of the zzbillpartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZBILLPARTNER() {
        return zzbillpartner;
    }

    /**
     * Sets the value of the zzbillpartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZBILLPARTNER(String value) {
        this.zzbillpartner = value;
    }

}
