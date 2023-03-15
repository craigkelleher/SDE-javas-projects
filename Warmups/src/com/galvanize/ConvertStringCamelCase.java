package com.galvanize;

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
}
