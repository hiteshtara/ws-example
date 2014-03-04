
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * F&A Recovery Affiliation Structure
 * 					
 * 
 * <p>Java class for ZGMFACREDIT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMFACREDIT">
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
 *         &lt;element name="DEPT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERCENTAGE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
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
@XmlType(name = "ZGMFACREDIT", propOrder = {
    "grantnbr",
    "dept",
    "percentage"
})
public class ZGMFACREDIT {

    @XmlElement(name = "GRANT_NBR")
    protected String grantnbr;
    @XmlElement(name = "DEPT")
    protected String dept;
    @XmlElement(name = "PERCENTAGE")
    protected BigDecimal percentage;

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
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPT() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPT(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTAGE(BigDecimal value) {
        this.percentage = value;
    }

}
