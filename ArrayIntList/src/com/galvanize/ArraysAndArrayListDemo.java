package com.galvanize;

public class ArraysAndArrayListDemo {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        System.out.println(list);

        list.add(3);
        System.out.println(list);

        list.add(5);
        System.out.println(list);

        list.add(-2);
        System.out.println(list);
    }
}
