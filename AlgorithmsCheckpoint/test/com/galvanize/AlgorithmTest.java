package com.galvanize;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {
    Algorithm algorithm = new Algorithm();

    @Test
    public void allEqualTest() {
        assertFalse(algorithm.allEqual("bbBbabbbb"));
        assertFalse(algorithm.allEqual(""));
        assertTrue(algorithm.allEqual("aAa"));
        assertTrue(algorithm.allEqual("aaa"));
        assertTrue(algorithm.allEqual("AaA"));
    }

    @Test
    public void letterCountTest() {
        Map<String, Long> expected1 = new HashMap<>();
        Map<String, Long> expected2 = new HashMap<>();
        Map<String, Long> expected3 = new HashMap<>();

        expected1.put("a", 2L);
        expected2.put("a", 1L);
        expected2.put("b", 2L);
        expected2.put("c", 1L);
        expected2.put("d", 1L);

        Map<String, Long> result1 = algorithm.letterCount("aa");
        Map<String, Long> result2 = algorithm.letterCount("abBcd");
        Map<String, Long> result3 = algorithm.letterCount("");

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }

    @Test
    public void interleaveTest() {
        Algorithm algorithm = new Algorithm();

        String expectedString1 = "adbecf";
        String expectedString2 = "abcdef";
        String expectedString3 = "";
        String result1 = algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));
        String result2 = algorithm.interleave(Arrays.asList("a", "c", "e"), Arrays.asList("b", "d", "f"));
        String result3 = algorithm.interleave(Collections.emptyList(), Collections.emptyList());

        assertEquals(expectedString1, result1);
        assertEquals(expectedString2, result2);
        assertEquals(expectedString3, result3);
    }
}
