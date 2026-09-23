package main.java;

import java.util.Scanner;

public class ArraySortCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n =sc.nextInt();

        //input
        int [] numbers=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        //output
        for (int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }

        boolean ASort=true;
        //Ascending Sort Checker
        for( int i=0; i<n-1;i++){ // remember this n-1.
            if (numbers[i] > numbers[i+1]){
                ASort=false;
                break;
            }
        }

        if(ASort){
            System.out.println("Ascending SORTED ARRAY");
        }
        else {
            System.out.println("Not SORTED ARRAY");
        }

    }
}
