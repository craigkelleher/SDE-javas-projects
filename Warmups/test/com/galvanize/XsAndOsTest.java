package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XsAndOsTest {
    @Test
    public void testSomething1() {
        assertTrue(XsAndOs.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertTrue(XsAndOs.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertFalse(XsAndOs.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertFalse(XsAndOs.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertFalse(XsAndOs.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertTrue(XsAndOs.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertFalse(XsAndOs.getXO("Xxxxertr34"));
    }
}