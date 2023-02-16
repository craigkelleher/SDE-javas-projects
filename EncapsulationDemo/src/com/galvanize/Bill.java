package com.galvanize;

import java.util.ArrayList;

public class Bill {
    private ArrayList<String> foodList;

    private double total;
    private double tax;
    private double mealCost;

    public Bill(double mealCost){
        this.mealCost = mealCost;
        foodList = new ArrayList<>();
        foodList.add("Taco");
        foodList.add("Pizza");
        foodList.add("Guacamole");
    }

    public double getTotal(){
        double calculatedTotal = mealCost + (mealCost * tax);
        total = calculatedTotal + 0.01;
        return total;
    }

    public ArrayList<String> getFoodList(){
        //return this.foodList; //gives access to this and allows it to be mutable, dangerous
        return new ArrayList<>(this.foodList); // protects the object in memory
    }

    public void setFoodList(ArrayList<String> foodList) {
        this.foodList = foodList;
    }

    public void setMealCost(double mealCost){
        this.mealCost = mealCost;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax(){
        return tax;
    }
}
