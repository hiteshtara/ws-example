
package com.sap.document.sap.rfc.functions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Table for grant master sponsored objects
 * 					
 * 
 * <p>Java class for ZBAPI0035SPONSOREDOBJECTST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZBAPI0035SPONSOREDOBJECTST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZBAPI0035SPONSOREDOBJECTS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZBAPI0035SPONSOREDOBJECTST", propOrder = {
    "item"
})
public class ZBAPI0035SPONSOREDOBJECTST {

    @XmlElement(required = true)
    protected List<ZBAPI0035SPONSOREDOBJECTS> item;

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
     * {@link ZBAPI0035SPONSOREDOBJECTS }
     * 
     * 
     */
    public List<ZBAPI0035SPONSOREDOBJECTS> getItem() {
        if (item == null) {
            item = new ArrayList<ZBAPI0035SPONSOREDOBJECTS>();
        }
        return this.item;
    }

}
