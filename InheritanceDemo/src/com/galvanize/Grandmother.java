package com.galvanize;

public class Grandmother extends Mother{
    private String name;

    public Grandmother(){

    }

    public Grandmother (String name, boolean isNice){
        super(name, isNice);
    }

    @Override
    public void throwShoe() {
        super.throwShoe(); // call parent's method
        // do something different than parent's method:
        System.out.println("Threw a boomerang shoe");
    }

    @Override
    public String getMessage() {
        return "I'm the grandma";
    }

    public String getMessage(String customMessage) {
        return customMessage;
    }
}
