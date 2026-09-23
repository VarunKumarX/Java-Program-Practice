package main.java;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows of 2D Array");
        int rows = sc.nextInt();
        System.out.print("Enter Columns of 2D Array");
        int cols =sc.nextInt();

        int [][] arr = new int[rows][cols];

        //input
        System.out.println("Enter Array Data");
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //output
        System.out.println("\n2D Array Data");
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //output using for-each loop
        System.out.println("\n2D Array using for-each loop:");
        for (int[] row : arr) { //2d array se row nikali
            for (int val : row) { //row se elements nikal liye
                System.out.print(val + " ");
            }
            System.out.println(); // Moves to the next line after printing a full row
        }


        //find x's index no
        System.out.print("\nEnter Element for its indices: ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (arr[i][j] ==x){
                    System.out.println("Index no of "+x+" is ("+i+","+j+")");
                }
            }
        }
    }
}
