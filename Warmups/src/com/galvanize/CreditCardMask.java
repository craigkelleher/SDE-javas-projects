package com.galvanize;

public class CreditCardMask {
    public static String maskify(String str) {
        // return str if input is length 4 or less
        if (str.length() <= 4) {
            return str;
        }
        // Save the last four characters of the input string into a new string
        String lastFour = str.substring(str.length() - 4);
        // Initialize an empty string for the masked characters
        StringBuilder masked = new StringBuilder();
        // loop over the input string, up to the last 4 characters
        // add a # character to the masked string for each char in the string
        masked.append("#".repeat(str.length() - 4));
        // concatenate the masked string and the last four characters
        return masked + lastFour;
    }

    public static String maskifyRefactored(String str) {
        if (str.length() <= 4) {
            return str;
        }
        return "#".repeat(str.length() - 4) +
                str.substring(str.length() - 4);
    }

    public static String maskifyOneLine(String str) {
        return str.length()<=4 ? str : "#".repeat(str.length() - 4) +
                str.substring(str.length() - 4);
    }
}
