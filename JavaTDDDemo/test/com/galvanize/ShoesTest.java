package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoesTest {
    // BeforeALl > BeforeEach >
    private Shoes shoes;
    // SEAT (setup, execution, assert, teardown)
    // AAA (arrange, act, assert)

    @BeforeEach
    void setUp() {
        // Arrange
        shoes = new Shoes ("name", 10.00);
    }

    @Test
    void getName() {
        // Arrange (instantiate the object) - taken from setUp
        // Act (test the name)
        String actual = shoes.getName();
        // Assert
        assertEquals("name", actual);
    }

    @Test
    void getAgeInYears() {
        // Act (test the name)
        int actual = shoes.getAgeInYears();
        // Assert
        assertEquals(1, actual);
    }

    @Test
    void ageShoesByOneYear() {
    }

    @Test
    void getSellingPrice() {
    }

    @Test
    void shouldSell() {
    }

    @Test
    void testShouldSell() {
    }
}