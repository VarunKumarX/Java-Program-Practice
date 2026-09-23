package main.java;
import java.util.Scanner;
public class SumOfNNaturals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No: ");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of N Natural Numbers:"+sum);


        System.out.println("\n\nTable of "+n);
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
    }
}
