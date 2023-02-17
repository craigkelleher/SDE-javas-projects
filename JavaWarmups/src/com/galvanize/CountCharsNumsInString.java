package com.galvanize;

public class CountCharsNumsInString {
    public static int[] Solve(String word) {
        //count number of letters, numbers, special characters from a string Java
        // create int array to hold counts
        // Iterate over the characters in the input string
        // Assign index 0 of array the number of uppercase letters
        // Assign index 1 of array the number of lowercase letters
        // Assign index 2 of array the number of digits
        // Assign index 3 of array the number of special characters
        // Return int array
        int[] counts = new int[4];

        for (char count : word.toCharArray()){
            if(Character.isUpperCase(count)){
                counts[0]++;
            } else if (Character.isLowerCase(count)) {
                counts[1]++;
            } else if (Character.isDigit(count)) {
                counts[2]++;
            }else {
                counts[3]++;
            }
        }
        return counts;
    }
}
