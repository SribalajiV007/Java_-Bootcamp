package Object_Oriented_Prog.Inheritance.Level1;

//Create 3 classes in hierarchy:
//Animal: method void eat()
//Dog: method void bark()
//Puppy: method void weep()
//Create Puppy p = new Puppy();
//Call all 3 methods: weep(), bark(), eat()


class Animaal{
    void eat(){
        System.out.println("Animal cn eat");
    }
}

class Dogg extends Animaal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dogg{
    void weep(){
        System.out.println("Puppy weeping");
    }
}

public class Main6{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

    }
}