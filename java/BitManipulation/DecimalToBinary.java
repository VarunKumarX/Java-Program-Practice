package main.java.BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int n=sc.nextInt();
        System.out.print("Binary Representation: ");

        //get
        for (int i =3; i>=0; i--){
            int bitmask = 1<<i;
            if ( (bitmask&n)==0 ){
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }

        }

        //using built-in method --Best way
        String binaryString = Integer.toBinaryString(n);
        System.out.println("\n\n\nUsing built-in method: "+binaryString);

        // Reverse operation: convert binary string back to integer
        int reversedNumber = Integer.parseInt(binaryString,2);
        //The second argument, 2, is the radix (or base), which tells the
        // compiler to interpret the first string as a binary number rather
        // than a decimal one.
        System.out.println("Number from binary string: " + reversedNumber);
    }
}
