package main.java;

import java.util.Scanner;

public class ArraysOfNames {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the no of names: ");
        int n=sc.nextInt(); // it reads n but leaves \n (newline) in the buffer.
        // So, names[0] = ""  (empty string)
        // then reads the remaining (n-1) names normally.
        sc.nextLine();// This consumed the leftover newline from the integer.
        // Note: Array banane se phele \n buffer clear karna hai (while mixing Int & Line)

        String []names=new String[n];
        //Names Input
        for(int i =0;i<n;i++){
            names[i]=sc.nextLine(); // if single token use sc.next(); to get rid of newline from sc.nextInt();.
        }
        //Names Output
        for (int i=0;i<n;i++){
            System.out.println((i+1)+". "+names[i]);
        }
    }
}

