package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    @Test
    public void test1Map() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissors.rpsMap("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissors.rpsMap("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissors.rpsMap("paper", "rock"));
    }
    @Test
    public void test2Map() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissors.rpsMap("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissors.rpsMap("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissors.rpsMap("rock", "paper"));
    }
    @Test
    public void test3Map() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockPaperScissors.rpsMap("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissors.rpsMap("paper", "paper"));
        assertEquals("Draw!", RockPaperScissors.rpsMap("rock", "rock"));
    }

    @Test
    public void test1Conditional() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissors.rpsConditional("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissors.rpsConditional("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissors.rpsConditional("paper", "rock"));
    }
    @Test
    public void test2Conditional() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissors.rpsConditional("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissors.rpsConditional("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissors.rpsConditional("rock", "paper"));
    }
    @Test
    public void test3Conditional() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockPaperScissors.rpsConditional("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissors.rpsConditional("paper", "paper"));
        assertEquals("Draw!", RockPaperScissors.rpsConditional("rock", "rock"));
    }
}