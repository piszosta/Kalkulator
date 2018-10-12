package com.calculator.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Calc{
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
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

    Calc calculator = new Calc(1, 2);
    calculator.adding();
        int sum = calculator.getSum();
    System.out.println("The sum is " + sum);
}

}
