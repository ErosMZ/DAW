package com.ermuza;

import java.io.IOException;

import javafx.fxml.FXML;

public class ErrorController {

        @FXML
private void AccionAceptar(){

    try {
        App.setRoot("cocina");
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}
