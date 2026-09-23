package main.java;
import java.util.Scanner;
public class BasicLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();


        //for loop
        System.out.println("\nfor loop");
        for (int i=0;i<=n;i++){
            System.out.println(i);
        }

        //while loop
        System.out.println("\nwhile loop");
        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        //do while loop
        System.out.println("\nDo While Loop");
        i=0;
        do{
            System.out.println(i); //prints atleast once as condition checks after first printing.
            i++;
        }while(i<=n);
    }
}
