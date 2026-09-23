package main.java.Sort;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 numbers... ");
        int [] num=new int[5];
        //Taking Number Array INPUT
        for (int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }


        //Bubble Sort
        for(int i=0; i<num.length-1; i++){     //n-1 iterations
            //On every iteration we are getting the heaviest number
            // which is swapped to the last, so skipping first one
            //because it auto. comes on correct(1st) position.
            //therefore, n-1-i iterations.
            for ( int j=0; j<num.length-1-i; j++){ //n-1-i
                if(num[j]>num[j+1]){
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
                System.out.println(Arrays.toString(num)); //to see swapping
            }
            System.out.println("next iteration"); //to see swapping
        }


        // Output using For Each Loop
        for( int n: num){
            System.out.print(n+" ");
        }
        //Output using Arrays built in method.
        System.out.println("\nBubble Sorted Array: "+Arrays.toString(num));

    }
}
