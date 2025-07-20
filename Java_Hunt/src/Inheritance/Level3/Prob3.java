package Inheritance.Level3;

import java.sql.SQLOutput;

class Animal{
    public void makeSound(){
        System.out.println("Makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}

class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cow moos");
    }
}

public class Prob3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
        Cow c1 = new Cow();
        c1.makeSound();
    }
}
