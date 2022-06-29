package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class StudentDashBoardFormController {

    public AnchorPane adminDashBoardContext;
    public AnchorPane adminContext;

    public void adminLogOutOnAction(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to log out?",yes,no);
        alert.setTitle("Log Out Confirmation");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.orElse(no)==yes){
            Stage window = (Stage) adminDashBoardContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
        }else {

        }
    }

    public void openAdminDashbord(ActionEvent actionEvent) throws IOException {
        System.out.println("clicked");

        Stage window = (Stage) adminDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/StudentDashBoardForm.fxml"))));


    }

    public void openAdminBookHostel(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/StudentBookHostelMenu.fxml"));
        adminContext.getChildren().add(parent);

    }

    public void openAdminMyRoomDetail(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/StudentRoomDetailMenu.fxml"));
        adminContext.getChildren().add(parent);

    }

    public void OpenAdminLogActivity(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/StudentLogActivityMenu.fxml"));
        adminContext.getChildren().add(parent);
    }

    public void openRegisterStudent(ActionEvent actionEvent) {

    }

    public void openViewStudentAccounts(ActionEvent actionEvent) {

    }

    public void openBookHostel(ActionEvent actionEvent) {

    }

    public void openHostelStudent(ActionEvent actionEvent) {

    }

    public void openManageRoom(ActionEvent actionEvent) {

    }
}
