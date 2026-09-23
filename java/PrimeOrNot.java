package main.java;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Un-optimized and easy and slow
//        int count=0;
//        if(n<=1){
//            System.out.println("Not Prime Number");
//        }
//        else{
//            for(int i=2; i<=Math.sqrt(n);i++){
//                if(n%i==0){
//                    count++;
//                    break;
//                }
//            }
//            if(count>0){
//                System.out.println("Not Prime Number");
//            }
//            else{
//                System.out.println("Prime Number");
//            }
//        }

        System.out.println("-----------------------------------");


        //Optimized fast and cleaner code (less execution)
        if(n<=1){
            System.out.println("Not Prime Number");
            return; // ends the program
        }
        if(n==2){  // Special Case
            System.out.println("Prime Number");
            return;
        }

        boolean isPrime=true;
        int limit = (int) Math.sqrt(n); //converted decimal value into int
        System.out.println(limit);

        if(n%2==0) isPrime=false;
        else{
            for(int i=3; i<=limit; i+=2){ //now checking only odd divisor
                if(n%i==0){
                    isPrime=false;
                    break; // stops loop immediately if divisor found
                }
            }
        }

        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
