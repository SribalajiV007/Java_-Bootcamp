package Inheritance.Level2;

class Shape{
    String color;
    Shape(String color){
        this.color = color;
    }
}

class Circle extends Shape{
    int radius;

    Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }

    void showDetails(){
        System.out.println("Color: "+color+", Radius: "+radius);
    }
}

public class Prob3 {
    public static void main(String[] args) {
        Circle c = new Circle("white",5);
        Circle c1 = new Circle("red",8);
        c.showDetails();
        c1.showDetails();
    }
}