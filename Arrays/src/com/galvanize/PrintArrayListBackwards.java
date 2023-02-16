package com.galvanize;

public class PrintArrayListBackwards {
    public static void main(String[] args) {
        printBackwards(new int[]{1, -3, 4, 7, 2});
        printBackwards(new int[]{1});
        printBackwards(new int[]{1, 2, 3, 4, 5, 6});
        printBackwards(new int[]{0});
    }

    public static void printBackwards(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("element [" + i + "] is " + arr[i]);
        }
    }
}
