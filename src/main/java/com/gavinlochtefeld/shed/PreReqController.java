package com.gavinlochtefeld.shed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class PreReqController implements Initializable {
    // Potentially passed in
    private Prerequisite prereq;

    // Context Menu FXML Attributes
    @FXML
    private ComboBox<String> weatherDropdown, npcPickDropdown;
    @FXML
    private CheckBox dayMon,
        dayTue,
        dayWed,
        dayThu,
        dayFri,
        daySat,
        daySun,
        festivalCheck,
        seasonSpring,
        seasonSummer,
        seasonFall,
        seasonWinter;

    @FXML
    private TextField dialogueReqInput, yearEntry, idBox;
    @FXML
    private Label npcVisibleLabel, badIDLabel;
    @FXML
    private Label dialogueReqOutLabel = new Label("");
    @FXML
    private Button addDialogueButton, addNPCVisButton, finishButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        weatherDropdown.setItems(StardewData.getWeathers());
        npcPickDropdown.setItems(StardewData.getNpcNames());
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
        if (!StardewData.isFreeID(Integer.valueOf(idBox.getText()))) {
            badIDLabel.setText("ID is already in base game");
        }
        else {
            badIDLabel.setText("Good ID, data copied to clipboard");
        }
    }

    private void setPrerequisite(Prerequisite pre) {
        this.prereq = pre;
    }
}
