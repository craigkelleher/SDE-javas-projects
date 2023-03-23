package com.galvanize;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VarArgsTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", VarArgs.whoLikesIt());
        assertEquals("Peter likes this", VarArgs.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", VarArgs.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", VarArgs.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", VarArgs.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    public void staticTestsRefactored() {
        assertEquals("no one likes this", VarArgs.whoLikesItRefactored());
        assertEquals("Peter likes this", VarArgs.whoLikesItRefactored("Peter"));
        assertEquals("Jacob and Alex like this", VarArgs.whoLikesItRefactored("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", VarArgs.whoLikesItRefactored("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", VarArgs.whoLikesItRefactored("Alex", "Jacob", "Mark", "Max"));
    }
}