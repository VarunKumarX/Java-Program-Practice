package main.java.Sort;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 numbers... ");
        int [] num=new int[5];
        //Taking Number Array INPUT
        for (int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }


        //Selection Sort
        for(int i=0; i<num.length-1; i++){
            int smallest=i;
            for( int j=i+1; j<num.length;j++){
                if(num[smallest]>num[j]){
                    smallest=j;
                }
            }

            //Swap
            int temp=num[smallest]; //smallest is declared out of the inner loop. so we can access it out of inner loop and we cant use j out of its loop.
            num[smallest]=num[i];
            num[i]=temp;
            System.out.println(i+" "+Arrays.toString(num)); // to see updation
            //1 swap per outer iteration
        }


        // Output using For Each Loop
        for( int n: num){
            System.out.print(n+" ");
        }
        //Output using Arrays built in method.
        System.out.println("\nSelection Sorted Array: "+ Arrays.toString(num));

    }
}
