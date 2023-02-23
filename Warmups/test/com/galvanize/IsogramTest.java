package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramTest {
    @Test
    public void FixedTests() {
        assertTrue(Isogram.isIsogram("Dermatoglyphics"));
        assertTrue(Isogram.isIsogram("isogram"));
        assertFalse(Isogram.isIsogram("moose"));
        assertFalse(Isogram.isIsogram("isIsogram"));
        assertFalse(Isogram.isIsogram("aba"));
        assertFalse(Isogram.isIsogram("moOse"));
        assertTrue(Isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(Isogram.isIsogram(""));
    }

    @Test
    public void isIsogramShortTests() {
        assertTrue(Isogram.isIsogramShort("Dermatoglyphics"));
        assertTrue(Isogram.isIsogramShort("isogram"));
        assertFalse(Isogram.isIsogramShort("moose"));
        assertFalse(Isogram.isIsogramShort("isIsogram"));
        assertFalse(Isogram.isIsogramShort("aba"));
        assertFalse(Isogram.isIsogramShort("moOse"));
        assertTrue(Isogram.isIsogramShort("thumbscrewjapingly"));
        assertTrue(Isogram.isIsogramShort(""));
    }

    @Test
    public void isIsogramHashSetTests() {
        assertTrue(Isogram.isIsogramWithHashSet("Dermatoglyphics"));
        assertTrue(Isogram.isIsogramWithHashSet("isogram"));
        assertFalse(Isogram.isIsogramWithHashSet("moose"));
        assertFalse(Isogram.isIsogramWithHashSet("isIsogram"));
        assertFalse(Isogram.isIsogramWithHashSet("aba"));
        assertFalse(Isogram.isIsogramWithHashSet("moOse"));
        assertTrue(Isogram.isIsogramWithHashSet("thumbscrewjapingly"));
        assertTrue(Isogram.isIsogramWithHashSet(""));
    }
}