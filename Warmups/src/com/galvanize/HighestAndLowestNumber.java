package com.galvanize;

public class HighestAndLowestNumber {
    public static String highAndLow(String numbers) {
        // split the input string by spaces into a String array
        // initialize int variables for min and max numbers
        // loop through String array
            // compare each number to max and min, update them accordingly
        // return the string concatenation of max + space + min.

        String[] numArr = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String s : numArr) {
            int num = Integer.parseInt(s);
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return String.format("%s %s", max, min);
    }
}
