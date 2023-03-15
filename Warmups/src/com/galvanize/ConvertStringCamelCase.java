package com.galvanize;

import java.util.Arrays;

public class ConvertStringCamelCase {
    static String toCamelCase(String s){
        // split the input string into an array of words using _ and - as delimiters
        String[] words = s.split("[-_]");
        // Create the resulting camelCaseString using StringBuilder
        StringBuilder result = new StringBuilder();
        // For each loop to iterate over the input string as a charArray
        for (int i = 0; i < words.length; i++) {
            // check if current character is - or _
            String word = words[i];
            // don't camelCase the first word, just append it
            if(i == 0) {
                result.append(word);
            } else {
                // Capitalize the first letter of each word
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
        }
        // return the result as a String
        return result.toString();
    }

    static String toCamelCaseStream(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    static String toCamelCaseCharArray(String s){
        // initialize a StringBuilder
        StringBuilder camelCaseString = new StringBuilder();
        // Iterate over the input String
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // check if current character is a - or a _
            if (c == '-' || c == '_') {
                // if it is, increment i
                i++;
                // if i < length of the String, upperCase current character
                if (i < s.length()) {
                    c = Character.toUpperCase(s.charAt(i));
                }
            }
            // append character to the camelCaseString
            camelCaseString.append(c);
        }
        // return the StringBuilder as a String
        return camelCaseString.toString();
    }
}
