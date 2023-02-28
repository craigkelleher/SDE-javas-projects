package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

    @Test
    public void testValid3() {
        assertEquals(true, checker.isValidStack("()"));
    }

    @Test
    public void testInvalid3() {
        assertEquals(false, checker.isValidStack("[(])"));
    }

    @Test
    public void testValid2() {
        assertEquals(true, checker.isValid2("()"));
    }

    @Test
    public void testInvalid2() {
        assertEquals(false, checker.isValid2("[(])"));
    }
}