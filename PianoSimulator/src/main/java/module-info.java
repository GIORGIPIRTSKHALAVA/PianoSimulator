module com.example.pianosimulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.pianosimulator to javafx.fxml;
    exports com.example.pianosimulator;
}
