package Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //take input from the user until user does press X or x

        int ans =0;
        while(true){
            //take operator as an input
            char op = s.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                //input two numbers
                int num1 = s.nextInt();
                int num2 = s.nextInt();

                if(op == '+')
                    ans = num1 +num2;
                if(op == '-')
                    ans = num1 - num2;
                if(op == '*')
                    ans = num1 * num2;
                if(op == '/')
                    ans = num1 / num2;
                if(op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    }
                    System.out.println("Cannot divide by zero");
                }

            }
            System.out.println(ans);
        }
    }
}
