package com.gavinlochtefeld.shed;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;

public class Prerequisite {
    public void setId(int id) {
        this.id = id;
    }

    public void setIdNotInProgress(ArrayList<String> idNotInProgress) {
        this.idNotInProgress = idNotInProgress;
    }

    public void setFestivalDay(boolean festivalDay) {
        this.festivalDay = festivalDay;
    }

    public void setWeekdays(ArrayList<String> weekdays) {
        this.weekdays = weekdays;
    }

    public void setRandomChance(double randomChance) {
        this.randomChance = randomChance;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSeasons(ArrayList<String> seasons) {
        this.seasons = seasons;
    }

    public void setDatingName(String datingName) {
        this.datingName = datingName;
    }

    public void setFinishedJoja(boolean finishedJoja) {
        this.finishedJoja = finishedJoja;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setSecretNotes(ArrayList<Integer> secretNotes) {
        this.secretNotes = secretNotes;
    }

    public void setCurrentTilePosition(int[] currentTilePosition) {
        this.currentTilePosition = currentTilePosition;
    }

    public void setBottomMineCount(int bottomMineCount) {
        this.bottomMineCount = bottomMineCount;
    }

    public void setFreeInventorySlots(int freeInventorySlots) {
        this.freeInventorySlots = freeInventorySlots;
    }

    public void setSeenEvents(ArrayList<String> seenEvents) {
        this.seenEvents = seenEvents;
    }

    public void setFriendshipLevel(HashMap<String, Integer> friendshipLevel) {
        this.friendshipLevel = friendshipLevel;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public void setHasItemIDs(ArrayList<Integer> hasItemIDs) {
        this.hasItemIDs = hasItemIDs;
    }

    public void setPlayedDays(int playedDays) {
        this.playedDays = playedDays;
    }

    public void setNotSeenEvents(ArrayList<String> notSeenEvents) {
        this.notSeenEvents = notSeenEvents;
    }

    public void setNotSeenLetters(ArrayList<String> notSeenLetters) {
        this.notSeenLetters = notSeenLetters;
    }

    public void setEarnedMoney(int earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public void setSeenLetters(ArrayList<String> seenLetters) {
        this.seenLetters = seenLetters;
    }

    public void setNotMarriedNPC(ArrayList<String> notMarriedNPC) {
        this.notMarriedNPC = notMarriedNPC;
    }

    public void setNpcInLocation(ArrayList<String> npcInLocation) {
        this.npcInLocation = npcInLocation;
    }

    public void setChosenDialogueID(ArrayList<String> chosenDialogueID) {
        this.chosenDialogueID = chosenDialogueID;
    }

    public void setShippedItem(HashMap<String, Integer> shippedItem) {
        this.shippedItem = shippedItem;
    }

    public void setBetweenTime(int[] betweenTime) {
        this.betweenTime = betweenTime;
    }

    public void setDate(ArrayList<Integer> date) {
        this.date = date;
    }

    public void setSeeEventLetterReturnFalse(HashMap<String, String> seeEventLetterReturnFalse) {
        this.seeEventLetterReturnFalse = seeEventLetterReturnFalse;
    }

    public void setFinishedCC(boolean finishedCC) {
        this.finishedCC = finishedCC;
    }

    public void setHostPlayer(boolean hostPlayer) {
        isHostPlayer = hostPlayer;
    }

    public void setHostNoLetter(ArrayList<String> hostNoLetter) {
        this.hostNoLetter = hostNoLetter;
    }

    public void setHostLetter(ArrayList<String> hostLetter) {
        this.hostLetter = hostLetter;
    }

    public void setHostAndPlayerNoLetter(ArrayList<String> hostAndPlayerNoLetter) {
        this.hostAndPlayerNoLetter = hostAndPlayerNoLetter;
    }

    public void setHostAndPlayerLetter(ArrayList<String> hostAndPlayerLetter) {
        this.hostAndPlayerLetter = hostAndPlayerLetter;
    }

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
    private ArrayList<String> notMarriedNPC = new ArrayList<>(); // /o <name>
    private ArrayList<String> npcInLocation = new ArrayList<>(); // /p <name>
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

    @Override
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
            for (int note : this.secretNotes) finalString += "/S " + note;
        }
        if (!this.currentTilePosition.equals(new int[]{0, 0})) finalString +=
                "/a " + this.currentTilePosition[0] + " " + this.currentTilePosition[1];
        if (this.bottomMineCount != 0)  finalString += "/b " + this.bottomMineCount;
        if (this.freeInventorySlots != 0) finalString += "/c " + this.freeInventorySlots;
        if (this.seenEvents.size() > 0) {
            for (String event : this.seenEvents) finalString += "/e " + event;
        }
        if (this.friendshipLevel.size() > 0) {
            finalString += "/f";
            for (String name : this.friendshipLevel.keySet()) finalString += " " + name + this.friendshipLevel.get(name);
        }
        if (!this.gender.equals("")) finalString += "/g " + this.gender;
        if (!this.pet.equals("")) finalString += "/h " + this.pet;
        if (this.hasItemIDs.size() > 0) {
            for (int itemID : this.hasItemIDs) finalString += "/i " + itemID;
        }
        if (this.playedDays != 0) finalString += "/j " + this.playedDays;
        if (this.notSeenEvents.size() > 0) {
            for (String events : this.notSeenEvents) finalString += "/k " + events;
        }
        if (this.notSeenLetters.size() > 0) {
            for (String letters : this.notSeenLetters) finalString += "/l " + letters;
        }
        if (this.earnedMoney != 0) finalString += "/m " + this.earnedMoney;
        if (this.seenLetters.size() > 0) {
            finalString += "/n";
            for (String letter : this.seenLetters) finalString += " " + letter;
        }
        if (this.notMarriedNPC.size() > 0) {
            for (String npc : this.notMarriedNPC) finalString += "/o " + this.notMarriedNPC;
        }
        if (this.npcInLocation.size() > 0) {
            for(String name : this.npcInLocation) finalString += "/p " + this.npcInLocation;
        }
        if (this.chosenDialogueID.size() > 0) {
            for (String events : this.notSeenEvents) finalString += "/q " + events;
        }
        if (this.shippedItem.size() > 0) {
            finalString += "/s";
            for (String item : this.shippedItem.keySet()) finalString += " " + item + this.shippedItem.get(item);
        }
        if (this.betweenTime == new int[] {0,0}) finalString += "/t " + this.betweenTime[0] + " " + this.betweenTime[1];
        if (this.date.size() > 0) {
            for (int date : this.date) finalString += "/u " + date;
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
            for (String season : this.seasons) finalString += "/z " + season;
        }

        // Host Player
        if (this.finishedCC) finalString += "/C ";
        if (this.isHostPlayer) finalString += "/H ";
        if (this.hostNoLetter.size() > 0) {
            for (String letter : this.hostNoLetter) finalString += "/Hl " + letter;
        }
        if (this.hostLetter.size() > 0) {
            for (String letter : this.hostLetter) finalString += "/Hn " + letter;
        }
        if (this.hostAndPlayerNoLetter.size() > 0) {
            for (String letter : this.hostAndPlayerNoLetter) finalString += "/*l " + letter;
        }
        if (this.hostAndPlayerLetter.size() > 0) {
            for (String letter : this.hostAndPlayerLetter) finalString += "/*n " + letter;
        }
        return finalString;
    }

}
