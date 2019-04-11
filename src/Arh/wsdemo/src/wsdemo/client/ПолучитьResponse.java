
package wsdemo.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="return" type="{http://www.1c.ru/demos/products}НоменклатураГруппа"/>
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
    "_return"
})
@XmlRootElement(name = "\u041f\u043e\u043b\u0443\u0447\u0438\u0442\u044cResponse")
public class ПолучитьResponse {

    @XmlElement(name = "return", required = true)
    protected НоменклатураГруппа _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link НоменклатураГруппа }
     *     
     */
    public НоменклатураГруппа getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link НоменклатураГруппа }
     *     
     */
    public void setReturn(НоменклатураГруппа value) {
        this._return = value;
    }

}
