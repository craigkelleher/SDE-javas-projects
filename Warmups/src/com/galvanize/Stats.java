package com.galvanize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stats {

    public static int computeMode(List<Integer> data) {
        Map<Integer, Integer> dataCompare = new HashMap<>();
        int numCount = 0;
        int mode = 0;

        for(int num : data){
            if (dataCompare.containsKey(num)){
                dataCompare.put(num, dataCompare.get(num) +1);
            }
            else{
                dataCompare.put(num, 1);
            }
        }

        for(Map.Entry<Integer, Integer> numbers : dataCompare.entrySet()){
            if(numbers.getValue() > numCount){
                numCount = numbers.getValue();
                mode = numbers.getKey();
            }
        }
        return mode;
    }

    public double computeMean(List<Integer> compareData) {
        double sum = 0.0;
        double mean;
        for (double number : compareData){
            sum += number;
        }
        mean = sum / compareData.size();
        return mean;
    }
}
