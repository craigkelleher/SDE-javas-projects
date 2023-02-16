package com.galvanize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithm {

    public boolean allEqual(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char firstChar = str.toLowerCase().charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }

    public Map<String, Long> letterCount(String str) {
        Map<String, Long> letterCountMap = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            letterCountMap.put(String.valueOf(c), letterCountMap.getOrDefault(String.valueOf(c), 0L) + 1);
        }
        return letterCountMap;
    }

    public String interleave(List<String> list1, List<String> list2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list1.size(); i++) {
            result.append(list1.get(i));
            result.append(list2.get(i));
        }
        return result.toString();
    }
}
