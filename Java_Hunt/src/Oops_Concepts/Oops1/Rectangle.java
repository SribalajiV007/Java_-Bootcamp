package Oops_Concepts.Oops1;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(){
        this.length = 5;
        this.breadth =10;
    }

    Rectangle(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    double area(){
        return length*breadth;
    }

    public static void main(String[]args){
        Rectangle r = new Rectangle();
        System.out.println(r.area());

        Rectangle r1 = new Rectangle(4,6);
        System.out.println(r1.area());
    }
}
