package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokeStatsTest {
    @Test
    void pokeGenieTagMewTwoTest() {
        PokeStats myTest = new PokeStats();
        String[] stats = {"MewTwo", "2325", "9.7"};
        assertEquals("ⓊMewTwo9.7",  myTest.pokeGenieTag(stats));
    }

    @Test
    void pokeGenieTagHydreigonTest() {
        PokeStats myTest = new PokeStats();
        String[] stats = {"Hydreigon", "2400", "100.0"};
        assertEquals("ⓊHydrei100.0", myTest.pokeGenieTag(stats));
    }

    @Test
    void pokeGenieTagGolemTest() {
        PokeStats myTest = new PokeStats();
        String[] stats = {"Golem", "1472", "82.3"};
        assertEquals("ⒼGolem82.3", myTest.pokeGenieTag(stats));
    }

    @Test
    void pokeGenieTagDedenneTest() {
        PokeStats myTest = new PokeStats();
        String[] stats = {"Dedenne", "1497", "95.6"};
        assertEquals("ⒼDedenne95.6", myTest.pokeGenieTag(stats));
    }

    @Test
    void pokeGenieTagStoutlandTest() {
        PokeStats myTest = new PokeStats();
        String[] stats = {"Stoutland", "1497", "95.6"};
        assertEquals("ⒼStoutla95.6", myTest.pokeGenieTag(stats));
    }
}
