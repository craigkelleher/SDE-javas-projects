package com.galvanize;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrrayToArrayList {
    public static void main(String[] args) {

        /* Complete the "converter" method below so that given an array of Strings,
        it returns an ArrayList of the same Strings */
        String[] words = {"fee", "fi", "fo", "fum"};
        ArrayList<String> listy = converter(words);
        ArrayList<String> listy2 = converterLoop(words);

        // the line below should print "size: 4"
        System.out.println("size: "+listy.size());
        System.out.println("size: "+listy2.size());
    }
    public static ArrayList<String> converter(String[] words){
        ArrayList<String> converted = new ArrayList<String>();
        Collections.addAll(converted, words);
        return converted;
    }

    public static ArrayList<String> converterLoop(String[] words){
        ArrayList<String> converted = new ArrayList<String>();
        for(String newWords : words){
            converted.add(newWords);
        }
        return converted;
    }
}