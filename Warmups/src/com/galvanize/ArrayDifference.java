package com.galvanize;

/*
*  initialize empty list called result
*  loop through each element in list a
*   if element is not present in list b, append to result
* return result
* */

import java.util.Arrays;
import java.util.List;

public class ArrayDifference {
    public static int[] arrayDiff(int[] a, int[] b) {
        int[] result = new int[a.length];
        int count = 0;
        for (int num : a) {
            boolean present = false;
            for (int num2 : b) {
                if (num == num2) {
                    present = true;
                    break;
                }
            }
            if (!present) {
                result[count] = num;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }


    public static int[] arrayDiffLoop(int[] a, int[] b) {
        int[] result = new int[a.length];
        int count = 0;
        for (int num : a) {
            int i = 0;
            while (i < b.length && num != b[i]) {
                i++;
            }
            if (i == b.length) {
                result[count++] = num;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /*
    * 1. Create a list named result, using Arrays.stream method to create a stream of elements in array b
    * 2. Convert that stream to a list using the boxed and tolist methods.
    *       This is done so we can use contains method
    * 3. Create a new Array containing elements of a that are not present in b1 using arrays.stream
    * method ot create a stream of the elements in array a,
    * 4. filter method to keep only the elements that are not included in b1
    * 5. toArray method to convert filtered stream back to an array.
    * */

    public static int[] arrayDiffStream(int[] a, int[] b) {
        List<Integer> result = Arrays.stream(b).boxed().toList();
        return Arrays.stream(a).filter(i -> !result.contains(i)).toArray();
    }
}
