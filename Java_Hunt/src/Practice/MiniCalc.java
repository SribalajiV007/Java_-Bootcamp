package Practice;

import java.util.Scanner;

public class MiniCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number");
        int a = s.nextInt();

        System.out.print("Enter a number");
        int b = s.nextInt();

        System.out.println("Enter the operation: ");
        char op = s.next().trim().charAt(0);

        switch (op){
            case '+':
                System.out.println("Addition of two numbers: "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of two numbers: "+(a-b));
                break;
            case '*':
                System.out.println("Multilication of two numbers: "+(a*b));
                break;
            case '/':
                System.out.println("Division of two numbers: "+(a/b));
                break;
            default:
                System.out.println("Enter the correct option");
        }
    }
}
