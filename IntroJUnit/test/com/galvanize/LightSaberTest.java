package com.galvanize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class LightSaberTest {
    LightSaber ls = new LightSaber(123456);

    @Test
    void applicationTest() {
        Application.main();
    }

    @Test
    public void testSetCharge() {
        ls.setCharge(50.0);
        assertEquals(50.0, ls.getCharge(), 0.1);
    }

    @Test
    public void testGetCharge() {
        assertEquals(100.0, ls.getCharge(), 0.1);
    }

    @Test
    public void testSetColor() {
        ls.setColor("blue");
        assertEquals("blue", ls.getColor());
    }

    @Test
    public void testGetColor() {
        assertEquals("green", ls.getColor());
    }

    @Test
    public void testGetJediSerialNumber() {
        assertEquals(123456, ls.getJediSerialNumber());
    }

    @Test
    public void testUse(){
        LightSaber ls = new LightSaber(12345);
        ls.use(60.0);
        assertEquals(90.0, ls.getCharge(), 0.1);
    }

    @Test
    public void testGetRemainingMinutes(){
        LightSaber ls = new LightSaber(12345);
        ls.setCharge(90.0);
        assertEquals(540.0, ls.getRemainingMinutes(), 0.1);
    }

    @Test
    public void testRecharge() {
        ls.setCharge(0.0);
        ls.recharge();
        assertEquals(100.0, ls.getCharge(), 0.1);
    }
}