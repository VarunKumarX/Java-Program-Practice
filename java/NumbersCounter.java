package main.java;

import java.util.Scanner;

public class NumbersCounter {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);

         char ch;
         int zero=0,positive=0,negative=0;
         do{
            System.out.print("Enter a number:");
            int n=sc.nextInt();

            if(n==0){
                zero++;
            }
            else if(n<0){
                negative++;
            }
            else{
                positive++;
            }

            System.out.println("Do you want to enter more\nPress Y or N");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');

        System.out.println("zeros: "+zero+"\nPositives: "+positive+"\nNegatives: "+negative);
    }
}
