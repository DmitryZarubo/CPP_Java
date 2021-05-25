package com.example.laba1.parametrs;

import com.example.laba1.service.MaxService;

public class Max implements Comparable<Max> {

    private int numb1 = 0;
    private int numb2 = 0;
    private int numb3 = 0;
    private int maxnumb;

    @Override
    public int compareTo(Max max) {
        return this.getValue() - max.getValue();
    }

    public Max(int numb1, int numb2, int numb3) {
        this.numb1 = numb1;
        this.numb2 = numb2;
        this.numb3 = numb3;
    }

    public Max(int numb1, int numb2, int numb3, int maxnumb) {
        this.numb1 = numb1;
        this.numb2 = numb2;
        this.numb3 = numb3;
        this.maxnumb = maxnumb;
    }

    public int getNumb1(){
        return numb1;
    }

    public int getNumb2(){
        return numb2;
    }

    public int getNumb3(){
        return numb3;
    }

    public int getValue() {
        MaxService maxservice = new MaxService();
        maxnumb = maxservice.MaxValue(numb1, numb2, numb3);
        return maxnumb;
    }
}
