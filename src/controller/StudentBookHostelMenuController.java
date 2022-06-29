package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import view.tm.StudentTM;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class StudentBookHostelMenuController  implements Initializable {

    public TextField txtCusID;
    public TextField txtCusName;
    public TextField txtCusAddress;
    public TableView<StudentTM> tblStudent;
    public TextField txtCusContract;
    public TextField txtCusDOB;
    public TextField txtCusGender;
    public JFXButton btnSaveStu;
    public TableColumn colCusName;
    public TableColumn colCusId;
    public TableColumn colCusAddress;
    public TableColumn colCusGender;
    public TableColumn colCusContract;
    public TableColumn colCusBtn;
    public TableColumn colCusDOB;

    LinkedHashMap<TextField, Pattern> map = new LinkedHashMap<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void textFields_Key_Released(KeyEvent keyEvent) {

    }



    public void clearAllTexts() {
        txtCusID.clear();
        txtCusName.clear();
        txtCusAddress.clear();
        txtCusContract.clear();
        txtCusDOB.clear();
        txtCusGender.clear();
        txtCusID.requestFocus();

        setBorders(txtCusID,txtCusName,txtCusAddress,txtCusContract,txtCusDOB,txtCusGender);
    }
    public void setBorders(TextField... textFields){
        for (TextField textField : textFields) {
            textField.getParent().setStyle("-fx-border-color: rgba(76, 73, 73, 0.83)");
        }
    }

}
