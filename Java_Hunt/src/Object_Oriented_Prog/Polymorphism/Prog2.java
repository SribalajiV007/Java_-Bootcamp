package Object_Oriented_Prog.Polymorphism;

class Shape{
    public void draw(){
        System.out.println("shape : the parent");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("shape : Circle");
    }
}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("shape : Rectangle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("shape : Triangle");
    }
}

public class Prog2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape s1 = new Rectangle();
        s.draw();
        s1.draw();
    }
}