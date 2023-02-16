package com.galvanize;

import java.util.Scanner;

// Write a Java program that accepts an int from the user, and prints an int that is double the number provided.
public class NumberTripler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        double userInput = input.nextDouble();
        double doubledNumber = userInput * 3;
        System.out.println(doubledNumber);
    }
}
