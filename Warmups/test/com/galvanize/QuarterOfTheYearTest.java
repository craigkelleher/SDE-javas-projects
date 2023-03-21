package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuarterOfTheYearTest {

    @Test
    public void exampleTests() {
        assertEquals(1, QuarterOfTheYear.quarterOf(2));
        assertEquals(3, QuarterOfTheYear.quarterOf(8));
        assertEquals(4, QuarterOfTheYear.quarterOf(11));
        assertEquals(2, QuarterOfTheYear.quarterOf(5));
        assertEquals(2, QuarterOfTheYear.quarterOf(6));
        assertEquals(1, QuarterOfTheYear.quarterOf(1));
        assertEquals(3, QuarterOfTheYear.quarterOf(9));
        assertEquals(4, QuarterOfTheYear.quarterOf(12));
    }
}