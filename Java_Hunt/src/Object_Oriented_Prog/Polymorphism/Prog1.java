package Object_Oriented_Prog.Polymorphism;

class Calculator{
    public void add(int  a, int b){
        System.out.println("Addition: "+(a+b));
    }

    public void add(double a, double b){
        System.out.println("Addition: "+(a+b));
    }

    public void add(int a, int b,int c ){
        System.out.println("Addition of 3 numbers: "+(a+b+c));
    }
}

public class Prog1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5,5);
        c.add(2.5,3.5);
        c.add(5,4,6);
    }
}
