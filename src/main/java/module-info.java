module com.example.busfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.busfx to javafx.fxml;
    exports com.example.busfx;
}