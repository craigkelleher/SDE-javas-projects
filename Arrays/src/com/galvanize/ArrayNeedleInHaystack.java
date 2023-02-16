package com.galvanize;

import java.util.Arrays;

class ArrayNeedleInHaystack {
    public static void main(String[] args) {
        String[] haystack = {"the", "quick", "brown", "fox", "always", "pushes",
                "the", "needle", ".", "happy", "new", "year", "by.", "the",
                "way", ", Hello ! "};

        String message = findNeedle(haystack);
        System.out.println(message);
    }

//    public static String findNeedle(String[] haystack) {
//        String needle = "needle";
//        int index;
//
//        for(index = 0; index < haystack.length; index++){
//            if(haystack[index] == needle){
//                return haystack[index];
//            }
//        }
//        return "needle not found";
//    }

    public static String findNeedle(String[] haystack){
        return String.format("needle found at index: %d", Arrays.asList(haystack).indexOf("needle"));
    }
}