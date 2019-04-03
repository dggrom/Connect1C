package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Fome;

    @FXML
    private Button FormButtonConnect;

    @FXML
    private TextField FormEditLogin;

    @FXML
    private TextField FormEditPass;

    @FXML
    void initialize() {
    	FormButtonConnect.setOnAction(Event -> {

    	});
    }

}
