
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Billing Plan Structure for KCRM Interface
 * 					
 * 
 * <p>Java class for ZGMBILLINGPLANSTRUCTURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMBILLINGPLANSTRUCTURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLING_UPDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BILLING_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="BILLING_VALUE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="23"/>
 *               &lt;fractionDigits value="4"/>
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
@XmlType(name = "ZGMBILLINGPLANSTRUCTURE", propOrder = {
    "billingupdate",
    "billingdate",
    "billingvalue"
})
public class ZGMBILLINGPLANSTRUCTURE {

    @XmlElement(name = "BILLING_UPDATE")
    protected String billingupdate;
    @XmlElement(name = "BILLING_DATE")
    protected String billingdate;
    @XmlElement(name = "BILLING_VALUE")
    protected BigDecimal billingvalue;

    /**
     * Gets the value of the billingupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLINGUPDATE() {
        return billingupdate;
    }

    /**
     * Sets the value of the billingupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLINGUPDATE(String value) {
        this.billingupdate = value;
    }

    /**
     * Gets the value of the billingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLINGDATE() {
        return billingdate;
    }

    /**
     * Sets the value of the billingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLINGDATE(String value) {
        this.billingdate = value;
    }

    /**
     * Gets the value of the billingvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBILLINGVALUE() {
        return billingvalue;
    }

    /**
     * Sets the value of the billingvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBILLINGVALUE(BigDecimal value) {
        this.billingvalue = value;
    }

}
