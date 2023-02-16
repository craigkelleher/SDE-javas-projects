package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbToHexTest {

    @Test
    public void rgbStringFormatterTest() {
        assertEquals("000000", RgbToHex.rgbUsingStringFormatter(0, 0, 0));
        assertEquals("010203", RgbToHex.rgbUsingStringFormatter(1, 2, 3));
        assertEquals("FFFFFF", RgbToHex.rgbUsingStringFormatter(255, 255, 255));
        assertEquals("FEFDFC", RgbToHex.rgbUsingStringFormatter(254, 253, 252));
        assertEquals("00FF7D", RgbToHex.rgbUsingStringFormatter(-20, 275, 125));
    }

    @Test
    public void rgbToHexMethodTest() {
        assertEquals("000000", RgbToHex.rgbUsingToHexString(0, 0, 0));
        assertEquals("010203", RgbToHex.rgbUsingToHexString(1, 2, 3));
        assertEquals("FFFFFF", RgbToHex.rgbUsingToHexString(255, 255, 255));
        assertEquals("FEFDFC", RgbToHex.rgbUsingToHexString(254, 253, 252));
        assertEquals("00FF7D", RgbToHex.rgbUsingToHexString(-20, 275, 125));
    }

    @Test
    public void rgbNoJavaBuiltMethodsTest() {
        assertEquals("000000", RgbToHex.rgbNoJavaBuiltMethods(0, 0, 0));
        assertEquals("010203", RgbToHex.rgbNoJavaBuiltMethods(1, 2, 3));
        assertEquals("FFFFFF", RgbToHex.rgbNoJavaBuiltMethods(255, 255, 255));
        assertEquals("FEFDFC", RgbToHex.rgbNoJavaBuiltMethods(254, 253, 252));
        assertEquals("00FF7D", RgbToHex.rgbNoJavaBuiltMethods(-20, 275, 125));
    }

    @Test
    public void rgbStringBufferTest() {
        assertEquals("000000", RgbToHex.rgbUsingStringBuffer(0, 0, 0));
        assertEquals("010203", RgbToHex.rgbUsingStringBuffer(1, 2, 3));
        assertEquals("FFFFFF", RgbToHex.rgbUsingStringBuffer(255, 255, 255));
        assertEquals("FEFDFC", RgbToHex.rgbUsingStringBuffer(254, 253, 252));
        assertEquals("00FF7D", RgbToHex.rgbUsingStringBuffer(-20, 275, 125));
    }
}