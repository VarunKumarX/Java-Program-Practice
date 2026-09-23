package main.java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series");
        int n = sc.nextInt();

        int first = 0, second = 1, next;
        for (int i = 1; i <= n; i++) {
            System.out.print(first+",");
            next= first+second;
            first = second;
            second = next;

        }
    }
}
