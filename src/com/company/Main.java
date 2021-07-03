package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the elements of the array: ");
        int numbersLength = in.nextInt();
        int[] numbers = new int[numbersLength];
        CreateArray1(numbers);
        System.out.println("Sorted Array");
       SortArray(numbers);
        System.out.println("Reversed sort");
       SortArrayReverse(numbers);
    }

    public static void CreateArray1(int[] numbers) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value for the " + (i + 1) + ": element: ");
            numbers[i] = in.nextInt();


        }
        System.out.println("Array1: " + Arrays.toString(numbers));
    }
    public static void SortArray(int[]array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    // swap the elements!
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void SortArrayReverse(int[]array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] < array[j]) {
                    // swap the elements!
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
