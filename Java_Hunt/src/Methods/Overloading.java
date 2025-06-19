package Methods;

public class Overloading {
    public static void main(String[] args) {
        fun(7);
        fun("Sribalaji");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
}
