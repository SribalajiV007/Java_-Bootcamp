package Object_Oriented_Prog.Polymorphism;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }

    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

public class Prog4 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();
//        v.wheels();

        Bike b = (Bike) v;
        b.run();
        b.wheels();
    }
}