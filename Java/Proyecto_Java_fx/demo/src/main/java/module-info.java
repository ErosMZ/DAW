module eros_fx {
    requires javafx.controls;
    requires javafx.fxml;

    opens eros_fx to javafx.fxml;
    exports eros_fx;
}
