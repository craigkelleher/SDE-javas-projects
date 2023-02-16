package com.galvanize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class Accumulator {

    /**
     * Calculate the total value of the inventory presented
     * @param inventory Inventory to sum
     * @return Total value of line items in inventory
     */
    public double totalValue(Map<String, Double> inventory){
        // create and initialize total variable
        double total = 0;
        // calculate total of inventory map by looping through the map
        for(Double cars : inventory.values()){
            total += cars;
        }
        // return total
        return total;
    }

    /**
     * Returns all words from a list of words that begin with a specific letter
     * @param firstLetter - Find words that start with this letter
     * @param listToSearch - The list of words to search through
     * @return Words that begin with that letter
     */
    public List<String> findByFirstLetter(String firstLetter, List<String> listToSearch){
        List<String> wordsWithFirstLetter = new ArrayList<>();

        // loop through listToSearch to find matching words
        for (String word : listToSearch){
            if(word.startsWith(firstLetter)){
                wordsWithFirstLetter.add(word);
            }
        }
        System.out.println(wordsWithFirstLetter);
        return wordsWithFirstLetter;
    }

    /**
     * Count the letters in each word, return a Map of the number of letters, and how many
     *      words have the same number of letters
     * @param listToStudy The list of words to evaluate
     * @return Report of number of letters, and the count of words that have the same number of letters
     */
    public Map<Integer, Integer> wordSizes(List<String> listToStudy){
        // Instantiate a Map:
        Map<Integer, Integer> newMap = new HashMap<>();
        // loop over the listToStudy
        for(String word : listToStudy){
            int length = word.length();
            // find the length of the word, and store the length and count in a map
            // left key is word length, right value is count of occurrences for that word length
            if (newMap.containsKey(length)){
                newMap.put(length, newMap.get(length) + 1);
            }
            else{
                newMap.put(length, 1);
            }
        }
        // Create a map from the list
        // returns a map
        System.out.println(newMap);
        return newMap;
    }

    /**
     * Report on the number of times a word shows up in a string
     * @param phrase The phrase to count the words
     * @return Report as a map of words and the number of time they appeared in the phrase
     */
    public Map<String, Integer> wordCount(String phrase){
        // Instantiate a Map:
        Map<String, Integer> newMap = new HashMap<>();
        String[] words = phrase.split("\\s+");
        // loop over the String Array words
        for(String word : words){
            if(newMap.containsKey(word)){
                newMap.put(word, newMap.get(word) + 1);
            }
            else{
                newMap.put(word, 1);
            }
        }
        System.out.println(newMap);
        return newMap;
    }

    /**
     * Return a List of Strings that are common between two arrays
     * @param array1 Array to compare
     * @param array2 Array to compare
     * @return List of common strings
     */
    public List<String> compareArrays(String[] array1, String[] array2){
        List<String>commonString = new ArrayList<>();

        for(String word : array1){
            for(String word2 : array2){
                if(word.equals(word2) && !commonString.contains(word)){
                    commonString.add(word);
                }
            }
        }
        System.out.println(commonString);
        return commonString;
    }
}
