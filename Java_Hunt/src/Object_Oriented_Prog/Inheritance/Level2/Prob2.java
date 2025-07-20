package Object_Oriented_Prog.Inheritance.Level2;

class Animal{
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }

    void print(){
        super.eat();
        this.eat();
    }
}

public class Prob2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
    }
}