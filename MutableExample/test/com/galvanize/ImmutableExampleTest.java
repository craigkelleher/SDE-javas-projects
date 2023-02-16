package com.galvanize;

import org.junit.jupiter.api.Test;
import org.openjdk.jol.vm.VM;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

final class ImmutableExampleTest {

    @Test
    void immutableExampleTest(){
        ImmutableExample.PersonName personName = new ImmutableExample.PersonName("John", "Doe");
        Object address1 = VM.current().addressOf(personName.getFirstName());
        System.out.println("Machine Address in memory of this object: " + address1 + "\n");
        assertEquals("John", personName.getFirstName(), "First name does not match");
        assertEquals("Doe", personName.getLastName(), "Last name does not match");

        personName = new ImmutableExample.PersonName("Jane", "Doe");
        Object address2 = VM.current().addressOf(personName.getFirstName());
        System.out.println("Machine Address in memory of this object: " + address2 + "\n");
        assertEquals("Jane", personName.getFirstName(), "First name does not match");
        assertEquals("Doe", personName.getLastName(), "Last name does not match");

        assertNotEquals(address1, address2, "Addresses are equal, but they should not be");
    }
}