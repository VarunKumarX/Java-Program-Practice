package main.java;

import java.util.Scanner;

public class GhostNewline {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id= sc.nextInt();
        System.out.print("Enter Grade: ");
        char grade= sc.next().charAt(0); // \n (Enter key) stays in buffer.

//        sc.nextLine(); //consuming the leftover newline character of above - removes ghost newline

        System.out.print("Enter Name: ");
        String name= sc.nextLine(); // Ghost Newline issue

        System.out.print(id+" Grade: "+grade);
        System.out.print(" Name: "+name);


        sc.close();


//        Methods like next(), nextInt(), nextDouble(), etc (non-line input method)
//        read tokens but ignore the newline character when we press Enter.
//        so, Newline stays in the buffer
//        If next line is nextLine(), it immediately consumes that leftover \n,
//        treats it as an empty line and skips waiting for user input.

//        Soultion : Add sc.nextLine() command right after non-line input method
//        to clear out the leftover character.
    }
}
