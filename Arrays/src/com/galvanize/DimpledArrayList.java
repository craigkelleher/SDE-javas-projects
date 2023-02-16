package com.galvanize;

import java.util.ArrayList;

public class DimpledArrayList {
    public static void main(String[] args) {
        // 1. Create an array of any primitive type
        int[] myIntArray2 = { 4, 5, 6 };
        // int[] myIntArray1 = new int[3];
        // int[] myIntArray3 = new int[]{1, 2, 3};

        // 2. Iterate over that array using two different iteration methods
        for (int i = 1; i <= myIntArray2.length; i++) {
            System.out.println(i);
        }
        for (int i : myIntArray2) {
            System.out.println(i);
        }
        // 3. Create an array of any Wrapper type. Iterate over that array and
        // then call a method that belongs to that Wrapper type on each item of
        // the array. For example, if you're iterating over Integer types, you
        // could call myNumber.intValue() on each integer .
        Integer[] myIntegerArray = { 4, 5, 6 };
        for (int i : myIntegerArray) {
            System.out.println(i);
        }

        // 4. We all know that Arrays can only contain one type. But what if ...
        // WHAT IF we found a way to "wrap" values in an array as Objects so we
        // could conceivably have Strings, ints, and floats all in the same Array?
        // Try to figure this out . an include an example of it in the code below

        //Object[] objectArray = {false, "this", 22, 3.3d};

        ArrayList<Object> superCoolArrayList = new ArrayList<>();
        superCoolArrayList.add("USAA:");
        superCoolArrayList.add(" 2023.");
        superCoolArrayList.add(1.17d);

        for (Object o : superCoolArrayList) {
            System.out.print(o);
        }

        superCoolArrayList.set(0, " Unemployed:");
        superCoolArrayList.set(2, 1.18d);
        System.out.println(superCoolArrayList.get(2));
        superCoolArrayList.remove(1.18d);
        // System.out.println(superCoolArrayList.get(2)); error, out of bounds now

        for (Object o : superCoolArrayList) {
            System.out.print(o);
        }

        System.out.println();
        //get last of arrayList
        System.out.println(superCoolArrayList.get(superCoolArrayList.size()-1));

        // 5. When finished, copy your code back to a REPL ( if you're not
        // working in a REPL already), and paste the link to your REPL
        // under the section in your notes dedicated to Java Arrays.
    }
}
