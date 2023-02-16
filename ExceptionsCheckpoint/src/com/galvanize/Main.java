package com.galvanize;

public class Main {
    public static void main(String[] args) {
        try{
        Animals animal = new Animals("Lion", 5);
        animal.eat("meat", 2);
        animal.sleep(12);

        Dogs dog = new Dogs("Fido", 3, "Golden Retriever");
        dog.bark(3);
        dog.fetch("ball");
        String info = dog.getInfo();
        System.out.println(info);

        } catch (JavaExceptions.InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (JavaExceptions.InvalidBreedException e) {
            System.out.println(e.getMessage());
        }
    }
}