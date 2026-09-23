package main.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();

        String rev=""; //initialised but empty
        System.out.println(rev);

        //1st using String Concating
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i); //concating the reverse string characters here.
            System.out.println(rev);
        }
        System.out.print("\nReversed String: "+rev+"\n\n");

        //2nd simple way - direct reverse print with concating
        for( int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

    }
}
