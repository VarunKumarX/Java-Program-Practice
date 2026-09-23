package main.java;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title= "i m god";
        System.out.println(title);
        System.out.println("Length of title: "+title.length());

        System.out.print("Enter First Name: ");
        String first=sc.next(); // handles single token or word
        sc.nextLine(); // consuming the \n buffer created by the above line.
        System.out.println(first);

        System.out.print("Enter Last Name: ");
        String second =sc.nextLine(); // can handle full sentence.
        System.out.println(second);

        //Concatenation
        String conc= first+second;
        System.out.println(conc);
        String conc2= first+" "+second;
        System.out.println(conc2);
        String conc3= "i am "+first;
        System.out.println(conc3);

        //printing characters one by one
        for (int i=0; i<conc2.length();i++){
            System.out.println(conc2.charAt(i));
        }

        //printing string in one time
        System.out.println(conc3);

        //parseInt - String to Integer conversion
        String s ="123";
        int n = Integer.parseInt(s);
        System.out.println(s);
        System.out.println(n);
//        System.out.println(Integer.parseInt(first)); //alphabet ->int X

        //toString - Integer to String conversion
        int m =345;
        String s2 = Integer.toString(m);
        System.out.println(m);
        System.out.println(s2);

        //toBinaryString
        String s3=Integer.toBinaryString(11);
        System.out.println(s3);
    }
}
