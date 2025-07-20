package Inheritance.Level2;

class Humann{
    int age;
    String name;
    boolean sense;

    Humann(int age,String name ,boolean sense){
        this.age = age;
        this.name = name;
        this.sense = sense;
    }

    public void humanDetails(){
        System.out.println("Name: "+name+", Age: "+age+", HasSense: "+sense);
    }
}

class SuperHero extends Humann{
    String power;

    SuperHero(int age, String name, boolean sense,String power){
        super(age,name,sense);
        this.power = power;
    }

    public void humanDetails(){
        System.out.println("Name: "+name+", Age: "+age+", HasSense: "+sense+", power: "+power);
    }
}

public class Prob5 {
    public static void main(String[] args) {
        SuperHero s = new SuperHero(21,"Sri balaji",true,"sucess");
        s.humanDetails();
    }

}
