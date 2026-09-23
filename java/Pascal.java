package main.java;

import java.util.Scanner;


public class Pascal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input, Please Enter a positive integer");
            return;
        }

        for(int i=0;i<n;i++){

            // print spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // print numbers
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }

    }
}
