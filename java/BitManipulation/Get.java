package main.java.BitManipulation;

import java.util.Scanner;

public class Get {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt(); //Ex- 5 (0101)

        System.out.print("Enter the Position: ");
        int i=sc.nextInt();

        //Steps to Get (check the bit)
        //i) 1<<i
        //ii) &
        // if ans is non-zero that means "1" bit at the position else 0.

        int bitMask = 1<<i;

        if( (bitMask&n)==0 ){
            System.out.println("'0' Bit at "+i+"th position of number"+n);
        }
        else{
            System.out.println("'1' Bit at "+i+"th position of number "+n);
        }


    }
}
