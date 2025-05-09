import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(b>a){
            System.out.println(b+" is greater than "+a);
        }else{
            System.out.println("Neural");
        }
    }
}
