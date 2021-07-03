package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Rows4Columns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] numbers = new double[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter value : ");

                numbers[i][j] = in.nextInt();
            }
        }
        System.out.println();

        for (int k = 0; k < numbers.length; k++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[k][j] + " ");
            }
            System.out.println();
        }
    }
}
