module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
}