package main.java.BitManipulation;

import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        System.out.print("Enter Position: ");
        int pos=sc.nextInt();

        int bitMask=1<<pos;
        int result=bitMask|n;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result)); //Binary Number
        System.out.println((1<<pos)|n); //inshort and direct

    }
}
