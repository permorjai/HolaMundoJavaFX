module com.ejemplojavafx.holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ejemplojavafx.holamundojavafx to javafx.fxml;
    exports com.ejemplojavafx.holamundojavafx;
}