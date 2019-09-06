package com.gavinlochtefeld.shed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.paint.Color;
import org.controlsfx.control.PrefixSelectionComboBox;
import org.controlsfx.control.action.Action;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;

public class PreReqController implements Initializable {
    // Potentially passed in
    private Prerequisite prereq;
    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent content = new ClipboardContent();

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
            npcInLocationDropdown,
            monthDate;

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
            eventFalseLetterEntry,
            eventFalseEventEntry,
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

    // Host menu FXML attributes
    @FXML
    private CheckBox finishedCCCheckbox,
        isHostPlayerCheckbox;
    @FXML
    private Button hostLetterButton,
        hostNoLetterButton,
        hostAndPlayerLetterButton,
        hostAndPlayerNoLetterButton;

    @FXML
    private TextField hostLetterEntry,
        hostNoLetterEntry,
        hostAndPlayerLetterEntry,
        hostAndPlayerNoLetterEntry;

    @FXML
    private Label hostLetterLabel,
        hostNoLetterLabel,
        hostAndPlayerLetterLabel,
        hostAndPlayerNoLetterLabel;

    // Context structures
    private ArrayList<String> inProgressDialogue = new ArrayList<>();
    // Current player structures
    private HashMap<String, String> friendship = new HashMap<>();
    private ArrayList<String> notMarriedNPCs = new ArrayList<>();
    private ArrayList<Integer> secretNotes = new ArrayList<Integer>();
    private ArrayList<String> seenEvents = new ArrayList<>();
    private ArrayList<String> notSeenEvents = new ArrayList<>();
    private ArrayList<String> chosenDialogue = new ArrayList<>();
    private ArrayList<String> seenLetters = new ArrayList<>();
    private ArrayList<String> notSeenLetters = new ArrayList<>();
    private ArrayList<String> npcsInLocation = new ArrayList<>();
    private HashMap<Integer, Integer> shippedItems = new HashMap<>();
    private ArrayList<Integer> heldItems = new ArrayList<>();
    // Host structures
    private ArrayList<String> hostSeenLetters = new ArrayList<>();
    private ArrayList<String> hostNotSeenLetters = new ArrayList<>();
    private ArrayList<String> hostAndPlayerLetters = new ArrayList<>();
    private ArrayList<String> hostAndPlayerNotLetters = new ArrayList<>();



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
        monthDate.setItems(StardewData.getDates());
    }

    @FXML
    private void addDialoguePrereq(ActionEvent event) {
        String dialogIn = dialogueReqInput.getText();
        if (dialogIn != "") {
            inProgressDialogue.add(dialogIn);
            if (dialogueReqOutLabel.getText() == "") {
                dialogueReqOutLabel.setText(dialogIn);
            }
            else {
                dialogueReqOutLabel.setText(dialogueReqOutLabel.getText() + ", " + dialogIn);
            }
        }
        else
            badIDLabel.setText("Bad In Progress Dialogue ID");

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
    private void addFriendship(ActionEvent event) {
        String npc = npcFriendshipDropdown.getValue();
        if (npcHeartsDropdown.getValue() != null) {
            String hearts = npcHeartsDropdown.getValue();
            int friendshipVal = Integer.parseInt(hearts) * 250;
            String friendshipStr = Integer.toString(friendshipVal);
            friendship.put(npc, friendshipStr);
            friendsLabel.setText(friendsLabel.getText() + npc + ":" + hearts + "hearts, ");
        }
        else
            badIDLabel.setText("Set friendship level");
    }

    @FXML
    private void addNPCNotMarried(ActionEvent event) {
        String npc = npcNotMarriedDropdown.getValue();
        if (npc != null) {
            npcNotMarriedLabel.setText(npcNotMarriedLabel.getText() + npc + ", ");
            notMarriedNPCs.add(npc);
        }
        else
            badIDLabel.setText("Select not married NPC");
    }

    @FXML
    private void addSecretNote(ActionEvent event) {
        String note = secretNoteEntry.getText();
        if (isInteger(note)) {
            secretNotesLabel.setText(secretNotesLabel.getText() + note + ", ");
            secretNotes.add(Integer.parseInt(note));
        }
        else
            badIDLabel.setText("Secret Note must be an integer");
    }

    @FXML
    private void addSeenEvent(ActionEvent event) {
        String seenEvent = seenEventEntry.getText();
        if (isInteger(seenEvent)) {
            seenEventsLabel.setText(seenEventsLabel.getText() + seenEvent + ", ");
            seenEvents.add(seenEvent);
        }
        else
            badIDLabel.setText("Seen event ID must be an integer");
    }

    @FXML
    private void addNotSeenEvent(ActionEvent event) {
        String notSeenEvent = notSeenEventEntry.getText();
        if (isInteger(notSeenEvent)) {
            notSeenEventsLabel.setText(notSeenEventsLabel.getText() + notSeenEvent + ", ");
            notSeenEvents.add(notSeenEvent);
        }
        else badIDLabel.setText("Not Seen event ID must be an integer");
    }

    @FXML
    private void addChosenDialogue(ActionEvent event) {
        String chosenDialogueStr = chosenDialogueEntry.getText();
        if (chosenDialogueStr != null) {
            chosenDialogue.add(chosenDialogueStr);
            chosenDialogueLabel.setText(chosenDialogueLabel.getText() + chosenDialogueStr + ", ");
        }
        else badIDLabel.setText("Chosen Dialogue field can't be empty");
    }

    @FXML
    private void addSeenLetter(ActionEvent event) {
        String seenLetter = seenLetterEntry.getText();
        if (isInteger(seenLetter)) {
            seenLettersLabel.setText(seenLettersLabel.getText() + seenLetter + ", ");
            seenLetters.add(seenLetter);
        }
        else badIDLabel.setText("Seen letter ID must be an integer");
    }

    @FXML
    private void addNotSeenLetter(ActionEvent event) {
        String notSeenLetter = notSeenLetterEntry.getText();
        if (isInteger(notSeenLetter)) {
            notSeenLettersLabel.setText(notSeenLettersLabel.getText() + notSeenLetter + ", ");
            notSeenLetters.add(notSeenLetter);
        }
        else badIDLabel.setText("Not Seen letter ID must be an integer");
    }

    @FXML
    private void addNPCInLocation(ActionEvent event) {
        String npc = npcInLocationDropdown.getValue();
        if (npc != null) {
            npcsInLocationLabel.setText(npcsInLocationLabel.getText() + npc + ", ");
            npcsInLocation.add(npc);
        }
        else badIDLabel.setText("Can't add null NPC");
    }

    @FXML
    private void addHeldItemID(ActionEvent event) {
        String item = carriedItemIDDropdown.getValue();
        if (item != null) {
            heldItems.add(StardewData.getItemIDMap().get(item));
            itemIDLabel.setText(itemIDLabel.getText() + item + ", ");
        }
        else badIDLabel.setText("Held item is null");
    }

    @FXML
    private void addShippedItem(ActionEvent event) {
        String item = shippedItemIDDropdown.getValue();
        String number = shippedItemAmountEntry.getText();
        if (isInteger(number) && item != null) {
            shippedItemsLabel.setText(shippedItemsLabel.getText() + item + ": " + number + ", ");
            shippedItems.put(StardewData.getItemIDMap().get(item),Integer.parseInt(number));
        }
        else badIDLabel.setText("Shipped Item is null or not a number");
    }

    @FXML
    private void addHostLetter(ActionEvent event){
        String letterID = hostLetterEntry.getText();
        if (isInteger(letterID)) {
            hostLetterLabel.setText(hostLetterLabel.getText() + letterID + ", ");
            hostSeenLetters.add(letterID);
        }
        else
            badIDLabel.setText("Host seen letter ID must be a number");
    }

    @FXML
    private void addHostNotLetter(ActionEvent event){
        String letterID = hostNoLetterEntry.getText();
        if (isInteger(letterID)) {
            hostNoLetterLabel.setText(hostNoLetterLabel.getText() + letterID + ", ");
            hostNotSeenLetters.add(letterID);
        }
        else
            badIDLabel.setText("Host not seen letter ID must be a number");
    }

    @FXML
    private void addHostAndPlayerLetter(ActionEvent event){
        String eventID = hostAndPlayerLetterEntry.getText();
        if (isInteger(eventID)) {
            hostAndPlayerLetterLabel.setText(hostAndPlayerLetterLabel.getText() + eventID + ", ");
            hostAndPlayerLetters.add(eventID);
        }
        else
            badIDLabel.setText("Host seen event ID must be a number");
    }

    @FXML
    private void addHostAndPlayerNoLetter(ActionEvent event){
        String eventID = hostAndPlayerNoLetterEntry.getText();
        if (isInteger(eventID)) {
            hostAndPlayerNoLetterLabel.setText(hostAndPlayerNoLetterLabel.getText() + eventID + ", ");
            hostAndPlayerNotLetters.add(eventID);
        }
        else
            badIDLabel.setText("Host and player not seen letter ID must be a number");
    }


    @FXML
    private void saveToPrerequisite(ActionEvent event) {
        if (checkIDHelper()) {
            this.prereq = new Prerequisite();
            // context prerequisites
            this.prereq.setId(Integer.parseInt(idBox.getText()));
            if (inProgressDialogue.size() > 0)
                this.prereq.setIdNotInProgress(inProgressDialogue);
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
                this.prereq.setEarnedMoney(Integer.parseInt(money.getText()));
            if (isInteger(currentMoney.getText()))
                this.prereq.setMoney(Integer.parseInt(currentMoney.getText()));
            if (isInteger(bottomMine.getText()))
                this.prereq.setBottomMineCount(Integer.parseInt(bottomMine.getText()));
            if (isInteger(freeInventorySlots.getText()))
                this.prereq.setFreeInventorySlots(Integer.parseInt(freeInventorySlots.getText()));
            if (isInteger(playedDays.getText()))
                this.prereq.setPlayedDays(Integer.parseInt(playedDays.getText()));
            if ( isInteger(startTime.getText()) && isInteger(endTime.getText()) ) {
                this.prereq.setBetweenTime(new int[]{
                                Integer.parseInt(startTime.getText()),
                                Integer.parseInt(endTime.getText())
                        }
                );
            }
            if (datingDropdown.getValue() != null)
                this.prereq.setDatingName(datingDropdown.getValue());
            if (isInteger(xPos.getText()) && isInteger(yPos.getText()))
                this.prereq.setCurrentTilePosition(Integer.parseInt(xPos.getText()), Integer.parseInt(yPos.getText()));
            if (monthDate.getValue() != null) {
             // Apparently you can have more than one date specified
             // for a heart Event, but the only place it's used is
             // the beginning of the game. If there's demand,
             //change this.
                ArrayList<Integer> tempArray = new ArrayList<>();
                int date = Integer.parseInt(monthDate.getValue());
                tempArray.add(date);
                this.prereq.setDate(tempArray);
            }
            if (eventFalseEventEntry.getText() != null && eventFalseLetterEntry.getText() != null) {
                HashMap<String,String> tempMap = new HashMap<>();
                tempMap.put(eventFalseEventEntry.getText(),eventFalseLetterEntry.getText());
                this.prereq.setSeeEventLetterReturnFalse(tempMap);
            }
            if (friendship.size() > 0)
                this.prereq.setFriendshipLevel(friendship);
            if (notMarriedNPCs.size() > 0)
                this.prereq.setNotMarriedNPC(notMarriedNPCs);
            if (secretNotes.size() > 0)
                this.prereq.setSecretNotes(secretNotes);
            if (seenEvents.size() > 0)
                this.prereq.setSeenEvents(seenEvents);
            if (notSeenEvents.size() > 0)
                this.prereq.setNotSeenEvents(notSeenEvents);
            if (chosenDialogue.size() > 0)
                this.prereq.setChosenDialogueID(chosenDialogue);
            if (seenLetters.size() > 0)
                this.prereq.setSeenLetters(seenLetters);
            if (npcsInLocation.size() > 0)
                this.prereq.setNpcInLocation(npcsInLocation);
            if (heldItems.size() > 0)
                this.prereq.setHasItemIDs(heldItems);
            if (shippedItems.size() > 0)
                this.prereq.setShippedItem(shippedItems);
            // Host prerequisites
            if (finishedCCCheckbox.isSelected())
                this.prereq.setFinishedCC(true);
            if (isHostPlayerCheckbox.isSelected())
                this.prereq.setHostPlayer(true);
            if (hostSeenLetters.size() > 0)
                this.prereq.setHostLetter(hostSeenLetters);
            if (hostNotSeenLetters.size() > 0)
                this.prereq.setHostNoLetter(hostNotSeenLetters);
            if (hostAndPlayerLetters.size() > 0)
                this.prereq.setHostAndPlayerLetter(hostAndPlayerLetters);
            if (hostAndPlayerNotLetters.size() > 0)
                this.prereq.setHostAndPlayerNoLetter(hostAndPlayerNotLetters);



            //dialogueReqOutLabel.setText(this.prereq.exportToString());
            content.putString(this.prereq.exportToString());
            clipboard.setContent(content);
            this.prereq.savePrerequisites();

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
