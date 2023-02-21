package com.galvanize;

public class CreditCardMask {
    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        String lastFour = str.substring(str.length() - 4);
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < str.length() - 4; i++) {
            masked.append("#");
        }
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
