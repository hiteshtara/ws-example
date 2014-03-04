
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Funds for the grant master
 * 
 * <p>Java class for ZBAPI0035FUNDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035FUNDS">
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
 *         &lt;element name="IDC_FUND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CS_FUND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PI_FUND" minOccurs="0">
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
@XmlType(name = "ZBAPI0035FUNDS", propOrder = {
    "fund",
    "idcfund",
    "csfund",
    "pifund"
})
public class ZBAPI0035FUNDS {

    @XmlElement(name = "FUND")
    protected String fund;
    @XmlElement(name = "IDC_FUND")
    protected String idcfund;
    @XmlElement(name = "CS_FUND")
    protected String csfund;
    @XmlElement(name = "PI_FUND")
    protected String pifund;

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
     * Gets the value of the idcfund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCFUND() {
        return idcfund;
    }

    /**
     * Sets the value of the idcfund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCFUND(String value) {
        this.idcfund = value;
    }

    /**
     * Gets the value of the csfund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSFUND() {
        return csfund;
    }

    /**
     * Sets the value of the csfund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSFUND(String value) {
        this.csfund = value;
    }

    /**
     * Gets the value of the pifund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIFUND() {
        return pifund;
    }

    /**
     * Sets the value of the pifund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIFUND(String value) {
        this.pifund = value;
    }

}
