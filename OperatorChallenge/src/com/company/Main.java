package com.company;

public class Main {

    public static void main(String[] args) {
        double myValue = 20.00d;
        double anotherValue = 80.00d;
        double result = (myValue + anotherValue) * 100.00d;
        double remainder = result % 40.00d;
        boolean boolVar = (remainder == 0);
        System.out.println("boolVar output is " + boolVar);
        if (!boolVar) {
            System.out.println("Got some remainder");
        }
    }
}
