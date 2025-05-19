module org.denzhe.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jbcrypt;

    opens org.denzhe.demo1 to javafx.fxml;
    exports org.denzhe.demo1;
}