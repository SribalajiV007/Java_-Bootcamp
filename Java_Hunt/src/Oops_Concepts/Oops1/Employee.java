package Oops_Concepts.Oops1;

public class Employee {
    int empId;
    String empName;
    static String company = "Mr Cooper";

    Employee(int id,String name){
        empId = id;
        empName = name;
    }

    void display(){
        System.out.println("Employee Id: "+empId+", Employee Name: "+empName+", Company Name: "+company);
    }

    public static void main(String[]args){
        Employee varun = new Employee(1001,"Varun D");
        varun.display();

        Employee balaji = new Employee(1007,"Sri Balaji V");
        balaji.display();
    }


}
