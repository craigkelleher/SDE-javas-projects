package com.galvanize;

public class CountCharsNumsInString {
    // count number of letters, numbers, special characters from a string Java
    public static int[] Solve(String word) {
        // create int array to hold counts
        int[] counts = new int[4];
        // Iterate over the characters in the input string
        for (char count : word.toCharArray()){
            // check if character is uppercase, lowercase, digits, special characters
            if(Character.isUpperCase(count)){
                counts[0]++;
            } // increment index 1 if lowercase letter
            else if (Character.isLowerCase(count)) {
                counts[1]++;
            } // increment index 2 if digit
            else if (Character.isDigit(count)) {
                counts[2]++;
            } // increment index 3 if special character
            else {
                counts[3]++;
            }
        }
        // Return int array
        return counts;
    }
}
