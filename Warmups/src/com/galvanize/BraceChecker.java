package com.galvanize;

import java.util.Stack;

public class BraceChecker {
    // Create a new stack to keep track of opening braces
    // loop through each character in input string:
        // if character is opening brace, push onto stack
        // if the character is a closing brace
            // if stack is empty, return false, no matching
            // pop the most recent opening brace from stack
            // compare popped opening brace to current closing brace to see if match, if no match, return false
    // check if stack is empty. If it is, return true because all braces matched
    // return whether stack is empty | false  if not as at least one not matched.

    public boolean isValidStack(String braces){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            char c = braces.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    // while loop through the string loop while there are still balanced together braces
    // when there are (inside the loop) remove all instances of balanced braces that are together with ""
    // {} () []
    // when done looping check the length of the remaining string
    // return true if the length is zero

    public boolean isValid(String braces){
        while(braces.contains("{}") || braces.contains("()") || braces.contains("[]")){
            braces = braces.replace("{}", "").replace("()", "").replace("[]", "");
        }
        return braces.length() == 0;
    }

    public boolean isValid2(String braces){
        for(int i = 0; i < braces.length(); i++){
            braces = braces.replace("{}", "").replace("()", "").replace("[]", "");
        }
        return braces.isEmpty();
    }
}
