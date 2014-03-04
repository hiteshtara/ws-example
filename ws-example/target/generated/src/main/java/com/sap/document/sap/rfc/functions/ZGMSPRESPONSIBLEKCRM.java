
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * GMSPRESPONSIBLe structure used for KCRM
 * 						interface
 * 
 * <p>Java class for ZGMSPRESPONSIBLE_KCRM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMSPRESPONSIBLE_KCRM">
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
 *         &lt;element name="RESPONSIBILITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBJECT_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBJECT_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBJECT_NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FROM_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="TO_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="DEFAULT_TO_GRANT" minOccurs="0">
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
@XmlType(name = "ZGMSPRESPONSIBLE_KCRM", propOrder = {
    "client",
    "sponsoredprog",
    "responsibility",
    "objecttype",
    "objectid",
    "objectname",
    "fromdate",
    "todate",
    "defaulttogrant"
})
public class ZGMSPRESPONSIBLEKCRM {

    @XmlElement(name = "CLIENT")
    protected String client;
    @XmlElement(name = "SPONSORED_PROG")
    protected String sponsoredprog;
    @XmlElement(name = "RESPONSIBILITY")
    protected String responsibility;
    @XmlElement(name = "OBJECT_TYPE")
    protected String objecttype;
    @XmlElement(name = "OBJECT_ID")
    protected String objectid;
    @XmlElement(name = "OBJECT_NAME")
    protected String objectname;
    @XmlElement(name = "FROM_DATE")
    protected String fromdate;
    @XmlElement(name = "TO_DATE")
    protected String todate;
    @XmlElement(name = "DEFAULT_TO_GRANT")
    protected String defaulttogrant;

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
     * Gets the value of the responsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBILITY() {
        return responsibility;
    }

    /**
     * Sets the value of the responsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBILITY(String value) {
        this.responsibility = value;
    }

    /**
     * Gets the value of the objecttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTTYPE() {
        return objecttype;
    }

    /**
     * Sets the value of the objecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTTYPE(String value) {
        this.objecttype = value;
    }

    /**
     * Gets the value of the objectid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTID() {
        return objectid;
    }

    /**
     * Sets the value of the objectid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTID(String value) {
        this.objectid = value;
    }

    /**
     * Gets the value of the objectname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJECTNAME() {
        return objectname;
    }

    /**
     * Sets the value of the objectname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJECTNAME(String value) {
        this.objectname = value;
    }

    /**
     * Gets the value of the fromdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMDATE() {
        return fromdate;
    }

    /**
     * Sets the value of the fromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMDATE(String value) {
        this.fromdate = value;
    }

    /**
     * Gets the value of the todate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODATE() {
        return todate;
    }

    /**
     * Sets the value of the todate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODATE(String value) {
        this.todate = value;
    }

    /**
     * Gets the value of the defaulttogrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTTOGRANT() {
        return defaulttogrant;
    }

    /**
     * Sets the value of the defaulttogrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTTOGRANT(String value) {
        this.defaulttogrant = value;
    }

}
