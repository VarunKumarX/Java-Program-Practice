package main.java;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of the row: ");
        int r=sc.nextInt();
        System.out.print("Enter the no of the column: ");
        int c=sc.nextInt();

        //Solid Rectangle
        System.out.println("\nSolid Rectangle");
        for (int i=0; i<r ; i++) {
            for (int j=0;j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollow Rectangle
        System.out.println("\n\nHollow Rectangle");
        for(int i=1; i<=r; i++){
            for(int j=1;j<=c;j++){

                if( i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
