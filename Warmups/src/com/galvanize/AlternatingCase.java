package com.galvanize;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        // Create a String using StringBuilder
        StringBuilder result = new StringBuilder();
        // For each loop to iterate over the input string as a charArray
        for (char c : string.toCharArray()) {
            // check if current Character of charArray is uppercase
            if(Character.isUpperCase(c)) {
                // if it is, replace it with toLowerCase version
                result.append(Character.toLowerCase(c));
            } else {
                // else, uppercase it.
                result.append(Character.toUpperCase(c));
            }
        }
        // return the result as a String
        return result.toString();
    }
}
