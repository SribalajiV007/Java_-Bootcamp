
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        double a = s.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = s.nextDouble();

        System.out.print("Enter + for Addtion \n - for Subtraction \n * for Multiplication \n / for Division");
        char opr = s.next().charAt(0);

        switch(opr){
            case '+':
               System.out.println("Additon: "+(a+b));
               break;
            case '-':
               System.out.println("Subtaction: "+(a-b));
               break;
            case '*':
               System.out.println("Multiplication: "+(a*b));
               break;
            case '/':
              if(b==0)
                  System.out.println("Cannot divide by zero");
              else
                  System.out.println("Division: "+(a/b));
               break;
            default:
               System.out.println("Enter a valid Operator");
        }

    }
}
