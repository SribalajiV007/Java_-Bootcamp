package Methods;

public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x); //100
        int x; // the class variable at line no 4 shadowed by this

        x =50;
        System.out.println(x); //50
        fun(); //100
    }



    static void fun() {
        System.out.println(x);
    }
}
