package com.galvanize;

import java.util.Arrays;

public class LargestElementsOfArray {
    public static int[] largest(int n, int[] arr) {
        // sort the array in descending order
        Arrays.sort(arr);
        // Create an array result with length n to store the first n largest elements from arr.
        int[] result = new int[n];
        int count = 0;
        // Loop over the last n elements of arr, starting from the arr.length-n index.
        for(int i = arr.length-n; i < arr.length; i++){
            // For each iteration of the loop, store the current element of arr in the result array at the index count.
            result[count] = arr[i];
            count++;
        }
        // Return the result array, which contains the first n largest elements from arr.
        return result;
    }
}
