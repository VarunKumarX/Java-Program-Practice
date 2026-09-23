package main.java.BitManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.print("Enter Position: ");
        int pos=sc.nextInt();

        int bitmask=1<<pos;

        if ( (bitmask&n)==0 ){ //checking bit is 0 or 1 to choose Operation
            System.out.println("SET Operation used to convert 0 to 1 at position");
            System.out.println(bitmask|n);
        }
        else{
            System.out.println("CLEAR Operation used to convert 0 to 1 at position");
            int notBitmask=~bitmask;
            System.out.println(notBitmask&n);
        }

    }
}
