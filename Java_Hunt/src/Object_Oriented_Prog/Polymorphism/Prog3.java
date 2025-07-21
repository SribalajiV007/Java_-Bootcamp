package Object_Oriented_Prog.Polymorphism;

//Array Objects adding polymorphism using upcasting

class Employee{
    void CalculateSalary(){
        System.out.println("base salary: 15000");
    }
}

class Manager extends Employee{
    @Override
    void CalculateSalary(){
        System.out.println("Manager salary: 80000");
    }
}

class Developer extends Employee{
    @Override
    void CalculateSalary(){
        System.out.println("Developer Salary: 40000");
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee();
        employees[1] = new Manager();
        employees[2] = new Developer();

        for (int i = 0; i < employees.length; i++) {
            employees[i].CalculateSalary();
        }
    }
}