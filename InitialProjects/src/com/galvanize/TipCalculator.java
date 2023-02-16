package com.galvanize;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        float mealCost;
        int tipPercentage;
        float tip;
        float totalCost;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the meal: $");
        mealCost = scanner.nextFloat();

        System.out.print("Enter the tip percentage as a whole number (e.g. 15): ");
        tipPercentage = scanner.nextInt();

        tip = mealCost * tipPercentage / 100;
        totalCost = mealCost + tip;

        System.out.println("The total cost of the meal including the tip is $" + totalCost);
    }
}