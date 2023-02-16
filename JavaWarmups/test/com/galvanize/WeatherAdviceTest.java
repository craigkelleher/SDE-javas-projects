package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherAdviceTest {

    @Test
    public void testShouldWearJacket_whenColdOutside() {
        WeatherAdvice weatherAdvice = new WeatherAdvice();
        assertTrue(weatherAdvice.shouldWearJacket(-10.0));
    }

    @Test
    public void testShouldWearJacket_whenHotOutside() {
        WeatherAdvice weatherAdvice = new WeatherAdvice();
        assertTrue(weatherAdvice.shouldWearShorts(39.0));
    }
}