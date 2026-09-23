package main.java.OOPS;

class Student {
    int  id;
    String name;
    public void info(){
        System.out.println("\nStudent Info.....");
        System.out.println(this.id);
        System.out.println(this.name);
    }

    //Default Constructor will auto. created if we didn't create constructor.
    Student(){                     //Non - Parameterized Constructor
        System.out.println("Student's Object has been created");
    }

    Student (int id, String name){ // Parameterized Constructor
        this.id = id;
        this.name = name;
    }

    Student (Student s){          // Copy Constructor
        this.id = s.id;
        this.name = s.name;
    }

    Student (long id){            // Constructor Overloading- Creating multiple
        System.out.println(this.id); // Printing Auto initialized value - 0 because class level variable get auto initialsed.
        this.id = (int) id;          // Initialized value with user data
        System.out.println(this.id); // Printing after initialisation
    }

}

public class Constructors {
    public static void main (String [] args){
        Student s1 = new Student(); // object created
        s1.id = 1;
        s1.name = "Scout";
        s1.info();

        Student s2 = new Student(105,"FEEL"); // using Parameterised
        s2.info();

        Student s3 = new Student(s2);  // Object using Copy Constructor
        s3.info();

        System.out.println();
        Student s4 = new Student(9749);
        // directly printing from constructor.
    }


}
