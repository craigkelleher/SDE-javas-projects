package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStringSpacesTest {

    @Test public void testSomethingStringBuilder() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpaceStringBuilder("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpaceStringBuilder("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpaceStringBuilder("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpaceStringBuilder("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpaceStringBuilder("8j aam"));
    }

    @Test public void testSomethingConcatenation() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpaceConcatenation("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpaceConcatenation("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpaceConcatenation("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpaceConcatenation("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpaceConcatenation("8j aam"));
    }

    @Test public void testSomethingnoSpaceRegex() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpaceRegex("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpaceRegex("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpaceRegex("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpaceRegex("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpaceRegex("8j aam"));
    }
}