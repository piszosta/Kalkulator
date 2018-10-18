package com.calculator.kalkulator;

public class Calc{
    int numberA;
    int numberB;
    int sum;

    public Calc (int numberA, int numberB){
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void adding(){
        sum = numberA + numberB;
    }

    public int getSum(){
        return sum;
    }
}