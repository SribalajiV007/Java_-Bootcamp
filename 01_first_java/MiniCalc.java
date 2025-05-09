import java.util.Scanner;

public class MiniCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = s.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = s.nextDouble();

        System.out.print("Enter Operator to Calculate (+, -, *, /):  ");
        char operator = s.next().charAt(0);

        double result =0;
        boolean valid = true;

        if(operator == '+'){
            result = a+b;
        }else if(operator == '-'){
            result = a-b;
        }else if(operator == '*'){
            result = a*b;
        }else if(operator == '/'){
            if(b != 0)
               result = a/b;
            else{
                System.out.println("Num divided by zero not possible da");
                valid = false;
            }
        }else{
            System.out.println("Invalid Operator");
            valid =false;
        }

        if(valid)
              System.out.println("Result: "+result);


    }
}
