package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsTest {
//
//    @BeforeEach
//    void setUp(){
//        Stats stats = new Stats();
//    }

    @Test
    public void computeModeTest(){
        Stats stats = new Stats();
//        List<Integer> compareData = new ArrayList<>();
//        compareData.add(5);
//        compareData.add(8);
//        compareData.add(2);
//        compareData.add(1);
//        compareData.add(8);
        List<Integer> compareData = Arrays.asList(5,8,2,1,8);
        assertEquals(8, stats.computeMode(compareData));
    }

    @Test
    public void computeMeanTest(){
        Stats stats = new Stats();
        List<Integer> compareData = Arrays.asList(5,8,2,1,8);
        assertEquals(4.8, stats.computeMean(compareData));
    }
}