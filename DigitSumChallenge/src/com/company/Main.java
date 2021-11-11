package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits of 125 is " + sumDigits(125));
        System.out.println("The sum of the digits of -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits of 4 is " + sumDigits(4));
        System.out.println("The sum of the digits of 32123 is " + sumDigits(32123));
    }

    private static long sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}
