package com.galvanize;

public class JavaExceptions {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    static class InvalidBreedException extends Exception {
        public InvalidBreedException(String message) {
            super(message);
        }
    }
}