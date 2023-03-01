package com.galvanize;

public class ShortestWord {
    // split the input string 's' into an array of words using a single space character as the delimiter
        // this matches one or more wqhitespace characters (spaces,tabs,etc0
    // initialize variable to track shortestWordLength to be length of first element
    // iterates over the array of words
    // keep track of the length of the shortest word seen so far in the shortestLength variable
    // return the value of the shortestWord


    public static int findShort(String s){
        String[] words = s.split(" ");
        int shortestWordLength = words[0].length();
        for(String c : words){
            int currentWordLength = c.length();
            if(currentWordLength < shortestWordLength){
                shortestWordLength = currentWordLength;
            }
        }
        return shortestWordLength;
    }
}
