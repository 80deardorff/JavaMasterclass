package com.example.mypackage;

public class Series {
    public static long nSum(int n) {
        long sum = 0;
        while(n > 0) {
            sum+=n;
            n--;
        }
        return sum;
    }

    public static long factorial(int n) {
        if (n < 1) {
            return n;
        }
        long product = 1;
        while(n > 0) {
            product*=n;
            n--;
        }
        return product;
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
