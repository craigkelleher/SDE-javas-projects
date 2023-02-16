package com.galvanize;

import java.util.HashMap;
import java.util.Map;

class MapChallenge {
    public static void main(String[] args) {
        Map<String, Boolean> hasDoneTTL = new HashMap<>();
        //Ian, Ibrahim, Charles, Robert, Robin , Vincent “Tom”, Jamal, Tarrence
        hasDoneTTL.put("Ian", true);
        hasDoneTTL.put("Craig", true);
        hasDoneTTL.put("Nmuta", false);
        String[] hasntDone = {"Roshan", "Aidan", "Reyes"};
        System.out.println(hasDoneTTL);
        addToHasGuessed(hasDoneTTL, hasntDone);
        System.out.println(hasDoneTTL);
    }

    // Add in all of the names in hasntDone to the hasDoneTTL map, but they should all map to false.
    public static void addToHasGuessed(Map<String, Boolean> hasDoneTTL, String[] hasntDone) {
        for(String name : hasntDone){
            hasDoneTTL.put(name, false);
        }
        //Arrays.stream(hasntDone).forEach(name -> hasDoneTTL.put(name, false));
    }
}