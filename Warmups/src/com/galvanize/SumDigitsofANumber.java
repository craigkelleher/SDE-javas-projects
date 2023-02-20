package com.galvanize;

public class SumDigitsofANumber {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumOfDigits2(int n) {
        int sum = 0; //Integer sum = null;
        String digits = Integer.toString(n); // missing ;
        for (int i = 0; i < digits.length(); i++) {
            // sum += digits[i + 1]; expected Array but got a String digits
            if(digits.charAt(i) >= '0' && digits.charAt(i) <= '9'){
                sum += digits.charAt(i) - '0';
            }
        }
        return sum;
    }

    public static int sumOfDigits3(int n) {
        int sum = 0; // int from Integer second
        String digits = Integer.toString(n); // ; first  third: Integer.toString(n) from n+""
        for (int i = 0; i < digits.length(); i++) {
            //array required but string found
            sum += Character.getNumericValue(digits.charAt(i));
        }
        return sum;
    }
}
