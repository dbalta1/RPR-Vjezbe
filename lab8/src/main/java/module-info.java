module com.example.probaprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.probaprogram to javafx.fxml;
    exports com.example.probaprogram;
}