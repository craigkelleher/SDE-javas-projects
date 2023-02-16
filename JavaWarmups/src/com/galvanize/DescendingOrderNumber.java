package com.galvanize;

public class DescendingOrderNumber {
    public static int sortDesc(final int num) {
        // 1. Convert the input integer into an array of digits
        int[] digits = new int[10];
        int n = num;
        while (n > 0) {
            // The input integer is divided by 10 repeatedly until it becomes 0,
            //  giving us each individual digit in the number
            int digit = n % 10;
            digits[digit]++;
            n /= 10;
        }
        int result = 0;
        // 2. Sort the Array of digits in descending order
        // The array of digits is sorted in descending order using a for loop from 9 to 0.
        for (int i = 9; i >= 0; i--) {
            // 3. Build the output integer from the sorted array of digits
            // Concatenating each digit from the sorted array.
            // For each iteration, current digit is added to it by multiplying the output
            //  integer by 10 to make room for the new digit, then adding the digit.
            for (int j = 0; j < digits[i]; j++) {
                result = result * 10 + i;
            }
        }
        // 4. Return the output integer, which is the input integer with its digits rearranged in decending order
        return result;
    }
}
