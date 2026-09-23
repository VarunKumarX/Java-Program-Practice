package main.java;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        for (int i=0; i<=sb.length()/2-1; i++){

            //finding index of first and last - we can directly use i instead of this
            int frontIndex=i;
            int backIndex=sb.length()-1-i;

            //Temporary holding characters.
            char first=sb.charAt(frontIndex);
            char last=sb.charAt(backIndex);

            //Replacing characters of StringBuilder
            sb.setCharAt(frontIndex, last);
            sb.setCharAt(backIndex,first);
//            System.out.println(sb); //to see the changes in sb enable this.
        }
        System.out.println(sb);

        //shorter
//        char first, last;
//        for( int i=0; i<(sb.length()/2); i++){
//            first=sb.charAt(i);
//            last=sb.charAt(sb.length()-1-i);
//            sb.setCharAt(i,last);
//            sb.setCharAt(sb.length()-1-i,first);
//        }
//        System.out.println(sb);

        System.out.println("\nEverything is updated on same StringBuilder\nNo new String or String builder is created.\nString is immutable.\nbut StringBuilder is mutable.");
    }
}
