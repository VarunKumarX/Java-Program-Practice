package main.java.OOPS;
class Stud {
    int id;
    String name;
    int age;

    //Three ways to fn overload:
    //1. No of parameters
    //2. DataTypes of parameters
    //3. Sequence of parameters
    //Note: returntype can be any void/non-void, but it doesn't overload fn.
    public void printInfo() {
        System.out.println("Stud Info:"+id+" "+name+" "+age);
    }
    public int printInfo(int id) { return id; }//note
    public void printInfo(String name){ System.out.println(name); }//2.
    public void printInfo(int id, String name) { System.out.println(id+" "+name); }
    public void printInfo(String name, int id) { System.out.println(name+" "+id); } //3.
    public void printInfo(int id, String name, int age) { System.out.println(id+" "+name+" "+age); }//1.
}

public class methodOverloading {
    // function overloading - Compile Time Polymorphism
    public static void main(String[] args) {
        Stud s1 = new Stud();
        //without initialisation of s1 student properties
        s1.printInfo();
        System.out.println(s1.printInfo(666));
        s1.printInfo(5);
        //no sout so printing only returning.
        s1.printInfo("maggi");
        s1.printInfo(6,"ram");
        s1.printInfo("ram",6);
        s1.printInfo(6,"Captain",29);
        s1.printInfo();


        System.out.println();
        Stud s2 = new Stud();
        // Initialising properties in Non-Parameterised Constructor
        s2.id=999;
        s2.name="VARUN";
        s2.age=28;
        s2.printInfo();
        s2.printInfo(s2.id); //java didn't understand which funtion is called & what to print
        System.out.println(s2.id); //correct way to access the instance property.
        s2.printInfo(s2.id+s2.name+s2.age); //java misinterpreted it as names constructor (bad way)






    }


}
