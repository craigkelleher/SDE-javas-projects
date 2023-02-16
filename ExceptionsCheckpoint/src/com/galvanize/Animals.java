package com.galvanize;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) throws JavaExceptions.InvalidAgeException {
        if (age <= 0) {
            throw new JavaExceptions.InvalidAgeException("Age must be greater than 0");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(String food, int quantity){
        System.out.println(name + " is eating " + food + " in quantity of " + quantity + " servings");
    }

    public void sleep(int hours){
        System.out.println(name + " is sleeping for " + hours + " hours");
    }
}
