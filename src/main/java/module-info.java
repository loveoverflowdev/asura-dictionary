module com.asura.asuradictionary {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jlayer;
    requires javafx.web;

    opens com.asura.asuradictionary to javafx.fxml;
    exports com.asura.asuradictionary;
}