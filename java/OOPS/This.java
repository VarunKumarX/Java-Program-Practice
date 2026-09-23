package main.java.OOPS;

class pencil{
    //class instance variables
    String modelNo;
    int price;
    float year;

    void info(){
        System.out.println(this.modelNo);
        System.out.println(this.price);
    }
    //Explain the use of this. keyword
    // this tells computer to use currently running objects own properties. <------------------
    void updatePrice(int price){ //price: local variable as parameter
        this.price = price; //comment it to see difference
//        price = price;
        //Java gets confused in between "class instance variable & local variable".
        //and java always priorities local variables over class instance variable.
        //hence assume both as local variables that is passed as a parameter.
        // leads to "Instance Variable Shadowing"
    }
    void  updateYear( float yr){
        year = yr;
        // local variable parameter(yr) & class instance variable/property(year)
        // both names are different, so java easily distinguish them.
        //name same hote to Shadowing ho jati.
    }
}

public class This {
    public static void main(String[] args) {

        pencil p2 = new pencil();
        p2.modelNo = "3edition";
        p2.info();
        System.out.println();

        p2.updatePrice(50);
        p2.info();
        System.out.println();

        p2.updateYear(123);
        p2.info();
        System.out.println(p2.year);

    }
}
