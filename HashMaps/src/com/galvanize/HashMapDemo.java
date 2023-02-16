package com.galvanize;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Double> foodPrices = new HashMap<>();

        //different type map, sorted order
        TreeMap<String, Double> foodPrices2 = new TreeMap<>();
        foodPrices2.put("apples", 5.0);
        foodPrices2.put("oranges", 3.0);

        // 2. Add the following key value pairs to `foodPrices`
        //  Apple is mapped to 0.99,
        //  Milk is mapped to 2.79,
        //  Frozen Pizza is mapped to 5.99

        foodPrices.put("Apple", 0.99);
        foodPrices.put("Milk", 2.79);
        foodPrices.put("Frozen Pizza", 5.99);
        foodPrices.put("Bananas", 0.79);

        // 3. Use get() to retrieve the value for a key that is in the map.
        // Print out the return of get to confirm your expectation
        System.out.println(foodPrices.get("apple"));
        System.out.println(foodPrices.get("Milk"));
        System.out.println(foodPrices.get("Frozen Pizza"));

        // 4. Use containsKey twice: once that will return true and once that will return false
        // Print out the returns of containsKey to confirm your expectation
        System.out.println(foodPrices.containsKey("Apple"));
        System.out.println(foodPrices.containsKey("Boba"));

        // Demo 2 cover looping briefly (keySet, foreach loop)
        printMap(foodPrices);
        printMap(foodPrices2);

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // it is not wrong to return an ArrayList, but it is better to return List

        //use interface types when possible, it is okay to return class types from methods
        // but in general, good practice to return interface types
        // use interface (list, map) everywhere excep for when you initialize them with new
        // at those times you have to use specific and say new ArrayList or new HashMap

        ArrayList<String> additionalFoods = new ArrayList<>();
        additionalFoods.add("Pear");
        additionalFoods.add("Tomato");

        System.out.println(foodPrices);
        addAllAt499(foodPrices, additionalFoods);
        System.out.println(foodPrices);
        addOneDollarToEach(foodPrices);
        System.out.println(foodPrices);
    }

    // 6.  Print out each key value pair with the following format with the key and value on separate lines
    // with a blank line after each pair
    // key: Apple
    // value: 0.99

    public static void printMap(Map<String, Double> foodPrices) {
        // with maps, printing and looping will not be in a predictable order.
        System.out.println(foodPrices.keySet());
        for (String food : foodPrices.keySet()){
            System.out.println("key: " + food);
            System.out.println("value: " + foodPrices.get(food));
            System.out.println();
        }

//        foodPrices.forEach((food, price) -> {
//            System.out.println("key: " + food + "\n" + "value " + price + "\n\n");
//        });

//        for(Map.Entry<String, Double> entry : foodPrices.entrySet()){
//            System.out.println("key: " + entry.getKey() + "\n" + "value: " + entry.getValue() + "\n\n");
//        }
    }

    // 7. Given a HashMap of existing food names -> prices mapping and an ArrayList of new foods to add,
    // add each of the foods in `additionalFoods` to `foodPrices` for 4.99 each
    public static void addAllAt499(HashMap<String, Double> foodPrices, ArrayList<String> additionalFoods) {
        // 7. your code here
        for (String food : additionalFoods){
            foodPrices.put(food, 4.99);
        }
    }

    // 8.  Given a HashMap of existing food names -> prices mapping,
    // increase each of the food's current prices by 1.00
    public static void addOneDollarToEach(HashMap<String, Double> foodPrices) {
        // 8. your code here
        for (String food : foodPrices.keySet()){
            foodPrices.put(food, foodPrices.get(food) + 1.00);
        }
        //foodPrices.forEach((key, value) -> foodPrices.put(key, value + 1.00));
    }
}