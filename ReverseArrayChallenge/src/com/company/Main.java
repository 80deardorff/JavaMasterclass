package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("My array = " + Arrays.toString(myArray));
        System.out.println("My array reversed = " + Arrays.toString(reverseArray(myArray)));
        System.out.println("My array reversed again = " + Arrays.toString(reverseArray(myArray)));
    }

    private static int[] reverseArray(int[] array) {

        // THE FOLLOWING DOES NOT MODIFY THE ORIGINAL PASSED ARRAY PARAMETER
//        int[] reversedArray = new int[array.length];
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            reversedArray[i] = array[j];
//        }
//        return reversedArray;

        // THE FOLLOWING DOES MODIFY THE ORIGINAL PASSED ARRAY PARAMETER
        int maxIndex = (array.length - 1);
        int temp;
        for (int i = 0; i < (array.length / 2); i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return array;
    }
}
