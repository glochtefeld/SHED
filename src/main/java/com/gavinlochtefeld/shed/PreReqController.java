package com.gavinlochtefeld.shed;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PreReqController implements Initializable {

    // Context menu attributes
    private ObservableList<String> weathers = FXCollections.observableArrayList("rainy", "sunny");

    // Context Menu FXML Attributes
    @FXML
    private ComboBox<String> weatherDropdown;
    @FXML
    private CheckBox dayMon;
    @FXML
    private CheckBox dayTue;
    @FXML
    private CheckBox dayWed;
    @FXML
    private CheckBox dayThu;
    @FXML
    private CheckBox dayFri;
    @FXML
    private CheckBox daySat;
    @FXML
    private CheckBox daySun;
    @FXML
    private TextField idBox;
    @FXML
    private Label badIDLabel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        weatherDropdown.setItems(weathers);
    }

    @FXML
    private void buildPrerequisite(ActionEvent event) {
        if (!Prerequisite.isFreeID(Integer.valueOf(idBox.getText()))) {
            badIDLabel.setText("ID is already in base game");
        }
        else {
            badIDLabel.setText("Good ID");
        }
    }
}
