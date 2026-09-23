package main.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input
        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b=sc.nextInt();

        System.out.println("Choose Operation by entering its number");
        System.out.println("1-> +   2-> -   3-> *   4-> /   5-> %");

        int no=sc.nextInt();
        switch (no){
            case 1:
                System.out.println("sum: "+(a+b));
                break;
            case 2:
                System.out.println("subtract: "+(a-b));
                break;
            case 3:
                System.out.println("multiple: "+(a*b));
                break;
            case 4:
                if (b==0){
                    System.out.println("INVALID: Not divisible by zero");
                }
                else {
                    //converted the a/b into float to store in float f.
                    float r= (float) a/b;
                    System.out.println("Division: "+r); //print raw
                    System.out.println("Division: "+(a/b));//without converting to decimal value.
                    System.out.printf("Division: %.3f %n",r);  //print 3 decimal value
                    System.out.println("Division: "+String.format("%.2f",r)); //print 2 decimal value
                }
                break;

            case 5:
                if(b==0){
                    System.out.println("INVALID: Not divisible by zero");
                }
                else{
                    //no need to convert output into float becoz remainder is natural no.
                    System.out.println("Remainder: "+(a%b));
                }
                break;
            default:
                System.out.println("INVALID number");

        }


    }
}
