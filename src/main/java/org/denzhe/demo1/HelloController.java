package org.denzhe.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public TextField userNameField;
    public TextField PasswordField;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene loginPage = new Scene(loader.load(),400,320);
        Stage login = (Stage) welcomeText.getScene().getWindow();
        login.setScene(loginPage);
        login.setTitle("login");
        login.show();
    }
    @FXML
    protected void onSubmit()throws IOException{
        if (User.login(String.valueOf(userNameField.getText()), String.valueOf(PasswordField.getText()))) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("app.fxml"));
            Scene loginPage = new Scene(loader.load(), 900, 900);
            Stage login = (Stage) userNameField.getScene().getWindow();
            login.setScene(loginPage);
            login.setTitle("welcome");
            login.show();
        }else {
            System.out.println("incorrect login");
        }
    }
}