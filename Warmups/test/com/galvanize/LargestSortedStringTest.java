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
}