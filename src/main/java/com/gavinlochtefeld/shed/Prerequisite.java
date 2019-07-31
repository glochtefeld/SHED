package com.gavinlochtefeld.shed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Prerequisite {
    private static final List<Integer> TAKEN_ID = Arrays.asList(35, 36, 4, 831125, 2481135, 34, 45, 53, 639373, 101, 233104,
            611439, 191393, 502261, 502969, 463391, 611173, 611173, 2123243, 92, 3910674, 3910974, 3900074, 691039,
            50, 51, 584059, 18, 19, 21, 2119820, 56, 2123343, 2120303, 528052, 529952, 67, 5, 47, 2346097, 2346096,
            2346095, 2346094, 2111194, 2111294, 3333094, 2346093, 2346092, 2346091, 2146991, 55, 63, 992553, 900553,
            992253, 65, 66, 690006, 68, 69, 70, 71, 72, 73, 74, 75, 76, 706, 707, 1590166, 897405, 91, 93, 102,
            2118991, 2128292, 901756, 100162, 39, 423502, 11, 12, 15, 917409, 471942, 195019, 195012, 2, 8, 26,
            384883, 384882, 404798, 371652, 95, 94, 44, 46, 100, 38, 7, 57, 571102, 40, 96, 97, 911526, 195099,
            195013, 6, 9, 25, 33, 10, 503180, 13, 20, 288847, 29, 43, 733330, 739330, 711130, 1848481, 0, 112, 418172,
            60367, 4081148, 9581348, 520702, 2794460, 27, 14, 52, 54, 181928, 318560, 611944, 3910975, 3910979, 558291,
            558292, 1, 3, 16, 17, 58, 3102768);
    private static final HashSet<Integer> TAKEN = new HashSet<>(TAKEN_ID);

    private int id;
    private ArrayList<String> contextReq = new ArrayList<>();
    private ArrayList<String> currentPlayerReq = new ArrayList<>();
    private ArrayList<String> hostPlayerReq = new ArrayList<>();


    public static boolean isFreeID(int id) {
        if (TAKEN.contains(id))
            return false;
        return true;
    }

    public Prerequisite(int potentialID) throws Exception {
        if (isFreeID(potentialID))
            throw new Exception();
        else {
            this.id = potentialID;
        }
    }


    public void add(String reqArea, ArrayList<String> req) throws IllegalStateException {
        switch (reqArea) {
            case "context":
                this.contextReq.addAll(req);
                break;
            case "currentPlayer":
                this.currentPlayerReq.addAll(req);
                break;
            case "hostPlayer":
                this.hostPlayerReq.addAll(req);
            default:
                throw new IllegalStateException("Unexpected value: " + reqArea);
        }
    }
    /*
    public HashMap<String,ArrayList<String>> exportToHashMap() {
    TODO: Export as hashmap
    }
    */

    public String exportToString() {
        String finalString = Integer.toString(this.id);
        for (String s : this.hostPlayerReq) finalString += "/" + s;
        for (String s : this.currentPlayerReq) finalString += "/" + s;
        for (String s : this.contextReq) finalString += "/" + s;
        return finalString;
    }

}
