package main.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String st1="apple";
        String st21="ap";
        System.out.println(st21.compareTo(st1)); // similar char so checking no of char diff.
        String st2="ap";
        String st3="Apple";
        String st4="zpple";
        String st5="banana";
        String st6="apple";
        String st7="9";
        String st8="2";
        String st9="2";
        String st10="2.0";
        System.out.println("--------------------------\nComparing Strings using compareTo()");
        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st1.compareTo(st4));
        System.out.println(st3.compareTo(st4));
        System.out.println(st1.compareTo(st5));
        System.out.println(st1.compareTo(st6));
        System.out.println(st3.equals(st5));
        System.out.println(st1.equals(st6));
        System.out.println("--------------------------\nComparing Numbers using compareTo()");
        System.out.println(st7.compareTo(st8));
        System.out.println(st8.compareTo(st9));
        System.out.println(st9.equals(st8));
        System.out.println(st9.compareTo(st10)); // decimal value bigger
//        System.out.println(5.compareTo(5.0));
// cant handle numbers but you can pass number using string. ex- above stt.
        System.out.println(st9.equals(st10));
        System.out.println("--------------------------\nComparing Numbers using compare()");
        int n1=9, n2=2, n3=2;
        float n4=2f;
        double n5=2.0;
        System.out.println(Integer.compare(n1,n2));
        System.out.println(Integer.compare(n2,n3));
        System.out.println(Integer.compare(n1, (int) n4));//n4 casted into int
        System.out.println(Integer.compare(n2, (int) n4));
        System.out.println(Double.compare(n1,n4)); // without casting using Double...
        System.out.println(Double.compare(4,n4)); // 4 vs 2f, decimal 2 unicode plus hota hai
        System.out.println(Double.compare(n4,n5)); // float double same unicode
        System.out.println(Integer.compare(5,5));
        System.out.println(Integer.compare(5,10));
        System.out.println(Integer.compare(9,5));
        System.out.println(Double.compare(5,5.0));
        System.out.println(Double.compare(5.0,5.0));
//        System.out.println(n1.equals(n3));    //not handle int- handles string only.
//        System.out.println(n1.compareTo(n2)); //not handle int- handles string only.

        System.out.println("\nComparison are done on the basis of \nUnicode Value of each character\n");


        if(st1.equals(st5)){          // it checks Exactly same or not
//        if(st1.compareTo(st6)==0){  //it compares lexicographically
            System.out.println("Same String");
        }
        else{
            System.out.println("Different String");
        }



    }
}
