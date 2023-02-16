package com.galvanize;
import java.util.*;

// HangmanManager manages the state of the game.
public class HangmanManager {
    private int wordLength;
    private int guessesLeft;
    private String pattern;
    private Set<String> wordChoices;
    private Set<Character> guessesMade;


    // HangmanManager accepts a dictionary, the length of a word, and the number of allowed answers as parameters
    public HangmanManager(Collection<String> dictionary, int length, int max) {
        if (length < 1 || max < 0) {
            throw new IllegalArgumentException("Length should be greater than 0 and max should be greater than or equal to 0");
        }
        // initialize instance variables to keep track of length of word, the number of wrong answers left, pattern
        // of the word to be guessed, a set of word choices and a set of guesses made so far.
        this.wordLength = length;
        this.guessesLeft = max;
        wordChoices = new HashSet<>();
        guessesMade = new HashSet<>();
        // Filter the dictionary to only contain words of the specified length.
        for (String word : dictionary) {
            if (word.length() == length) {
                wordChoices.add(word);
            }
        }
        // pattern of the word to be guessed is initialized to '-' repeating for the specified length of the word
        pattern = "-".repeat(length);
    }

    public String pattern() {
        if (wordChoices.isEmpty()) {
            throw new IllegalStateException("Set of words is empty");
        }
        return pattern;
    }
    public int guessesLeft() {
        return guessesLeft;
    }

    public Set<String> words() {
        return wordChoices;
    }

    public Set<Character> guesses() {
        return guessesMade;
    }

    // Record the player's guess and updates set of word chocies based on player's guess, and updates the pattern to
    // reflect the state of the game
    public int record(char guess) {
        // add the guessed character to the set of guesses made
        guessesMade.add(guess);
        int guessedCorrect = 0;
        // Store the frequency of guessed characters in each word in the current set of word choices.
        Map<String, Set<String>> wordFamily = new HashMap<>();
        /*
        loop through each word in the set of word choices, count number of instances of character in the word
        For each word, the method uses the count of the guessed character in the word to add the word to a corresponding
         group in the Map object. The group is determined by the count of the character in the word, with each group
         having a unique count as its key.
        * */
        for (String word : wordChoices) {
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < wordLength; i++) {
                if (word.charAt(i) == guess) {
                    newString.append(guess);
                } else {
                    newString.append('-');
                }
            }
            String pattern = newString.toString();
            Set<String> set = wordFamily.getOrDefault(pattern, new HashSet<>());
            set.add(word);
            wordFamily.put(pattern, set);
        }
        int guessesLeft = 0;
        // After looping through all the words, the method determines the group with the most words and chooses that
        // group as the new set of word choices.
        for (Set<String> set : wordFamily.values()) {
            if (set.size() > guessesLeft) {
                guessesLeft = set.size();
                wordChoices = set;
            }
        }

        // if the guess has a match, increment the guessed correct counter
        for (char guessedCharacter : pattern().toCharArray()) {
            if (guessedCharacter == guess) {
                guessedCorrect++;
            }
        }
        // if the guess has no matches, decrement the amount of guesses left
        if (guessedCorrect == 0) {
            this.guessesLeft--;
        }
        // update the pattern to reflect changes to set of word choices.
        pattern = wordChoices.iterator().next();
        for (int i = 0; i < pattern.length(); i++) {
            char guessedLetter = pattern.charAt(i);
            // if there is a match, replace the '-' with that character
            if (guessesMade.contains(guessedLetter)) {
                pattern = pattern.substring(0, i) + guessedLetter + pattern.substring(i + 1);
            }
            // if the position has no matching characters, position remains '-' in the pattern
            else {
                pattern = pattern.substring(0, i) + '-' + pattern.substring(i + 1);
            }
        }
        return guessedCorrect;
    }
}