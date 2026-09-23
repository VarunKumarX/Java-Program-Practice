package main.java.BitManipulation;

import java.util.Scanner;

public class Clear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=sc.nextInt();

        System.out.print("Enter Position index: ");
        int pos =sc.nextInt();

        //i) Bitmask 1<<i
        int bitmask=1<<pos;

        //ii) & with ~
        int notBitmask=~bitmask;
        int result=n&notBitmask;

        System.out.println(result);
        System.out.println(Integer.toBinaryString(result)); //binary Number
        System.out.println((~(1<<pos))&n); //inshort and direct

    }
}
