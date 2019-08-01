package com.gavinlochtefeld.shed;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private ObservableList<String> npcNames = FXCollections.observableArrayList(
            "Alex",
            "Elliot",
            "Harvey",
            "Sam",
            "Shane",
            "Abigail",
            "Emily",
            "Haley",
            "Leah",
            "Maru",
            "Penny",
            "Caroline",
            "Clint",
            "Demetrius",
            "Dwarf",
            "Evelyn",
            "George",
            "Gus",
            "Jas",
            "Jodi",
            "Kent",
            "Krobus",
            "Lewis",
            "Linus",
            "Marnie",
            "Pam",
            "Pierre",
            "Robin",
            "Sandy",
            "Vincent",
            "Willy",
            "Wizard",
            "Gil",
            "Governer",
            "Grandpa",
            "Gunther",
            "Henchman",
            "Marlon",
            "Morris",
            "Mr. Qi"
    );

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
    private CheckBox festivalCheck;
    @FXML
    private TextField dialogueReqInput;
    @FXML
    private Label dialogueReqOutLabel = new Label("");
    @FXML
    private TextField yearEntry;
    @FXML
    private CheckBox seasonSpring;
    @FXML
    private CheckBox seasonSummer;
    @FXML
    private CheckBox seasonFall;
    @FXML
    private CheckBox seasonWinter;
    @FXML
    private Label npcVisibleLabel;
    @FXML
    private ComboBox<String> npcPickDropdown;
    @FXML
    private Button addDialogueButton;
    @FXML
    private Button addNPCVisButton;
    @FXML
    private TextField idBox;
    @FXML
    private Label badIDLabel;
    @FXML
    private Button finishButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        weatherDropdown.setItems(weathers);
        npcPickDropdown.setItems(npcNames);
    }

    @FXML
    private void addDialoguePrereq(ActionEvent event) {
        String dialogIn = dialogueReqInput.getText();
        if (dialogueReqOutLabel.getText() == "") {
            dialogueReqOutLabel.setText(dialogIn);
        }
        else {
            dialogueReqOutLabel.setText(dialogueReqOutLabel.getText() + ", " + dialogIn);
        }
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
