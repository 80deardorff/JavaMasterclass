package com.company;

import com.example.mypackage.Series;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i <= num; i++) {
            System.out.print((i == num) ? Series.nSum(i) + "\n" : Series.nSum(i) + ", ");
        }

        for (int i = 0; i <= num; i++) {
            System.out.print((i == num) ? Series.factorial(i) + "\n" : Series.factorial(i) + ", ");
        }

        for (int i = 0; i <= num; i++) {
            System.out.print((i == num) ? Series.fibonacci(i) + "\n" : Series.fibonacci(i) + ", ");
        }
    }
}
