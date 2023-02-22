package com.galvanize;

public class XsAndOs {
    public static boolean getXO(String str){
        // initialize accumulator for x's and o's
        int difference = 0;
        // loop through input string
        for (int i = 0; i < str.length(); i++){
            // increment x's counter if x is found
            if(str.toLowerCase().charAt(i) == 'x') difference++;
            // increment o's counter if o is found
            if(str.toLowerCase().charAt(i) == 'o') difference--;
        }
        // return true if x's is equal to o's, false otherwise
        return difference == 0;
    }
}