package com.galvanize;

public class PokeStats {
    public String pokeGenieTag(String[] stats) {
        // 1. Determine the league of the Pokemon based on its CP:
        String league = Integer.parseInt(stats[1]) >= 1500 ? "Ⓤ" : "Ⓖ";
        // 2. Create a string representation of the score with only 1 decimal place
        //      convert score to a double, then use string.format to format double as a string with one decimal place
        String score = String.format("%.1f", Double.parseDouble(stats[2]));
        String name = stats[0];
        // 3. Clip the name of the Pokemon to 12 - 1 - length of rating:
        if (name.length() > 12 - league.length() - score.length()) {
            name = name.substring(0, 11 - score.length());
        }
        // 4. Concatenate the league, name, and score to form the label and return:
        return league + name + score;
    }
}