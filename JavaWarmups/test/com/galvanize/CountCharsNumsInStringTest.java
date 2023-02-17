package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCharsNumsInStringTest {

    @Test
    public void testSomething() {
        assertArrayEquals(new int[]{1,18,3,2}, CountCharsNumsInString.Solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, CountCharsNumsInString.Solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, CountCharsNumsInString.Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, CountCharsNumsInString.Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, CountCharsNumsInString.Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, CountCharsNumsInString.Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}