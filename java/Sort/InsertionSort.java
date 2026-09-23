package main.java.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int num[]={99,36,0,11,7};

        //insertion sort
        for(int i=1;i<num.length;i++){
            int current=num[i];
            int j=i-1;
            while(j>=0 && current<num[j]){
                //shifting sorted array forward / making space for current in sorted part
                num[j+1]=num[j]; // num[j] khali ho gya
                j--; //j - ho gya
            }
            num[j+1]=current; //because j become negative due to j--. So, j+1
            // line @14: num[j] = line @17: num[j+1], becoz @15 j - ho gya
            System.out.println(i+" "+Arrays.toString(num)); //to see updation
        }

        // Output using For Each Loop
        for( int n: num){
            System.out.print(n+" ");
        }
        //Output using Arrays built in method.
        System.out.println("\nSelection Sorted Array: "+ Arrays.toString(num));

    }
}
