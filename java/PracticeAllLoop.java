package main.java;

import java.util.Scanner;

public class PracticeAllLoop {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n=sc.nextInt();
        System.out.print("Enter the second number: ");
        int m=sc.nextInt();

        //rectangle
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //hollow Rectangle
        for (int i=1;i<=n;i++){
            for (int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Half Pramid
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
        // similar but i starts from n
        for (int i =n; i>=1; i--){
            for (int j=i; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // inverted Half pramid
        // both i & j started from 1
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print("- ");
            }
            System.out.println();
        }
        //similar but j starts from n
        for  (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print("+ ");
            }
            System.out.println();
        }
        //similar but i starts from n
        for (int i=n;i>0;i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //180 Rotated half pramid
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("x ");
            }
            System.out.println();
        }

        //Half pramid with no
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Inverted Half Pramid with No
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nFloyd's Triangle <----------------");
        int no=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }

        System.out.println("\n0-1 Triangle <-------------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
//                int sum=i+j;
                if((i+j) % 2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        //Butterfly
        System.out.println("\nButterfly <---------------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //to flip above part just flip the sequence i= n -> 1
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Hollow Butterfly
        System.out.println("\nHollow Butterfly <--------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(j==1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                if(j==1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                if(j==1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                if(j==1 || i==j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\nSolid Rhombus <------------------");
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=1;j<=n; j++){
                System.out.print("x ");
            }
            System.out.println();
        }

        System.out.println("\nparallelogram <----------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Number Pyramid <----------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("Palindromic Pattern <----------");
        for (int i=1;i<=n;i++){
            int pal=i;
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(pal+" ");
                pal--;
            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j+" ");
//            }
            for (int j=2;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        //similar Palindromic
        for ( int i =1; i<=n; i++){
            for ( int j=n-1; j>=i; j--) System.out.print("  ");
            for ( int j=i; j>=1; j--) System.out.print(j+" ");
            for ( int j=2;j<=i; j++ ) System.out.print(j+" ");
            System.out.println();
        }

        System.out.println("\nDiamond <-------------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Similar Diamond with sharp corners
        for (int i=1; i<=n; i++){
            for (int j=n; j>i; j--) System.out.print("  ");
            for (int j=1; j<=(2*i)-1; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i=n-1; i>=1; i--){ //n-1; to decrease 1 row.
            for (int j=n; j>i; j--) System.out.print("  ");
            for (int j=1; j<=(2*i)-1; j++) System.out.print("* ");
            System.out.println();
        }
        //
        System.out.println("\nHollowDiamond <-------------------");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                if(j==1 || j==2*i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                if(j==1 || j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }




    }


}
