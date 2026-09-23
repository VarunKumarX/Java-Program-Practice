package main.java;

import java.util.Scanner;


public class FunctionExercise {

    public static float avg(float x, float y, float z){
        return (x+y+z)/3;       //returns float because returnType is float.
    }
    public static void avg2(int a, int b, int c){
        System.out.println("\navg2: "+(a+b+c)/3); //print without decimal value
        System.out.println("avg2: "+(a+b+c)/3.0); //print a double result
        System.out.println("avg2: "+(a+b+c)/3f); //print a float result
    }

    public static int greater(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int sumOddN(int n){
        int sum=0;
        if(n<0){
            System.out.println("\na is -ve so");
            return sum;
        }
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void circle(int r){ //return type VOID
        if(r<0){
            System.out.println("\nb is -ve so");
            return;
        }
        System.out.println("circumference: "+ 2*Math.PI*r);
        System.out.printf("circumference: %.2f",(2*Math.PI*r));
        System.out.println("\narea: "+String.format("%.2f",Math.PI*r*r));
    }
    public static double circle2(int r){ //return type double.
        return Math.PI*r*r;
    }

    public static void ageCheck(int n){
        if(n>18){
            System.out.println("Eligible for VOTE");
        }
        else{
            System.out.println("Ineligible for VOTE");
        }
    }

    public static void infinity(int n){
        do{
            System.out.println(n);
        }while(n==n);
    }

    public static void power(int x,int n){
        double power=1;
        int m=Math.abs(n);   // converting any -ve to +ve, if exist. ABSOLUTE VALUE of n.
        for (int i=1;i<=m;i++){
            power=power*x;
        }
        if (n<0){
            power=1/power;
        }
        System.out.println("x^n: "+power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= sc.nextInt();
        System.out.print("Enter the second number: ");
        int b= sc.nextInt();
        System.out.print("Enter the third number: ");
        int c= sc.nextInt();
        System.out.print("Enter Age: ");
        int age= sc.nextInt();

        //Average;
        System.out.printf("Average: %.2f",avg(a,b,c));
        avg2(a,b,c);

        //Greater
        System.out.println("\n"+greater(a,b)+" is greater in between a & b.");

        //Sum of all odd from 1 to a.
        System.out.println("sum of odds from 1 to a: "+sumOddN(a));

        //circle
        circle(b);
        System.out.println("area2: "+circle2(b));

        //Vote eligibility check
        ageCheck(age);

//        infinity(c);

        //a^b
        power(a,b);

    }
}
