package Object_Oriented_Prog.Inheritance.Level3;

class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{
    int seats;

    Car(String brand, int seats){
        super(brand);
        this.seats = seats;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brand: "+brand+", Seats: "+seats);
    }
}

class Bike extends Vehicle{
    int engineCC;

    Bike(String brand,int engineCC){
        super(brand);
        this.engineCC = engineCC;
    }

    public void displayInfo(){
        System.out.println("Bike Brand: "+brand+", EngineCC: "+engineCC);
    }
}

public class Prob2 {
    public static void main(String[] args) {
        Car Benz = new Car("Mercedez Benz",4);
        Bike Yamaha = new Bike("Yamaha",150);

        Benz.displayInfo();
        Yamaha.displayInfo();
    }
}