package Inheritance;

class Animal1{
    void eat(){
        System.out.println("Animal can eat");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dog barking");
    }
}
public class Main2 {
    public static void main(String[] args) {
            Dog1 d = new Dog1();
            d.eat();
            d.bark();
    }
}
