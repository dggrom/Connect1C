
package wsdemo.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for НоменклатураГруппа complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="НоменклатураГруппа">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Группы" type="{http://www.1c.ru/demos/products}НоменклатураГруппа" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Элементы" type="{http://www.1c.ru/demos/products}Номенклатура" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u0430\u0413\u0440\u0443\u043f\u043f\u0430", propOrder = {
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0433\u0440\u0443\u043f\u043f\u044b",
    "\u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b"
})
public class НоменклатураГруппа {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String наименование;
    @XmlElement(name = "\u0413\u0440\u0443\u043f\u043f\u044b")
    protected List<НоменклатураГруппа> группы;
    @XmlElement(name = "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b")
    protected List<Номенклатура> элементы;

    /**
     * Gets the value of the наименование property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаименование() {
        return наименование;
    }

    /**
     * Sets the value of the наименование property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаименование(String value) {
        this.наименование = value;
    }

    /**
     * Gets the value of the группы property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the группы property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getГруппы().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link НоменклатураГруппа }
     * 
     * 
     */
    public List<НоменклатураГруппа> getГруппы() {
        if (группы == null) {
            группы = new ArrayList<НоменклатураГруппа>();
        }
        return this.группы;
    }

    /**
     * Gets the value of the элементы property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the элементы property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getЭлементы().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Номенклатура }
     * 
     * 
     */
    public List<Номенклатура> getЭлементы() {
        if (элементы == null) {
            элементы = new ArrayList<Номенклатура>();
        }
        return this.элементы;
    }

}
