package Object_Oriented_Prog.Inheritance.Level1;

class Person{
    String name = "Sri balaji";

    void showName(){
        System.out.println("Name: "+name);
    }
}

class Student extends Person{
    String name = "Kamal";
    String rollno = "22BCA39";

    void showName(){
        System.out.println("Name: "+name);
    }
    void showRollNo(){
        System.out.println("Roll No: "+rollno);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Student s = new Student();

        s.showName();
        s.showRollNo();
    }
}