package main.java;

import java.util.Scanner;

public class Array2dTranspose {
    public static void main ( String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        //Defining Array
        int [][] nums = new int [r][c];

        //input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        //2D array output using for each loop
        for (int[] row : nums){
            for ( int ans:row){
                System.out.print(ans+" ");
            }
            System.out.println();
        }

        // transpose
        System.out.println("\n\nTranspose of the array:  ");
        for( int j=0;j<c;j++){
            for ( int i=0; i<r; i++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
