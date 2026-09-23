package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class practice09_2026 {

    public static void OddNum(int n){
        int counter=0;
        for (int i=1;i<=n;i+=2){
            System.out.println(i);
            counter++;
        }
        System.out.println(counter);
        return;
    }
    public static void pascc(int n){
        for (int i =0; i<n; i++){
            for (int j=0; j<n-i; j++) System.out.print(" ");
            int no =1;
            for ( int j=0; j<=i; j++){
                System.out.print(no+" ");
                no=no*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public static void palind(int n){
        for ( int i=1; i<=n; i++){
            for( int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for ( int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for ( int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void diaIce(int n){
        for (int i=1; i<=n; i++){
            for ( int j=1; j<=n-i; j++) System.out.print("  ");
            for ( int j=1; j<=2*i-1; j++) {
                if(j==1||j==2*i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for ( int j=1; j<=n-i; j++) System.out.print("  ");
            for ( int j=1; j<=2*i-1; j++) System.out.print("* ");
            System.out.println();
        }
    }

    //passed Scanner class object int the methods argument. (IMP)
    public static void stringArrCharCount(int n, Scanner sc){ //passing scanner object as argument.
        //input array of strings
        String [] name = new String[n];
        int counter=0;
        for ( int i=0; i < n; i++){
            System.out.print("Enter Name "+(i+1)+": ");
            name[i]=sc.nextLine();
            counter+= name[i].length(); // Array's each element is String so used .length();
        }
        System.out.println(Arrays.toString(name)); // Printing Array
        System.out.println("Total No of characters: "+counter);
        System.out.println("Total No of names: "+name.length); //Array length
    }

    public static void sbReverse(StringBuilder sb){

        for ( int i=0; i < sb.length()/2; i++){
            char first = sb.charAt(i);
            char last = sb.charAt(sb.length()-i-1);
            sb.setCharAt(i,last);
            sb.setCharAt(sb.length()-1-i,first);
        }
        System.out.println(sb);
    }

    public static void getbits(int n, int i){
        int x =(1<<i)&n;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    public static void bubble(int n, Scanner sc){
        // array input
        int [] no = new int[n];
        for ( int i=0; i<n; i++){
            no[i]=sc.nextInt();
        }

        //sort
        for ( int i=0; i<no.length-1; i++){

            for( int j=0; j<no.length-1-i; j++){
                if(no[i]>no[i+1]){
                    //swap
                    int temp=no[i];
                    no[i]=no[i+1];
                    no[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(no));
    }

    public static void selectionsort( ){
        int [] no = {33,0,95,73,-9};
        for(int i=0; i <no.length-1; i++){
            int small=i; //assume
            for (int j=i+1; j<no.length; j++){
                // finding smallest no position.
                if(no[small]>no[j]){
                    small=j;
                }
                //Swap
                int temp=no[small];
                no[small]=no[i];
                no[i]=temp;
            }
        }
        System.out.println(Arrays.toString(no));
    }

    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt(); sc.nextLine(); //consuming leftover \n
//        stringArrCharCount(n,sc);
//        diaIce(n);
//
//        palind(n);
//
//        pascc(n);

//          getbits(n,m);

//          bubble(n,sc);
          selectionsort();

        StringBuilder sb=new StringBuilder("memeso");
        sbReverse(sb);

        //hcf
        while(n!=m){
            if(n>m){
                n=n-m;
            }
            else{
                m=m-n;
            }
//            System.out.println("hcf: "+m);
        }
        System.out.println("hcf: "+m);




//        int [] arr= new int[m];
//        for(int i=0;i<m;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Integer.toBinaryString(11));








        //expo
        int y=Math.abs(m);
        float exp=1;
        for(int i=1;i<=y;i++){
            exp*=n;
        }
        if (m<0){
            exp=1/exp;
        }
        System.out.println(exp);


//        // pascal
//        for (int i=0; i<n; i++){
//            for (int j=0; j<n-i; j++) System.out.print(" ");
//            int no=1;
//            for (int j=0; j<=i; j++){
//                System.out.print(no+" ");
//                no=no*(i-j)/(j+1);
//            }
//            System.out.println();
//        }






//        int product=n*m;
//        //LCM or HCF GCD
//        //
//        while(n!=m) {
//            if (n > m) {
//                n = n - m;
//            } else {
//                m = m - n;
//            }
//        }
//        int lcm=product/n;
//        System.out.println("HCF: "+n+"\nLCM: "+lcm);


//        // Prime check
//        if (n<2){
//            System.out.println("Invalid Input / Not Prime Number");
//            return;
//        }
//
//        if(n==2){
//            System.out.println("Prime Number");
//            return;
//        }
//
//        Boolean chk=true;
//        double limit=Math.sqrt(n);
//        if(n%2==0){
//            chk=false;
//        }
//        else {
//            for( int i=3; i<=limit; i+=2){
//                if(n%i==0){
//                chk=false;
//                break;}
//            }
//        }
//
//        if(chk) System.out.println("Prime Number");
//        else System.out.println("Not Prime Number");














//        int a=0,b=1,c;
//        // fibonacci
//        for (int i=1;i<=n;i++){
//            System.out.println(a);
//            c=a+b;
//            a=b;
//            b=c;
//        }


//        for ( int i=1;i<=n;i++) {
//            for (int j = 1; j <= i; j++) {
//                if(j==1 || j==i) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if(j==1 || j==i) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
//        for ( int i=n;i>=1;i--) {
//            for (int j = 1; j <= i; j++) {
//                if(j==1 || j==i) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if(j==1 || j==i) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

//        int []  arr= new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println((Arrays.toString(arr)));
//
//        // checking
//
//        Boolean chk=true;
//        for ( int i =0; i<n-1; i++){
//            if (arr[i]>arr[i+1]){
//                chk=false;
//                break;
//            }
//        }
//        if (chk){
//            System.out.println("sorted array");
//        }
//        else{
//            System.out.println("not sorted array");
//        }
//
//        sc.close();



//        OddNum(n);
//
//        System.out.println("Table of "+n+" :");
//        for ( int i =1; i<=10; i++){
//            System.out.println(n*i);
//        }
    }
}
