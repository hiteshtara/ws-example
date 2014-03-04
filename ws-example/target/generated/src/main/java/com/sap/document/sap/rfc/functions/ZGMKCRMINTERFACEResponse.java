
package com.sap.document.sap.rfc.functions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.GRANTMESSAGES;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.RETURN;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPONSOREDPROGRAMSMESSAGES;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPONSORMESSAGES;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACEResponse.SPXWALKT;


/**
 * <p>Java class for Z_GM_KCRM_INTERFACE.Response element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="Z_GM_KCRM_INTERFACE.Response">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;all>
 *           &lt;element name="GRANT_MESSAGES" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGRANTMESSAGES" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SPONSORED_PROGRAMS_MESSAGES" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZSPPROGRAMMESSAGES" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SPONSOR_MESSAGES" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZSPONSORMESSAGES" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SP_XWALK_T" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZFI_KCRM_SP_XWALK" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="RETURN" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPIRET2" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/all>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Z_GM_KCRM_INTERFACE.Response")
public class ZGMKCRMINTERFACEResponse {

    @XmlElement(name = "GRANT_MESSAGES")
    protected GRANTMESSAGES grantmessages;
    @XmlElement(name = "SPONSORED_PROGRAMS_MESSAGES")
    protected SPONSOREDPROGRAMSMESSAGES sponsoredprogramsmessages;
    @XmlElement(name = "SPONSOR_MESSAGES")
    protected SPONSORMESSAGES sponsormessages;
    @XmlElement(name = "SP_XWALK_T")
    protected SPXWALKT spxwalkt;
    @XmlElement(name = "RETURN")
    protected RETURN _return;

    /**
     * Gets the value of the grantmessages property.
     * 
     * @return
     *     possible object is
     *     {@link GRANTMESSAGES }
     *     
     */
    public GRANTMESSAGES getGRANTMESSAGES() {
        return grantmessages;
    }

    /**
     * Sets the value of the grantmessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRANTMESSAGES }
     *     
     */
    public void setGRANTMESSAGES(GRANTMESSAGES value) {
        this.grantmessages = value;
    }

    /**
     * Gets the value of the sponsoredprogramsmessages property.
     * 
     * @return
     *     possible object is
     *     {@link SPONSOREDPROGRAMSMESSAGES }
     *     
     */
    public SPONSOREDPROGRAMSMESSAGES getSPONSOREDPROGRAMSMESSAGES() {
        return sponsoredprogramsmessages;
    }

    /**
     * Sets the value of the sponsoredprogramsmessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPONSOREDPROGRAMSMESSAGES }
     *     
     */
    public void setSPONSOREDPROGRAMSMESSAGES(SPONSOREDPROGRAMSMESSAGES value) {
        this.sponsoredprogramsmessages = value;
    }

    /**
     * Gets the value of the sponsormessages property.
     * 
     * @return
     *     possible object is
     *     {@link SPONSORMESSAGES }
     *     
     */
    public SPONSORMESSAGES getSPONSORMESSAGES() {
        return sponsormessages;
    }

    /**
     * Sets the value of the sponsormessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPONSORMESSAGES }
     *     
     */
    public void setSPONSORMESSAGES(SPONSORMESSAGES value) {
        this.sponsormessages = value;
    }

    /**
     * Gets the value of the spxwalkt property.
     * 
     * @return
     *     possible object is
     *     {@link SPXWALKT }
     *     
     */
    public SPXWALKT getSPXWALKT() {
        return spxwalkt;
    }

    /**
     * Sets the value of the spxwalkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPXWALKT }
     *     
     */
    public void setSPXWALKT(SPXWALKT value) {
        this.spxwalkt = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RETURN }
     *     
     */
    public RETURN getRETURN() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RETURN }
     *     
     */
    public void setRETURN(RETURN value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGRANTMESSAGES" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class GRANTMESSAGES {

        @XmlElement(required = true)
        protected List<ZGRANTMESSAGES> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZGRANTMESSAGES }
         * 
         * 
         */
        public List<ZGRANTMESSAGES> getItem() {
            if (item == null) {
                item = new ArrayList<ZGRANTMESSAGES>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPIRET2" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class RETURN {

        @XmlElement(required = true)
        protected List<BAPIRET2> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BAPIRET2 }
         * 
         * 
         */
        public List<BAPIRET2> getItem() {
            if (item == null) {
                item = new ArrayList<BAPIRET2>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZSPPROGRAMMESSAGES" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class SPONSOREDPROGRAMSMESSAGES {

        @XmlElement(required = true)
        protected List<ZSPPROGRAMMESSAGES> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZSPPROGRAMMESSAGES }
         * 
         * 
         */
        public List<ZSPPROGRAMMESSAGES> getItem() {
            if (item == null) {
                item = new ArrayList<ZSPPROGRAMMESSAGES>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZSPONSORMESSAGES" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class SPONSORMESSAGES {

        @XmlElement(required = true)
        protected List<ZSPONSORMESSAGES> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZSPONSORMESSAGES }
         * 
         * 
         */
        public List<ZSPONSORMESSAGES> getItem() {
            if (item == null) {
                item = new ArrayList<ZSPONSORMESSAGES>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZFI_KCRM_SP_XWALK" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class SPXWALKT {

        @XmlElement(required = true)
        protected List<ZFIKCRMSPXWALK> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZFIKCRMSPXWALK }
         * 
         * 
         */
        public List<ZFIKCRMSPXWALK> getItem() {
            if (item == null) {
                item = new ArrayList<ZFIKCRMSPXWALK>();
            }
            return this.item;
        }

    }

}
