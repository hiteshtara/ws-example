
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sponsored Program Group Structure for Interface
 * 					
 * 
 * <p>Java class for ZGMSPPROGRAMGRPSTRUCTURE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZGMSPPROGRAMGRPSTRUCTURE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARENT_AWARD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHILD_AWARD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
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
 *         &lt;element name="TITLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "ZGMSPPROGRAMGRPSTRUCTURE", propOrder = {
    "parentaward",
    "childaward",
    "sponsoredprog",
    "title"
})
public class ZGMSPPROGRAMGRPSTRUCTURE {

    @XmlElement(name = "PARENT_AWARD")
    protected String parentaward;
    @XmlElement(name = "CHILD_AWARD")
    protected String childaward;
    @XmlElement(name = "SPONSORED_PROG")
    protected String sponsoredprog;
    @XmlElement(name = "TITLE")
    protected String title;

    /**
     * Gets the value of the parentaward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTAWARD() {
        return parentaward;
    }

    /**
     * Sets the value of the parentaward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTAWARD(String value) {
        this.parentaward = value;
    }

    /**
     * Gets the value of the childaward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDAWARD() {
        return childaward;
    }

    /**
     * Sets the value of the childaward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDAWARD(String value) {
        this.childaward = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

}
