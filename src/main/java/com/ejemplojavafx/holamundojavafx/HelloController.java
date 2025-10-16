package com.ejemplojavafx.holamundojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("¡Bienvenido a mi primera aplicación de JavaFX!");
    }
}
