package main.java.BitManipulation;

import java.util.Scanner;

public class Get2 {
    public static Boolean isKthBitSet(int n, int k) {
        // Create a mask with only the k-th bit set
        int mask = (1 << k);

        // Perform bitwise AND
        return (n & mask) != 0;
//        return (n&mask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Ex: 13  Binary: 1101

        // Check the 0th bit (rightmost)
        System.out.println("Is 0th bit of " + number + " set? " + isKthBitSet(number, 0)); // true (1)

        // Check the 1st bit
        System.out.println("Is 1st bit of " + number + " set? " + isKthBitSet(number, 1)); // false (0)

        // Check the 2nd bit
        System.out.println("Is 2nd bit of " + number + " set? " + isKthBitSet(number, 2)); // true (1)

        // Check the 3rd bit
        System.out.println("Is 3rd bit of " + number + " set? " + isKthBitSet(number, 3)); // true (1)


        //2nd way to find all bits - without the use of function
        for (int i=3;i>=0;i--){
            if(((1<<i)&number)==0) System.out.print("0 ");
            else System.out.print("1 ");
        }
    }
}