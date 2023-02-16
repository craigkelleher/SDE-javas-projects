package com.galvanize;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Question 2
        Character[] arr = {'h', 'i', ' ', 'u', 's', 'a', 'a'};
        convertToYelling(arr);

        //Question 3
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        add9AtEnds(numbers);

        //Question 5
        HashMap<String, Integer> map = new HashMap<>(){{
            put("hi", 3);
            put("bye", 2);
            put("San Antonio", 4);
        }};
//        Map<String, Integer> map = new HashMap<>();
//        map.put("hi", 3);
//        map.put("bye", 2);
//        map.put("San Antonio", 4);
        System.out.println(findKeyWithValue(map, 3));
        System.out.println(findKeyWithValue(map, 1));

        //Question 6
//        ArrayList<String> list = new ArrayList<>();
//        list.add("hi");
//        list.add("hi");
//        list.add("hi");
//        list.add("bye");
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi", "hi", "hi", "bye"));
        System.out.println(containsAnyThreeTimes(list));

        //Question 7
        tryCatchFinally(0);
    }

    //Question 2 Implementation
    public static void convertToYelling(Character[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                arr[i] = '*';
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        System.out.println(Arrays.asList(arr));
    }

    //Question 3 Implementation
    public static void add9AtEnds(ArrayList<Integer> list){
        list.add(0,9);
        list.add(2,9);
        System.out.println(Arrays.asList(list));
    }

    //Question 5 Implementation
    // Return the associated String key of the given 'value'. if the map does not contain 'value' then return "value
    // not found". You can assume there are no duplicate values in the map
    public static String findKeyWithValue(HashMap<String, Integer> map, int value){
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == value){
                return entry.getKey();
            }

        }
        return "value not found";
    }

    //Question 6 Implementation
    //Return true if the list contains any value at least 3 times
    //containsAnyThreeTimes passed ["hi", "bye", "hi"] returns false
    // containsAnyThreeTimes passed ["hi", "hi", "hi"] returns true
    public static boolean containsAnyThreeTimes(ArrayList<String> list){
        for(String thing : list){
            int count = Collections.frequency(list, thing);
            if(count >= 3){
                return true;
            }
        }
        return false;
    }

    //Question 7 Implementation
    //use try, catch, and finally to implement the behavior that:
    // "Arithmetic Exception" is printed to System.out if an Arithmetic Exception was thrown when computing x
    // "That's enough math for today" is always printed at the end, regardless of any exceptions thrown
    public static void tryCatchFinally(int divisor)  {
        // your code here
        try {
            int x = 5 / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        } finally {
            System.out.println("That's enough math for today");
        }
    }

}
