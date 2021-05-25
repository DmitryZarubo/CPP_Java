package com.example.laba1.service;

public class MaxService {
    public int MaxValue(int numb1, int numb2, int numb3) {
        int maxnumb;
        if (numb1 > numb2){
            maxnumb = numb1;
        }
        else maxnumb = numb2;
        if (numb3 > maxnumb){
            maxnumb = numb3;
        }
        return maxnumb;
    }
}
