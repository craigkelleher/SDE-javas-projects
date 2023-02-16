package com.galvanize;

public class Game {
    private int[] rolledBalls = new int[21];
    private int points;

    public int getGameScore() {
        int currentBall = 0;
        for (int i = 0; i < 10; i++) {
            if (ifStrike(currentBall)) {
                points += bonusPoints(currentBall);
                currentBall++;
            } else if (ifSpare(currentBall)) {
                points += bonusPoints(currentBall);
                currentBall += 2;
            } else {
                points += calcCurrentScore(currentBall);
                currentBall += 2;
            }
        }
        return points;
    }

    private int calcCurrentScore(int thrownBall) {
        return rolledBalls[thrownBall] + rolledBalls[thrownBall + 1];
    }

    private int bonusPoints(int thrownBall) {
        return rolledBalls[thrownBall] + rolledBalls[thrownBall + 1] + rolledBalls[thrownBall + 2];
    }

    private boolean ifSpare(int thrownBall) {
        return calcCurrentScore(thrownBall) == 10;
    }

    private boolean ifStrike(int thrownBall) {
        return rolledBalls[thrownBall] == 10;
    }

    public void rollTheBall(int pins, int currentBall) {
        rolledBalls[currentBall] = pins;
    }
}
