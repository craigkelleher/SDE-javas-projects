package com.galvanize;

public class SquareAndSumtInput {
    public static int squareSum(int[] n)
    {
        // Initialize accumulator
        int sum = 0;
        // loop through array
        for (int number : n) {
            // square each element and add it to the accumulator
            sum += number * number;
        }
        // return the sum of the squares of all numbers in the input array
        return sum;
    }
}
