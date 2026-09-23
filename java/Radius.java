package main.java;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input
        System.out.print("Enter Radius: ");
        float r=sc.nextFloat();

        //output
        System.out.println("circumference: "+(2*Math.PI*r));
        System.out.println("Area: "+(Math.PI*r*r));
        System.out.println();

        //2 decimal values by using printf
        System.out.printf("circumference: %.2f %n",(2*Math.PI*r));
        System.out.printf("Area: %.2f %n",(Math.PI*r*r));

        //2 decimal values by using println
        System.out.println("circumference: "+String.format("%.2f",(2*Math.PI*r)));
        System.out.println(String.format("Area: %.2f",(Math.PI*r*r)));


    }


}
