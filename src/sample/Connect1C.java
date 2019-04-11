package sample;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceClient;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "JavaLoadNomen", targetNamespace = "http://127.0.0.1/Dok", wsdlLocation = "http://127.0.0.1/Dok.ws1.1cws")
public class Connect1C
        extends Service {

    private final static URL urlC = new URL(new URL("http://127.0.0.1/Dok"), "http://127.0.0.1/Dok.ws1.1cws");

    static {
        try {

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public Connect1C(){
        super(urlC, new QName("http://127.0.0.1/Dok","JavaLoadNomen"));
    }

    public void Connect() {


    }

}
