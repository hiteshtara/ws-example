
package com.sap.document.sap.rfc.functions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Table type for GMSPRESPONSIBLE used in KCRM
 * 						interface
 * 
 * <p>Java class for ZFI_GMSPRESPONSIBLE_TAB_KCRM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZFI_GMSPRESPONSIBLE_TAB_KCRM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZGMSPRESPONSIBLE_KCRM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZFI_GMSPRESPONSIBLE_TAB_KCRM", propOrder = {
    "item"
})
public class ZFIGMSPRESPONSIBLETABKCRM {

    @XmlElement(required = true)
    protected List<ZGMSPRESPONSIBLEKCRM> item;

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
     * {@link ZGMSPRESPONSIBLEKCRM }
     * 
     * 
     */
    public List<ZGMSPRESPONSIBLEKCRM> getItem() {
        if (item == null) {
            item = new ArrayList<ZGMSPRESPONSIBLEKCRM>();
        }
        return this.item;
    }

}
