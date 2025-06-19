package Methods;

public class Swap {
    public static void main(String[] args) {

      swap1(2,1);
    }

    static void swap1(int a,int b){
        System.out.println("a: "+a+" b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a+" b: "+b);
    }
}
