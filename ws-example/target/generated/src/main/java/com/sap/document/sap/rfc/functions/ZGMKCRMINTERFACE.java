
package com.sap.document.sap.rfc.functions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACE.BILLINGPLAN;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACE.RETURN;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACE.SPONSOR;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACE.SPONSOREDPROGRAMS;
import com.sap.document.sap.rfc.functions.ZGMKCRMINTERFACE.SPONSOREDPROGRAMSGRP;


/**
 * <p>Java class for Z_GM_KCRM_INTERFACE element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="Z_GM_KCRM_INTERFACE">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;all>
 *           &lt;element name="BILLING_PLAN">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMBILLINGPLANSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="GRANT" type="{urn:sap-com:document:sap:rfc:functions}ZGMGRANTSTRUCTURE"/>
 *           &lt;element name="SPONSOR">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPONSORSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SPONSORED_PROGRAMS">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPPROGRAMSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SPONSORED_PROGRAMS_GRP">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPPROGRAMGRPSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "Z_GM_KCRM_INTERFACE")
public class ZGMKCRMINTERFACE {

    @XmlElement(name = "BILLING_PLAN", required = true)
    protected BILLINGPLAN billingplan;
    @XmlElement(name = "GRANT", required = true)
    protected ZGMGRANTSTRUCTURE grant;
    @XmlElement(name = "SPONSOR", required = true)
    protected SPONSOR sponsor;
    @XmlElement(name = "SPONSORED_PROGRAMS", required = true)
    protected SPONSOREDPROGRAMS sponsoredprograms;
    @XmlElement(name = "SPONSORED_PROGRAMS_GRP", required = true)
    protected SPONSOREDPROGRAMSGRP sponsoredprogramsgrp;
    @XmlElement(name = "RETURN")
    protected RETURN _return;

    /**
     * Gets the value of the billingplan property.
     * 
     * @return
     *     possible object is
     *     {@link BILLINGPLAN }
     *     
     */
    public BILLINGPLAN getBILLINGPLAN() {
        return billingplan;
    }

    /**
     * Sets the value of the billingplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BILLINGPLAN }
     *     
     */
    public void setBILLINGPLAN(BILLINGPLAN value) {
        this.billingplan = value;
    }

    /**
     * Gets the value of the grant property.
     * 
     * @return
     *     possible object is
     *     {@link ZGMGRANTSTRUCTURE }
     *     
     */
    public ZGMGRANTSTRUCTURE getGRANT() {
        return grant;
    }

    /**
     * Sets the value of the grant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZGMGRANTSTRUCTURE }
     *     
     */
    public void setGRANT(ZGMGRANTSTRUCTURE value) {
        this.grant = value;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * @return
     *     possible object is
     *     {@link SPONSOR }
     *     
     */
    public SPONSOR getSPONSOR() {
        return sponsor;
    }

    /**
     * Sets the value of the sponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPONSOR }
     *     
     */
    public void setSPONSOR(SPONSOR value) {
        this.sponsor = value;
    }

    /**
     * Gets the value of the sponsoredprograms property.
     * 
     * @return
     *     possible object is
     *     {@link SPONSOREDPROGRAMS }
     *     
     */
    public SPONSOREDPROGRAMS getSPONSOREDPROGRAMS() {
        return sponsoredprograms;
    }

    /**
     * Sets the value of the sponsoredprograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPONSOREDPROGRAMS }
     *     
     */
    public void setSPONSOREDPROGRAMS(SPONSOREDPROGRAMS value) {
        this.sponsoredprograms = value;
    }

    /**
     * Gets the value of the sponsoredprogramsgrp property.
     * 
     * @return
     *     possible object is
     *     {@link SPONSOREDPROGRAMSGRP }
     *     
     */
    public SPONSOREDPROGRAMSGRP getSPONSOREDPROGRAMSGRP() {
        return sponsoredprogramsgrp;
    }

    /**
     * Sets the value of the sponsoredprogramsgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPONSOREDPROGRAMSGRP }
     *     
     */
    public void setSPONSOREDPROGRAMSGRP(SPONSOREDPROGRAMSGRP value) {
        this.sponsoredprogramsgrp = value;
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMBILLINGPLANSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class BILLINGPLAN {

        @XmlElement(required = true)
        protected List<ZGMBILLINGPLANSTRUCTURE> item;

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
         * {@link ZGMBILLINGPLANSTRUCTURE }
         * 
         * 
         */
        public List<ZGMBILLINGPLANSTRUCTURE> getItem() {
            if (item == null) {
                item = new ArrayList<ZGMBILLINGPLANSTRUCTURE>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPONSORSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class SPONSOR {

        @XmlElement(required = true)
        protected List<ZGMSPONSORSTRUCTURE> item;

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
         * {@link ZGMSPONSORSTRUCTURE }
         * 
         * 
         */
        public List<ZGMSPONSORSTRUCTURE> getItem() {
            if (item == null) {
                item = new ArrayList<ZGMSPONSORSTRUCTURE>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPPROGRAMSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class SPONSOREDPROGRAMS {

        @XmlElement(required = true)
        protected List<ZGMSPPROGRAMSTRUCTURE> item;

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
         * {@link ZGMSPPROGRAMSTRUCTURE }
         * 
         * 
         */
        public List<ZGMSPPROGRAMSTRUCTURE> getItem() {
            if (item == null) {
                item = new ArrayList<ZGMSPPROGRAMSTRUCTURE>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPPROGRAMGRPSTRUCTURE" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class SPONSOREDPROGRAMSGRP {

        @XmlElement(required = true)
        protected List<ZGMSPPROGRAMGRPSTRUCTURE> item;

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
         * {@link ZGMSPPROGRAMGRPSTRUCTURE }
         * 
         * 
         */
        public List<ZGMSPPROGRAMGRPSTRUCTURE> getItem() {
            if (item == null) {
                item = new ArrayList<ZGMSPPROGRAMGRPSTRUCTURE>();
            }
            return this.item;
        }

    }

}
