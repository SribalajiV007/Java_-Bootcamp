package Inheritance;

class Animal{
    void makeSound(){
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.makeSound();
    }
}