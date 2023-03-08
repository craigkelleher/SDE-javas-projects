package com.galvanize;

public class CountSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // iterate over the array
        // if element is true, add to accumulator
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep){
                count++;
            }
        }
        return count;
    }
}
