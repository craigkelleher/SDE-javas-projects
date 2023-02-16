package com.galvanize;

public class GuessProgram {
    public static void main(String[] args) {
        int secretNumber = 15;
        int guessedNumber = 0;

        while (guessedNumber != secretNumber){
            guessedNumber += 1;
        }
        if (guessedNumber == secretNumber){
            System.out.println("The computer guessed the secret # correctly of: " + guessedNumber);
        }
    }
}