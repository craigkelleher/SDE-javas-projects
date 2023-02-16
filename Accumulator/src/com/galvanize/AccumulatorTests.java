package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AccumulatorTests {

    @Test
    void totalValueTest() {
        // Create a new Accumulator
        Accumulator acc = new Accumulator();
        // Instantiate an inventory object
        Map<String, Double> inventory = new HashMap<>();
        // Put things in inventory
        inventory.put("Mazda", 20.4);
        inventory.put("Hyundai", 28.1);
        inventory.put("Ford", 3.3);
        System.out.println(inventory);

        // Calculate the total value of inventory
        double actual = acc.totalValue(inventory);
        double expected = 20.4 + 28.1 + 3.3;

        // assert expected is = actual (from totalValue)
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void findByFirstLetterTest() {
        // Setup: Create a new Accumulator
        Accumulator acc = new Accumulator();
        // Instantiate an inventory object
        List<String> listToSearch = Arrays.asList("apple", "banana",
                "cherry", "date", "elderberry", "avocado");

        List<String> expected = Arrays.asList("apple", "avocado");
        List<String> actual = acc.findByFirstLetter("a", listToSearch);
        // assert expected is = actual (from totalValue)
        assertEquals(expected, actual);
    }

    @Test
    void wordSizesTest() {
        // Setup: Create a new Accumulator
        Accumulator acc = new Accumulator();
        // Instantiate an listToStudy object
        List<String> listToStudy = Arrays.asList("apple", "banana",
                "cherry", "date", "elderberry", "avocado", "grape", "orange");
        Map<Integer, Integer> expected = new HashMap<>();
        //put things in this map
        expected.put(6,3);
        expected.put(4,1);
        expected.put(5,2);
        expected.put(7,1);
        expected.put(10,1);

        Map<Integer, Integer> actual = acc.wordSizes(listToStudy);
        assertEquals(expected, actual);
    }

    @Test
    void wordCountTest() {
        // Setup: Create a new Accumulator
        Accumulator acc = new Accumulator();
        String phrase = "The quick brown fox jumps over the lazy dog";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("The", 1);
        expected.put("quick", 1);
        expected.put("brown", 1);
        expected.put("fox", 1);
        expected.put("jumps", 1);
        expected.put("over", 1);
        expected.put("the", 1);
        expected.put("lazy", 1);
        expected.put("dog", 1);

        Map<String, Integer> result = acc.wordCount(phrase);

        assertEquals(expected, result);
    }

    @Test
    void compareArraysTest() {
        Accumulator acc = new Accumulator();

        String[] array1 = {"apple", "banana", "cherry", "date", "banana"};
        String[] array2 = {"banana", "avocado", "grape", "orange", "banana"};

        List<String> expected = Arrays.asList("banana");
        List<String> result = acc.compareArrays(array1, array2);

        assertEquals(expected, result);
    }
}