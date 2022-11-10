module com.example.homeworkweek2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.homeworkweek2 to javafx.fxml;
    exports com.example.homeworkweek2;
}