package com.galvanize;

public class LightSaber {

    private static double EFFICIENCY = 10.0;

    private double charge = 100.0;
    private long jediSerialNumber;
    private String color = "green";

    public LightSaber(long jediSerialNumber){
        this.jediSerialNumber = jediSerialNumber;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCharge() {
        return charge;

    }

    public long getJediSerialNumber() {
        return jediSerialNumber;
    }

    public String getColor() {
        return color;
    }

    public void use(double minutes) {
        charge -= (EFFICIENCY / 60.0) * minutes;
    }

    public double getRemainingMinutes() {
        return ((charge/EFFICIENCY)*60);
    }

    public void recharge(){
        charge = 100.0;
    }

}
