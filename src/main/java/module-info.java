module com.asura.asuradictionary {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.asura.asuradictionary to javafx.fxml;
    exports com.asura.asuradictionary;
}