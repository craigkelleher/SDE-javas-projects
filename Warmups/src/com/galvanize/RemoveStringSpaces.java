package com.galvanize;

// initialize result string (accumulator)
// for loop to iterate over array
// check if current character is not a space
//      if it is not, append to result string
// return result String.

public class RemoveStringSpaces {
    public static String noSpaceStringBuilder(final String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String noSpaceConcatenation(final String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                result += c;
            }
        }
        return result;
    }

    public static String noSpaceRegex(final String s) {
        return s.replaceAll("\\s+", "");
    }
}
