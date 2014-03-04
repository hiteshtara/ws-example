
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Responsiblity for the grant
 * 
 * <p>Java class for ZBAPI0035RESPONSIBLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035RESPONSIBLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RESPONSIBILITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USER_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USER_ID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USER_NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RESPONSIBLE_FROM_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="RESPONSIBLE_TO_DATE" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZBAPI0035RESPONSIBLE", propOrder = {
    "responsibility",
    "usertype",
    "userid",
    "username",
    "responsiblefromdate",
    "responsibletodate"
})
public class ZBAPI0035RESPONSIBLE {

    @XmlElement(name = "RESPONSIBILITY")
    protected String responsibility;
    @XmlElement(name = "USER_TYPE")
    protected String usertype;
    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "USER_NAME")
    protected String username;
    @XmlElement(name = "RESPONSIBLE_FROM_DATE")
    protected String responsiblefromdate;
    @XmlElement(name = "RESPONSIBLE_TO_DATE")
    protected String responsibletodate;

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
     * Gets the value of the usertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERTYPE() {
        return usertype;
    }

    /**
     * Sets the value of the usertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERTYPE(String value) {
        this.usertype = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNAME() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNAME(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the responsiblefromdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEFROMDATE() {
        return responsiblefromdate;
    }

    /**
     * Sets the value of the responsiblefromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEFROMDATE(String value) {
        this.responsiblefromdate = value;
    }

    /**
     * Gets the value of the responsibletodate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLETODATE() {
        return responsibletodate;
    }

    /**
     * Sets the value of the responsibletodate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLETODATE(String value) {
        this.responsibletodate = value;
    }

}
