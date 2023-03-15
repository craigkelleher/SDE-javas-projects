package com.galvanize;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertStringCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeUnderscoreLowerStartStrean() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringCamelCase.toCamelCaseStream(input));
    }
    @Test
    public void testSomeDashLowerStartStream() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringCamelCase.toCamelCaseStream(input));
    }

    @Test
    public void testSomeUnderscoreLowerStartCharArray() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringCamelCase.toCamelCaseCharArray(input));
    }

    @Test
    public void testSomeDashLowerStartCharArray() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringCamelCase.toCamelCaseCharArray(input));
    }
}