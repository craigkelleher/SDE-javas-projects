package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class RgbToHex {

    public static String rgbUsingStringFormatter(int r, int g, int b) {
        // Math.min returns smaller of 255 and result of Math.max(0,r), so <= 255
        // round value to the closest edge
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        // Once input is verified 0 to 255, we then pass it to String.format
        // %: starts a format specifier
        // 0: output should be padded with zeros if needed
        // 2: output should have a minimum width of 2 chars
        // X: argument should be formatted as uppercase Hexadecimal integer
        /*
        each of the arguments r, g, and b are formatted as uppercase hexadecimal
        integers and padded with leading zeros if needed to ensure a minimum width
        of 2 characters. The resulting hexadecimal values are concatenated to form
        a single 6-character string, which represents the color code in hexadecimal
        format.
        */
        return String.format("%02X%02X%02X", r, g, b);
    }

    public static String rgbUsingToHexString(int r, int g, int b) {
        // Math.min returns smaller of 255 and result of Math.max(0,r), so <= 255
        // set r, g, or b to be within 0 to 255
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        String result = toHexString(r) + toHexString(g) + toHexString(b);
        return result;
    }

    private static String toHexString(int value) {
        // convert the decimal value to a hexadecimal string
        // use toUpperCase to convert it to uppercase
        // if the length of the hexidecimal string is 1, add a 0 to the front of it
        String hex = Integer.toHexString(value).toUpperCase();
        return hex.length() == 1 ? "0" + hex : hex;
    }

    //  r, g, and b represent the values for the red, green, and blue color channels of an RGB color value.
    public static String rgbNoJavaBuiltMethods(int r, int g, int b) {
        // bounds check, ensure input between 0-255
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));

        // Create an array 'hex' of characters containing hexadecimal characters 0-9 and A-F
        char[] hex = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        // The r, g, and b values are then converted to hexadecimal and concatenated together to form a single string.
        // to convert, the values r, g, and b are divided by 16 to get their most significant digit
        // the remainder of the division by 16 is used to get their least significant digit.
        String result = String.valueOf(hex[r / 16]) +
                hex[r % 16] +
                hex[g / 16] +
                hex[g % 16] +
                hex[b / 16] +
                hex[b % 16];
        return result;
    }

    public static String rgbUsingStringBuffer(int r, int g, int b) {
        Map<Integer, Character> hexMap = new HashMap<>();
        // Map 0-9 by casting integers to characters and store them in the map
        for (int i = 0; i <= 9; i++) {
            hexMap.put(i, (char)('0' + i));
        }
        hexMap.put(10, 'A');
        hexMap.put(11, 'B');
        hexMap.put(12, 'C');
        hexMap.put(13, 'D');
        hexMap.put(14, 'E');
        hexMap.put(15, 'F');

        // Result is used to build the representation of the hexadecimal color
        StringBuffer result = new StringBuffer();
        // For each RGB value, compute the quotient and remainder of value dvided by 16
        // This will index into the hexMap and retrieve corresponding hexadecimal characters
        for (int num : new int[]{r, g, b}) {
            int quotient = Math.min(255, Math.max(0, num)) / 16;
            int remainder = Math.min(255, Math.max(0, num)) % 16;
            // Finally, append the characters to the result string
            result.append(hexMap.get(quotient));
            result.append(hexMap.get(remainder));
        }
        return result.toString();
    }
}
