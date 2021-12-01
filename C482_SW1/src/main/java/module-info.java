module com.example.c482_sw1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.c482_sw1 to javafx.fxml;
    exports com.example.c482_sw1;
}