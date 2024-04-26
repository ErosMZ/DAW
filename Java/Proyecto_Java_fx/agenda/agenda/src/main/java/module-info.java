module agenda {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens agenda to javafx.fxml;
    exports agenda;
}
