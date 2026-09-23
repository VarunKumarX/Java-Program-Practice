package main.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    //returnType is void because if we choose int then we have to
    //return int value for -ve numbers too.
    //so we choose void so no need to return anything for -ve.
    public static void factorial(int n) {
        if(n<0){
            System.out.println("No Factorial for -ve number!!!");
            return;
        }
//        int fac = 1;  // works upto n=12 after that it overflows.
        long fac = 1;   // works upto n=20 after that it overflows.
//        for above n=20 use BigInteger

        for(int i=n; i>=1; i--){
            fac=fac*i;
        }
        System.out.println("Factorial: "+fac);


        System.out.println("\n\nNote: Remember that variable should not be overflowed.");
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        factorial(n);
    }
}
