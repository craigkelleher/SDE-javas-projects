package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
    public static String rpsMap(String p1, String p2) {
        Map<String, String> winningMoves = new HashMap<>();
        winningMoves.put("rock", "scissors");
        winningMoves.put("scissors", "paper");
        winningMoves.put("paper", "rock");

        return p1.equals(p2) ? "Draw!" : winningMoves.get(p1).equals(p2) ?
                "Player 1 won!" : "Player 2 won!";
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
