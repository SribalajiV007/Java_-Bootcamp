package Oops_Concepts.Oops1;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name+", Age: "+age);
    }

    public static void main(String[]args){

        Person akash = new Person("Akash",21);
        Person Ram = new Person ("Ram",23);
        Person Ramesh = new Person("Ramesh",28);

        akash.display();
        Ram.display();
        Ramesh.display();
    }
}
