package com.example.laba1.validator;
import  com.example.laba1.exceptions.InputException;

public class Validator {

     public  Validator() {

     }
     public void CheckString(String position) throws InputException {
         int flag = 0;
         if(position.length() == 0) {
             throw new InputException("Empty string");
         }
         else {
             for(int i = 0; i < position.length(); i++) {
                 if(position.charAt(i) == '-' && flag == 0) {
                     flag = 1;
                     continue;
                 }
                 if(position.charAt(i) < '0' || position.charAt(i) > '9') {
                     throw new InputException("Incorrect input");
                 }
             }
         }
     }
}
