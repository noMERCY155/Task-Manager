module com.example.tuhin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tuhin to javafx.fxml;
    exports com.example.tuhin;
}