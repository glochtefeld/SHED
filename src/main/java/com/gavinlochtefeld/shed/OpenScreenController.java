package com.gavinlochtefeld.shed;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class OpenScreenController {

    @FXML
    private Button newProjButton;

    @FXML
    private Button openProjButton;

    @FXML
    private Button closeButton;

    @FXML
    private void handleCloseButtonAction (ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.hide();
    }

    @FXML
    private void handleNewProjButtonAction (ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("prerequisite.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Build Prerequisites");
            stage.setScene(new Scene(root));
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void handleOpenProjButtonAction (ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Project");
        File file = fileChooser.showOpenDialog( (Stage) openProjButton.getScene().getWindow());
        if (file != null) {
            openFile(file);
        }
    }

    private void openFile(File file) {
    }



    public void initialize(URL url, ResourceBundle rb) {
    }

}
