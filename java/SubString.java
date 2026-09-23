package main.java;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1="I am Varun Kumar";
        String name= s1.substring(5,s1.length()); //1
        String name2=s1.substring(5); //end index no = length()
        System.out.println(name);
        System.out.println(name2);

        String fname=s1.substring(5,10); //2
        System.out.println(fname);
        String lname=s1.substring(11); //3
//        String lname=s1.substring(11,s1.length);
//        String lname=s1.substring(11,16);
        System.out.println(lname);

    }
}
