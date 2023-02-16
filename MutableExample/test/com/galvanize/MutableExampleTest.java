package com.galvanize;

import org.junit.jupiter.api.Test;
import org.openjdk.jol.vm.VM;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

final class MutableExampleTest {

    @Test
    void mutableExampleTest(){
        MutableExample.Address address = new MutableExample.Address(
                "123 Main St", "San Francisco", "CA", "94105");

        assertEquals("123 Main St", address.getStreet());
        assertEquals("San Francisco", address.getCity());
        assertEquals("CA", address.getState());
        assertEquals("94105", address.getZip());

        Object address1a = VM.current().addressOf(address);
        System.out.println("\nMachine Address in memory of this object: " + address1a);

        MutableExample.Address address2 = new MutableExample.Address("123 Main St", "San Francisco", "CA", "94105");
        address2.setStreet("321 SE Main St");
        address2.setCity("Portland");
        address2.setState("OR");
        address2.setZip("97229");

        assertEquals("321 SE Main St", address2.getStreet());
        assertEquals("Portland", address2.getCity());
        assertEquals("OR", address2.getState());
        assertEquals("97229", address2.getZip());

        Object address2a = VM.current().addressOf(address2);
        System.out.println("Machine Address in memory of this object: " + address2a + "\n");

        assertNotEquals(address1a, address2a, "Addresses are equal, but they should not be");
    }
}