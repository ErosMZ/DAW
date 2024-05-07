package com.ermuza;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
public class PrincipalController {

 
    @FXML
    private TextField idNombre;
    
    @FXML
    private TextField Idrango;
    

    @FXML
    private void cambiarDeFMXL() throws IOException {
        String nombre = idNombre.getText();
        String rango = Idrango.getText();

        if (rango.equals("Cocinero")) {
            App.setRoot("cocina");
        }else if (rango.equals("camarero")) {
            App.setRoot("camarero");
        }else if (rango.equals("Jefe de sala")) {
            App.setRoot("JefeDeSala");
        }
    
    }
}