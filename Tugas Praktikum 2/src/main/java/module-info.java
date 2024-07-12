module com.example.tugaspraktikum2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugaspraktikum2 to javafx.fxml;
    exports com.example.tugaspraktikum2;
}