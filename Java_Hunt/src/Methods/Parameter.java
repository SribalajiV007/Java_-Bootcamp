package Methods;

public class Parameter {
    public static void main(String[] args) {
//       Parameter s = new Parameter();
       int result = add(5,5);
       System.out.println(result);

       System.out.println(s1("Sribalaji"));

    }

     static int add(int a, int b){
        return a+b;
    }

    static String s1(String name){
        String res = "Hello "+name;
        return res;
    }
}
