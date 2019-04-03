package sample;

import org.jawin.COMException;
import org.jawin.DispatchPtr;
import org.jawin.win32.Ole32;

public class Connect1C {

    private String Login,Pass;

    public Connect1C(String Log, String Pas){
        Login = Log;
        Pass = Pas;
    }

    public void Connect() throws COMException {

        Ole32.CoInitialize();
        DispatchPtr app = new DispatchPtr("V82.COMConnector");



    }

}
