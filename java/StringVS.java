package main.java;

import java.util.Scanner;

import static java.lang.CharSequence.compare;

public class StringVS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1="cat";
        String s2="zog";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s1));
        System.out.println(compare(s1,s2)); //imported the library for using with string
        //also Integer and Double isnt mentioned here becoz its string.

        System.out.println(s1==s2); //false, it works but not in all cases
        System.out.println(s1==s1);
        System.out.println(s1=="cat");

        // this == doesn't works in this case.
        if(new String("Tony") == new String("Tony")){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        //Both are equal but still showing not equal
        //thats why == not good for comparing strings.
        //because strings in java are objects and they
        //act differently in memory in comparison to primitive types.

        String s3="3";
        String s4="6";
        int s5=3;
        int s6=6;
        int s66=6;
        char s7='c';
        char s8='d';
        boolean s9=true;
        boolean s10=true;
        float f1= 5.2F;
        double d1= 5.2;

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(Integer.toString(s5))); //0

//        System.out.println(f1.equals(f1)); // equals works only on string
        System.out.println(Integer.compare(s66,s6));
//        System.out.println(Double.compare(s10,s9));
//        System.out.println(s9.equals(s10));
//        System.out.println(s7.equals(s8)); //only works on string.



    }
}
