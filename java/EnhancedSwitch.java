package main.java;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Day Number from 1-7 : ");
        int day = sc.nextInt();

        //1.
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Out of Range");
        }

        //2.storing output of switch to a variable named as print and then print it.
        String print = switch(day){
            case 1,2,3,4,5 -> "Weekday";
            case 6,7 -> "Weekend";
            default -> "Out of Range";
        };
        System.out.println(print);

        //3.directly printing the switch output
        System.out.println(
            switch(day){
            case 1,2,3,4,5 -> "Weekday";
            case  6,7 -> "Weekend";
            default -> "Out of Range";
        }
        );


    }
}
