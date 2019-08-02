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
    private int[] currentTilePosition = new int[] {0,0}; // /a <x> <y>
    private int bottomMineCount = 0; // /b <number>
    private int freeInventorySlots = 0; // /c <number>
    private ArrayList<String> seenEvents = new ArrayList<>(); // /e <event id>
    private HashMap<String,Integer> friendshipLevel = new HashMap<>(); // /f <name> <number>
    private String gender = "male"; // /g <gender> ("male" or "female")
    private String pet = "cat"; // /h <pet> ("cat" or "dog")
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
    private int[] betweenTime = new int[] {0,0}; // /t <min time> <max time>
    private ArrayList<Integer> date = new ArrayList<>(); // /u <day of month>
    private HashMap<String,String> seeEventLetterReturnFalse = new HashMap<>(); // /x <event ID> <letter ID>

    // Host Player
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
        return finalString;
    }

}
