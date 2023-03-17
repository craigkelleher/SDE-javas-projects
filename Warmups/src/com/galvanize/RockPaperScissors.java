package com.galvanize;

import java.util.HashMap;
import java.util.Map;

/*
* return Draw if both strings are equal
* initialize a new hashmap
* create winning moves by putting them into the map:
*  rock, scissors
*  scissors, paper
*  paper, rock
* Check if winning moves p1 equals p2
*  if yes, player 1 won
*  else player 2 won
* */

/*
 * return Draw if both strings are equal
 * Check if player 1 won
 *  if p1 equals "rock" && p2 equals Scissors
 *   or p1 equals scissors && p2 equals paper
 *   or p1 equals paper && p2 equals rock,
 *  return player 1 won
 * else player 2 won
 * */

public class RockPaperScissors {
    public static String rpsMap(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        Map<String, String> winningMoves = new HashMap<>() {{
            put("rock", "scissors");
            put("scissors", "paper");
            put("paper", "rock");
        }};
        return winningMoves.get(p1).equals(p2) ? "Player 1 won!" : "Player 2 won!";
    }

    public static String rpsConditional(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("rock") && p2.equals("scissors")
                || p1.equals("scissors") && p2.equals("paper")
                || p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}
