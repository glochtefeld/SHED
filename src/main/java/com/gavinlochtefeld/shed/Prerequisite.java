package com.gavinlochtefeld.shed;

import com.google.gson.Gson;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Prerequisite {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getIdNotInProgress() {
        return idNotInProgress;
    }

    public void setIdNotInProgress(ArrayList<String> idNotInProgress) {
        this.idNotInProgress = idNotInProgress;
    }

    public boolean isFestivalDay() {
        return festivalDay;
    }

    public void setFestivalDay(boolean festivalDay) {
        this.festivalDay = festivalDay;
    }

    public ArrayList<String> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(ArrayList<String> weekdays) {
        this.weekdays = weekdays;
    }

    public double getRandomChance() {
        return randomChance;
    }

    public void setRandomChance(double randomChance) {
        this.randomChance = randomChance;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<String> seasons) {
        this.seasons = seasons;
    }

    public String getDatingName() {
        return datingName;
    }

    public void setDatingName(String datingName) {
        this.datingName = datingName;
    }

    public boolean isFinishedJoja() {
        return finishedJoja;
    }

    public void setFinishedJoja(boolean finishedJoja) {
        this.finishedJoja = finishedJoja;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Integer> getSecretNotes() {
        return secretNotes;
    }

    public void setSecretNotes(ArrayList<Integer> secretNotes) {
        this.secretNotes = secretNotes;
    }

    public int[] getCurrentTilePosition() {
        return currentTilePosition;
    }

    public void setCurrentTilePosition(int x, int y) {
        this.currentTilePosition = new int[] {x,y};
    }

    public int getBottomMineCount() {
        return bottomMineCount;
    }

    public void setBottomMineCount(int bottomMineCount) {
        this.bottomMineCount = bottomMineCount;
    }

    public int getFreeInventorySlots() {
        return freeInventorySlots;
    }

    public void setFreeInventorySlots(int freeInventorySlots) {
        this.freeInventorySlots = freeInventorySlots;
    }

    public ArrayList<String> getSeenEvents() {
        return seenEvents;
    }

    public void setSeenEvents(ArrayList<String> seenEvents) {
        this.seenEvents = seenEvents;
    }

    public HashMap<String, String> getFriendshipLevel() {
        return friendshipLevel;
    }

    public void setFriendshipLevel(HashMap<String, String> friendshipLevel) {
        this.friendshipLevel = friendshipLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public ArrayList<Integer> getHasItemIDs() {
        return hasItemIDs;
    }

    public void setHasItemIDs(ArrayList<Integer> hasItemIDs) {
        this.hasItemIDs = hasItemIDs;
    }

    public int getPlayedDays() {
        return playedDays;
    }

    public void setPlayedDays(int playedDays) {
        this.playedDays = playedDays;
    }

    public ArrayList<String> getNotSeenEvents() {
        return notSeenEvents;
    }

    public void setNotSeenEvents(ArrayList<String> notSeenEvents) {
        this.notSeenEvents = notSeenEvents;
    }

    public ArrayList<String> getNotSeenLetters() {
        return notSeenLetters;
    }

    public void setNotSeenLetters(ArrayList<String> notSeenLetters) {
        this.notSeenLetters = notSeenLetters;
    }

    public int getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(int earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public ArrayList<String> getSeenLetters() {
        return seenLetters;
    }

    public void setSeenLetters(ArrayList<String> seenLetters) {
        this.seenLetters = seenLetters;
    }

    public ArrayList<String> getNotMarriedNPC() {
        return notMarriedNPC;
    }

    public void setNotMarriedNPC(ArrayList<String> notMarriedNPC) {
        this.notMarriedNPC = notMarriedNPC;
    }

    public ArrayList<String> getNpcInLocation() {
        return npcInLocation;
    }

    public void setNpcInLocation(ArrayList<String> npcInLocation) {
        this.npcInLocation = npcInLocation;
    }

    public ArrayList<String> getChosenDialogueID() {
        return chosenDialogueID;
    }

    public void setChosenDialogueID(ArrayList<String> chosenDialogueID) {
        this.chosenDialogueID = chosenDialogueID;
    }

    public HashMap<Integer, Integer> getShippedItem() {
        return shippedItem;
    }

    public void setShippedItem(HashMap<Integer, Integer> shippedItem) {
        this.shippedItem = shippedItem;
    }

    public int[] getBetweenTime() {
        return betweenTime;
    }

    public void setBetweenTime(int[] betweenTime) {
        this.betweenTime = betweenTime;
    }

    public ArrayList<Integer> getDate() {
        return date;
    }

    public void setDate(ArrayList<Integer> date) {
        this.date = date;
    }

    public HashMap<String, String> getSeeEventLetterReturnFalse() {
        return seeEventLetterReturnFalse;
    }

    public void setSeeEventLetterReturnFalse(HashMap<String, String> seeEventLetterReturnFalse) {
        this.seeEventLetterReturnFalse = seeEventLetterReturnFalse;
    }

    public boolean isFinishedCC() {
        return finishedCC;
    }

    public void setFinishedCC(boolean finishedCC) {
        this.finishedCC = finishedCC;
    }

    public boolean isHostPlayer() {
        return isHostPlayer;
    }

    public void setHostPlayer(boolean hostPlayer) {
        isHostPlayer = hostPlayer;
    }

    public ArrayList<String> getHostNoLetter() {
        return hostNoLetter;
    }

    public void setHostNoLetter(ArrayList<String> hostNoLetter) {
        this.hostNoLetter = hostNoLetter;
    }

    public ArrayList<String> getHostLetter() {
        return hostLetter;
    }

    public void setHostLetter(ArrayList<String> hostLetter) {
        this.hostLetter = hostLetter;
    }

    public ArrayList<String> getHostAndPlayerNoLetter() {
        return hostAndPlayerNoLetter;
    }

    public void setHostAndPlayerNoLetter(ArrayList<String> hostAndPlayerNoLetter) {
        this.hostAndPlayerNoLetter = hostAndPlayerNoLetter;
    }

    public ArrayList<String> getHostAndPlayerLetter() {
        return hostAndPlayerLetter;
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
    private int year = 0; // /y <year>
    private ArrayList<String> seasons = new ArrayList<>(); // /z <season>

    // Current Player
    private String datingName = ""; // /D <name>
    private boolean finishedJoja = false; // /J
    private int money = 0; // /M <number
    private ArrayList<Integer> secretNotes = new ArrayList<>(); // /S <secret node id>
    private int[] currentTilePosition; // /a <x> <y>
    private int bottomMineCount = 0; // /b <number>
    private int freeInventorySlots = 0; // /c <number>
    private ArrayList<String> seenEvents = new ArrayList<>(); // /e <event id>
    private HashMap<String, String> friendshipLevel = new HashMap<>(); // /f <name> <number>
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
    private HashMap<Integer, Integer> shippedItem = new HashMap<>(); // /s <item ID> <number>
    private int[] betweenTime; // /t <min time> <max time>
    private ArrayList<Integer> date = new ArrayList<>(); // /u <day of month>
    private HashMap<String, String> seeEventLetterReturnFalse = new HashMap<>(); // /x <event ID> <letter ID>

    // Host Player{
    private boolean finishedCC = false; // /C
    private boolean isHostPlayer = false; // /H
    private ArrayList<String> hostNoLetter = new ArrayList<>(); // /Hl <letter ID>
    private ArrayList<String> hostLetter = new ArrayList<>(); // /Hn <letter ID>
    private ArrayList<String> hostAndPlayerNoLetter = new ArrayList<>(); // /*l <letter ID>
    private ArrayList<String> hostAndPlayerLetter = new ArrayList<>(); // /*n <letter ID>

    public void savePrerequisites() {
        Gson gson = new Gson();
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
        if (this.currentTilePosition != null) finalString +=
                "/a " + this.currentTilePosition[0] + " " + this.currentTilePosition[1];
        if (this.bottomMineCount != 0)  finalString += "/b " + this.bottomMineCount;
        if (this.freeInventorySlots != 0) finalString += "/c " + this.freeInventorySlots;
        if (this.seenEvents.size() > 0) {
            for (String event : this.seenEvents) finalString += "/e " + event;
        }
        if (this.friendshipLevel.size() > 0) {
            for (String name : this.friendshipLevel.keySet()) finalString += "/f " + name + " " + this.friendshipLevel.get(name);
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
            for (String npc : this.notMarriedNPC) finalString += "/o " + npc;
        }
        if (this.npcInLocation.size() > 0) {
            for(String name : this.npcInLocation) finalString += "/p " + name;
        }
        if (this.chosenDialogueID.size() > 0) {
            for (String events : this.notSeenEvents) finalString += "/q " + events;
        }
        if (this.shippedItem.size() > 0) {
            finalString += "/s";
            for (Integer item : this.shippedItem.keySet()) finalString += " " + item + this.shippedItem.get(item);
        }
        if (this.betweenTime != null) finalString +=
                "/t " + this.betweenTime[0] + " " + this.betweenTime[1];
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
