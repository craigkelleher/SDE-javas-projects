package com.galvanize;

import java.util.List;

public class MixedArray {
    public int sum(List<?> mixed) {
        // initialize sum accumulator
        int total = 0;
        // loop through each element of input list with a for each loop
        for (Object element : mixed) {
            //if element is an Integer, add to accumulator
            if (element instanceof Integer) {
                total += (int) element;
            } // if element is a string, add to accumulator
            else if (element instanceof String) {
                total += Integer.parseInt((String) element);
            }
        }
        // return total
        return total;
    }

    // loop through each element of input
    // convert everything to a string using concatenation
    // parse String to an int and add to running total
    public int sum2(List<?> mixed){
        int total = 0;
        for (Object element : mixed) {
            total += Integer.parseInt("" + element);
        }
        return total;
    }

    static public int sum3(List<?> mixed) {
        int total = 0;
        for (Object listItem : mixed) {
            if(listItem instanceof String){
                total += Integer.parseInt((String) listItem);
            }
            else if(listItem instanceof Integer){
                total += (Integer) listItem;
            }
        }
        return total;
    }
}
