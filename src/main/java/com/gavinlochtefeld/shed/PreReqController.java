package com.gavinlochtefeld.shed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

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
    private Button addDialogueButton, addNPCVisButton, finishButton, checkIDButton;

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
    private void addNPCVisPrereq(ActionEvent event) {
        String npcIn = npcPickDropdown.getValue() + "\n";
        npcVisibleLabel.setText(npcVisibleLabel.getText() + npcIn);
    }

    @FXML
    private void checkID(ActionEvent event) {
        if (idBox.getText().matches("\\d*")) {
            if (!StardewData.isFreeID(Integer.parseInt(idBox.getText()))) {
                badIDLabel.setTextFill(Color.RED);
                badIDLabel.setText("ID is already in base game");
            }
            else {
                badIDLabel.setTextFill(Color.GREEN);
                badIDLabel.setText("Good ID");
            }
        }
        else {
            badIDLabel.setTextFill(Color.RED);
            badIDLabel.setText("Not a number");
        }
    }

    public void setPrerequisite(Prerequisite pre) {
        this.prereq = pre;
    }
}
