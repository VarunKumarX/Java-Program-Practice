package main.java;
import java.util.*;

public class StringArrayCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;


        for(int i=0; i<size; i++) {
            System.out.print("\nEnter String: ");
            array[i] = sc.next(); // taking input
            totLength += array[i].length(); //string ki tarah array element ki lenght nikal li
            //array[i]=array ka 1 element string hi hai tabhi string ki .length(); nikali
            System.out.println(array[i]+"  Length: "+array[i].length());
        }


        System.out.println("\n\nArray Length: "+array.length); // tell the array length -size
        System.out.println("Total Character: "+totLength);  // tells the all character combined length - all char
    }
}
