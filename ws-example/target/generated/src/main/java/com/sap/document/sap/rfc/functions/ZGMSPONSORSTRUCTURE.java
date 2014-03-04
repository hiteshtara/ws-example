
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sponsor structure for KCRM Interface
 * 					
 * 
 * <p>Java class for ZGMSPONSORSTRUCTURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMSPONSORSTRUCTURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SPONSOR_UPDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
 *         &lt;element name="SPONSOR_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPONSOR_NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONTACT_PERSON" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDRESS_LINE1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDRESS_LINE2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CITY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POST_CODE1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COUNTRY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TEL_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FAX_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FUND" minOccurs="0">
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
@XmlType(name = "ZGMSPONSORSTRUCTURE", propOrder = {
    "sponsorupdate",
    "sponsor",
    "sponsortype",
    "sponsorname",
    "contactperson",
    "addressline1",
    "addressline2",
    "city",
    "state",
    "postcode1",
    "country",
    "telnumber",
    "faxnumber",
    "fund"
})
public class ZGMSPONSORSTRUCTURE {

    @XmlElement(name = "SPONSOR_UPDATE")
    protected String sponsorupdate;
    @XmlElement(name = "SPONSOR")
    protected String sponsor;
    @XmlElement(name = "SPONSOR_TYPE")
    protected String sponsortype;
    @XmlElement(name = "SPONSOR_NAME")
    protected String sponsorname;
    @XmlElement(name = "CONTACT_PERSON")
    protected String contactperson;
    @XmlElement(name = "ADDRESS_LINE1")
    protected String addressline1;
    @XmlElement(name = "ADDRESS_LINE2")
    protected String addressline2;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "POST_CODE1")
    protected String postcode1;
    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "TEL_NUMBER")
    protected String telnumber;
    @XmlElement(name = "FAX_NUMBER")
    protected String faxnumber;
    @XmlElement(name = "FUND")
    protected String fund;

    /**
     * Gets the value of the sponsorupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPONSORUPDATE() {
        return sponsorupdate;
    }

    /**
     * Sets the value of the sponsorupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPONSORUPDATE(String value) {
        this.sponsorupdate = value;
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
     * Gets the value of the sponsortype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPONSORTYPE() {
        return sponsortype;
    }

    /**
     * Sets the value of the sponsortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPONSORTYPE(String value) {
        this.sponsortype = value;
    }

    /**
     * Gets the value of the sponsorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPONSORNAME() {
        return sponsorname;
    }

    /**
     * Sets the value of the sponsorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPONSORNAME(String value) {
        this.sponsorname = value;
    }

    /**
     * Gets the value of the contactperson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACTPERSON() {
        return contactperson;
    }

    /**
     * Sets the value of the contactperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACTPERSON(String value) {
        this.contactperson = value;
    }

    /**
     * Gets the value of the addressline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSLINE1() {
        return addressline1;
    }

    /**
     * Sets the value of the addressline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSLINE1(String value) {
        this.addressline1 = value;
    }

    /**
     * Gets the value of the addressline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSLINE2() {
        return addressline2;
    }

    /**
     * Sets the value of the addressline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSLINE2(String value) {
        this.addressline2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postcode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTCODE1() {
        return postcode1;
    }

    /**
     * Sets the value of the postcode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTCODE1(String value) {
        this.postcode1 = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the telnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELNUMBER() {
        return telnumber;
    }

    /**
     * Sets the value of the telnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELNUMBER(String value) {
        this.telnumber = value;
    }

    /**
     * Gets the value of the faxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNUMBER() {
        return faxnumber;
    }

    /**
     * Sets the value of the faxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNUMBER(String value) {
        this.faxnumber = value;
    }

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

}
