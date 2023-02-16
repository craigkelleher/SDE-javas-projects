package com.galvanize;

public class Controller {
    public static void main(String[] args) {
        Grandmother gma = new Grandmother();
        gma.throwShoe();
        String msg = gma.getMessage("I pity the fool");
        System.out.println(msg);
    }
}
