package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareAndSumtInputTest {

    @Test
    void squareSum() {
        assertEquals(9, SquareAndSumtInput.squareSum(new int[] {1,2,2}));
        assertEquals(5, SquareAndSumtInput.squareSum(new int[] {1,2}));
        assertEquals(50, SquareAndSumtInput.squareSum(new int[] {5,-3,4}));
        assertEquals(0, SquareAndSumtInput.squareSum(new int[] {}));
    }
}