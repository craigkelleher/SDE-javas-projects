package com.galvanize;

public class WeatherAdvice {
    public boolean shouldWearJacket(double temperature) {
        if (temperature < 32.0){
            return true;
        }
        return false;
    }

    public boolean shouldWearShorts(double temperature) {
        if (temperature < 40.0){
            return true;
        }
        return false;
    }
}
