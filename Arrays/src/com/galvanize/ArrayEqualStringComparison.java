package com.galvanize;

import java.util.Arrays;

public class ArrayEqualStringComparison {
    public static void main(String[] args) {
        equals(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"});
        equals(new String[]{"a", "b", "c"}, new String[]{"a", "f", "g"});
        equals(new String[]{"hi", "bye", "okay"}, new String[]{"hi", "bye", "okay", "good"});
        equals(new String[]{"hi", "bye", "okay", "good"}, new String[]{"hi", "bye", "okay"});
        equals(new String[]{"a", "b", "a", "c", "a", "d", "a", "e", "a"}, new String[]{"a", "b", "a", "c", "a", "d", "a", "e", "x"});
        equals(new String[]{"boo"}, new String[]{"boo"});
        equals(new String[]{"boo"}, new String[]{"yay"});
    }

    static boolean equals(String[] arr1, String[] arr2){
        return Arrays.equals(arr1, arr2);
    }

}
