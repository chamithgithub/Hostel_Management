package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class AdminManageRoomsMenuController implements Initializable {

    public TableView RmManageTbl;
    public TableColumn colRoom_ID;
    public TableColumn colRoom_Type;
    public TableColumn colMonthly_retal;
    public TableColumn colRooms_Qty;
    public TableColumn colOption;
    public JFXButton btnAddRoom;
    public ComboBox cmbRMType;
    public TextField txtRmId;
    public TextField txtMonthPrice;
    public TextField txtRmQty;

    LinkedHashMap<TextField, Pattern> map = new LinkedHashMap<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }


}
