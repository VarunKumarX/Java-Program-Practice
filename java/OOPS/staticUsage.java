package main.java.OOPS;
class Studentx{
    static String school; //static variable
    String stuName;

    static void updateSchool(String s){ //static method
        school=s;
    }
}

public class staticUsage {
    public static void main(String[] args) {

        System.out.println("school:"+Studentx.school); //null - auto initialised

        Studentx.school="IP"; //initialsed school directly without object creation
        System.out.println("school:"+Studentx.school);
        Studentx.updateSchool("MIT"); //update school without object
        System.out.println("school:"+Studentx.school);

        Studentx s=new Studentx(); //object 1 / student1
        s.stuName="varun";
        System.out.println("school:"+s.stuName);
        System.out.println("school:"+
                s.school); // fetched school through object.
        System.out.println("school:"+Studentx.school); // fetched school directly.

        s.updateSchool("DPS");
        System.out.println("school:"+s.school);

        Studentx s2=new Studentx();//object 2 / student2
        System.out.println("schools of both students:"+s.school+"  "+s2.school+"\nbecause its common for both students");

    }
}
