package main.java;

import java.util.Scanner;

public class Pramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();

        //Half Pramid
        for(int i=1;i<=n;i++){           //for(i=1->n)
            for(int j=1;j<=i;j++){       //    for(j=1->i)
                System.out.print(j);
            }
            System.out.println();
        }


        //Inverted Half Pramid
        for(int i=n;i>=1;i--){           // for(i=n->1)
            for(int j=1;j<=i;j++){       //     for(j=1->i)
                System.out.print("0");
            }
            System.out.println();
        }
        // Another Way - Inverted Half Pramid - easy to remember
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }


        //Inverted Half Pramid - 180 Degree
        for(int i=n;i>=1;i--){            // for(i=n->1)
            for(int j=1; j<i; j++){       //    for(j=1->i-1)
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++){      //    for(k=i->n)
                System.out.print("+");
            }
            System.out.println();
        }


        //Pramid
        for(int i=n;i>=1;i--){            // for(i=n->1)
            for(int j=1; j<i; j++){       //    for(j=1->i-1)
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++){      //    for(k=i->n)
                System.out.print(".");
            }
            for(int k=i; k<n; k++){      //    for(k=i->n-1)
                System.out.print(".");
            }
            System.out.println();
        }
        //similar
        for(int i=1; i<=n;i++){
            for( int j=n-1; j>=i; j--) System.out.print("  ");
            for( int j=1; j<=(2*i)-1; j++) System.out.print("* ");
            System.out.println();
        }


        //Floyd's Triangle - Number Pattern
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }


        //0-1 Triangle
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if (sum % 2 == 0){  //even
                    System.out.print("1 ");
                }
                else {              //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


        //
    }
}
