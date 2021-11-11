package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int num;
        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                num = scanner.nextInt();
                if (first) {
                    max = num;
                    min = num;
                    first = false;
                }
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max number entered: " + max);
        System.out.println("Min number entered: " + min);
        scanner.close();
    }
}
