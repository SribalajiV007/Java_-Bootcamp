package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
         fun(1,2,34,56,76,89,223);
         fun1(23,12,"abilash","kanan","ramesh","suresh");
    }

     static void fun1(int a ,int b, String ... c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }

    static void fun(int ... v){
        System.out.println(Arrays.toString(v));
    }
}
