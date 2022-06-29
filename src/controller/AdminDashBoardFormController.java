package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class AdminDashBoardFormController {

    public AnchorPane repDashBoardContext;
    public AnchorPane adminLoginContext;

    public AnchorPane StudentContext;
    public AnchorPane StudentDashBoardContext;
    public TableView StuLastActiveTbl;
    public TableColumn colNumber;
    public TableColumn colStuRegNo;
    public TableColumn colLastActive;

    public void initialize(){

        colNumber.setCellValueFactory(new PropertyValueFactory("ColNo"));
        colStuRegNo.setCellValueFactory(new PropertyValueFactory("Student_RegN0"));
        colLastActive.setCellValueFactory(new PropertyValueFactory("LastAct"));


        try {
            loadAllCustomers();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    private void loadAllCustomers() throws ClassNotFoundException, SQLException {


    }


    public void repLogOutOnAction(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to log out?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType>result = alert.showAndWait();

        if(result.orElse(no)==yes){
            Stage window = (Stage) StudentDashBoardContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
        }else {
        }
    }

    public void openAdminDashbord(ActionEvent actionEvent) throws IOException {

        Stage window = (Stage) StudentDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));
    }

    public void openRegisterStudent(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/AdminRegStudentMenu.fxml"));
        StudentContext.getChildren().add(parent);
    }

    public void openViewStudentAccounts(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/AdminViewStudentAccountsMenu.fxml"));
        StudentContext.getChildren().add(parent);
    }

    public void openBookHostel(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/AdminBookHostelmenu.fxml"));
        StudentContext.getChildren().add(parent);
        System.out.println("clicked");
    }

    public void openHostelStudent(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/AdminHostelStudentMenu.fxml"));
        StudentContext.getChildren().add(parent);
    }

    public void openManageRoom(ActionEvent actionEvent) throws IOException {
        Parent parent =FXMLLoader.load(getClass().getResource("../view/AdminManageRoomsMenu.fxml"));
        StudentContext.getChildren().add(parent);
    }

    public void openManageCourses(ActionEvent actionEvent) throws IOException {
        System.out.println("clicked");
        //Parent parent =FXMLLoader.load(getClass().getResource("../view/AdminManageRoomsMenu.fxml.fxml"));
        //StudentContext.getChildren().add(parent);

    }
}
