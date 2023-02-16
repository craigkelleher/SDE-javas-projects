package com.galvanize;

import java.util.ArrayList;

public class MutabilityDemo {
    public static void main(String[] args) {
//        String firstString = "coderolls";
//        String thirdString = "coderolls";
//        System.out.println(firstString == thirdString);
//        String fourthString =  new String("coderolls");
//        System.out.println(firstString == fourthString);
//        System.out.println(VM.current().addressOf(firstString));
//        System.out.println(VM.current().addressOf(thirdString));
//        System.out.println(VM.current().addressOf(fourthString));

        ArrayList<String> animals = new ArrayList<>();
        animals.add("tiger");
        animals.add("leopard");
        animals.add("cheetah");
        animals.add("bush baby");

        ArrayList<String> animales = new ArrayList<>(animals);
        animals.clear();
        animales.add("dolphin");
        animales.add("fox");
        animales.add("bear");
        animals.add("cat");

        for(String animal : animals){
            System.out.println(animal);
        }

        for(String animal : animales){
            System.out.println(animal);
        }

//        HashMap<String, Integer> scores = new HashMap<>();
//        scores.put("Olu", 435);
//        scores.put("Nike", 999);
//        scores.put("Adeola", 22);
//        scores.put("Tolu", 1200);
//
//        HashMap<String, Integer> tallies = new HashMap<>(scores);
//        scores.clear();
//        for(String name : tallies.keySet()){
//            System.out.println(name);
//        }
//        // Following doesnt print anything
//        for(String name : scores.keySet()){
//            System.out.println(name);
//        }

//        int[] numbers = {1,2,3,4,5};
//        //int[] numeros = numbers; //mutable
//        int[] numeros = new int[numbers.length]; //two different entities
//
//        int[] numberss = Arrays.copyOf(numbers, 5);
//        for(int i = 0; i < numbers.length; i++){
//            numeros[i] = numbers[i];
//        }
//        numeros[0] +=100;
//
//        System.out.println("The first number is " + numbers[0]);
//        for(int numero : numbers){
//            System.out.println(numero);
//        }
//        System.out.println("The first number is " + numeros[0]);
//        for(int numero : numeros){
//            System.out.println(numero);
//        }
    }
}
