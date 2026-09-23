package main.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ARRAY ELEMENT AUTO INITIALIZATION");
        System.out.print("Enter the size of the array: ");
        int n =sc.nextInt();

        //Declaration
        int [] marks = new int[n];

        System.out.println("Auto intialized Values");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // it will show error if we enter n<3,
        // because we occupied memory for size 3 further in code below and
        // trying to access less than 3 memory size.
        System.out.println("Values after intialization");
        marks[0]=85;
        marks[1]=70;
        marks[2]=90;

        //for-each loop same as for-loop
        // which is iterable (gives elements one by one).
        for (int mark : marks) {
            System.out.println(mark);
        }

        //array converted to String
        String ss=Arrays.toString(marks);
        System.out.println(ss);
        System.out.println(Arrays.toString(marks)); //can directly print also
        //[85, 70, 90, 0, 0]


        System.out.println("\n\nauto intialized char values");
        char [] grade= new char[marks.length];
//        grade[1]=sc.next().charAt(0);
        for (int i=0;i<marks.length;i++){
            System.out.println(grade[i]);
        }
//        //same with for-each loop
//        for(char a:grade){
//            System.out.println(a);
//        }

        System.out.println("\n\nauto intialized boolean values- null");
        boolean [] goodBad = new boolean[marks.length];
        System.out.println(Arrays.toString(goodBad));
        for (int i=0;i<marks.length;i++){
            System.out.println(goodBad[i]);
        }


        //INT Array concatenation
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray();
        System.out.println("\n\n"+Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6]

        //String Array concatenation
        String [] s1={"ram", "sam", "nam"};
        String [] s2={"am", "am", "am"};
        char [] c1={'b','a','v'};
        String [] s= Stream.concat(Arrays.stream(s1),Arrays.stream(s2))
                .toArray(String[]::new);
        System.out.println("\n\n"+Arrays.toString(s));

    // Things to learn here:-
        // Default, Mannual, User input initialisation,
        // Accessing values using index no' (set/print)
        // Accessing values using For Each Loop (print)
        // Concatenation
        // Print array using Arrays.toString(arr)

    }
}
