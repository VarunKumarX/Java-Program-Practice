package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        //Array input
        int [] numbers = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

//      // 11111111111111111111st Way................................
//        int min=numbers[0];
//        int max=numbers[0];


        //222222222222222222222nd way.................................
        int min = Integer.MAX_VALUE; //Largest Possible Integer = 2147483647.
        //So anything Smaller then max will updated correct and eventually gives min value.
        int max = Integer.MIN_VALUE; // Smallest Possible Integer = -2147483647
        //So anything bigger then min will updated correct and eventually gives ax value.


//        //333333333333rd way using Java's Built-in Methods
//        // (Directly initialised with MIN MAX values.)
//        int min = Arrays.stream(numbers).min().getAsInt();
//        int max = Arrays.stream(numbers).max().getAsInt();


        //checker
        for (int i=0;i<n;i++){
            if (numbers[i]>max) { max=numbers[i]; }
            if (numbers[i]<min) { min=numbers[i]; }
        }

        System.out.println("The minimum value is "+min);
        System.out.println("The maximum value is "+max);

    }
}
