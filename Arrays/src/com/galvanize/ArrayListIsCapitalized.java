package com.galvanize;

import java.util.ArrayList;

public class ArrayListIsCapitalized {

    public static void main(String[] args) {
        String[] stockWords = {"Rubbish", "bin", "is", "never", "full", "if",
                "you", "don't", "Waste", "reusable", "items!", "Reduce", "Reuse", "Recycle!"};

        // Declare an ArrayList of Strings called 'capitalized'.
        ArrayList<String> capitalized = new ArrayList<>();
        // Then loop through the list of words in the stockWords Array.
        for(String word : stockWords){
            // for(int word = 3; i < stockWords.length; i++)
            // If a word is capitalized, push it to the capitalized Array.
            if(Character.isUpperCase(word.charAt(0))){
                capitalized.add(word);
            }
        }

        // 2. Iterate over the capitalized array. If any of the words are "Rubbish",
        // "Trash", or "Waste", remove them from the Arraylist
        //capitalized.removeAll(Arrays.asList("Rubbish", "Trash", "Waste"));
        for(int i = 0; i < capitalized.size(); i++){
            //switch(capitalized).get(i)){
            //  case "Rubbish":
            //  case "Trash":
            //  Case "Waste":
            //  capitalized.remove(i);
            //  }
            //}
            if(capitalized.get(i).equals("Rubbish") ||
                    capitalized.get(i).equals("Trash") ||
                    capitalized.get(i).equals("Waste")){
                capitalized.remove(i);
                i--;
            }
        }

        // 3. After completing step number two, console log out the size of the ArrayList.
        System.out.println("The size of the capitalized array is: " + capitalized.size());
    }
}
