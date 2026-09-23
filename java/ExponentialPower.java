package main.java;

import java.util.Scanner;

public class ExponentialPower {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        double ans=1;
        int m=Math.abs(n);   // converting any -ve to +ve, if exist. ABSOLUTE VALUE of n.
        for (int i=1;i<=m;i++){
            ans=ans*x;
        }
        if (n<0){
            ans=1/ans;
        }
        System.out.println("x^n: "+ans);
    }
}
