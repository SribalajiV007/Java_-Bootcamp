package Methods;

public class Swap {
    public static void main(String[] args) {
      String naame ="boopathi";
      swap1(2,1);
      System.out.println(swap2(naame));
    }



    static void swap1(int a,int b){
        System.out.println("a: "+a+" b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a+" b: "+b);
        }
    static String swap2(String naame){
        return "bala";
    }
}
