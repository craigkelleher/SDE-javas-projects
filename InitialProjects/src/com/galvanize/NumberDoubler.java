package com.galvanize;

import java.util.Scanner;

// Write a Java program that accepts an int from the user, and prints an int that is double the number provided.
public class NumberDoubler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int userInput = input.nextInt();
        int doubledNumber = userInput * 2;
        System.out.println(doubledNumber);
    }
}
