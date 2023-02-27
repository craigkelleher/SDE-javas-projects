package com.galvanize;

import java.util.Stack;

public class BraceChecker {

//    public boolean isValid(String braces) {
//        int count = 0;
//        for (int i = 0; i < braces.length(); i++) {
//            char c = braces.charAt(i);
//            if (c == '(' || c == '[' || c == '{') {
//                count++;
//            } else if (c == ')' || c == ']' || c == '}') {
//                count--;
//            }
//            if (count < 0) {
//                return false;
//            }
//        }
//        return count == 0;
//    }


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
}
