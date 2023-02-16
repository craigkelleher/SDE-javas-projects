package com.galvanize;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sample Tests")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LargestElementsOfArrayTest {

    @Test
    @Order(1)
    @DisplayName("Largest n elements where n = 1")
    void sampleTestOne() {
        Assertions.assertArrayEquals(new int[]{5}, LargestElementsOfArray.largest(1, new int[]{1, 2, 3, 4, 5}), "For input: n = 1, arr " +
                "= [1, 2, 3, 4, 5]");
    }

    @Test
    @Order(2)
    @DisplayName("Largest n elements where n = 2")
    void sampleTestTwo() {
        Assertions.assertArrayEquals(new int[]{5, 6}, LargestElementsOfArray.largest(2, new int[]{1, 2, 3, 4, 5, 6}), "For input: n = 2, arr = [1, 2, 3, 4, 5, 6]");
    }

    @Test
    @Order(3)
    @DisplayName("Largest n elements where n = 4")
    void sampleTestThree() {
        Assertions.assertArrayEquals(new int[]{4, 5, 6, 7}, LargestElementsOfArray.largest(4, new int[]{3, 4, 5, 6, 7}), "For input: n = 4, arr = [3, 4, 5, 6, 7]");
    }

    @Test
    @Order(4)
    @DisplayName("Largest n elements where there are duplicates")
    void sampleTestFour() {
        Assertions.assertArrayEquals(new int[]{1, 1, 2}, LargestElementsOfArray.largest(3, new int[]{1, 2, 1, 1}), "For input: n = 3, arr = [1, 2, 1, 1]");
    }

    @Test
    @Order(5)
    @DisplayName("Largest n elements where n equals the length of the array")
    void sampleTestFive() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, LargestElementsOfArray.largest(5, new int[]{1, 2, 3, 4, 5}), "For input: n = 5, arr = [1, 2, 3, 4, 5]");
    }

    @Test
    @Order(6)
    @DisplayName("Largest n elements where n = 0")
    void sampleTestSix() {
        Assertions.assertArrayEquals(new int[]{}, LargestElementsOfArray.largest(0, new int[]{7, 6, 8}), "For input: n = 0, arr = [7, 6, 8]");
    }
}