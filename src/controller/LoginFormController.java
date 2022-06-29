package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {
    public AnchorPane loginContext;
    public ProgressBar progressBar;
    public Label myLbl;
    BigDecimal progress=new BigDecimal(String.format("%.2f",0.0));

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        progressBar.setStyle("-fx-accent:#00F00;");

    }

    public void openReceptionistLoginWindow(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) loginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/StudentLoginForm.fxml"))));
    }

    public void openAdminLoginWindow(ActionEvent actionEvent) throws IOException {
        Random r = new Random();

        for (int i = 1; i <= 10; i++) {
            int Random = (int) (Math.random() * 1000);
            System.out.println(Random);

            if (progress.doubleValue() < 1) {
                progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
                System.out.println(progress.doubleValue());
                progressBar.setProgress(progress.doubleValue());
                myLbl.setText((int) Math.round(progress.doubleValue() * 100) + "%");
            }
        }
        Stage window = (Stage) loginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminLoginForm.fxml"))));
    }



    }


