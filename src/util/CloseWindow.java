package util;

import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public interface CloseWindow {

     void CloseWindowUi(AnchorPane x) throws IOException;
    /* private void CloseWindow(String URI) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("../views/"+URI+".fxml"));
          Scene scene = new Scene(root);
          Stage stage = new Stage();
          stage.setScene(scene);
          stage.show();
     }*/
}
