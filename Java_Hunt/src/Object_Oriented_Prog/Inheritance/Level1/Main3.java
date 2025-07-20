package Object_Oriented_Prog.Inheritance.Level1;

class Vehicle{
    void start(){
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Driving car");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Car benz = new Car();
        benz.start();
        benz.drive();
    }
}
