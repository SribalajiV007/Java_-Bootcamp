package Object_Oriented_Prog.Inheritance.Level1;

class Shape{

    void show(){
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{
    int area = 20;

    void area(){
        System.out.println(area);
    }
}

public class Main5{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.show();
        r.area();
    }
}