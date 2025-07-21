package Object_Oriented_Prog.Polymorphism;

class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }

    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Costructor");
    }

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog{
    Puppy(){
        System.out.println("Dog Cnstructor");
    }
    @Override
    void sound(){
        System.out.println("Puppy yelps");
    }
}

public class Prog5{
    public static void main(String[] args) {
        Animal a = new Puppy();
        a.sound();
    }
}