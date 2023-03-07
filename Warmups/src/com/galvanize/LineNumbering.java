package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/*
* Create an empty list that will contain the resulting lines prepended by correct number.
* Iterate over the input list
* Create a new string concatenating the line number, with a colon and a space and content of the line
* add the String to the result list.
* */

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> numberedLines = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            numberedLines.add((i + 1) + ": " + lines.get(i));
        }
        return numberedLines;
    }
}
