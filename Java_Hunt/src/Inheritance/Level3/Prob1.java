package Inheritance.Level3;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Name: "+name);
    }
}

class Employee extends Person{
    int id;
    int salary;

    Employee(int id, String name , int salary){
        super(name);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void showDetails(){
        System.out.println("Id: "+id+", Name: "+name+", salary: "+salary);
    }
}

class Manager extends Employee{
    String department;

    Manager(int id,String name, int salary, String department){
        super(id,name,salary);
        this.department = department;
    }

    @Override
    public void showDetails(){
        System.out.println("Id: "+id+", Name: "+name+", salary: "+salary+", Department: "+department);
    }
}

public class Prob1 {
    public static void main(String[] args) {
        Manager m1 = new Manager(1001,"Balaji",100000,"Development");
        m1.showDetails();
    }
}
