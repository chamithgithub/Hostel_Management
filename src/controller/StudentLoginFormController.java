package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentLoginFormController {
    public AnchorPane adminLoginContext;
    public JFXPasswordField admPassword;
    public JFXButton admLogin;
    public JFXTextField adminUserName;
    public Label wrongDetails;
    public AnchorPane adminContext ;

    public void backToFirstWindow(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminLoginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
    }

    public void moveToPassword(ActionEvent actionEvent) {
        admPassword.requestFocus();
    }

    public void moveToLogin(ActionEvent actionEvent) {
        admLogin.requestFocus();
    }

    public void adminDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource()==admLogin){
            String username = adminUserName.getText();
            String password = admPassword.getText();
            if(username.equalsIgnoreCase("1")&& password.equalsIgnoreCase("1")) {
                System.out.println("login success");
                Stage window = (Stage) adminLoginContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/StudentDashBoardForm.fxml"))));
                System.out.println("clicked");


            }else if
                (adminUserName.getText().isEmpty()&& admPassword.getText().isEmpty()){
                    wrongDetails.setText("Please enter your data.");



            }else {
                   wrongDetails.setText("Wrong username or password!");
                }

        }


    }




}
