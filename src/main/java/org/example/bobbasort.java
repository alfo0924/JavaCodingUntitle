package org.example;

import java.util.*;

public class bobbasort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int size = scanner.nextInt();
        int temp;

        int[] array = new int[size];

        System.out.println("Enter values in array");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        for (int num : array) {
            System.out.println(num);
        }

        System.out.println("\nReversed array:");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }

        System.out.println("\nSorted array in descending order:"); // Modified output message
        for (int i = 0; i < array.length - 1; i++) {
            for (int g = 0; g < array.length - 1 - i; g++) {
                if (array[g] < array[g + 1]) { // Changed comparison to sort in descending order
                    temp = array[g];
                    array[g] = array[g + 1];
                    array[g + 1] = temp;
                }
            }

            for (int e : array) {
                System.out.print("  " + e);
            }
            System.out.println("  ");
        }
    }
}


