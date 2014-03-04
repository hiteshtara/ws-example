
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * FI Kuali Coeus Sponsored Program - unit dept
 * 						structure
 * 
 * <p>Java class for ZFI_KCRM_SP_XWALK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZFI_KCRM_SP_XWALK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="ZZREFERENCE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FND_UNT_DPT_PRE_SUF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INTERNAL_ORDER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
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
@XmlType(name = "ZFI_KCRM_SP_XWALK", propOrder = {
    "spprogramnumber",
    "sponsoredprog",
    "zzreference",
    "type",
    "fnduntdptpresuf",
    "internalorder"
})
public class ZFIKCRMSPXWALK {

    @XmlElement(name = "SPPROGRAM_NUMBER")
    protected String spprogramnumber;
    @XmlElement(name = "SPONSORED_PROG")
    protected String sponsoredprog;
    @XmlElement(name = "ZZREFERENCE")
    protected String zzreference;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "FND_UNT_DPT_PRE_SUF")
    protected String fnduntdptpresuf;
    @XmlElement(name = "INTERNAL_ORDER")
    protected String internalorder;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fnduntdptpresuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNDUNTDPTPRESUF() {
        return fnduntdptpresuf;
    }

    /**
     * Sets the value of the fnduntdptpresuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNDUNTDPTPRESUF(String value) {
        this.fnduntdptpresuf = value;
    }

    /**
     * Gets the value of the internalorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERNALORDER() {
        return internalorder;
    }

    /**
     * Sets the value of the internalorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERNALORDER(String value) {
        this.internalorder = value;
    }

}
