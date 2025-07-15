package Oops_Concepts.Oops1;

public class Laptop {
    String processer;
    int price;

    Laptop(String processor,int price){
        this.processer = processor;
        this.price = price;
    }

    void display(){
        System.out.println("Processor: "+processer+", Price: "+price);
    }

    public static void main(String[]args){
        Laptop lenovo = new Laptop("i3",32000);
        lenovo.display();

        Laptop Dell = new Laptop("i5",49000);
        Dell.display();
    }


}
