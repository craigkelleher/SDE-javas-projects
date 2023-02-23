package com.galvanize;

// If string is null, return true
// Create data structure to keep track of unique characters
// Loop through the input string
// check if current character is already in the data structure
//   if it is, return false
//   if it is not, add to the data structure
// return true if loop completes without finding repeated characters

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean  isIsogram(String str) {
        if (str == null) return true;
        boolean[] seen = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            int index = str.toLowerCase().charAt(i) - 'a';
            if(seen[index]) return false;
            seen[index] = true;
        }
        return true;
    }

    public static boolean  isIsogramShort(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static boolean isIsogramWithHashSet(String str) {
        Set<Character> letters = new HashSet<Character>();
        for (int i = 0; i < str.length(); ++i) {
            if (letters.contains(str.toLowerCase().charAt(i))) {
                return false;
            }
            letters.add(str.charAt(i));
        }
        return true;
    }
}
