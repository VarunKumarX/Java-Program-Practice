package main.java;

public class MethodsOfInteger {
    public static void main(String[] args) {

        //parseInt - String to Integer conversion
        String s ="123";
        int n = Integer.parseInt(s);
        System.out.println(s);
        System.out.println(n);

        //toString - Integer to String conversion
        int m =345;
        String s2 = Integer.toString(m);
        System.out.println(m);
        System.out.println(s2);

        //toBinaryString - Integer to Binary Conversion
        String x=Integer.toBinaryString(m);
        System.out.println(x);

    }
}
