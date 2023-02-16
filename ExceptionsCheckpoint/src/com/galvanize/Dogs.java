package com.galvanize;

class Dogs extends Animals {
    private String breed;

    public Dogs(String name, int age, String breed) throws JavaExceptions.InvalidAgeException, JavaExceptions.InvalidBreedException {
        super(name, age);
        if (breed == null || breed.isEmpty()) {
            throw new JavaExceptions.InvalidBreedException("Breed cannot be null or empty");
        }
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void bark(int numberOfBarks) {
        System.out.println(super.getName() + " is barking " + numberOfBarks + " times");
    }

    public void fetch(String object) {
        System.out.println(super.getName()  + " is fetching " + object);
    }

    public String getInfo(){
        String info = "";
        try {
            info = String.format("Dog's name: %s, age: %d, breed: %s", getName(), getAge(), getBreed());
        } catch (Exception e) {
            System.out.println("An error occurred while getting the dog's info: " + e.getMessage());
        } finally {
            System.out.println("Program Complete");
        }
        return info;
    }
}
