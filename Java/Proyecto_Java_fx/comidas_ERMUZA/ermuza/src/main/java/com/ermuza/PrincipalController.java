package com.ermuza;
import java.io.IOException;
import javafx.fxml.FXML;
public class PrincipalController {
    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("principal");
    
    }
}