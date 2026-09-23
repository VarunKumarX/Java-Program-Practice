package main.java;

import java.util.Scanner;

public class ArrayFindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[]= {1,66,0,48}; //2nd way of declaring/creating a array.
        System.out.println(age); //Garbage value: mixture of class name and hexa code
        for(int mark:age) System.out.print(mark+" "); //For Each Loop


        //Declaring array and taking its size
        System.out.print("\n\nEnter size of array: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];

        //input
        System.out.println("Enter array elements");
        for (int i = 0; i < n; ++i) { //taking input from user
            numbers[i] = sc.nextInt();
        }

        //what to find
        System.out.print("Enter element for its index no: ");
        int x = sc.nextInt();

        //searching x number index in array
        for(int i=0; i<n; i++){
            if(numbers[i]==x){
                System.out.println(x+" found at index no: "+i);
                return; //ends the program if x found once.
            }
        }

    }
}
