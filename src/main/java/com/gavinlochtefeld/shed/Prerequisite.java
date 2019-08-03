package com.gavinlochtefeld.shed;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

public class Prerequisite {
    // Context
    private int id = 8675309;
    private ArrayList<String> idNotInProgress = new ArrayList<>(); // /A <dialogue id>
    private boolean festivalDay = false; // /F
    private ArrayList<String> weekdays = new ArrayList<>(); // /d <day of week>
    private double randomChance = 0.0; // /r <number>
    private String weather = ""; // /w <weather>
    private int year = 1; // /y <year>
    private ArrayList<String> seasons = new ArrayList<>(); // /z <season>

    // Current Player
    private String datingName = ""; // /D <name>
    private boolean finishedJoja = false; // /J
    private int money = 0; // /M <number
    private ArrayList<Integer> secretNotes = new ArrayList<>(); // /S <secret node id>
    private int[] currentTilePosition = new int[]{0, 0}; // /a <x> <y>
    private int bottomMineCount = 0; // /b <number>
    private int freeInventorySlots = 0; // /c <number>
    private ArrayList<String> seenEvents = new ArrayList<>(); // /e <event id>
    private HashMap<String, Integer> friendshipLevel = new HashMap<>(); // /f <name> <number>
    private String gender = ""; // /g <gender> ("male" or "female")
    private String pet = ""; // /h <pet> ("cat" or "dog")
    private ArrayList<Integer> hasItemIDs = new ArrayList<>(); // /i <item ID>
    private int playedDays = 0; // /j <number>
    private ArrayList<String> notSeenEvents = new ArrayList<>(); // /k <event ID>
    private ArrayList<String> notSeenLetters = new ArrayList<>(); // /l <letter ID>
    private int earnedMoney = 0; // /m <number>, current $ doesn't matter
    private ArrayList<String> seenLetters = new ArrayList<>(); // /n <letter ID>
    private String marriedNPC = ""; // /o <name>
    private String npcInLocation = ""; // /p <name>
    private ArrayList<String> chosenDialogueID = new ArrayList<>(); // /q <dialogue ID>
    private HashMap<String, Integer> shippedItem = new HashMap<>(); // /s <item ID> <number>
    private int[] betweenTime = new int[]{0, 0}; // /t <min time> <max time>
    private ArrayList<Integer> date = new ArrayList<>(); // /u <day of month>
    private HashMap<String, String> seeEventLetterReturnFalse = new HashMap<>(); // /x <event ID> <letter ID>

    // Host Player{
    private boolean finishedCC = false; // /C
    private boolean isHostPlayer = false; // /H
    private ArrayList<String> hostNoLetter = new ArrayList<>(); // /Hl <letter ID>
    private ArrayList<String> hostLetter = new ArrayList<>(); // /Hn <letter ID>
    private ArrayList<String> hostAndPlayerNoLetter = new ArrayList<>(); // /*l <letter ID>
    private ArrayList<String> hostAndPlayerLetter = new ArrayList<>(); // /*n <letter ID>

    public String savePrerequisites() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toString() {
        return "<Prerequisite id=" + this.id + ">";
    }

    public Prerequisite getPrerequisiteFromJSON(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Prerequisite.class);
    }

    public String exportToString() {
        String finalString = Integer.toString(this.id);
        // Player Specific
        if (!this.datingName.equals("")) finalString += "/D " + datingName;
        if (this.finishedJoja) finalString += "/J";
        if (this.money != 0) finalString += "/M " + this.money;
        if (this.secretNotes.size() > 0) {
            finalString += "/S";
            for (int note : this.secretNotes) finalString += " " + note; //TODO: Check if event should be separated
        }
        if (!this.currentTilePosition.equals(new int[]{0, 0})) finalString +=
                "/a " + this.currentTilePosition[0] + " " + this.currentTilePosition[1];
        if (this.bottomMineCount != 0)  finalString += "/b " + this.bottomMineCount;
        if (this.freeInventorySlots != 0) finalString += "/c " + this.freeInventorySlots;
        if (this.seenEvents.size() > 0) {
            finalString += "/e";
            for (String event : this.seenEvents) finalString += " " + event; //TODO: Check if events should be separated
        }
        if (this.friendshipLevel.size() > 0) {
            finalString += "/f";
            for (String name : this.friendshipLevel.keySet()) finalString += " " + name + this.friendshipLevel.get(name);
        }
        if (!this.gender.equals("")) finalString += "/g " + this.gender;
        if (!this.pet.equals("")) finalString += "/h " + this.pet;
        if (this.hasItemIDs.size() > 0) {
            finalString += "/i";
            for (int itemID : this.hasItemIDs) finalString += " " + itemID; //TODO: check if ID should be separate
        }
        if (this.playedDays != 0) finalString += "/j " + this.playedDays;
        if (this.notSeenEvents.size() > 0) {
            finalString += "/k";
            for (String events : this.notSeenEvents) finalString += " " + events; //TODO: check if separated
        }
        if (this.notSeenLetters.size() > 0) {
            finalString += "/l";
            for (String letters : this.notSeenLetters) finalString += " " + letters; //TODO: check if separated
        }
        if (this.earnedMoney != 0) finalString += "/m " + this.earnedMoney;
        if (this.seenLetters.size() > 0) {
            finalString += "/n";
            for (String letter : this.seenLetters) finalString += " " + letter;
        }
        if (!this.marriedNPC.equals("")) finalString += "/o " + this.marriedNPC;
        if (!this.npcInLocation.equals("")) finalString += "/p " + this.npcInLocation; //TODO: check if could be multiple
        if (this.chosenDialogueID.size() > 0) {
            for (String events : this.notSeenEvents) finalString += "/q " + events;
        }
        if (this.shippedItem.size() > 0) {
            finalString += "/s";
            for (String item : this.shippedItem.keySet()) finalString += " " + item + this.shippedItem.get(item);
        }
        if (this.betweenTime == new int[] {0,0}) finalString += "/t " + this.betweenTime[0] + " " + this.betweenTime[1];
        if (this.date.size() > 0) {
            for (int date : this.date) finalString += "/u " + date; //TODO: check if separated
        }
        if (this.seeEventLetterReturnFalse.size() > 0) {
            finalString += "/f";
            for (String event : this.seeEventLetterReturnFalse.keySet()) {
                finalString += " " + event + this.seeEventLetterReturnFalse.get(event);
            }
        }

        //Context
        if (this.idNotInProgress.size() > 0) {
            for (String id : this.idNotInProgress) finalString += "/A " + id;
        }
        if (this.festivalDay) finalString += "/F ";
        if (this.weekdays.size() > 0) {
            finalString += "/d";
            for (String day : this.weekdays) finalString += " " + day;
        }
        if (this.randomChance != 0.0) finalString += "/r " + this.randomChance;
        if (!this.weather.equals("")) finalString += "/w " + this.weather;
        if (this.year != 0) finalString += "/y " + this.year;
        if (this.seasons.size() > 0) {
            finalString += "/z";
            for (String season : this.seasons) finalString += " " + season;
        }
        return finalString;
    }

}
