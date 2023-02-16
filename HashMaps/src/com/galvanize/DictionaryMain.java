package com.galvanize;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner dictionary = new Scanner(new File("HashMaps/src/main/resources/oxford-dictionary"));
        // link to oxford-dictionary file:
        // https://raw.githubusercontent.com/sujithps/Dictionary/master/Oxford%20English%20Dictionary.txt
        // put it in your resources folder

        ArrayList<String> words = new ArrayList<>();
        HashMap<String, String> definitions = new HashMap<>();
        while (dictionary.hasNextLine()) {
            String nextLine = dictionary.nextLine();

            if(nextLine.isBlank() || nextLine.trim().length() == 1){
                continue;
            }

            String[] split = nextLine.split(" ", 2);

            String allInfo = split[1];
            words.add(split[0]);

            definitions.put(split[0], allInfo);
        }
        System.out.println(definitions);

        // new scanner to take user input
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Input a word to look up (type 'quit' to quit): ");
            String input = console.next();

            if (input.equals("quit")) {
                break;
            }
            System.out.println(input + " definition " + definitions.get(input));
        }

        // Let's change this program to use a Map
        // 1. What are some different key/value relationships we could store with the txt file?
        // 2. How do we break down the line of input into the key/values that we want? Googling practice :)
        // 3. HashMap time - let's change our program so the user can look up the keys and get the values
        // What's the point of using maps and this exercise?
    }
}