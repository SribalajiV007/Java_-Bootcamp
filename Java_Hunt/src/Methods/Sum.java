package Methods;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
         sum();
    }

    static void sum(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.print("Enter a number: ");
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("Sum: "+sum);
    }
}

/*
     [access modifier] returnType name(){
          /body
     }
* */
