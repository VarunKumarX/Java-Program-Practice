package main.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FunctionsBasic {
    String color;
    int a;
    int x=6;

    public static void print(String name ){
        System.out.println(name);
        return;
    }

    public static int adder(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static int mul(int a, int b){
        return a*b; //directly returning
    }

    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println(n+" is Even");
        }
        else{
            System.out.println(n+" is Odd");
        }
        //no necessary to return; because return type is void.
    }

    public static void table(int n){
        System.out.println("\nTable of "+n);
        for(int i=1;i<=10;i++){
            System.out.print(i*n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine();
//        print(name);

        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();

        //Addition
        int addition=adder(a,b);                //calling in variable
        System.out.println(addition);           //printing using variable
        System.out.println("Sum: "+addition);   //printing using variable with Text
        System.out.println("Sum: "+adder(a,b)); //directly call in sout -best

        //Multiplication
        System.out.println("Product: "+mul(a,b));

        //EvenOld
        evenOdd(a);
        evenOdd(b);

        //Table
        table(a);
        table(b);


    }
}
