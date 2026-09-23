package main.java.OOPS;

class Pen{
        String modelNo;
        int price;

        void info(){
            System.out.println(this.modelNo);
            System.out.println(this.price);
        }
}

public class Basics {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.info();
        p.modelNo="x0x0";
        p.price= 49;
        p.info();

        Pen p2=new Pen();
        p2.modelNo="3xlll";
        p2.info();

    }
}
