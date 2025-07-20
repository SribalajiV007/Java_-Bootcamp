package Object_Oriented_Prog.Inheritance.Level2;

class Person{
    String name;
    Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    int marks;
    Student(String name,int marks){
        super(name);
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+name+", Marks: "+marks);
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Student s1 = new Student("Balaji",100);
        Student s2 = new Student("Mohan",99);
        s1.display();
        s2.display();
    }
}