package com.galvanize;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sample Tests")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SumDigitsofANumberTest {
    @Test
    @Order(1)
    @DisplayName("Testing method 1")
    void sampleTestOne() {
        assertEquals(6, SumDigitsofANumber.sumOfDigits(123), "For input: " + 123);
        assertEquals(1, SumDigitsofANumber.sumOfDigits(1), "For input: " + 1);
        assertEquals(1, SumDigitsofANumber.sumOfDigits(100), "For input: " + 100);
        assertEquals(12, SumDigitsofANumber.sumOfDigits(291), "For input: " + 291);
        assertEquals(36, SumDigitsofANumber.sumOfDigits(9999), "For input: " + 9999);
    }

    @Test
    @Order(2)
    @DisplayName("Testing method 2")
    void sampleTestTwo() {
        assertEquals(6, SumDigitsofANumber.sumOfDigits2(123), "For input: " + 123);
        assertEquals(1, SumDigitsofANumber.sumOfDigits2(1), "For input: " + 1);
        assertEquals(1, SumDigitsofANumber.sumOfDigits2(100), "For input: " + 100);
        assertEquals(12, SumDigitsofANumber.sumOfDigits2(291), "For input: " + 291);
        assertEquals(36, SumDigitsofANumber.sumOfDigits2(9999), "For input: " + 9999);
    }

    @Test
    @Order(3)
    @DisplayName("Testing method 3")
    void sampleTestThree() {
        assertEquals(6, SumDigitsofANumber.sumOfDigits3(123), "For input: " + 123);
        assertEquals(1, SumDigitsofANumber.sumOfDigits3(1), "For input: " + 1);
        assertEquals(1, SumDigitsofANumber.sumOfDigits3(100), "For input: " + 100);
        assertEquals(12, SumDigitsofANumber.sumOfDigits3(291), "For input: " + 291);
        assertEquals(36, SumDigitsofANumber.sumOfDigits3(9999), "For input: " + 9999);
    }
}