package com.gavinlochtefeld.shed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import org.controlsfx.control.PrefixSelectionComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;

public class PreReqController implements Initializable {
    // Potentially passed in
    private Prerequisite prereq;

    // Context Menu FXML Attributes
    @FXML
    private ComboBox<String> weatherDropdown,
            npcPickDropdown;
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
    private TextField dialogueReqInput, yearEntry, idBox, randomChance;
    @FXML
    private Label npcVisibleLabel, badIDLabel;
    @FXML
    private Label dialogueReqOutLabel = new Label("");
    @FXML
    private Button addDialogueButton, addNPCVisButton, finishButton, checkIDButton;

    // Player menu FXML Attributes
    @FXML
    private ComboBox<String> genderDropdown,
            petDropdown,
            datingDropdown,
            npcFriendshipDropdown,
            npcHeartsDropdown,
            npcNotMarriedDropdown,
            npcInLocationDropdown;

    @FXML
    private TextField money,
            currentMoney,
            bottomMine,
            freeInventorySlots,
            playedDays,
            startTime,
            endTime,
            xPos,
            yPos,
            secretNoteEntry,
            seenEventEntry,
            notSeenEventEntry,
            seenLetterEntry,
            notSeenLetterEntry,
            shippedItemAmountEntry,
            chosenDialogueEntry;

    @FXML
    private CheckBox finishedJoja;

    @FXML
    private Button addNPCFriendship,
            addSecretNote,
            addSeenEvent,
            addItemID,
            addNPCNotMarried,
            addNotSeenEvent,
            addChosenDialogue,
            addSeenLetter,
            addNotSeenLetter,
            addShippedItem,
            addNPCInLocation;
    @FXML
    private Label
            friendsLabel,
            npcNotMarriedLabel,
            secretNotesLabel,
            seenEventsLabel,
            notSeenEventsLabel,
            chosenDialogueLabel,
            seenLettersLabel,
            notSeenLettersLabel,
            npcsInLocationLabel,
            itemIDLabel,
            shippedItemsLabel;

    @FXML
    private PrefixSelectionComboBox<String> carriedItemIDDropdown,
            shippedItemIDDropdown;

    private HashMap<String, String> friendship = new HashMap<>();
    private HashMap<String, Integer> shippedItems = new HashMap<>();
    private ArrayList<Integer> heldItems = new ArrayList<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        weatherDropdown.setItems(StardewData.getWeathers());
        npcPickDropdown.setItems(StardewData.getNpcNames());

        // init current player
        genderDropdown.setItems(StardewData.getGenders());
        petDropdown.setItems(StardewData.getPets());
        datingDropdown.setItems(StardewData.getNpcNames());
        npcFriendshipDropdown.setItems(StardewData.getNpcNames());
        npcHeartsDropdown.setItems(StardewData.getHearts());
        npcNotMarriedDropdown.setItems(StardewData.getNpcNames());
        npcInLocationDropdown.setItems(StardewData.getNpcNames());
        carriedItemIDDropdown.setItems(StardewData.getItemNames());
        shippedItemIDDropdown.setItems(StardewData.getItemNames());
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
        dialogueReqInput.setText("");
    }

    @FXML
    private void addNPCVisPrereq(ActionEvent event) {
        String npcIn = npcPickDropdown.getValue() + "\n";
        npcVisibleLabel.setText(npcVisibleLabel.getText() + npcIn);
    }

    @FXML
    private void checkID(ActionEvent event) {
        if (checkIDHelper()) {
            badIDLabel.setTextFill(Color.GREEN);
            badIDLabel.setText("Good ID");
        }
        else {
            badIDLabel.setTextFill(Color.RED);
            badIDLabel.setText("ID is in base game");
        }
    }

    @FXML
    private void saveToPrerequisite(ActionEvent event) {
        if (checkIDHelper()) {
            this.prereq = new Prerequisite();
            // context prerequisites
            this.prereq.setId(Integer.parseInt(idBox.getText()));
            // Get ID list from label and turn into ArrayList
            if (!dialogueReqOutLabel.getText().equals("")) {
                String[] tempIdArray = dialogueReqOutLabel.getText().split("\\s+,\\s+");
                ArrayList<String> tempIdArrayList = new ArrayList<>(Arrays.asList(tempIdArray));
                this.prereq.setIdNotInProgress(tempIdArrayList);
            }
            this.prereq.setFestivalDay(festivalCheck.isSelected());
            // Set Weekdays
            this.prereq.setWeekdays(getWeekdayValue());
            if (checkRandNum())
                this.prereq.setRandomChance(getRandNum());
            if (weatherDropdown.getValue() != null)
                this.prereq.setWeather(weatherDropdown.getValue());
            if (isInteger(yearEntry.getText()))
                this.prereq.setYear(Integer.parseInt(yearEntry.getText()));
            this.prereq.setSeasons(getSeasons());

            // player prerequisites
            this.prereq.setFinishedJoja(finishedJoja.isSelected());
            if (genderDropdown.getValue() != null)
                this.prereq.setGender(genderDropdown.getValue());
            if (petDropdown.getValue() != null)
                this.prereq.setPet(petDropdown.getValue());
            if (isInteger(money.getText()))
                this.prereq.setMoney(Integer.parseInt(money.getText()));
            if (isInteger(bottomMine.getText()))
                this.prereq.setBottomMineCount(Integer.parseInt(bottomMine.getText()));
            if (isInteger(freeInventorySlots.getText()))
                this.prereq.setFreeInventorySlots(Integer.parseInt(freeInventorySlots.getText()));
            if (isInteger(playedDays.getText()))
                this.prereq.setPlayedDays(Integer.parseInt(playedDays.getText()));
            if ( isInteger(startTime.getText()) && isInteger(endTime.getText()) )
                this.prereq.setBetweenTime(new int[] {
                        Integer.parseInt(startTime.getText()),
                        Integer.parseInt(endTime.getText())
                    }
                );
            if ( isInteger(xPos.getText()) && isInteger(yPos.getText()) )
                this.prereq.setBetweenTime(new int[] {
                                Integer.parseInt(xPos.getText()),
                                Integer.parseInt(yPos.getText())
                        }
                );

            dialogueReqOutLabel.setText(this.prereq.exportToString());

        }
        else {
            badIDLabel.setTextFill(Color.RED);
            badIDLabel.setText("ID is in base game");
        }
    }

    private ArrayList<String> getWeekdayValue() {
        ArrayList<String> weekdays = new ArrayList<>();
        if (dayMon.isSelected()) weekdays.add("Mon");
        if (dayTue.isSelected()) weekdays.add("Tue");
        if (dayWed.isSelected()) weekdays.add("Wed");
        if (dayThu.isSelected()) weekdays.add("Thu");
        if (dayFri.isSelected()) weekdays.add("Fri");
        if (daySat.isSelected()) weekdays.add("Sat");
        if (daySun.isSelected()) weekdays.add("Sun");
        return weekdays;
    }

    private ArrayList<String> getSeasons() {
        ArrayList<String> seasons = new ArrayList<>();
        if (seasonSpring.isSelected()) seasons.add("spring");
        if (seasonSummer.isSelected()) seasons.add("summer");
        if (seasonFall.isSelected()) seasons.add("fall");
        if (seasonWinter.isSelected()) seasons.add("winter");
        return seasons;
    }

    private boolean checkIDHelper() {
        if (isInteger(idBox.getText())) {
            if (StardewData.isFreeID(Integer.parseInt(idBox.getText())))
                return true;
        }
        return false;
    }

    private boolean isInteger(String possibleInt) {
        if (possibleInt.matches("\\d+"))
            return true;
        return false;
    }
    private boolean checkRandNum() {
        if (randomChance.getText().matches("0?\\.?\\d*")) {
            if (Double.parseDouble(randomChance.getText()) < 100.0)
                return true;
        }
        badIDLabel.setTextFill(Color.RED);
        badIDLabel.setText("Invalid Random Number");
        return false;
    }

    private double getRandNum() {
        double random = Double.parseDouble(randomChance.getText());
        if (random > 1.0)
            return random / 100;
        return random;
    }

    public void setPrerequisite(Prerequisite pre) {
        this.prereq = pre;
    }
}
