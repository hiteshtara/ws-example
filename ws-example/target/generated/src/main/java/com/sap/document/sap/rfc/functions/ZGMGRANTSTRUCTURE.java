
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grant Structure for KCRM Interface
 * 					
 * 
 * <p>Java class for ZGMGRANTSTRUCTURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMGRANTSTRUCTURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GRANT_UPDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HEADER" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035HEADER" minOccurs="0"/>
 *         &lt;element name="HEADER_ADD" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035HEADERADD" minOccurs="0"/>
 *         &lt;element name="RESPONSIBILITY" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035RESPONSIBLET" minOccurs="0"/>
 *         &lt;element name="FUNDS" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035FUNDST" minOccurs="0"/>
 *         &lt;element name="SPONSORED_PROGRAM" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035SPONSOREDPROGT" minOccurs="0"/>
 *         &lt;element name="SPONSORED_OBJECTS" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035SPONSOREDOBJECTST" minOccurs="0"/>
 *         &lt;element name="BUDGET_VALIDITY" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035BUDGETVALIDITYT" minOccurs="0"/>
 *         &lt;element name="GRANT_DESCRIPTIONS" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035GRANTDESCRIPTION" minOccurs="0"/>
 *         &lt;element name="EXTENSION_IN" type="{urn:sap-com:document:sap:rfc:functions}ZFIGRANTDATA" minOccurs="0"/>
 *         &lt;element name="FACREDIT" type="{urn:sap-com:document:sap:rfc:functions}ZGMFACREDIT_T" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZGMGRANTSTRUCTURE", propOrder = {
    "grantupdate",
    "header",
    "headeradd",
    "responsibility",
    "funds",
    "sponsoredprogram",
    "sponsoredobjects",
    "budgetvalidity",
    "grantdescriptions",
    "extensionin",
    "facredit"
})
public class ZGMGRANTSTRUCTURE {

    @XmlElement(name = "GRANT_UPDATE")
    protected String grantupdate;
    @XmlElement(name = "HEADER")
    protected ZBAPI0035HEADER header;
    @XmlElement(name = "HEADER_ADD")
    protected ZBAPI0035HEADERADD headeradd;
    @XmlElement(name = "RESPONSIBILITY")
    protected ZBAPI0035RESPONSIBLET responsibility;
    @XmlElement(name = "FUNDS")
    protected ZBAPI0035FUNDST funds;
    @XmlElement(name = "SPONSORED_PROGRAM")
    protected ZBAPI0035SPONSOREDPROGT sponsoredprogram;
    @XmlElement(name = "SPONSORED_OBJECTS")
    protected ZBAPI0035SPONSOREDOBJECTST sponsoredobjects;
    @XmlElement(name = "BUDGET_VALIDITY")
    protected ZBAPI0035BUDGETVALIDITYT budgetvalidity;
    @XmlElement(name = "GRANT_DESCRIPTIONS")
    protected ZBAPI0035GRANTDESCRIPTION grantdescriptions;
    @XmlElement(name = "EXTENSION_IN")
    protected ZFIGRANTDATA extensionin;
    @XmlElement(name = "FACREDIT")
    protected ZGMFACREDITT facredit;

    /**
     * Gets the value of the grantupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRANTUPDATE() {
        return grantupdate;
    }

    /**
     * Sets the value of the grantupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRANTUPDATE(String value) {
        this.grantupdate = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035HEADER }
     *     
     */
    public ZBAPI0035HEADER getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035HEADER }
     *     
     */
    public void setHEADER(ZBAPI0035HEADER value) {
        this.header = value;
    }

    /**
     * Gets the value of the headeradd property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035HEADERADD }
     *     
     */
    public ZBAPI0035HEADERADD getHEADERADD() {
        return headeradd;
    }

    /**
     * Sets the value of the headeradd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035HEADERADD }
     *     
     */
    public void setHEADERADD(ZBAPI0035HEADERADD value) {
        this.headeradd = value;
    }

    /**
     * Gets the value of the responsibility property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035RESPONSIBLET }
     *     
     */
    public ZBAPI0035RESPONSIBLET getRESPONSIBILITY() {
        return responsibility;
    }

    /**
     * Sets the value of the responsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035RESPONSIBLET }
     *     
     */
    public void setRESPONSIBILITY(ZBAPI0035RESPONSIBLET value) {
        this.responsibility = value;
    }

    /**
     * Gets the value of the funds property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035FUNDST }
     *     
     */
    public ZBAPI0035FUNDST getFUNDS() {
        return funds;
    }

    /**
     * Sets the value of the funds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035FUNDST }
     *     
     */
    public void setFUNDS(ZBAPI0035FUNDST value) {
        this.funds = value;
    }

    /**
     * Gets the value of the sponsoredprogram property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035SPONSOREDPROGT }
     *     
     */
    public ZBAPI0035SPONSOREDPROGT getSPONSOREDPROGRAM() {
        return sponsoredprogram;
    }

    /**
     * Sets the value of the sponsoredprogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035SPONSOREDPROGT }
     *     
     */
    public void setSPONSOREDPROGRAM(ZBAPI0035SPONSOREDPROGT value) {
        this.sponsoredprogram = value;
    }

    /**
     * Gets the value of the sponsoredobjects property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035SPONSOREDOBJECTST }
     *     
     */
    public ZBAPI0035SPONSOREDOBJECTST getSPONSOREDOBJECTS() {
        return sponsoredobjects;
    }

    /**
     * Sets the value of the sponsoredobjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035SPONSOREDOBJECTST }
     *     
     */
    public void setSPONSOREDOBJECTS(ZBAPI0035SPONSOREDOBJECTST value) {
        this.sponsoredobjects = value;
    }

    /**
     * Gets the value of the budgetvalidity property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035BUDGETVALIDITYT }
     *     
     */
    public ZBAPI0035BUDGETVALIDITYT getBUDGETVALIDITY() {
        return budgetvalidity;
    }

    /**
     * Sets the value of the budgetvalidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035BUDGETVALIDITYT }
     *     
     */
    public void setBUDGETVALIDITY(ZBAPI0035BUDGETVALIDITYT value) {
        this.budgetvalidity = value;
    }

    /**
     * Gets the value of the grantdescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ZBAPI0035GRANTDESCRIPTION }
     *     
     */
    public ZBAPI0035GRANTDESCRIPTION getGRANTDESCRIPTIONS() {
        return grantdescriptions;
    }

    /**
     * Sets the value of the grantdescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZBAPI0035GRANTDESCRIPTION }
     *     
     */
    public void setGRANTDESCRIPTIONS(ZBAPI0035GRANTDESCRIPTION value) {
        this.grantdescriptions = value;
    }

    /**
     * Gets the value of the extensionin property.
     * 
     * @return
     *     possible object is
     *     {@link ZFIGRANTDATA }
     *     
     */
    public ZFIGRANTDATA getEXTENSIONIN() {
        return extensionin;
    }

    /**
     * Sets the value of the extensionin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZFIGRANTDATA }
     *     
     */
    public void setEXTENSIONIN(ZFIGRANTDATA value) {
        this.extensionin = value;
    }

    /**
     * Gets the value of the facredit property.
     * 
     * @return
     *     possible object is
     *     {@link ZGMFACREDITT }
     *     
     */
    public ZGMFACREDITT getFACREDIT() {
        return facredit;
    }

    /**
     * Sets the value of the facredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZGMFACREDITT }
     *     
     */
    public void setFACREDIT(ZGMFACREDITT value) {
        this.facredit = value;
    }

}
