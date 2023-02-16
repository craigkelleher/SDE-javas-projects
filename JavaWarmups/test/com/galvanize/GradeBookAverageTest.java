package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeBookAverageTest {

    @Test
    void getGrade() {
        assertEquals('A', GradeBookAverage.getGrade(95,90,93));
    }
}