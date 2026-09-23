package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        String marks []=new String[n];
//        for ( int i=0;i<n;i++){
//            marks[i]=sc.nextLine();
//        }

        // 1st - for each loop
        for (String a : marks){
            System.out.println(a);
        }

        //2nd - using for loop
        for (int j=0;j<n;j++){
            System.out.print(marks[j]+" ");
        }

        //3rd -array converted to string
        System.out.println(Arrays.toString(marks));


    }
}
