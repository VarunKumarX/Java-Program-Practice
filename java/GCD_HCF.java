package main.java;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int n2=sc.nextInt();
        int gcd=0;

        //simple one
        for(int i=1; i<=n1 && i<=n2; i++){
           if(n1%i==0 && n2%i==0){
               gcd=i;
           }
        }
        System.out.println("GCD & HCF :"+ gcd);

        //LCM * HCF = a * b
        int LCM=n1*n2/gcd;
        System.out.println("LCM :"+ LCM+"\n\n");

        //Best & optimized one ("Euclidean Algorithm)
        while(n1 != n2){
            if(n1>n2) {
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
        }
        System.out.println("GCD & HCF :"+ n1);
        System.out.println("GCD & HCF :"+ n2);
        System.out.println("we can print n1 or n2 becoz both will become same.");

    }

}
