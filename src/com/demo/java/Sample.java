package com.demo.java;

public class Sample {

    public String isVacation(boolean onVacation){
        return onVacation ? "I'm on vacation" : "I'm working";
    }

    public void printNumbers(int[] numbers){
        for(int number: numbers){
            System.out.println(number);
        }
    }
}
