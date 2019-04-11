
package wsdemo.client;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdemo.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdemo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ПолучитьResponse }
     * 
     */
    public ПолучитьResponse createПолучитьResponse() {
        return new ПолучитьResponse();
    }

    /**
     * Create an instance of {@link Номенклатура }
     * 
     */
    public Номенклатура createНоменклатура() {
        return new Номенклатура();
    }

    /**
     * Create an instance of {@link НоменклатураГруппа }
     * 
     */
    public НоменклатураГруппа createНоменклатураГруппа() {
        return new НоменклатураГруппа();
    }

    /**
     * Create an instance of {@link Получить }
     * 
     */
    public Получить createПолучить() {
        return new Получить();
    }

}
