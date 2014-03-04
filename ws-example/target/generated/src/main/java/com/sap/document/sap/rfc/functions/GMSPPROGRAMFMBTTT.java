
package com.sap.document.sap.rfc.functions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sponsored Program Master Data - Budget Transfer
 * 						Objects
 * 
 * <p>Java class for GMSPPROGRAM_FMBT_TT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMSPPROGRAM_FMBT_TT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}GMSPPROGRAM_FMBT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMSPPROGRAM_FMBT_TT", propOrder = {
    "item"
})
public class GMSPPROGRAMFMBTTT {

    @XmlElement(required = true)
    protected List<GMSPPROGRAMFMBT> item;

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
     * {@link GMSPPROGRAMFMBT }
     * 
     * 
     */
    public List<GMSPPROGRAMFMBT> getItem() {
        if (item == null) {
            item = new ArrayList<GMSPPROGRAMFMBT>();
        }
        return this.item;
    }

}
