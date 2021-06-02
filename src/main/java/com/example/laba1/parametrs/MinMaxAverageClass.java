package com.example.laba1.parametrs;

public class MinMaxAverageClass {
    private int max;
    private int min;
    private double average;

   public MinMaxAverageClass(int min, int max, double average){
        this.min = min;
        this.max = max;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
