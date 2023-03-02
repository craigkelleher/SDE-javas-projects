package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSortedStringTest {

    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", LargestSortedString.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", LargestSortedString.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", LargestSortedString.longest("inmanylanguages", "theresapairoffunctions"));
    }

    @Test
    public void test1a() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", LargestSortedString.longestV2("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", LargestSortedString.longestV2("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", LargestSortedString.longestV2("inmanylanguages", "theresapairoffunctions"));
    }

    @Test
    public void test2() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", LargestSortedString.oneLineSolution("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", LargestSortedString.oneLineSolution("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", LargestSortedString.oneLineSolution("inmanylanguages", "theresapairoffunctions"));
    }
}