package org.denzhe.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public PasswordField username;
    public PasswordField password;
    public Text Heading;
    public Label menu;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene loginPage = new Scene(loader.load());
        Stage login = (Stage) welcomeText.getScene().getWindow();
        login.setScene(loginPage);
        login.setTitle("login");
        login.show();
    }
    @FXML
    protected void onSubmit()throws IOException{
        if (User.login(username.getText(),password.getText())) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("app.fxml"));
            Scene loginPage = new Scene(loader.load(), 900, 900);
            Stage login = (Stage) username.getScene().getWindow();
            login.setScene(loginPage);
            login.setTitle("welcome");
            login.show();
        }else {
            System.out.println("incorrect login");
        }
    }
}