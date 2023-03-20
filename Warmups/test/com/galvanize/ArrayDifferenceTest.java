package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDifferenceTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, ArrayDifference.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, ArrayDifference.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, ArrayDifference.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, ArrayDifference.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, ArrayDifference.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void sampleTestsLoop() {
        assertArrayEquals(new int[] {2}, ArrayDifference.arrayDiffLoop(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, ArrayDifference.arrayDiffLoop(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, ArrayDifference.arrayDiffLoop(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, ArrayDifference.arrayDiffLoop(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, ArrayDifference.arrayDiffLoop(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void sampleTestsStream() {
        assertArrayEquals(new int[] {2}, ArrayDifference.arrayDiffStream(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, ArrayDifference.arrayDiffStream(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, ArrayDifference.arrayDiffStream(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, ArrayDifference.arrayDiffStream(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, ArrayDifference.arrayDiffStream(new int [] {}, new int[] {1,2}));
    }
}