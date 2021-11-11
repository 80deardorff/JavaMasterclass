package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
        int sum = 0;
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers. The program will then return the sum of the numbers entered.");
        while (count <= 10) {
            System.out.println("Enter number #" + count + ": ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                count++;
                sum += input;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // Handles the next line of the input
        }
        System.out.println("The sum of all " + (count -1) + " numbers entered is: " + sum);
        scanner.close();
    }
}
