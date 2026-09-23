package main.java;

import java.util.Scanner;

public class Importants {
    public static void flyoddd(int n){
        int no=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
    }

    public static void TriOl(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){

                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void expo(int a, int b){
        int abs=Math.abs(b);
        float ans=1;
        if(a<0){
            System.out.println("1st Number cant be negative...");
            return;
        }
        for (int i=1;i<=abs;i++){
            ans*=a;
        }
        if(b<0){
            ans=1/ans;
        }
        System.out.print("a^b: "+ans);
    }

    public static void Fabo(int n){
        int a=0,b=1,c;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }

    public static void primeno(int a){
        if(a<2){
            System.out.println(a+" is not prime ");
            return;
        }

        if(a==2){
            System.out.println(a+" is Prime no");
            return;
        }

        int limit=(int)Math.sqrt(a);
        boolean flag=true;

        if(a%2==0){
            flag=false;
        }
        else{
            for (int i=3;i<=limit;i+=2){
                if(a%i==0){
                    flag=false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println(a+" is Prime no");
        }
        else{
            System.out.println(a+" is not Prime no");
        }
    }

    public static void pascal(int n){
        if(n<1){
            System.out.println("Invalid Number for Pascal");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int num=1; //every iteration starts from 1 so initiation again n again.
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public static void palin(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }

    public static void dia(int n){
        for (int i=1; i<=n; i++){
            for ( int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){
            for ( int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butter( int n){
        for (int i=1; i<=n; i++){
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){ //only this line changed
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterH( int n){
        for (int i=1; i<=n; i++){
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i)-1; j++){
                System.out.print("  ");
            }
            for ( int j=1; j<=i; j++){
                if(j<n) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){ //only this line changed
            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i)-1; j++){
                System.out.print("  ");
            }
            for ( int j=1; j<=i; j++){
                if(j<n) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First No: ");
        int n=sc.nextInt();
        System.out.print("Enter Second No: ");
        int m=sc.nextInt();

        System.out.println("\nFlyod's Triangle------------------");
        flyoddd(n);

        System.out.println("\n0-1 Triangle ---------------------");
        TriOl(n);

        System.out.println("\nExponential ----------------------");
        expo(n,m);

        System.out.println("\n\nFabonacci ------------------------");
        Fabo(n);

        System.out.println("\n\nPrime No -------------------------");
        primeno(n);
        primeno(m);

        System.out.println("\nPascal ---------------------------");
        pascal(n);

        System.out.println("\nPalindrome -----------------------");
        palin(n);

        System.out.println("\nDiamond --------------------------");
        dia(n);

        System.out.println("\nButterfly ------------------------");
        butter(n);

        System.out.println("\nButterfly 2 ----------------------");
        butterH(n);

//        making constant
        final int a=5; //now we can change the value of a.

    }
}
