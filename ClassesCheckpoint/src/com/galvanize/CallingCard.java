
package com.galvanize;

public class CallingCard {
    private int centsPerMinute;
    private int balance;
    private int minutes;

    public CallingCard(int centsPerMinute) {
        this.centsPerMinute = centsPerMinute;
        this.balance = 0;
        this.minutes = 0;
    }

    public void addDollars(int amount) {
        this.balance += amount * 100;
        this.minutes += this.balance / this.centsPerMinute;
        this.balance %= this.centsPerMinute;
    }

    public int getBalance() {
        return balance;
    }

    public int getRemainingMinutes() {
        return this.minutes;
    }

    public void useMinutes(int minutes) {
        this.minutes -= minutes;
    }
}

