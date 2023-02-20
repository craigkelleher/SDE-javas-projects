package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAndSumInputTest {

    @Test
    void squareSum() {
        assertEquals(9, SquareAndSumInput.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareAndSumInput.squareSum(new int[] {1,2}));
        assertEquals(50, SquareAndSumInput.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareAndSumInput.squareSum(new int[] {}));
    }
}