package com.company;

public class Task2 {
    public static void main(String[] args) {
        int[][] movieRaiting = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7,}

        };
        int[][]ratings2=new int[3][4];
        for (int i=0;i<movieRaiting.length;i++){
            for (int j=0;j<movieRaiting[0].length;j++){
                System.out.print(movieRaiting[i][j]+" ");
            }
            System.out.println( );
        }
        for (int i=0;i<3;i++){
            int sumRow=0;
            for (int j=0;j<4;j++){
                sumRow=sumRow+movieRaiting[i][j];
            }
            System.out.println(sumRow/4.0);
        }
        int sumCritic2=0;
        for (int j=0;j<4;j++){
            sumCritic2+=movieRaiting[1][j];
        }
        System.out.println(sumCritic2/4.0);
    }
}
