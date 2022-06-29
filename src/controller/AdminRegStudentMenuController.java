package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import view.tm.StudentTM;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class AdminRegStudentMenuController implements Initializable {

    public TextField txtCusID;
    public TextField txtCusName;
    public TextField txtCusAddress;
    public TextField txtCusContract;
    public TextField txtCusDOB;
    public TextField txtCusGender;
    public TableView<StudentTM> tblStudent;
    public TableColumn colCusId;
    public TableColumn colCusName;
    public TableColumn colCusAddress;
    public TableColumn colCusContract;
    public TableColumn colCusDOB;
    public TableColumn colCusGender;
    public TableColumn colCusBtn;
    public JFXButton btnSaveStu;

    LinkedHashMap<TextField, Pattern> map = new LinkedHashMap<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }


}
