package main.java;

import java.util.Scanner;

public class AdvancedPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        //Butterfly
        //Upper Half
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            for(int j=1;j<n-i+1;j++) {
//                System.out.print("  ");  //2 spaces here
//            }
////            for(int j=1;j<n-i+1;j++) {
////                System.out.print(" ");
////            }
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Lower Half
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<n-i+1;j++) {
                System.out.print("  ");  //2 spaces here
            }
//            for(int j=1;j<n-i+1;j++) {
//                System.out.print(" ");
//            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }



//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=n-i+1;j++) {
//                System.out.print("*");
//            }
//            for(int j=1;j<=i-1;j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i-1;j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n-i+1;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//      rhombus
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
