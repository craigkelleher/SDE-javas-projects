package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    Game gameTest;

    @BeforeEach
    void setUp() {
        gameTest = new Game();
    }

    @Test
    void createNewGameTest() {
        Game newGame = new Game();

        int expected = 0;
        int result = newGame.getGameScore();

        assertEquals(expected, result);
    }

    @Test
    void rollTheBallTest() {
        gameTest.rollTheBall(5, 0);

        int expected = 5;
        int result = gameTest.getGameScore();

        assertEquals(expected, result);
    }

    @Test
    void scoreOnlyGutterBallsTest() {
        for (int i = 1; i <= 20; i++) {
            gameTest.rollTheBall(0, i);
        }

        int expected = 0;
        int result = gameTest.getGameScore();

        assertEquals(expected, result);
    }

    @Test
    void scoreOnlyOnePinHitTest() {
        for (int i = 0; i <= 20; i++) {
            gameTest.rollTheBall(1, i);
        }

        int expected = 20;
        int result = gameTest.getGameScore();

        assertEquals(expected, result);
    }

    @Test
    void scoreSpareTest() {
        gameTest.rollTheBall(6, 0);
        gameTest.rollTheBall(4, 1);
        gameTest.rollTheBall(3, 2);
        for (int i = 3; i < 20; i++) {
            gameTest.rollTheBall(0, i);
        }

        int expected = 16;
        int result = gameTest.getGameScore();

        assertEquals(expected, result);
    }

    @Test
    void scoreStrikeTest() {
        gameTest.rollTheBall(10, 0);
        gameTest.rollTheBall(2, 1);
        gameTest.rollTheBall(4, 2);
        for (int i = 3; i < 20; i++) {
            gameTest.rollTheBall(0, i);
        }

        int expected = 22;
        int result = gameTest.getGameScore();

        assertEquals(expected, result);
    }

    @Test
    void scorePerfectGameTest() {
        for (int i = 0; i <= 12; i++) {
            gameTest.rollTheBall(10, i);
        }
        int expected = 300;
        int result = gameTest.getGameScore();

        assertEquals(expected, result);
    }
}