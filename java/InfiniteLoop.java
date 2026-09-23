package main.java;

public class InfiniteLoop {
    public static void main(String[] args) {

        int a=0;
        for( ; ; ){  //no condition defined - java assume it as always true.
            System.out.println(a);
            a++;
        }
    }
}
