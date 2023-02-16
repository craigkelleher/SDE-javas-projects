package com.galvanize;

public class Mother {
    private boolean isNice;
    private String name;

    public Mother(){

    }

    public Mother(String name, boolean isNice){
        this.name = name;
        this.isNice = isNice;
    }

    public void throwShoe(){
        System.out.println("got you!");
    }

    public String getMessage(){
        return "I'm your mother!";
    }
}
