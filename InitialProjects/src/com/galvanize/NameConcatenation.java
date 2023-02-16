package com.galvanize;

import java.util.Scanner;

/*
Write a Java program that accepts a first name from the user and outputs that user's full name as their first name plus your
obligatory last name.  Example:  if they input "Fred" and your last name is "Bortles", then it should output "Fred Bortles"/
 */

public class NameConcatenation{

    public static void main(String[] args) {
        nameConcat();
    }

    public static void nameConcat(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first name: ");
        String userFirstName = input.next();
        System.out.println(userFirstName + " Kelleher");
    }

}