
package wsdemo.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ������������ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="������������">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="������������" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="��������������" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="��������" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="������������������" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="��������" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041d\u043e\u043c\u0435\u043d\u043a\u043b\u0430\u0442\u0443\u0440\u0430", propOrder = {
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0437\u0430\u043a\u0443\u043f\u043e\u0447\u043d\u0430\u044f\u0426\u0435\u043d\u0430",
    "\u043a\u0430\u0440\u0442\u0438\u043d\u043a\u0430",
    "\u043f\u043e\u043b\u043d\u043e\u0435\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
    "\u0448\u0442\u0440\u0438\u0445\u041a\u043e\u0434"
})
public class ������������ {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
    protected String ������������;
    @XmlElement(name = "\u0417\u0430\u043a\u0443\u043f\u043e\u0447\u043d\u0430\u044f\u0426\u0435\u043d\u0430")
    protected int ��������������;
    @XmlElement(name = "\u041a\u0430\u0440\u0442\u0438\u043d\u043a\u0430")
    protected byte[] ��������;
    @XmlElement(name = "\u041f\u043e\u043b\u043d\u043e\u0435\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435")
    protected String ������������������;
    @XmlElement(name = "\u0428\u0442\u0440\u0438\u0445\u041a\u043e\u0434", required = true)
    protected String ��������;

    /**
     * Gets the value of the ������������ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get������������() {
        return ������������;
    }

    /**
     * Sets the value of the ������������ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set������������(String value) {
        this.������������ = value;
    }

    /**
     * Gets the value of the �������������� property.
     * 
     */
    public int get��������������() {
        return ��������������;
    }

    /**
     * Sets the value of the �������������� property.
     * 
     */
    public void set��������������(int value) {
        this.�������������� = value;
    }

    /**
     * Gets the value of the �������� property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] get��������() {
        return ��������;
    }

    /**
     * Sets the value of the �������� property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void set��������(byte[] value) {
        this.�������� = ((byte[]) value);
    }

    /**
     * Gets the value of the ������������������ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get������������������() {
        return ������������������;
    }

    /**
     * Sets the value of the ������������������ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set������������������(String value) {
        this.������������������ = value;
    }

    /**
     * Gets the value of the �������� property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get��������() {
        return ��������;
    }

    /**
     * Sets the value of the �������� property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set��������(String value) {
        this.�������� = value;
    }

}
