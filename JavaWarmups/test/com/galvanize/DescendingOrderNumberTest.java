package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderNumberTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrderNumber.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrderNumber.sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrderNumber.sortDesc(123456789));
    }
}