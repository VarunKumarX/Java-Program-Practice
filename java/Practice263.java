package main.java;
import java.util.Arrays;
import java.util.Scanner;

public class Practice263 {

    public static void marks( int n){
        Scanner sc = new Scanner(System.in);
        int [] marks = new int [n];


        //default
        System.out.print("\n\nDefault values: ");
        for ( int i=0; i<n; i++){
            System.out.print(" "+marks[i]);
        }
        //input
        for ( int i=0; i<n; i++){
            System.out.print("\nEnter next marks: ");
            marks[i]=sc.nextInt();
        }
        //ouput
        System.out.print("\n\nYour marks are: ");
        for ( int i=0; i<n; i++){
            System.out.print(" "+marks[i]);
        }
        // Max Min
        int max=marks[0], min=marks[0];
        for ( int i=1; i< marks.length; i++){
            if(max<marks[i]) max=marks[i];
            if(min>marks[i]) min=marks[i];
        }
        System.out.println("\nmax marks: "+max);
        System.out.println("min marks: "+min);
        System.out.println("Built in MIN: "+Arrays.stream(marks).min().getAsInt());
        int jjj=Arrays.stream( marks).max().getAsInt();
        System.out.println("built in MAX: "+jjj);

        // ascending or not
        boolean is=true;
        for ( int i =1; i<marks.length; i++){
            if( marks[i-1]>marks[i]) { is=false; break; }
        }
         if(is) System.out.println("Ascending marks");
         else System.out.println("Not Ascending marks");

//         //find ith position's value
//        System.out.print("Enter i for its value: ");
//        int x=sc.nextInt();
//        System.out.println("\nAns: "+marks[x]);
//
//        //find i position of x
//        System.out.println("Enter No. (x) for its position: ");
//        int x2=sc.nextInt();
//        for( int i=0; i<marks.length; i++){
//            if(marks[i]==x2){
//                System.out.println("position: "+i);
//                break;
//            }
//        }

        System.out.println(marks);

    }

    public static void topstu( int n){
        Scanner sc=new Scanner(System.in);
        String [] names = new String[n];
        for( int i=0; i<n; i++){
            System.out.print ("Enter Name: ");
            names[i]=sc.nextLine();
//            sc.nextLine();
        }
        System.out.print(names.length+" Top Student Names are: ");
        for ( int i=0; i<n; i++){
            System.out.print(names[i]+" ");
        }

    }
//    public static void mult( int x, int y){
//        int m=x*y;
//        System.out.println(m);
//    }
//    public static long facto(int x, int y){
//        if (x<0){ System.out.println("invalid"); return 0;}
//        long sta=1;
//        for( int i=x; i>=2; i-- ){
//            sta=sta*i;
//            System.out.println(sta+" ");
//        }
//        return sta;
//    }
//    public static void evennot(int n){
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");
//    }
//    public static void tabl( int a){
//        for ( int i=1; i<=10; i++){
//            System.out.println(a*i);
//        }
//    }
//
//    public static void primenot( int b){
//        if ( b<2){
//            System.out.println("invalid/not prime");
//            return;}
//        if  (b==2) {
//            System.out.println(" Prime");
//            return;
//        }
//        boolean isprime=true;
//        int limit= ( int) Math.sqrt(b);
//        if (b%2==0) isprime=false;
//        else {
//            for ( int i=3; i<=limit; i+=2){
//                if (b%i==0) isprime=false;break;
//            }
//        }
//        if (isprime) System.out.println("Prime");
//        else System.out.println("not prime");
//
//    }


    public static void main( String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
//        mult(a,b);
//        int ans=multi(a,b);
//        System.out.print(facto(a,b));
//        evennot(a);
//        tabl(b);
//        primenot(a);
        marks(a);
//        topstu(b);
        sc.close();

    }
}
