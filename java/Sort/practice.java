package main.java.Sort;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        int []num ={77777,8,999,2,33};

        //bubble sort
//        for(int i=0;i<num.length-1;i++){
//            for(int j=0; j<num.length-1-i; j++){
//                if (num[j]>num[j+1]){
//                    int temp=num[j];
//                    num[j]=num[j+1];
//                    num[j+1]=temp;
//                }
//            }
//        }

        //Selection Sort
//        for (int i=0;i<num.length-1;i++){
//            int smallest=i;
//            for(int j=i+1; j<num.length;j++) {
//                if (num[smallest] > num[j]) {
//                    smallest = j;
//                }
//            }
//                int temp=num[i];
//                num[i]=num[smallest];
//                num[smallest]=temp;
//
//        }

        //Insertion Sort
        for( int i=1;i<num.length;i++){
            int j=i-1;
            int current = num[i];
            while (j>=0 && current<num[j]){
                num[j+1]=num[j];
                j--;
            }
            System.out.println(j);
            num[j+1]=current;
        }

        System.out.println(Arrays.toString(num));
    }
}
