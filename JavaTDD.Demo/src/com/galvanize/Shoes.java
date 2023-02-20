package com.galvanize;

public class Shoes {
    private String name;
    private double originalPrice;
    private int ageInYears;
    private boolean legit;


    public static void main(String[] args) {
        Shoes shoes = new Shoes("kicks", 3.00);

    }

    public Shoes(String name, double originalPrice) {
        this(name, originalPrice, 1, false);
    }

    public Shoes(String name, double originalPrice, int ageInYears, boolean legit) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.ageInYears = ageInYears;
        this.legit = legit;
    }

    public String getName() {
        return name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void ageShoesByOneYear() {
        ageInYears++;
    }

    public double getSellingPrice() {
        double price = originalPrice;
        if (name.contains("Air Jordan")) {
            price += 500;
        }

        if (name.contains("Nike Dunk")) {
            price += 700;
        }

        if (name.equals("Red October")) {
            price += 21000;
        }

        price *= ageInYears;

        if (!legit) {
            price /= 10;
        }
        return price;
    }

    public boolean shouldSell() {
        return getSellingPrice() >= 1.5 * originalPrice;
    }

    public boolean shouldSell(double inflationRate) {
        return getSellingPrice() >= 1.5 * originalPrice * inflationRate;
    }
}
