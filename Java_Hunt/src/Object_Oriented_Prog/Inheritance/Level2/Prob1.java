package Object_Oriented_Prog.Inheritance.Level2;

class Human{
    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}

class Employee extends Human{
    int empId;

    Employee(String name, int age, int empId){
        super(name,age);
        this.empId = empId;
    }
    void showDetails() {
        System.out.println("Employee ID: " + empId);
    }
}

public class Prob1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sri Balaji",21,1007);
        Employee e2 = new Employee("Shyam",21,1008);
        e1.show();
        e2.show();
    }
}