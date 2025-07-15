package Oops_Concepts.Oops1.CRM;

public class Customer {
    int id;
    String name;
    String phone;

    Customer(int id, String name,String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    void display(){
        System.out.println("CustomerId: "+id+", CustomerName: "+name+", Phone: "+phone);
    }


}
