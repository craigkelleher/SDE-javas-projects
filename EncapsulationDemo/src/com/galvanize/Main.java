package com.galvanize;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bill bill = new Bill(10.00);
//        bill.setMealCost(12.0);
//        bill.setTax(0.5);

        double myBill = bill.getTotal();
        myBill += 100;

        ArrayList myFoods = bill.getFoodList();

        System.out.println(myFoods);
        System.out.println(myBill);
        System.out.println(bill.getTotal());
        myFoods.add("shrimp");
        System.out.println(myFoods); // after adding, the copy can be changed, doesn't affect inner contents of class
        System.out.println(bill.getFoodList()); // what the class has as its state, not affected
    }
}
