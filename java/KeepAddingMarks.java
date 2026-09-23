package main.java;

import java.util.Scanner;

public class KeepAddingMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char carryon; // Because initialisation must be above the loop (syntax).
        //if we wrote it inside the loop then it will disappear after the loop ends.

        do{
            System.out.println("Enter Your Marks: ");
            int marks=sc.nextInt();

            if(marks>=90 && marks<=100){
                System.out.println("Awesome");
            } else if (marks>=60 && marks<=89) {
                System.out.println("Good");
            } else if (marks>=0 && marks<=59) {
                System.out.println("Fine");
            }
            else{
                System.out.println("Invalid");
            }

            System.out.print("Want to Continue entering marks?\n Enter y for yes OR n for no: ");
            carryon = sc.next().charAt(0);

        }while(carryon == 'y'|| carryon == 'Y');
    }
}
