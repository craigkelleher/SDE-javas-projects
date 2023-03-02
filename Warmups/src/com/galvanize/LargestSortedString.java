package com.galvanize;

import java.util.Arrays;

public class LargestSortedString {
    // concatenate the two input strings into a new string
    // initialize a result string using string builder.
    // loop through string from 'a' to 'z'
    // check if current character appears in the string
    // if it does, append to result string
    // return the result string.

    public static String longest (String s1, String s2) {
        StringBuilder result = new StringBuilder();
        String s = s1 + s2;
        for (char c = 'a'; c <= 'z'; c++)
        {
            if (s.contains(c + "")) result.append(c);
        }
        return result.toString();
    }

    public static String oneLineSolution(String s1, String s2) {
        return (s1 + s2).chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
